# ROBOT apocalypse
 developing a REST API 


Welcome to the Survivor API, your last hope in the midst of the robot apocalypse. 
This REST API is designed to help you manage information about survivors and resources,
as well as provide crucial reports to aid the resistance.

Technologies Used

Java: The API is implemented using Java and the Spring Boot framework.

PostgreSQL: The database is powered by PostgreSQL to store survivor and resource information.

IntelliJ IDEA: The development tool used for building and running the project.

Endpoints
1. Register Survivor
   
Endpoint: POST /survivor/registerSurvivor

Description: Register a survivor with their name, age, gender, ID, last location, and initial inventory of resources (Water, Food, Medication, Ammunition).

2. Register Resources
   
Endpoint: POST /survivor/registerResources

Description: Register additional resources to a survivor's inventory.

3. Update Survivor Location
   
Endpoint: PUT /survivor/{id}/update-location

Description: Update the last location of a survivor by providing their ID, longitude, and latitude.

4. Flag Survivor as Infected
   
Endpoint: GET /survivor/getSurvivorStatus

Description: Flag a survivor as infected when at least three other survivors report their contamination.

5. Get All Survivors

Endpoint: GET /survivor/getAllSurvivors

Description: Retrieve a list of all registered survivors.

6. Reports
   
 Percentage of Infected and Non-Infected Survivors
   
Endpoint: GET /survivor/getSurvivorPercentage

Description: Get the percentage of infected and non-infected survivors.

7 List of Infected Survivors

Endpoint: GET /survivor/getInfectedSurvivors

Description: Get a list of survivors marked as infected.

8 List of Non-Infected Survivors

Endpoint: GET /survivor/getNonInfectedSurvivors

Description: Get a list of survivors not marked as infected.

 List of Robots

Endpoint: GET /survivor/getRobots

Description: Connect to the Robot CPU system to get a list of all robots and their known locations, categorized as Flying robots and Land robots.


How to Run:

Clone the repository.

Open the project in IntelliJ IDEA.

Configure the PostgreSQL database settings in application.properties.

Run the application.
