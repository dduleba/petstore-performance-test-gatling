# Uruchomienie testów

```shell
rm -rf target/                                                                                                                                                                                     in zsh at 23:21:46
rm -rf ~/.m2/repository/io/gatling/

# Wykonaj kompilację od nowa
mvn clean compile
mvn gatling:test
[INFO] Scanning for projects...
[INFO]
[INFO] ---------------< org.example:petstore-performance-tests >---------------
[INFO] Building petstore-performance-tests 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/highcharts/gatling-charts-highcharts/3.13.5/gatling-charts-highcharts-3.13.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/highcharts/gatling-charts-highcharts/3.13.5/gatling-charts-highcharts-3.13.5.pom (2.4 kB at 4.8 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-app/3.13.5/gatling-app-3.13.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-app/3.13.5/gatling-app-3.13.5.pom (4.1 kB at 90 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-core/3.13.5/gatling-core-3.13.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-core/3.13.5/gatling-core-3.13.5.pom (8.5 kB at 154 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-netty-util/3.13.5/gatling-netty-util-3.13.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-netty-util/3.13.5/gatling-netty-util-3.13.5.pom (4.4 kB at 103 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-shared-util_2.13/0.0.12/gatling-shared-util_2.13-0.0.12.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-shared-util_2.13/0.0.12/gatling-shared-util_2.13-0.0.12.pom (2.1 kB at 52 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-quicklens/3.13.5/gatling-quicklens-3.13.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-quicklens/3.13.5/gatling-quicklens-3.13.5.pom (2.4 kB at 55 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-commons/3.13.5/gatling-commons-3.13.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-commons/3.13.5/gatling-commons-3.13.5.pom (4.3 kB at 69 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-jsonpath/3.13.5/gatling-jsonpath-3.13.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-jsonpath/3.13.5/gatling-jsonpath-3.13.5.pom (3.8 kB at 83 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-shared-model_2.13/0.0.11/gatling-shared-model_2.13-0.0.11.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-shared-model_2.13/0.0.11/gatling-shared-model_2.13-0.0.11.pom (2.3 kB at 49 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-shared-cli/0.0.6/gatling-shared-cli-0.0.6.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-shared-cli/0.0.6/gatling-shared-cli-0.0.6.pom (1.7 kB at 32 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-core-java/3.13.5/gatling-core-java-3.13.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-core-java/3.13.5/gatling-core-java-3.13.5.pom (4.6 kB at 113 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-http/3.13.5/gatling-http-3.13.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-http/3.13.5/gatling-http-3.13.5.pom (4.1 kB at 103 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-http-client/3.13.5/gatling-http-client-3.13.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-http-client/3.13.5/gatling-http-client-3.13.5.pom (9.1 kB at 206 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-http-java/3.13.5/gatling-http-java-3.13.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-http-java/3.13.5/gatling-http-java-3.13.5.pom (4.6 kB at 113 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-jms/3.13.5/gatling-jms-3.13.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-jms/3.13.5/gatling-jms-3.13.5.pom (4.2 kB at 83 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-jms-java/3.13.5/gatling-jms-java-3.13.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-jms-java/3.13.5/gatling-jms-java-3.13.5.pom (4.6 kB at 108 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-jdbc/3.13.5/gatling-jdbc-3.13.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-jdbc/3.13.5/gatling-jdbc-3.13.5.pom (3.6 kB at 78 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-jdbc-java/3.13.5/gatling-jdbc-java-3.13.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-jdbc-java/3.13.5/gatling-jdbc-java-3.13.5.pom (4.6 kB at 99 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-redis/3.13.5/gatling-redis-3.13.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-redis/3.13.5/gatling-redis-3.13.5.pom (3.6 kB at 83 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-redis-java/3.13.5/gatling-redis-java-3.13.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-redis-java/3.13.5/gatling-redis-java-3.13.5.pom (4.7 kB at 116 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-charts/3.13.5/gatling-charts-3.13.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-charts/3.13.5/gatling-charts-3.13.5.pom (3.6 kB at 87 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-recorder/3.13.5/gatling-recorder-3.13.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-recorder/3.13.5/gatling-recorder-3.13.5.pom (4.5 kB at 74 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-recorder-bc-shaded/1.80.0/gatling-recorder-bc-shaded-1.80.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-recorder-bc-shaded/1.80.0/gatling-recorder-bc-shaded-1.80.0.pom (5.9 kB at 131 kB/s)
[INFO]
[INFO] --- clean:3.2.0:clean (default-clean) @ petstore-performance-tests ---
[INFO]
[INFO] --- resources:3.3.1:resources (default-resources) @ petstore-performance-tests ---
[INFO] skip non existing resourceDirectory /Users/ddl/repo/my/petstore-performance-test-gatling/src/main/resources
[INFO]
[INFO] --- compiler:3.13.0:compile (default-compile) @ petstore-performance-tests ---
[INFO] No sources to compile
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.205 s
[INFO] Finished at: 2025-03-11T23:22:08+01:00
[INFO] ------------------------------------------------------------------------
[INFO] Scanning for projects...
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-maven-plugin/4.8.1/gatling-maven-plugin-4.8.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-maven-plugin/4.8.1/gatling-maven-plugin-4.8.1.pom (7.6 kB at 21 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-maven-plugin/4.8.1/gatling-maven-plugin-4.8.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-maven-plugin/4.8.1/gatling-maven-plugin-4.8.1.jar (66 kB at 874 kB/s)
[INFO]
[INFO] ---------------< org.example:petstore-performance-tests >---------------
[INFO] Building petstore-performance-tests 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] >>> gatling:4.8.1:test (default-cli) > test-compile @ petstore-performance-tests >>>
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/highcharts/gatling-charts-highcharts/3.13.5/gatling-charts-highcharts-3.13.5.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/highcharts/gatling-charts-highcharts/3.13.5/gatling-charts-highcharts-3.13.5.jar (186 kB at 1.7 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-app/3.13.5/gatling-app-3.13.5.jar
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-core/3.13.5/gatling-core-3.13.5.jar
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-netty-util/3.13.5/gatling-netty-util-3.13.5.jar
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-shared-util_2.13/0.0.12/gatling-shared-util_2.13-0.0.12.jar
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-quicklens/3.13.5/gatling-quicklens-3.13.5.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-app/3.13.5/gatling-app-3.13.5.jar (59 kB at 917 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-commons/3.13.5/gatling-commons-3.13.5.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-commons/3.13.5/gatling-commons-3.13.5.jar (177 kB at 1.3 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-jsonpath/3.13.5/gatling-jsonpath-3.13.5.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-netty-util/3.13.5/gatling-netty-util-3.13.5.jar (15 kB at 84 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-shared-model_2.13/0.0.11/gatling-shared-model_2.13-0.0.11.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-jsonpath/3.13.5/gatling-jsonpath-3.13.5.jar (133 kB at 632 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-core-java/3.13.5/gatling-core-java-3.13.5.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-shared-util_2.13/0.0.12/gatling-shared-util_2.13-0.0.12.jar (52 kB at 240 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-http/3.13.5/gatling-http-3.13.5.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-quicklens/3.13.5/gatling-quicklens-3.13.5.jar (108 kB at 464 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-http-client/3.13.5/gatling-http-client-3.13.5.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-shared-model_2.13/0.0.11/gatling-shared-model_2.13-0.0.11.jar (165 kB at 435 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-http-java/3.13.5/gatling-http-java-3.13.5.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-http-client/3.13.5/gatling-http-client-3.13.5.jar (186 kB at 452 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-jms/3.13.5/gatling-jms-3.13.5.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-core-java/3.13.5/gatling-core-java-3.13.5.jar (316 kB at 662 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-jms-java/3.13.5/gatling-jms-java-3.13.5.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-http-java/3.13.5/gatling-http-java-3.13.5.jar (118 kB at 189 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-jdbc/3.13.5/gatling-jdbc-3.13.5.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-jms/3.13.5/gatling-jms-3.13.5.jar (230 kB at 336 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-jdbc-java/3.13.5/gatling-jdbc-java-3.13.5.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-http/3.13.5/gatling-http-3.13.5.jar (1.3 MB at 1.8 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-redis/3.13.5/gatling-redis-3.13.5.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-jms-java/3.13.5/gatling-jms-java-3.13.5.jar (43 kB at 60 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-redis-java/3.13.5/gatling-redis-java-3.13.5.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-core/3.13.5/gatling-core-3.13.5.jar (1.8 MB at 2.4 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-charts/3.13.5/gatling-charts-3.13.5.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-jdbc/3.13.5/gatling-jdbc-3.13.5.jar (11 kB at 15 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-recorder/3.13.5/gatling-recorder-3.13.5.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-jdbc-java/3.13.5/gatling-jdbc-java-3.13.5.jar (5.6 kB at 7.6 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-shared-cli/0.0.6/gatling-shared-cli-0.0.6.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-redis/3.13.5/gatling-redis-3.13.5.jar (15 kB at 19 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-recorder-bc-shaded/1.80.0/gatling-recorder-bc-shaded-1.80.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-redis-java/3.13.5/gatling-redis-java-3.13.5.jar (7.8 kB at 10 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-shared-cli/0.0.6/gatling-shared-cli-0.0.6.jar (7.6 kB at 9.2 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-charts/3.13.5/gatling-charts-3.13.5.jar (393 kB at 360 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-recorder/3.13.5/gatling-recorder-3.13.5.jar (732 kB at 494 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-recorder-bc-shaded/1.80.0/gatling-recorder-bc-shaded-1.80.0.jar (8.8 MB at 3.9 MB/s)
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
[INFO]
[INFO] <<< gatling:4.8.1:test (default-cli) < test-compile @ petstore-performance-tests <<<
[INFO]
[INFO]
[INFO] --- gatling:4.8.1:test (default-cli) @ petstore-performance-tests ---
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-enterprise-plugin-commons/1.9.0-M7/gatling-enterprise-plugin-commons-1.9.0-M7.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-enterprise-plugin-commons/1.9.0-M7/gatling-enterprise-plugin-commons-1.9.0-M7.pom (3.0 kB at 62 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-scanner/1.4.0-M3/gatling-scanner-1.4.0-M3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-scanner/1.4.0-M3/gatling-scanner-1.4.0-M3.pom (2.3 kB at 56 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-asm-shaded/9.6/gatling-asm-shaded-9.6.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-asm-shaded/9.6/gatling-asm-shaded-9.6.pom (5.1 kB at 33 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-enterprise-plugin-commons/1.9.0-M7/gatling-enterprise-plugin-commons-1.9.0-M7.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-enterprise-plugin-commons/1.9.0-M7/gatling-enterprise-plugin-commons-1.9.0-M7.jar (150 kB at 2.7 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-scanner/1.4.0-M3/gatling-scanner-1.4.0-M3.jar
Downloading from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-asm-shaded/9.6/gatling-asm-shaded-9.6.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-asm-shaded/9.6/gatling-asm-shaded-9.6.jar (179 kB at 2.8 MB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/io/gatling/gatling-scanner/1.4.0-M3/gatling-scanner-1.4.0-M3.jar (12 kB at 124 kB/s)
23:22:16,584 |-INFO in ch.qos.logback.classic.LoggerContext[default] - This is logback-classic version 1.5.17
23:22:16,586 |-INFO in ch.qos.logback.classic.util.ContextInitializer@383bfa16 - No custom configurators were discovered as a service.
23:22:16,586 |-INFO in ch.qos.logback.classic.util.ContextInitializer@383bfa16 - Trying to configure with ch.qos.logback.classic.joran.SerializedModelConfigurator
23:22:16,587 |-INFO in ch.qos.logback.classic.util.ContextInitializer@383bfa16 - Constructed configurator of type class ch.qos.logback.classic.joran.SerializedModelConfigurator
23:22:16,594 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.scmo]
23:22:16,594 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback.scmo]
23:22:16,611 |-INFO in ch.qos.logback.classic.util.ContextInitializer@383bfa16 - ch.qos.logback.classic.joran.SerializedModelConfigurator.configure() call lasted 8 milliseconds. ExecutionStatus=INVOKE_NEXT_IF_ANY
23:22:16,612 |-INFO in ch.qos.logback.classic.util.ContextInitializer@383bfa16 - Trying to configure with ch.qos.logback.classic.util.DefaultJoranConfigurator
23:22:16,612 |-INFO in ch.qos.logback.classic.util.ContextInitializer@383bfa16 - Constructed configurator of type class ch.qos.logback.classic.util.DefaultJoranConfigurator
23:22:16,613 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.xml]
23:22:16,620 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Found resource [logback.xml] at [file:/Users/ddl/repo/my/petstore-performance-test-gatling/target/test-classes/logback.xml]
23:22:16,621 |-WARN in ch.qos.logback.classic.util.DefaultJoranConfigurator@4d465b11 - Resource [logback.xml] occurs multiple times on the classpath.
23:22:16,621 |-WARN in ch.qos.logback.classic.util.DefaultJoranConfigurator@4d465b11 - Resource [logback.xml] occurs at [jar:file:/Users/ddl/.m2/repository/io/gatling/gatling-maven-plugin/4.8.1/gatling-maven-plugin-4.8.1.jar!/logback.xml]
23:22:16,621 |-WARN in ch.qos.logback.classic.util.DefaultJoranConfigurator@4d465b11 - Resource [logback.xml] occurs at [file:/Users/ddl/repo/my/petstore-performance-test-gatling/target/test-classes/logback.xml]
23:22:16,782 |-INFO in ch.qos.logback.core.model.processor.AppenderModelHandler - Processing appender named [CONSOLE]
23:22:16,782 |-INFO in ch.qos.logback.core.model.processor.AppenderModelHandler - About to instantiate appender of type [ch.qos.logback.core.ConsoleAppender]
23:22:16,800 |-INFO in ch.qos.logback.core.model.processor.ImplicitModelHandler - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
23:22:16,852 |-INFO in ch.qos.logback.core.ConsoleAppender[CONSOLE] - BEWARE: Writing to the console can be very slow. Avoid logging to the
23:22:16,852 |-INFO in ch.qos.logback.core.ConsoleAppender[CONSOLE] - console in production environments, especially in high volume systems.
23:22:16,852 |-INFO in ch.qos.logback.core.ConsoleAppender[CONSOLE] - See also https://logback.qos.ch/codes.html#slowConsole
23:22:16,852 |-INFO in ch.qos.logback.classic.model.processor.RootLoggerModelHandler - Setting level of ROOT logger to WARN
23:22:16,856 |-INFO in ch.qos.logback.core.model.processor.AppenderRefModelHandler - Attaching appender named [CONSOLE] to Logger[ROOT]
23:22:16,856 |-INFO in ch.qos.logback.core.model.processor.DefaultProcessor@53fdffa1 - End of configuration.
23:22:16,857 |-INFO in ch.qos.logback.classic.joran.JoranConfigurator@5562c41e - Registering current configuration as safe fallback point
23:22:16,857 |-INFO in ch.qos.logback.classic.util.ContextInitializer@383bfa16 - ch.qos.logback.classic.util.DefaultJoranConfigurator.configure() call lasted 245 milliseconds. ExecutionStatus=DO_NOT_INVOKE_NEXT_IF_ANY

Warning: Unknown option -rsf
Warning: Unknown argument '/Users/ddl/repo/my/petstore-performance-test-gatling/src/test/resources'
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access using Lookup on io.gatling.core.stats.writer.StringInternals (file:/Users/ddl/.m2/repository/io/gatling/gatling-core/3.13.5/gatling-core-3.13.5.jar) to class java.lang.String
WARNING: Please consider reporting this to the maintainers of io.gatling.core.stats.writer.StringInternals
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
Simulation petstoretest.PetStoreSimulation started...
Created Pet ID: 0
Created Pet ID: 0

========================================================================================================================
2025-03-11 22:22:25 GMT                                                                               5s elapsed
---- Requests -----------------------------------------------------------------------|---Total---|-----OK----|----KO----
> Global                                                                             |         4 |         4 |         0
> Create Pet                                                                         |         2 |         2 |         0
> Get Pet by ID                                                                      |         1 |         1 |         0
> Find Pets by Status                                                                |         1 |         1 |         0

---- Pet Store API Test ------------------------------------------------------------------------------------------------
[###########||||||||||||                                                                                         ]   10%
          waiting:         8 / active:         1  / done:         1
========================================================================================================================

Created Pet ID: 0
Created Pet ID: 0

========================================================================================================================
2025-03-11 22:22:30 GMT                                                                              10s elapsed
---- Requests -----------------------------------------------------------------------|---Total---|-----OK----|----KO----
> Global                                                                             |        10 |        10 |         0
> Create Pet                                                                         |         4 |         4 |         0
> Get Pet by ID                                                                      |         3 |         3 |         0
> Find Pets by Status                                                                |         3 |         3 |         0

---- Pet Store API Test ------------------------------------------------------------------------------------------------
[#################################||||||||||||                                                                   ]   30%
          waiting:         6 / active:         1  / done:         3
========================================================================================================================

Created Pet ID: 0

========================================================================================================================
2025-03-11 22:22:35 GMT                                                                              15s elapsed
---- Requests -----------------------------------------------------------------------|---Total---|-----OK----|----KO----
> Global                                                                             |        14 |        14 |         0
> Create Pet                                                                         |         5 |         5 |         0
> Get Pet by ID                                                                      |         5 |         5 |         0
> Find Pets by Status                                                                |         4 |         4 |         0

---- Pet Store API Test ------------------------------------------------------------------------------------------------
[############################################||||||||||||                                                        ]   40%
          waiting:         5 / active:         1  / done:         4
========================================================================================================================

Created Pet ID: 0
Created Pet ID: 0

========================================================================================================================
2025-03-11 22:22:40 GMT                                                                              20s elapsed
---- Requests -----------------------------------------------------------------------|---Total---|-----OK----|----KO----
> Global                                                                             |        19 |        19 |         0                                                                                                                                                          [0/1925]
> Create Pet                                                                         |         7 |         7 |         0
> Get Pet by ID                                                                      |         6 |         6 |         0
> Find Pets by Status                                                                |         6 |         6 |         0

---- Pet Store API Test ------------------------------------------------------------------------------------------------
[###################################################################||||||||||||                                 ]   60%
          waiting:         3 / active:         1  / done:         6
========================================================================================================================

Created Pet ID: 0
Created Pet ID: 0

========================================================================================================================
2025-03-11 22:22:45 GMT                                                                              25s elapsed
---- Requests -----------------------------------------------------------------------|---Total---|-----OK----|----KO----
> Global                                                                             |        25 |        25 |         0
> Create Pet                                                                         |         9 |         9 |         0
> Get Pet by ID                                                                      |         8 |         8 |         0
> Find Pets by Status                                                                |         8 |         8 |         0

---- Pet Store API Test ------------------------------------------------------------------------------------------------
[#########################################################################################||||||||||||           ]   80%
          waiting:         1 / active:         1  / done:         8
========================================================================================================================

Created Pet ID: 0

========================================================================================================================
2025-03-11 22:22:50 GMT                                                                              30s elapsed
---- Requests -----------------------------------------------------------------------|---Total---|-----OK----|----KO----
> Global                                                                             |        29 |        29 |         0
> Create Pet                                                                         |        10 |        10 |         0
> Get Pet by ID                                                                      |        10 |        10 |         0
> Find Pets by Status                                                                |         9 |         9 |         0

---- Pet Store API Test ------------------------------------------------------------------------------------------------
[####################################################################################################||||||||||||]   90%
          waiting:         0 / active:         1  / done:         9
========================================================================================================================


========================================================================================================================
2025-03-11 22:22:50 GMT                                                                              30s elapsed
---- Requests -----------------------------------------------------------------------|---Total---|-----OK----|----KO----
> Global                                                                             |        30 |        30 |         0
> Create Pet                                                                         |        10 |        10 |         0
> Get Pet by ID                                                                      |        10 |        10 |         0
> Find Pets by Status                                                                |        10 |        10 |         0

---- Pet Store API Test ------------------------------------------------------------------------------------------------
[################################################################################################################]  100%
          waiting:         0 / active:         0  / done:        10
========================================================================================================================

Parsing log file(s)...
Parsing log file(s) done in 0s.
Generating reports...

========================================================================================================================
---- Global Information -------------------------------------------------------------|---Total---|-----OK----|----KO----
> request count                                                                      |        30 |        30 |         0
> min response time (ms)                                                             |         2 |         2 |         -
> max response time (ms)                                                             |        14 |        14 |         -
> mean response time (ms)                                                            |         4 |         4 |         -
> response time std deviation (ms)                                                   |         3 |         3 |         -
> response time 50th percentile (ms)                                                 |         3 |         3 |         -
> response time 75th percentile (ms)                                                 |         6 |         6 |         -
> response time 95th percentile (ms)                                                 |         7 |         7 |         -
> response time 99th percentile (ms)                                                 |        14 |        14 |         -
> mean throughput (rps)                                                              |      0.97 |      0.97 |         -
---- Response Time Distribution ----------------------------------------------------------------------------------------
> OK: t < 800 ms                                                                                             30   (100%)
> OK: 800 ms <= t < 1200 ms                                                                                   0     (0%)
> OK: t >= 1200 ms                                                                                            0     (0%)
> KO                                                                                                          0     (0%)
========================================================================================================================

Reports generated, please open the following file: file:///Users/ddl/repo/my/petstore-performance-test-gatling/target/gatling/petstoresimulation-20250311222219197/index.html
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  40.452 s
[INFO] Finished at: 2025-03-11T23:22:51+01:00
[INFO] ------------------------------------------------------------------------
```