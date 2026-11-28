# cs157a-project
Movie theater booking website

Prerequisites:
- Java 17 or higher
- MySQL Workbench 8.0 or higher

Installation Instructions (Tested for Windows but not Mac):

1. Clone repository into your preferred IDE
2. Launch MySQL Workbench and execute `user_initialize.sql`
   
&nbsp;&nbsp;&nbsp;3A. If using an IDE that has an integrated run button, simply run `WebApplication.java` (Like IntelliJ or VSCode)

&nbsp;&nbsp;&nbsp;3B. Otherwise, run the following command in the terminal:

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Windows: `.\mvnw.cmd spring-boot:run`

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;MacOS: `./mvnw spring-boot:run` (Not tested yet)

4. Open any browser and go to `http://localhost:8080/`

WORKSPACE NOTES (Will be deleted when we're all done):
- SQL files are stored in the `sql` folder. When new SQL files are created, add them to `src/main/resources/application.properties` at the bottom. I wrote a few templates, just uncomment and replace the name so that they can be executed
- If everything works correctly, we only need to connect the database through MySQL and execute `user_initialize.sql` only ONCE so that it's easier to work with (we need to run once so that the local database user is created). Afterwards, whenever the SQL files are edited, Java SpringBoot will automatically connect and execute the SQL scripts every time the website starts up.
- HTML code is in `src/resources/templates/index.html`
- Most of the Java code and classes will be handled in `src/main/java/edu.sjsu.web` folder. `WebApplication.java` is basically just the file used to run the whole application.
