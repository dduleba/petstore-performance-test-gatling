package petstoretest;
import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import petstoretest.config.BaseConfig;
import java.time.Duration;
import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
public class PetStoreSimulation extends Simulation {
    private HttpProtocolBuilder httpProtocol = http
            .baseUrl(BaseConfig.BASE_URL)
            .acceptHeader("application/json")
            .contentTypeHeader("application/json")
            .userAgentHeader("Gatling Performance Test");
    // Feeder for pet IDs
    FeederBuilder<String> petIdFeeder = csv("pet_ids.csv").random();
    // Scenario 1: Create a new pet (POST)
    ScenarioBuilder createPetScenario = scenario("Create Pet Scenario")
            .exec(http("Create Pet")
                    .post("/api/v3/pet")
                    .body(ElFileBody("bodies/createPet.json"))
                    .check(status().is(200))
                    .check(jsonPath("$.id").saveAs("petId")));
    // Scenario 2: Get pet by ID (GET)
    ScenarioBuilder getPetScenario = scenario("Get Pet Scenario")
            .exec(session -> session.set("petId", session.getString("petId")))
            .exec(http("Get Pet by ID")
                    .get("/api/v3/pet/${petId}")
                    .check(status().is(200))
                    .check(jsonPath("$.id").is("${petId}")));
    // Scenario 3: Find pets by status (Search)



ScenarioBuilder findPetsByStatusScenario = scenario("Find Pets by Status Scenario")
            .exec(http("Find Pets by Status")
                    .get("/api/v3/pet/findByStatus?status=available")
                    .check(status().is(200))
                    .check(jsonPath("$[*]").exists()));
    // Combined scenario
    ScenarioBuilder fullTestScenario = scenario("Pet Store API Test")
            .exec(createPetScenario.scenarios().get(0))
            .pause(2)
            .exec(getPetScenario.scenarios().get(0))
            .pause(1)
            .exec(findPetsByStatusScenario.scenarios().get(0));
    {
        setUp(
                fullTestScenario.injectOpen(
                        rampUsers(BaseConfig.USERS).during(Duration.ofSeconds(BaseConfig.RAMP_DURATION))
                )
        ).protocols(httpProtocol);
    }
}
