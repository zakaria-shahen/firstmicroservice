FROM openjdk:20-ea-17-slim as build

LABEL maintainer = "Zakaria Shahen <secret@gmail.com>"

ARG JAR_FILE
ARG TARGET=target/dependency

COPY ${JAR_FILE} app.jar

RUN mkdir -p ${TARGET} && (cd ${TARGET}; jar -xf /app.jar)

FROM openjdk:20-ea-17-slim

VOLUME /tmp

ARG DEPENDENCY=/target/dependency
COPY --from=build ${DEPENDENCY}/BOOT-INF/lib     /app/lib
COPY --from=build ${DEPENDENCY}/META-INF         /app/META-INF
COPY --from=build ${DEPENDENCY}/BOOT-INF/classes /ap

ENTRYPOINT ["java", "-cp", "app:app/lib/*", "com.mycompany.firstmicroservice.FirstMicroserviceApplication"]
