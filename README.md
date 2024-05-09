## Employee CRUD Application

This Spring Boot program implements a CRUD (Create, Read, Update, Delete) application for managing employee records. It consists of several components:

1. **EmployeeController**: This controller class defines REST endpoints for managing employee data.

   - `GET /getAllEmployee`: Retrieves all employee records from the database.
   
   - `POST /addEmployee`: Adds a new employee record to the database. It accepts JSON data representing the new employee.

   - `PUT /updateEmployee/{id}`: Updates an existing employee record in the database. It accepts the employee ID in the URL path and the updated employee details in the request body.

   - `DELETE /deleteEmployee/{id}`: Deletes an existing employee record from the database. It accepts the employee ID in the URL path.

2. **EmployeeService**: This service interface declares methods for managing employee data.

   - `getAllEmployee()`: Retrieves all employee records.
   
   - `addEmployee(Employee employee)`: Adds a new employee record.
   
   - `updateEmployee(Long id, Employee updatedEmployee)`: Updates an existing employee record.
   
   - `deleteEmployee(Long id)`: Deletes an existing employee record.

3. **EmployeeServiceImpl**: This service implementation class provides the business logic for managing employee data. It interacts with the DAO layer to perform CRUD operations on the database.

4. **EmployeeDao**: This DAO (Data Access Object) interface declares methods for database interaction.

   - `getAllEmployee()`: Retrieves all employee records.
   
   - `addEmployee(Employee employee)`: Adds a new employee record.

5. **EmployeeDaoImpl**: This DAO implementation class uses Spring JDBC's JdbcTemplate to interact with the database. It contains methods to execute SQL queries for retrieving and adding employee records.

6. **Employee**: This simple POJO (Plain Old Java Object) class represents an employee entity. It has fields for storing the employee's ID and name.

### Endpoints
- **Retrieve all employees**: 
  - `GET http://localhost:8080/getAllEmployee`

- **Add a new employee**: 
  - `POST http://localhost:8080/addEmployee`

- **Update an existing employee**: 
  - `PUT http://localhost:8080/updateEmployee/{id}`
  - Request Body: JSON data representing the updated employee.

- **Delete an existing employee**: 
  - `DELETE http://localhost:8080/deleteEmployee/{id}`

This application follows a standard MVC (Model-View-Controller) architecture, ensuring separation of concerns and maintainability. It uses Spring Boot's auto-configuration and component scanning for easy setup and integration.
