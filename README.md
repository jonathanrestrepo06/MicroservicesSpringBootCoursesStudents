# MicroservicesSpringBootCoursesStudents
# Microservices with Spring Boot

This project contains a microservices architecture built with Spring Boot. The included microservices are students, courses, and registry and configuration services Eureka and Config.

## Project Structure and Configuration

### Services and Ports

| Service       | Port | Description                          |
| --------------|------|--------------------------------------|
| MSVC-COURSE   | 9090 | Course management microservice       |
| MSVC-EUREKA   | 8761 | Eureka registration service          |
| MSVC-GATEWAY  | 8080 | Gateway service                      |
| MSVC-STUDENT  | 8090 | Student management microservice      |

## Requirements

- JDK 11 or higher
- MySQL
- PostgreSQL

## Configuration

### Database Configuration

#### students

Set MySQL credentials in `students/src/main/resources/msvc-student.yml`.

```yaml
spring:
  application:
    name: msvc-student
  config:
    import: optional:configserver:http://localhost:8888
```
