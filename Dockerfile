FROM openjdk:20-ea-17-slim as build

LABEL maintainer = "Zakaria Shahen <secret@gmail.com>"
WORKDIR app
ARG JAR_FILE
ARG TARGET=target/*

COPY ${JAR_FILE} app.jar

RUN jave -Djarmode=layertools -jar app.jar extract

FROM openjdk:20-ea-17-slim

VOLUME /tmp
WORKDIR app
COPY --from=build application/dependencies/          ./
COPY --from=build application/spring-boot-loader/    ./
COPY --from=build application/snapshot-dependencies/ ./
COPY --from=build application/application/           ./

ENTRYPOINT ["java", "org.springframework.boot.loader.JarLauncher"]