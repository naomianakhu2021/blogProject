FROM openjdk:11
LABEL maintainer="naomiAnakhu"
ADD target/blogProject-0.0.1-SNAPSHOT.jar blogProject.jar
ENTRYPOINT ["java", "-jar", "sblogProject.jar"]