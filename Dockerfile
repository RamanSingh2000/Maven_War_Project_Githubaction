FROM openjdk:8
EXPOSE 8087
ADD target/devops-integration.war devops-integration.war
ENTRYPOINT ["java","-jar","/devops-integration.war"]
