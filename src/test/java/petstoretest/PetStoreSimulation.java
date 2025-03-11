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

    // Combined scenario
    ScenarioBuilder fullTestScenario = scenario("Pet Store API Test")
            // Krok 1: Tworzenie peta (POST)
            .exec(http("Create Pet")
                    .post("/api/v3/pet")
                    .body(ElFileBody("bodies/createPet.json"))
                    .check(status().is(200))
                    .check(jsonPath("$.id").saveAs("petId"))
                    .check(bodyString().saveAs("petResponse")))
            .exec(session -> {
                System.out.println("Created Pet ID: " + session.getString("petId"));
                System.out.println("Pet Response: " + session.getString("petResponse"));
                return session;
            })
            .pause(2)
            // Krok 2: Pobieranie peta (GET)
            .exec(http("Get Pet by ID")
                    .get("/api/v3/pet/${petId}")
                    .check(status().is(200))
                    .check(bodyString().saveAs("getPetResponse")))
            .exec(session -> {
                System.out.println("Get Pet Response: " + session.getString("getPetResponse"));
                return session;
            })
            .pause(1)
            // Krok 3: Wyszukiwanie petów po statusie
            .exec(http("Find Pets by Status")
                    .get("/api/v3/pet/findByStatus?status=available")
                    .check(status().is(200))
                    .check(jsonPath("$[*]").exists()));

    {
        setUp(
                fullTestScenario.injectOpen(
                        rampUsers(BaseConfig.USERS).during(Duration.ofSeconds(BaseConfig.RAMP_DURATION))
                )
        ).protocols(httpProtocol);
    }
}