FROM adoptopenjdk/openjdk15
COPY target/spring-k8s-configmap-demo-1.0.0-SNAPSHOT.jar /usr/local/src/spring-k8s-configmap-demo.jar
EXPOSE 8080
WORKDIR /usr/local/src
ENTRYPOINT ["java", "-jar", "/usr/local/src/spring-k8s-configmap-demo.jar"]