The application does not implement the login functionality as I tried to implemented that but there are configurational errors. I tried to debug it but won't able to resolve sp uploading this one only you can 
test all the mentioned features by the PostMan that I will mention later in this readme.

#To run the application follow the given steps:

  1.Clone the project.
  2. Navigate the location in the folder where pom.xml is found and open in terminal.
  3. Run the following commands:
  
    # Clean the project
    mvn clean

    # Compile the project
    mvn compile

    # Package the project
    mvn package

    # Run the application (Spring Boot)
    mvn spring-boot:run


Now, you can test the api with the base URL: http://localhost:8080/api

  =>/student:-
  
    **/addStudent: for adding student in the database->
                    {
                      "name": "John Doe",
                      "address": "123 Main St",
                      "subjects": [
                            {"name": "Math"},
                            {"name": "Science"}
                            ]
                    }

    **/getAllStudents: for getting all the students.

    **getAllSub?studentName={param}
              -> param is name in the db. It gets all the subjects the student has.

  =>/subject:-
  
    **/getAllSub: for fetching all the subjects in the database.


  Following the above instructions you will get all the required functions.


******IMPORTANT:- The repository that has all the configuration for login and authentication in is present in this repo.  https://github.com/Anubhav8176/AndroidAssessment
But the application has some configurational errors.********
