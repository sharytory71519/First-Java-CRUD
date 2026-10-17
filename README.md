# First-Java-CRUD

Simple Student Management CRUD application using Java 21, Spring Boot 3.5.7, Spring Data JPA and an in-memory H2 database.

## Requirements
- Java JDK 21
- Apache Maven 3.6.3 or newer

## Run
Open this folder (the one containing `pom.xml`) in IntelliJ IDEA as a Maven project, wait for dependency downloads, then run `FirstjavacrudApplication`.

Alternatively, in a terminal in this folder:

```bash
mvn spring-boot:run
```

Visit **http://localhost:8080/** to use the student-management interface. Add students, edit them, and delete them. The data is stored in memory and resets after restarting the application.

## REST API
- `GET /students` — list students
- `POST /students` — create student with JSON `{"name":"Alex","email":"alex@example.com"}`
- `PUT /students/{id}` — update student using the same JSON format
- `DELETE /students/{id}` — delete student
- `GET /students/welcome` — example welcome endpoint

H2 console: http://localhost:8080/h2-console (JDBC URL `jdbc:h2:mem:studentdb`, username `sa`, empty password).

## Assignment screenshots
Add your own screenshots to `doc/` showing the application, CRUD actions, startup logs, and GitHub commit history with both students' commits. These are intentionally not included because they must show your actual work.

## Collaboration
Each partner forks the other's public repository, creates a branch, pushes a small change, opens a pull request, and the repository owner reviews and merges it.
