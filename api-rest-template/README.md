# API RESTFull Template

This project is a simple example of how to implement a RESTful API with Spring Boot, H2 Database, Postgres, Mappers, and CQRS pattern.

### Technologies

- Java 17+
- Spring Boot 3.3.8
- H2 Database

### How to run

1. Run the command `mvn clean install` to build the project.
2. Run the command `$env:SPRING_PROFILES_ACTIVE="local"` to set the environment variable.
   (For Windows, use the command `set SPRING_PROFILES_ACTIVE=local`)
   (For Linux, use the command `export SPRING_PROFILES_ACTIVE=local`)
3. Run the command `mvn spring-boot:run` to start the application.
4. Access the URL `http://localhost:8085/swagger-ui/index.html` to see the API documentation.

### Docker

1. Build the Docker image using the command `docker-compose up -d`.
2. Down the Docker image using the command `docker-compose down -v`.
3. Remove the Docker image using the command `docker rmi -f api-rest-template-api-rest-template`.
4. Remove the volume using the command `docker volume rm postgres-data-rest-template`.

### API

The API documentation is available at `http://localhost:8085/v3/api-docs`.

List of available endpoints:

1. Create a new user
2. Get all users
3. Get user by ID
4. Update user
5. Delete user

### JoCoCo Report

1. Run the command `mvn clean package` to build the project.
2. The JoCoCo report is available in the `target/site/jacoco/index.html` file.

### Author

- **Raul Bolivar Navas** - [rasysbox](https://github.com/raulrobinson/cqrs-clean-architecture-mapstruct-jpa)

### License

This project is licensed under the MIT License - see the [LICENSE](https://www.apache.org/licenses/LICENSE-2.0) file for details.