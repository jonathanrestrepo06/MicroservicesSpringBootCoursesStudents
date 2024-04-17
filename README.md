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
courses
Set PostgreSQL credentials in courses/src/main/resources/msvc-course.yml.

```yaml
Copy code
spring:
  application:
    name: msvc-course
  config:
    import: optional:configserver:http://localhost:8888
```

Gateway Configuration
Set gateway configuration in gateway/src/main/resources/msvc-gateway.yml.

``` yaml
Copy code
spring:
  application:
    name: msvc-gateway
  config:
    import: optional:configserver:http://localhost:8888
```
Eureka Configuration
Set Eureka configuration in eureka/src/main/resources/msvc-eureka.yml.

```yaml
Copy code
spring:
  application:
    name: msvc-eureka
  config:
    import: optional:configserver:http://localhost:8888
```
