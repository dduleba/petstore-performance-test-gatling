# petstore-performance-test-gatling

Na potrzeby prezentacji korzystamy z aplikacji
https://github.com/swagger-api/swagger-petstore
https://petstore3.swagger.io/

Przed rozpoczęciem testów startujemy aplikacje:

```shell
docker pull swaggerapi/petstore3:unstable
docker run  --name swaggerapi-petstore3 -d -p 8080:8080 swaggerapi/petstore3:unstable

mvn gatling:test
```

[stworzenie repozytorium](docs/00_create_repo.md)

[pierwszy run testów](docs/01_run_tests.md)

[pierwsze poprawki w tescie](docs/01_fix_tests.md)

[drugie uruchomienie testów](docs/02_run_tests.md)

[drugie poprawki w teście](docs/02_fix_tests.md)

[trzecie uruchomienie testów](docs/03_run_tests.md)


[podbicie wersji](docs/04_gatling_fix_warnings.md)

[uruchomienie testów](docs/04_run_tests.md)


[popprawaka na nowszą wersje java](docs/05_fix_java.md)