FROM amazoncorretto:17-alpine-jdk as builder
RUN   apk update \
  &&  apk add maven
COPY . .

RUN --mount=type=cache,target=/root/.m2  mvn compile \
  &&  mvn package

FROM amazoncorretto:17-alpine-jdk as runner 
COPY --from=builder /target/*.jar app.jar
ARG JAR_FILE  

ENV DB_URL=jdbc:mysql://db:3306/mydb
ENV DB_USER=mysql
ENV DB_PASSWORD=password

ENTRYPOINT ["java","-jar","/app.jar"] 