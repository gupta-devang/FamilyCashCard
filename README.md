# Cash Card Management System

This Spring Boot application showcases CRUD operations and Spring Security implementation for managing cash cards. It provides a RESTful API for creating, reading, updating, and deleting cash card records with user authentication and authorization.

## Features

- CRUD operations for cash cards
- User authentication and role-based authorization
- Pagination and sorting for cash card listings
- Comprehensive unit tests

## Technologies Used

- Spring Boot
- Spring Security
- Spring Data JPA
- JUnit 5
- Gradle

## Setup and Installation

1. Ensure you have Java JDK 11 or later installed.
2. Clone this repository.
3. Navigate to the project directory.
4. Run the application using:
   ```
   ./gradlew bootRun
   ```
   For Windows:
   ```
   gradlew.bat bootRun
   ```

## API Endpoints

- GET `/cashcards`: Retrieve all cash cards (paginated)
- GET `/cashcards/{id}`: Retrieve a specific cash card
- POST `/cashcards`: Create a new cash card
- PUT `/cashcards/{id}`: Update an existing cash card
- DELETE `/cashcards/{id}`: Delete a cash card

All endpoints require authentication.

## Security

- Basic authentication is implemented.
- Users are assigned roles (CARD-OWNER or NON-OWNER).
- Only CARD-OWNER role can access cash card endpoints.
- Passwords are encoded using BCrypt.

## Testing

The project includes comprehensive unit tests covering:
- Cash card CRUD operations
- Security configuration
- JSON serialization/deserialization

Run tests using:
```
./gradlew test
```
For Windows:
```
gradlew.bat test
```