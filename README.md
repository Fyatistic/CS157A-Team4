# Around The World
### _CS157A -- Team 4_
#### Contributor: Anni Shao, Victor Martinez Zarate, Richard Perry
#
***
## Overview

##### Goal:
This web application aims to be an online travel journal for its users that focuses on travel and experiences through simplicity of the UI.
#
##### Motivation:
People can always buy their own paper world map and put physical pins in the places they’ve traveled to around the world, but how can we make this experience more interactive and shareable to other travel enthusiasts? 

##### Innovative Idea:
Introducing Around the World, an online travel journal that helps users visually track the places they’ve been to across the globe. In each of the locations the user wants to post to their profile, they can add pictures, write a bio, and rate their experience travelling there. There is also a social aspect to the app since users can follow and be followed by other users.

##### Stakeholders:
Dr. Mike is the project manager, while Anni, Victor, and Richard are the developers of the project. Any individual interested in using Around the World would be the users.

##### Application Domain:
Around the World is an application to track travel experiences and to connect its users in a meaningful way online.

##### Benefits to Users:
Similar to the motivation, creating a platform where users can focus on their travels and experiences without the clutter may provide a more positive experience than can be found on current social media.
#
#
***
#


## Hardware/Software:
+ Spring Boot
+ VSCode (IDE)
+ MySQL Workbench v8.0 CE
+ Java 11
+ Gradle 5.6

## RDBMS:
+ MySQL Community Server v8.0.26

## Application Languages:
+ Java (JDK 11)
+ SQL
+ Docker
+ HTML
+ CSS

## How to run
### Requirements
- Gradle 5.6 
- Java 11
- Docker with mySQL container

### Prereqs
Before running these commands, make sure docker is running with a mysql container.
- To get the MYSQL container running you have to run this command in your command line after docker is set up
- "docker run -d --name mysql -td -p 3306:3306 -e MYSQL_ROOT_PASSWORD=cmpe172 mysql:8.0"
- Note*: That the password is cmpe172, when entering the MYSQL account, the name would be root with the password being cmpe172.
- This command will allow the container to be set up as shown by the screenshot below. The container was created through the given command.
![images](https://github.com/Fyatistic/CS157A-Team4/blob/main/docker.png)

![images](https://github.com/Fyatistic/CS157A-Team4/blob/main/application.png)
- NOTE*: There has to be a database created already named cs157a, so create a database in your MYSQL workbench named cs157a since that's the name of the database that our program connects to. Also make sure the datasource.username and datasource.password match with the mySQL container command.
(Note you can't have MYSQL 8.0 running on services because this will interfere with the docker MYSQL)

### Running with the command line in Mac/Linux:
![images](https://github.com/Fyatistic/CS157A-Team4/blob/main/howtorun.png)
Go to your CMD and make sure the location is inside the aroundtheworld folder. Then type these commands,
- gradle build -x test
- gradle bootJar
- gradle bootRun

To access the website, navigate to the localhost:8080// link on any web browser. This should be what the output looks like:
![images](https://github.com/Fyatistic/CS157A-Team4/blob/main/success.jpg)

### Running in VSCode:
First, ensure that the Spring Boot Extension Pack is downloaded in Visual Studio Code.
![images](https://github.com/Fyatistic/CS157A-Team4/blob/main/vscode_ext.jpg)

With the AroundtheworldApplication.java class open, navigate to the 'Run' bar and click on the 'Start Debugging' button.

![images](https://github.com/Fyatistic/CS157A-Team4/blob/main/vscode_run.jpg)

To access the website, navigate to the localhost:8080// link on any web browser. This should be what the output looks like:
![images](https://github.com/Fyatistic/CS157A-Team4/blob/main/success.jpg)
#
***
#
