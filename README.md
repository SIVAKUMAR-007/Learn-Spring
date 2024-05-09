# Learn-Spring
This Spring Boot program implements an Employee CRUD (Create, Read, Update, Delete) application. It consists of several components:

1. **EmployeeController**: This controller class defines two REST endpoints:
   - `GET /getAllEmployee`: Retrieves all employee records from the database.
   - `POST /addEmployee`: Adds a new employee record to the database. It accepts JSON data representing the new employee.

2. **EmployeeService**: This service interface declares methods for managing employee data:
   - `getAllEmployee()`: Retrieves all employee records.
   - `addEmployee(Employee employee)`: Adds a new employee record.

3. **EmployeeServiceImpl**: This service implementation class provides the business logic for managing employee data. It interacts with the DAO layer to perform CRUD operations on the database.

4. **EmployeeDao**: This DAO (Data Access Object) interface declares methods for database interaction:
   - `getAllEmployee()`: Retrieves all employee records.
   - `addEmployee(Employee employee)`: Adds a new employee record.

5. **EmployeeDaoImpl**: This DAO implementation class uses Spring JDBC's JdbcTemplate to interact with the database. It contains methods to execute SQL queries for retrieving and adding employee records.

6. **Employee**: This simple POJO (Plain Old Java Object) class represents an employee entity. It has fields for storing the employee's ID and name.

Endpoints:
- To retrieve all employees: `GET http://localhost:8080/getAllEmployee`
- To add a new employee: `POST http://localhost:8080/addEmployee`

This application follows a standard MVC (Model-View-Controller) architecture, ensuring separation of concerns and maintainability. It uses Spring Boot's auto-configuration and component scanning for easy setup and integration.
