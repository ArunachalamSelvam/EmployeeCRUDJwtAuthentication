#Employee CRUD With JWT Authentication

The Employee Management System with JWT Authentication is a web application designed to streamline employee management tasks while ensuring secure access to the system. It provides functionalities for adding, updating, and deleting employee records. Additionally, the system incorporates JSON Web Token (JWT) authentication for user authentication and authorization purposes, ensuring secure access to the system's resources.

API Documentation.

Employee Controller
Add Employee
URL: /addEmployee
Method: POST
Request Body: JSON object representing the Employee model
Response:
Success: Employee ID is added successfully.
Failure: Employee could not be added.

Get Employees
URL: /getEmployees
Method: GET
Response: JSON array containing a list of Employee objects
Update Employee
URL: /updateEmployee/{employeeId}
Method: POST
Path Variables: employeeId (long)
Request Body: JSON object representing the updated Employee model
Response: A message indicating the success or failure of the update operation

Delete Employee
URL: /deleteEmployee/{employeeId}
Method: DELETE
Path Variables: employeeId (long)
Response: A message indicating the success or failure of the delete operation

JWT Authentication Controller

Authenticate User
URL: /authenticate
Method: POST
Request Body: JSON object containing username and password
Response:
Success: JWT token
Failure: Error message

Register User
URL: /register
Method: POST
Request Body: JSON object representing the UserDTO model
Response:
Success: Details of the registered user
Failure: Error message
