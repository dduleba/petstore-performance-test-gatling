# petstore-performance-test-gatling

Na potrzeby prezentacji korzystamy z aplikacji
https://github.com/swagger-api/swagger-petstore
https://petstore3.swagger.io/

Przed rozpoczęciem testów startujemy aplikacje:

```shell
docker pull swaggerapi/petstore3:unstable
docker run  --name swaggerapi-petstore3 -d -p 8080:8080 swaggerapi/petstore3:unstable
```

[stworzenie repozytorium](docs/create_repo.md)

[pierwszy run testów](docs/run_tests_01.md)

[pierwszy run testów](docs/fix_tests_01.md)
