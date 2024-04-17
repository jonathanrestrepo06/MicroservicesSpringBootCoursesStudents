# MicroservicesSpringBootCoursesStudents
# Microservices with Spring Boot

This project contains a microservices architecture built with Spring Boot. The included microservices are students, courses, and registry and configuration services Eureka and Config.

## Project Structure and Configuration

### Services and Ports

| Service      | Port | Description                  |
|--------------|------|------------------------------|
| MSVC-COURSE  | 9090 | Course management microservice |
| MSVC-EUREKA  | 8761 | Eureka registration service  |
| MSVC-GATEWAY | 8080 | Gateway service              |
| MSVC-STUDENT | 8090 | Student management microservice|

## Requirements

- JDK 11 or higher
- MySQL
- PostgreSQL

## Configuration

### Database Configuration

#### students:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/students_db
spring.datasource.username=root
spring.datasource.password=root

courses:
spring.datasource.url=jdbc:postgresql://localhost:5432/courses_db
spring.datasource.username=postgres
spring.datasource.password=postgres

Eureka and Config Server Configuration
eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka/
spring.cloud.config.uri=http://localhost:8888

Execution
Run Eureka Server (MSVC-EUREKA on port 8761).
Run Config Server (MSVC-GATEWAY on port 8080).
Run students (MSVC-STUDENT on port 8090) and courses (MSVC-COURSE on port 9090) in any order.

Access http://localhost:8761 to view the Eureka registry.

Usage
The students and courses microservices can be consumed through the gateway at:

http://localhost:8080/students
http://localhost:8080/courses

Contributions

Contributions are welcome! Please open an issue or send a pull request.

