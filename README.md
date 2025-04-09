# Employee Management System

A comprehensive web application for managing employee information, built with Spring Boot, Thymeleaf, and MySQL.

## Features

- Complete CRUD operations for employee records
- RESTful APIs for integration with other systems
- Responsive, modern UI with Bootstrap 5
- Form validation (both client and server-side)
- Detailed API documentation with Swagger UI

## Technologies Used

- **Backend**: Spring Boot 3.2.5, Spring Data JPA, Hibernate
- **Frontend**: Thymeleaf, Bootstrap 5, HTML/CSS/JavaScript
- **Database**: MySQL
- **Documentation**: Swagger/OpenAPI
- **Validation**: Spring Validation, Bean Validation
- **Tools**: Maven, Git

## Prerequisites

- JDK 21 or higher
- Maven 3.6+
- MySQL 8.0+

## Setup and Installation

1. **Clone the repository**

   ```bash
   git clone https://github.com/yourusername/employee-management.git
   cd employee-management
   ```

2. **Configure MySQL**

   Create a MySQL database named `employeedb` or update the database configuration in `application.properties`:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/employeedb
   spring.datasource.username=root
   spring.datasource.password=root
   ```

3. **Build and run the application**

   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. **Access the application**

   Open a web browser and navigate to: `http://localhost:8080/employees

## API Documentation

Swagger UI documentation is available at: `http://localhost:8080/swagger-ui/index.html`

### API Endpoints

| Method | URL                              | Description                     |
|--------|----------------------------------|---------------------------------|
| GET    | /employees                   | Get all employees               |
| POST   | /employees/add               | Create a new employee           |
| PUT    | /employees/edit/{id}         | Update an existing employee     |
| DELETE | /employees                   | Delete an employee              |
    |

## Data Model

The Employee entity contains the following fields:

- id: Long (Primary Key)
- name: String (required)
- email: String (required, unique)
- salary: Double
- department: String (required)


## Folder Structure

```
employeeManagSys/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── employee/
│   │   │           └── management/
│   │   │               ├── controller/ # REST & Web Controllers
│   │   │               ├── swagger/    # 
│   │   │               ├── exception/  # Exception handler
│   │   │               ├── model/      # Employee entity
│   │   │               ├── repository/ #Spring Data JPA Repositories
│   │   │               ├── service/    # Service layer
│   │   │               └── EmployeeManagementApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       │   
│   │        ── templates/      # Thymeleaf HTML templates
│   │       │   ├── add-employee/
│   │       │   └── edit-employee/ 
                └── employee/ 
│   │       └── application.properties
│   └── test/
├── .gitignore
├── mvnw
├── pom.xml    # Project dependencies

    employee-management-app/
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │   └── com/employee/management/
    │   │   │       ├── controller/     # REST & Web Controllers
    │   │   │       ├── model/          # Employee entity
    │   │   │       ├── repository/     # Spring Data JPA Repositories
    │   │   │       └── service/        # Service layer
    │   │   └── resources/
    │   │       ├── static/             # Static assets (CSS/JS)
    │   │       ├── templates/          # Thymeleaf HTML templates
    │   │       └── application.properties
    │   └── test/                       # Unit & integration tests
    ├── pom.xml                         # Project dependencies
    └── README.md                       # Documentation
