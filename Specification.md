# Functional Specification
## Intro
The goal of this project is to create a miniature personal web page frame built on the modern Java stack. It should be easily customisable and deployable. 

Apart from developing personal experience with the given technologies, it aims at providing examples of a real-world usage of the frameworks it is based on.

## Contents

### Bio/CV
Page that renders a short bio and a complete CV.

#### Exemples
[Cassidy Williams](http://cassidoo.co/)

[Scott Nonnenberg](https://scottnonnenberg.com/)

#### Possible Improvements
Controls should be added to rearrange the CV from Chronological order to Technology view, for example.


## Requirements
### Internationalisation
Every section of the website should be localized (Fr/En/Es/Ru).

### PDF Export
CV/Bio section should be exportable to PDF format ("Download PDF" button)

### Mobile Friendly
All the sections should be rendered on mobile as well as on PC screen. The download button in the CV section should be hidden if on mobile.



# Technical specification
## Technologies


| Language | Build | UI |  Server | DB | Deployment
|---|---|---|---|---|---
|Java 8| Gradle | Angular 4 | Spring | Postgres | AWS
||| Bootstrap | JPA | Liquibase | Docker

Important note: no Spring Bootstrap is allowed. The goal is to fine-tune the system and use only what is needed and when it is needed. The deployment should be made using Docker or using Eclipse (dev).

## Java 9 Migration
The major reason for not using java 9 right away is the lack of Tomcat/Docker support for it. Eclipse support is also tricky to install for now. A milestone should be scheduled to migrate the system to Java 9 after all subsystems support the new version:

- [x] SDK 
- [ ] Tomcat
- [ ] Spring
- [ ] Gradle
- [ ] JDBC Driver
- [ ] JPA (?)

## Internationalisation
There is some challenge here: the standard label localization should be joined with the text localization (the text will be stored in the database, hence it should be retrieved depending on the language defaulting to english).

## PDF Export
Here is the [proposed list](https://stackoverflow.com/questions/2510560/pdf-library-for-java) of the pdf generating libraries. The default choice is Apache PdfBox. The last release is dated on 2017-05-15. This seems to be an overkill, but it would allow us to avoid problems with pdf format nuances that can be not supported in minor libraries.

## Mobile Friendly
This should be achieved by using the Bootstrap scaling mechanics.
**N.B.:** no parallax effect, since it is not very well supported by mobile browsers (costly redrawing, AFAIK)

## Build and Deployment
### Gradle

In order to build the project, you first need to create a gradle wrapper by running this command:

`gradle wrapper --gradle-version=4.0`

Now, to actually build the project, run 

`gradlew build` 

### Eclipse
- Clone the project via git. 
- Make sure that you have the latest Buildship version installed
- Import the project
- Open Facets section in the project properties; add "Dynamic Web Project" and "Java"
- Open Deployment Assembly in the project properties; Remove WebContent folder and add src/main/webapp
- Deploy the project in Tomcat v8.5 in the Servers view.
- Go to [http://localhost:8080/homepage](local address) to make sure it is deployed.

### Docker

In order to create a docker container with the war deployed in the tomcat, you first need to build the project (see the 'Gradle' section above).

To build a docker container, run the following command from the root folder of the project:

`docker build -t homepage:0.1 -f src/main/docker/Dockerfile .`

After the image is built, you can run the container as follows:

`docker run -it --rm -p 80:8080 homepage:0.1`

Please, note that the actual IP of the docker machine depends on the docker implementation. For instance, when opening the Docker Quickstart Terminal for Windows, you get a message: 
`docker is configured to use the default machine with IP xxx.xxx.xx.xxx`
Use this ip and open the page at `http://xxx.xxx.xx.xxx/` and you should see the initial screen of the homepage project.
### AWS
