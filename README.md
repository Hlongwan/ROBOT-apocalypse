# ROBOT apocalypse
 developing a REST API 

README for Robot Apocalypse Survivor System
Project Overview
Welcome to the Robot Apocalypse Survivor System! In the midst of a global robotic takeover, this project aims to provide a REST API to manage information about survivors and their resources. As a last coding survivor, your mission is to implement key functionalities, including survivor registration, location updates, infection tracking, and integration with the Robot CPU system.

Use Cases
1. Add Survivors to the Database
A survivor includes essential details such as name, age, gender, ID, and last location (latitude, longitude).
Each survivor has an inventory of resources, including Water, Food, Medication, and Ammunition.

3. Update Survivor Location
Survivors can update their last location by providing a new latitude and longitude.

5. Flag Survivor as Infected
Survivors can be marked as infected when at least three others report their contamination.

7. Connect to the Robot CPU System
Integration with the Robot CPU system to fetch a list of all robots and their known locations. Robots are categorized as Flying and Land robots.

9. Reports
Percentage of infected and non-infected survivors.
Lists of infected and non-infected survivors.
List of Robots.
How to Run the Project
Clone the Repository:



Open Project in IntelliJ:

Import the project into IntelliJ IDEA.
Configure PostgreSQL:

Set up a PostgreSQL database and update the application.properties file with the database URL, username, and password.
Build and Run:

Build and run the project using IntelliJ or run the ./gradlew bootRun command.
Access Endpoints:

The API will be accessible at http://localhost:8080

Endpoints

Survivor Controller
POST /survivor/registerSurvivor:
Register a new survivor with details and an initial resource inventory.

POST /survivor/registerResources:
Register resources for a survivor.

GET /survivor/getAllSurvivors:
Retrieve all survivors.

PUT /survivor/{id}/update-location:
Update survivor location based on the provided ID.

GET /survivor/getSurvivorStatus:
Get the infected status of a survivor.

GET /survivor/getSurvivorPercentage:
Get the percentage of infected and non-infected survivors.

GET /survivor/getInfectedSurvivors:
Get a list of infected survivors.

GET /survivor/getNonInfectedSurvivors:
Get a list of non-infected survivors.

Robots Controller
GET /robots/all:
Retrieve a list of robots from the Robot CPU system.
Resources Used
Spring Boot
PostgreSQL
Gradle
IntelliJ IDEA
RestTemplate for API integration
