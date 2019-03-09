FROM openjdk:8-jdk-alpine
VOLUME /tmp
#RUN apk add --no-cache bash
ADD target/*.jar /app/
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app/microservices-config-server.jar" ]
#HEALTHCHECK --interval=30s --timeout=30s CMD curl -f http://localhost:9090/actuator/health || exit 1