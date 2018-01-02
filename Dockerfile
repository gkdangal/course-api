FROM openjdk:8u151-jdk
ADD /target/course-api-docker.jar course-api-docker.jar
RUN bash -c 'touch /course-api-docker.jar'
EXPOSE 8080
ENTRYPOINT ["java","-jar","/course-api-docker.jar"]
