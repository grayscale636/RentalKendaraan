# Vehicle Rental

## Description
Vehicle Rental is a web-based application designed to facilitate users in renting vehicles, including cars and motorcycles. This application provides an intuitive interface for viewing the available vehicles and making reservations.

## Key Features
- **Vehicle List**: Users can view all vehicles available for rent.
- **User Management**: Users can register and manage their personal information.
- **RESTful API**: The application uses APIs to interact between the frontend and backend.

## Technologies Used
- **Backend**: 
  - Java
  - Spring Boot
  - JPA (Java Persistence API)
  - PostgreSQL as the database
- **Frontend**: 
  - HTML
  - CSS (Tailwind CSS)
  - JavaScript

## Installation
1. **Clone the Repository**
   ```bash
   git clone <repository-url>
   cd rental-kendaraan
   ```

2. **Setup Database**
   - Create a new database in PostgreSQL named `rental_kendaraan`.
   - Adjust the database configuration in `src/main/resources/application.properties`.

3. **Run the Backend**
   - Navigate to the `backend` directory and run the following command:
   ```bash
   mvn spring-boot:run
   ```

4. **Run the Frontend**
   - Open the `index.html` file in a browser to access the user interface.

## Usage
- Once the application is running, open a browser and access `http://localhost:8080/kendaraan` to view the list of available vehicles.
- You can use the API to perform CRUD operations on users and vehicles.

## Contributing
If you would like to contribute to this project, please fork this repository and create a pull request with your changes.