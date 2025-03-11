# trzecie uruchomienie testów

```shell
 mvn gatling:test                                                                                                                                                                              in zsh at 22:44:58
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
[WARNING] system modules path not set in conjunction with -source 11
[INFO]
[INFO] <<< gatling:4.3.2:test (default-cli) < test-compile @ petstore-performance-tests <<<
[INFO]
[INFO]
[INFO] --- gatling:4.3.2:test (default-cli) @ petstore-performance-tests ---
22:45:05,603 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.xml]
22:45:05,603 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Found resource [logback.xml] at [file:/Users/ddl/repo/my/petstore-performance-test-gatling/target/test-classes/logback.xml]
22:45:05,604 |-WARN in ch.qos.logback.classic.LoggerContext[default] - Resource [logback.xml] occurs multiple times on the classpath.
22:45:05,604 |-WARN in ch.qos.logback.classic.LoggerContext[default] - Resource [logback.xml] occurs at [jar:file:/Users/ddl/.m2/repository/io/gatling/gatling-maven-plugin/4.3.2/gatling-maven-plugin-4.3.2.jar!/logback.xml]
22:45:05,604 |-WARN in ch.qos.logback.classic.LoggerContext[default] - Resource [logback.xml] occurs at [file:/Users/ddl/repo/my/petstore-performance-test-gatling/target/test-classes/logback.xml]
22:45:05,680 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - debug attribute not set
22:45:05,680 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - About to instantiate appender of type [ch.qos.logback.core.ConsoleAppender]
22:45:05,685 |-INFO in ch.qos.logback.core.joran.action.AppenderAction - Naming appender as [CONSOLE]
22:45:05,690 |-INFO in ch.qos.logback.core.joran.action.NestedComplexPropertyIA - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
22:45:05,742 |-INFO in ch.qos.logback.classic.joran.action.RootLoggerAction - Setting level of ROOT logger to WARN
22:45:05,742 |-INFO in ch.qos.logback.core.joran.action.AppenderRefAction - Attaching appender named [CONSOLE] to Logger[ROOT]
22:45:05,742 |-INFO in ch.qos.logback.classic.joran.action.ConfigurationAction - End of configuration.
22:45:05,743 |-INFO in ch.qos.logback.classic.joran.JoranConfigurator@3cb1ffe6 - Registering current configuration as safe fallback point

Gatling 3.13.5 is available! (you're using 3.9.5)
22:45:07.889 [WARN ] i.g.c.s.e.ElCompiler$ - You're still using the deprecated ${} pattern for Gatling EL. Please use the #{} pattern instead.
Simulation petstoretest.PetStoreSimulation started...
Created Pet ID: 0
Pet Response: {"id":0,"category":{"id":1,"name":"Dogs"},"name":"doggie","photoUrls":["https://example.com/dog.jpg"],"tags":[{"id":0,"name":"pet-tag"}],"status":"available"}
Get Pet Response: {"id":0,"category":{"id":1,"name":"Dogs"},"name":"doggie","photoUrls":["https://example.com/dog.jpg"],"tags":[{"id":0,"name":"pet-tag"}],"status":"available"}
Created Pet ID: 0
Pet Response: {"id":0,"category":{"id":1,"name":"Dogs"},"name":"doggie","photoUrls":["https://example.com/dog.jpg"],"tags":[{"id":0,"name":"pet-tag"}],"status":"available"}
Get Pet Response: {"id":0,"category":{"id":1,"name":"Dogs"},"name":"doggie","photoUrls":["https://example.com/dog.jpg"],"tags":[{"id":0,"name":"pet-tag"}],"status":"available"}

================================================================================
2025-03-11 22:45:14                                           5s elapsed
---- Requests ------------------------------------------------------------------
> Global                                                   (OK=4      KO=0     )
> Create Pet                                               (OK=2      KO=0     )
> Get Pet by ID                                            (OK=1      KO=0     )
> Find Pets by Status                                      (OK=1      KO=0     )

---- Pet Store API Test --------------------------------------------------------
[#######--------                                                           ] 10%
          waiting: 8      / active: 1      / done: 1
================================================================================

Created Pet ID: 0
Pet Response: {"id":0,"category":{"id":1,"name":"Dogs"},"name":"doggie","photoUrls":["https://example.com/dog.jpg"],"tags":[{"id":0,"name":"pet-tag"}],"status":"available"}
Get Pet Response: {"id":0,"category":{"id":1,"name":"Dogs"},"name":"doggie","photoUrls":["https://example.com/dog.jpg"],"tags":[{"id":0,"name":"pet-tag"}],"status":"available"}
Created Pet ID: 0
Pet Response: {"id":0,"category":{"id":1,"name":"Dogs"},"name":"doggie","photoUrls":["https://example.com/dog.jpg"],"tags":[{"id":0,"name":"pet-tag"}],"status":"available"}

================================================================================
2025-03-11 22:45:19                                          10s elapsed
---- Requests ------------------------------------------------------------------
> Global                                                   (OK=10     KO=0     )
> Create Pet                                               (OK=4      KO=0     )
> Get Pet by ID                                            (OK=3      KO=0     )
> Find Pets by Status                                      (OK=3      KO=0     )

---- Pet Store API Test --------------------------------------------------------
[######################--------                                            ] 30%
          waiting: 6      / active: 1      / done: 3
================================================================================

Get Pet Response: {"id":0,"category":{"id":1,"name":"Dogs"},"name":"doggie","photoUrls":["https://example.com/dog.jpg"],"tags":[{"id":0,"name":"pet-tag"}],"status":"available"}
Created Pet ID: 0
Pet Response: {"id":0,"category":{"id":1,"name":"Dogs"},"name":"doggie","photoUrls":["https://example.com/dog.jpg"],"tags":[{"id":0,"name":"pet-tag"}],"status":"available"}
Get Pet Response: {"id":0,"category":{"id":1,"name":"Dogs"},"name":"doggie","photoUrls":["https://example.com/dog.jpg"],"tags":[{"id":0,"name":"pet-tag"}],"status":"available"}

================================================================================
2025-03-11 22:45:24                                          15s elapsed
---- Requests ------------------------------------------------------------------
> Global                                                   (OK=14     KO=0     )
> Create Pet                                               (OK=5      KO=0     )
> Get Pet by ID                                            (OK=5      KO=0     )
> Find Pets by Status                                      (OK=4      KO=0     )

---- Pet Store API Test --------------------------------------------------------
[#############################---------------                              ] 40%
          waiting: 4      / active: 2      / done: 4
================================================================================

Created Pet ID: 0
Pet Response: {"id":0,"category":{"id":1,"name":"Dogs"},"name":"doggie","photoUrls":["https://example.com/dog.jpg"],"tags":[{"id":0,"name":"pet-tag"}],"status":"available"}
Get Pet Response: {"id":0,"category":{"id":1,"name":"Dogs"},"name":"doggie","photoUrls":["https://example.com/dog.jpg"],"tags":[{"id":0,"name":"pet-tag"}],"status":"available"}
Created Pet ID: 0
Pet Response: {"id":0,"category":{"id":1,"name":"Dogs"},"name":"doggie","photoUrls":["https://example.com/dog.jpg"],"tags":[{"id":0,"name":"pet-tag"}],"status":"available"}
Get Pet Response: {"id":0,"category":{"id":1,"name":"Dogs"},"name":"doggie","photoUrls":["https://example.com/dog.jpg"],"tags":[{"id":0,"name":"pet-tag"}],"status":"available"}

================================================================================
2025-03-11 22:45:29                                          20s elapsed
---- Requests ------------------------------------------------------------------
> Global                                                   (OK=20     KO=0     )
> Create Pet                                               (OK=7      KO=0     )
> Get Pet by ID                                            (OK=7      KO=0     )
> Find Pets by Status                                      (OK=6      KO=0     )

---- Pet Store API Test --------------------------------------------------------
[############################################--------                      ] 60%
          waiting: 3      / active: 1      / done: 6
================================================================================

Created Pet ID: 0
Pet Response: {"id":0,"category":{"id":1,"name":"Dogs"},"name":"doggie","photoUrls":["https://example.com/dog.jpg"],"tags":[{"id":0,"name":"pet-tag"}],"status":"available"}
Get Pet Response: {"id":0,"category":{"id":1,"name":"Dogs"},"name":"doggie","photoUrls":["https://example.com/dog.jpg"],"tags":[{"id":0,"name":"pet-tag"}],"status":"available"}
Created Pet ID: 0
Pet Response: {"id":0,"category":{"id":1,"name":"Dogs"},"name":"doggie","photoUrls":["https://example.com/dog.jpg"],"tags":[{"id":0,"name":"pet-tag"}],"status":"available"}

================================================================================
2025-03-11 22:45:34                                          25s elapsed
---- Requests ------------------------------------------------------------------
> Global                                                   (OK=25     KO=0     )
> Create Pet                                               (OK=9      KO=0     )
> Get Pet by ID                                            (OK=8      KO=0     )
> Find Pets by Status                                      (OK=8      KO=0     )

---- Pet Store API Test --------------------------------------------------------
[###########################################################--------       ] 80%
          waiting: 1      / active: 1      / done: 8
================================================================================

Get Pet Response: {"id":0,"category":{"id":1,"name":"Dogs"},"name":"doggie","photoUrls":["https://example.com/dog.jpg"],"tags":[{"id":0,"name":"pet-tag"}],"status":"available"}
Created Pet ID: 0
Pet Response: {"id":0,"category":{"id":1,"name":"Dogs"},"name":"doggie","photoUrls":["https://example.com/dog.jpg"],"tags":[{"id":0,"name":"pet-tag"}],"status":"available"}
Get Pet Response: {"id":0,"category":{"id":1,"name":"Dogs"},"name":"doggie","photoUrls":["https://example.com/dog.jpg"],"tags":[{"id":0,"name":"pet-tag"}],"status":"available"}

================================================================================
2025-03-11 22:45:39                                          30s elapsed
---- Requests ------------------------------------------------------------------
> Global                                                   (OK=29     KO=0     )
> Create Pet                                               (OK=10     KO=0     )
> Get Pet by ID                                            (OK=10     KO=0     )
> Find Pets by Status                                      (OK=9      KO=0     )

---- Pet Store API Test --------------------------------------------------------
[##################################################################--------] 90%
          waiting: 0      / active: 1      / done: 9
================================================================================


================================================================================
2025-03-11 22:45:39                                          30s elapsed
---- Requests ------------------------------------------------------------------
> Global                                                   (OK=30     KO=0     )
> Create Pet                                               (OK=10     KO=0     )
> Get Pet by ID                                            (OK=10     KO=0     )
> Find Pets by Status                                      (OK=10     KO=0     )

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
> request count                                         30 (OK=30     KO=0     )
> min response time                                      3 (OK=3      KO=-     )
> max response time                                     17 (OK=17     KO=-     )
> mean response time                                     6 (OK=6      KO=-     )
> std deviation                                          3 (OK=3      KO=-     )
> response time 50th percentile                          4 (OK=4      KO=-     )
> response time 75th percentile                          8 (OK=8      KO=-     )
> response time 95th percentile                          9 (OK=9      KO=-     )
> response time 99th percentile                         15 (OK=15     KO=-     )
> mean requests/sec                                      1 (OK=1      KO=-     )
---- Response Time Distribution ------------------------------------------------
> t < 800 ms                                            30 (100%)
> 800 ms <= t < 1200 ms                                  0 (  0%)
> t >= 1200 ms                                           0 (  0%)
> failed                                                 0 (  0%)
================================================================================

Reports generated in 0s.
Please open the following file: file:///Users/ddl/repo/my/petstore-performance-test-gatling/target/gatling/results/petstore-simulation-20250311214507926/index.html
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  36.793 s
[INFO] Finished at: 2025-03-11T22:45:40+01:00
[INFO] ------------------------------------------------------------------------
```