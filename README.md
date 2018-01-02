# course-api
###Here we are are docker with spring boot application This is the simple rest api application 
## step by step command to run spring boot application on docker container
-We already know how to create a project on sts using spring boot.
# I am ging to mension what are the dependencies packages on 
- We need Two dependencies packages to run spring boot application on docker
1. <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-tomcat -->
		<dependency>
    			<groupId>org.springframework.boot</groupId>
    			<artifactId>spring-boot-starter-tomcat</artifactId>
    			<version>1.5.9.RELEASE</version>
		</dependency>
		
2. <!-- https://mvnrepository.com/artifact/tomcat/jasper-runtime -->
		<dependency>
    			<groupId>tomcat</groupId>
    			<artifactId>jasper-runtime</artifactId>
    			<version>5.5.23</version>
		</dependency>


3. We have to mension Final name of application because it make easy to run docker command 
-- we can see where to put dependency on pom.xml 

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
		<finalName>course-api-docker</finalName>
	</build>
4. we have to create Docker file and add these command

5. ####FROM openjdk:8u151-jdk
6. ####ADD /target/course-api-docker.jar course-api-docker.jar
7. ####RUN bash -c 'touch /course-api-docker.jar'
8. ####EXPOSE 8080
9. ####ENTRYPOINT ["java","-jar","/course-api-docker.jar"]
10. ### configuration is almost finish we can add other dependencies depending  our application

11. Now open terminal(if we have windowa machine then open git cli) navigate your project location
##Before running the command there must be mavan, docker and openjdk(manage home directory for jdk) installed on our machine
 
##### mvn install
12. $  docker images
=> it will images on our docker
13. $  docker build -f Dockerfile -t docker-spring-boot1 .
=> it will create docker images
14. $  docker images
=> list all available images on our machine
15. $  docker run -p 8080:8080 docker-spring-boot1
=> running our docker images with viewing logs when you are going to exit form your terminal application is immidiatly  stop
16. $  docker run -d -p 8080:8080 docker-spring-boot1
=> running our application backgroun with out viewing log. you can see your aplication using your browser

##Git command for push to the master and dont forgate to 
…or create a new repository on the command line

###echo "# course-api" >> README.md
###git init
###git add README.md
###git commit -m "first commit"
###git remote add origin https://github.com/gkdangal/course-api.git
###git push -u origin master
###…or push an existing repository from the command line

###git remote add origin https://github.com/gkdangal/course-api.git
###git push -u origin master
