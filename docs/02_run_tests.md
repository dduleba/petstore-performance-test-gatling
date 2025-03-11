# drugie wywołanie testów

```shell
mvn gatling:test                                                                                                                                                                                        in zsh at 22:30:49
f[INFO] Scanning for projects...
^R
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
[WARNING] system modules path not set in conjunction with -source 11
[INFO]
[INFO] <<< gatling:4.3.2:test (default-cli) < test-compile @ petstore-performance-tests <<<
[INFO]
[INFO]
[INFO] --- gatling:4.3.2:test (default-cli) @ petstore-performance-tests ---
22:31:00,283 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.xml]
22:31:00,283 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Found resource [logback.xml] at [file:/Users/ddl/repo/my/petstore-performance-test-gatling/target/test-classes/logback.xml]
22:31:00,283 |-WARN in ch.qos.logback.classic.LoggerContext[default] - Resource [logback.xml] occurs multiple times on the classpath.
22:31:00,284 |-WARN in ch.qos.logback.classic.LoggerContext[default] - Resource [logback.xml] occurs at [jar:file:/Users/ddl/.m2/repository/io/gatling/gatling-maven-plugin/4.3.2/gatling-maven-plugin-4.3.2.jar!/logback.xml]
22:31:00,284 |-WARN in ch.qos.logback.classic.LoggerContext[default] - Resource [logback.xml] occurs at [file:/Users/ddl/repo/my/petstore-performance-test-gatling/target/test-classes/logback.xml]
22:31:00,360 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - debug attribute not set
22:31:00,360 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.ConsoleAppender]
22:31:00,365 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [CONSOLE]
22:31:00,370 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
22:31:00,419 |-INFO in ch.qos.logback.classic.joran.action.RootLoggerAction - Setting level of ROOT logger to WARN
22:31:00,419 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [CONSOLE] to Logger[ROOT]
22:31:00,420 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - End of configuration.
22:31:00,420 |-INFO in ch.qos.logback.classic.joran.JoranConfigurator@2a556333 - Registering current configuration as safe fallback point

Gatling 3.13.5 is available! (you're using 3.9.5)
22:31:02.531 [WARN ] i.g.c.s.e.ElCompiler$ - You're still using the deprecated ${} pattern for Gatling EL. Please use the #{} pattern instead.
Simulation petstoretest.PetStoreSimulation started...

================================================================================
2025-03-11 22:31:09                                           5s elapsed
---- Requests ------------------------------------------------------------------
> Global                                                   (OK=3      KO=1     )
> Create Pet                                               (OK=2      KO=0     )
> Get Pet by ID                                            (OK=0      KO=1     )
> Find Pets by Status                                      (OK=1      KO=0     )
---- Errors --------------------------------------------------------------------
> jsonPath($.id).find.is(${petId}), but actually found 0              1 (100.0%)

---- Pet Store API Test --------------------------------------------------------
[#######--------                                                           ] 10%
          waiting: 8      / active: 1      / done: 1
================================================================================


================================================================================
2025-03-11 22:31:14                                          10s elapsed
---- Requests ------------------------------------------------------------------
> Global                                                   (OK=7      KO=3     )
> Create Pet                                               (OK=4      KO=0     )
> Get Pet by ID                                            (OK=0      KO=3     )
> Find Pets by Status                                      (OK=3      KO=0     )
---- Errors --------------------------------------------------------------------
> jsonPath($.id).find.is(${petId}), but actually found 0              3 (100.0%)

---- Pet Store API Test --------------------------------------------------------
[######################--------                                            ] 30%
          waiting: 6      / active: 1      / done: 3
================================================================================


================================================================================
2025-03-11 22:31:19                                          15s elapsed
---- Requests ------------------------------------------------------------------
> Global                                                   (OK=9      KO=5     )
> Create Pet                                               (OK=5      KO=0     )
> Get Pet by ID                                            (OK=0      KO=5     )
> Find Pets by Status                                      (OK=4      KO=0     )
---- Errors --------------------------------------------------------------------
> jsonPath($.id).find.is(${petId}), but actually found 0              5 (100.0%)

---- Pet Store API Test --------------------------------------------------------
[#############################---------------                              ] 40%
          waiting: 4      / active: 2      / done: 4
================================================================================


================================================================================
2025-03-11 22:31:24                                          20s elapsed
---- Requests ------------------------------------------------------------------
> Global                                                   (OK=13     KO=6     )
> Create Pet                                               (OK=7      KO=0     )
> Get Pet by ID                                            (OK=0      KO=6     )
> Find Pets by Status                                      (OK=6      KO=0     )
---- Errors --------------------------------------------------------------------
> jsonPath($.id).find.is(${petId}), but actually found 0              6 (100.0%)

---- Pet Store API Test --------------------------------------------------------
[############################################--------                      ] 60%
          waiting: 3      / active: 1      / done: 6
================================================================================


================================================================================
2025-03-11 22:31:29                                          25s elapsed
---- Requests ------------------------------------------------------------------
> Global                                                   (OK=17     KO=8     )
> Create Pet                                               (OK=9      KO=0     )
> Get Pet by ID                                            (OK=0      KO=8     )
> Find Pets by Status                                      (OK=8      KO=0     )
---- Errors --------------------------------------------------------------------
> jsonPath($.id).find.is(${petId}), but actually found 0              8 (100.0%)

---- Pet Store API Test --------------------------------------------------------
[###########################################################--------       ] 80%
          waiting: 1      / active: 1      / done: 8
================================================================================


================================================================================
2025-03-11 22:31:34                                          30s elapsed
---- Requests ------------------------------------------------------------------
> Global                                                   (OK=19     KO=10    )
> Create Pet                                               (OK=10     KO=0     )
> Get Pet by ID                                            (OK=0      KO=10    )
> Find Pets by Status                                      (OK=9      KO=0     )
---- Errors --------------------------------------------------------------------
> jsonPath($.id).find.is(${petId}), but actually found 0             10 (100.0%)

---- Pet Store API Test --------------------------------------------------------
[##################################################################--------] 90%
          waiting: 0      / active: 1      / done: 9
================================================================================


================================================================================
2025-03-11 22:31:34                                          30s elapsed
---- Requests ------------------------------------------------------------------
> Global                                                   (OK=20     KO=10    )
> Create Pet                                               (OK=10     KO=0     )
> Get Pet by ID                                            (OK=0      KO=10    )
> Find Pets by Status                                      (OK=10     KO=0     )
---- Errors --------------------------------------------------------------------
> jsonPath($.id).find.is(${petId}), but actually found 0             10 (100.0%)

---- Pet Store API Test --------------------------------------------------------
[##########################################################################]100%
          waiting: 0      / active: 0      / done: 10
================================================================================

Simulation petstoretest.PetStoreSimulation completed in 30 seconds
Parsing log file(s)...
Parsing log file(s) done
Generating reports...

================================================================================
---- Global Information --------------------------------------------------------
> request count                                         30 (OK=20     KO=10    )
> min response time                                      3 (OK=3      KO=3     )
> max response time                                     23 (OK=23     KO=5     )
> mean response time                                     6 (OK=7      KO=4     )
> std deviation                                          4 (OK=4      KO=1     )
> response time 50th percentile                          5 (OK=7      KO=4     )
> response time 75th percentile                          8 (OK=9      KO=5     )
> response time 95th percentile                         10 (OK=11     KO=5     )
> response time 99th percentile                         19 (OK=21     KO=5     )
> mean requests/sec                                      1 (OK=0.667  KO=0.333 )
---- Response Time Distribution ------------------------------------------------
> t < 800 ms                                            20 ( 67%)
> 800 ms <= t < 1200 ms                                  0 (  0%)
> t >= 1200 ms                                           0 (  0%)
> failed                                                10 ( 33%)
---- Errors --------------------------------------------------------------------
> jsonPath($.id).find.is(${petId}), but actually found 0             10 (100.0%)
================================================================================

Reports generated in 0s.
Please open the following file: file:///Users/ddl/repo/my/petstore-performance-test-gatling/target/gatling/results/petstore-simulation-20250311213102568/index.html
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  37.256 s
[INFO] Finished at: 2025-03-11T22:31:35+01:00
[INFO] ------------------------------------------------------------------------
```