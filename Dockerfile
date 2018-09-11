FROM openjdk:8-alpine
ARG VERSION=0.1.0
ADD springcloudkubernetes-${VERSION}.jar /springcloudkubernetes.jar
CMD java -jar /springcloudkubernetes.jar