## OpenAPI client generation
`./gradlew openApiGenerate`
https://github.com/OpenAPITools/openapi-generator/tree/master/modules/openapi-generator-gradle-plugin

## Copy specification and client
`export version=v11.0; cp ~/Downloads/openApiSpecification_$version.json . ; cp ~/Downloads/generatedClient_$version.jar libs`

## Compare specifications
docker run --rm -t \
-v $(pwd):/specs:ro \
openapitools/openapi-diff:latest /specs/openApiSpecification_v5.0.json /specs/openApiSpecification_v7.0.json  

Alternative way of comparing specification => https://app.swaggerhub.com/apis/amartyushov/sut/v7.0

## openapi.tools
https://openapi.tools/

## Swagger ui
http://localhost:8080/swagger-ui.html