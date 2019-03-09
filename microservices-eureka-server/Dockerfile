FROM openjdk:8-jdk-alpine
VOLUME /tmp
#RUN apk add --no-cache bash
ADD target/*.jar /app/
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app/microservices-eureka-server.jar" ]