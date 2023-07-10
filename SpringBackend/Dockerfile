FROM amazoncorretto:17-alpine-jdk as builder
RUN   apk update \
  &&  apk add maven
COPY . .

RUN --mount=type=cache,target=/root/.m2  mvn compile \
  &&  mvn package

FROM amazoncorretto:17-alpine-jdk as runner 
COPY --from=builder /target/*.jar app.jar
ARG JAR_FILE
ENTRYPOINT ["java","-jar","/app.jar"] 