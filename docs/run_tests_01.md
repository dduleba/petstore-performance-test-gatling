# Pierwsze uruchomienie testów

```shell
[INFO] Scanning for projects...
[INFO]
[INFO] ---------------< org.example:petstore-performance-tests >---------------
[INFO] Building petstore-performance-tests 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] >>> gatling:4.3.2:test (default-cli) > test-compile @ petstore-performance-tests >>>
[INFO]
[INFO] --- resources:3.3.1:resources (default-resources) @ petstore-performance-tests ---
[INFO] skip non existing resourceDirectory /Users/ddl/repo/my/petstore-performance-test-gatling/src/main/resources
[INFO]
[INFO] --- compiler:3.13.0:compile (default-compile) @ petstore-performance-tests ---
[INFO] No sources to compile
[INFO]
[INFO] --- resources:3.3.1:testResources (default-testResources) @ petstore-performance-tests ---
[INFO] Copying 4 resources from src/test/resources to target/test-classes
[INFO]
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ petstore-performance-tests ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 2 source files with javac [debug target 11] to target/test-classes
[INFO] -------------------------------------------------------------
[WARNING] COMPILATION WARNING :
[INFO] -------------------------------------------------------------
[WARNING] system modules path not set in conjunction with -source 11
[INFO] 1 warning
[INFO] -------------------------------------------------------------
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR :
[INFO] -------------------------------------------------------------
[ERROR] /Users/ddl/repo/my/petstore-performance-test-gatling/src/test/java/petstoretest/PetStoreSimulation.java:[35,1] illegal start of type
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.491 s
[INFO] Finished at: 2025-03-11T22:17:11+01:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.13.0:testCompile (default-testCompile) on project petstore-performance-tests: Compilation failure
[ERROR] /Users/ddl/repo/my/petstore-performance-test-gatling/src/test/java/petstoretest/PetStoreSimulation.java:[35,1] illegal start of type
[ERROR]
[ERROR] -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
```

poprawki wynikające z użycia slacka
```shell
mvn gatling:test                                                                                                                                                                                   in zsh at 22:17:12
[INFO] Scanning for projects...
[INFO]
[INFO] ---------------< org.example:petstore-performance-tests >---------------
[INFO] Building petstore-performance-tests 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] >>> gatling:4.3.2:test (default-cli) > test-compile @ petstore-performance-tests >>>
[INFO]
[INFO] --- resources:3.3.1:resources (default-resources) @ petstore-performance-tests ---
[INFO] skip non existing resourceDirectory /Users/ddl/repo/my/petstore-performance-test-gatling/src/main/resources
[INFO]
[INFO] --- compiler:3.13.0:compile (default-compile) @ petstore-performance-tests ---
[INFO] No sources to compile
[INFO]
[INFO] --- resources:3.3.1:testResources (default-testResources) @ petstore-performance-tests ---
[INFO] Copying 4 resources from src/test/resources to target/test-classes
[INFO]
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ petstore-performance-tests ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 2 source files with javac [debug target 11] to target/test-classes
[INFO] -------------------------------------------------------------
[WARNING] COMPILATION WARNING :
[INFO] -------------------------------------------------------------
[WARNING] system modules path not set in conjunction with -source 11
[INFO] 1 warning
[INFO] -------------------------------------------------------------
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR :
[INFO] -------------------------------------------------------------
[ERROR] /Users/ddl/repo/my/petstore-performance-test-gatling/src/test/java/petstoretest/PetStoreSimulation.java:[41,36] cannot find symbol
  symbol:   method scenarios()
  location: variable createPetScenario of type io.gatling.javaapi.core.ScenarioBuilder
[ERROR] /Users/ddl/repo/my/petstore-performance-test-gatling/src/test/java/petstoretest/PetStoreSimulation.java:[43,33] cannot find symbol
  symbol:   method scenarios()
  location: variable getPetScenario of type io.gatling.javaapi.core.ScenarioBuilder
[ERROR] /Users/ddl/repo/my/petstore-performance-test-gatling/src/test/java/petstoretest/PetStoreSimulation.java:[45,43] cannot find symbol
  symbol:   method scenarios()
  location: variable findPetsByStatusScenario of type io.gatling.javaapi.core.ScenarioBuilder
[INFO] 3 errors
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.861 s
[INFO] Finished at: 2025-03-11T22:22:37+01:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.13.0:testCompile (default-testCompile) on project petstore-performance-tests: Compilation failure: Compilation failure:
[ERROR] /Users/ddl/repo/my/petstore-performance-test-gatling/src/test/java/petstoretest/PetStoreSimulation.java:[41,36] cannot find symbol
[ERROR]   symbol:   method scenarios()
[ERROR]   location: variable createPetScenario of type io.gatling.javaapi.core.ScenarioBuilder
[ERROR] /Users/ddl/repo/my/petstore-performance-test-gatling/src/test/java/petstoretest/PetStoreSimulation.java:[43,33] cannot find symbol
[ERROR]   symbol:   method scenarios()
[ERROR]   location: variable getPetScenario of type io.gatling.javaapi.core.ScenarioBuilder
[ERROR] /Users/ddl/repo/my/petstore-performance-test-gatling/src/test/java/petstoretest/PetStoreSimulation.java:[45,43] cannot find symbol
[ERROR]   symbol:   method scenarios()
[ERROR]   location: variable findPetsByStatusScenario of type io.gatling.javaapi.core.ScenarioBuilder
[ERROR] -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
```