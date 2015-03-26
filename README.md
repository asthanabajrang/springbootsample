# springbootsample
sample application in spring boot with unit test cases using mock mvc

Requirements
1. JDK 7 or higher
2. Maven 3 or higer

Run this application

1. Using maven

  mvn spring-boot:run

2. package application in jar and run from command line 

  mvn package

  jar -jar <jar name>


-----

The inbuilt tomcat server will start at default port 8080.

To access service create REST Get request or directly put below url in browser:

http://localhost:8080/hello?name=<Your Name>

....
