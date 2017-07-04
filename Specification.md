# Functional Specification

## Contents

### CV/Résumé/Bio

#### PDF Export
CV/Bio should be exportable to PDF format (download button)


### Internationalisation
Fr/En/Es/Ru

# Technologies
## UI

| Build | UI |  Server | DB | Deployment
|---|---|---|---|---
| Gradle | Angular 4 | Spring | Postgres | AWS
|| Bootstrap | JPA | Liquibase | Docker

## PDF Export
Here is the [proposed list](https://stackoverflow.com/questions/2510560/pdf-library-for-java) of the pdf generating libraries. The default choice is Apache PdfBox. The last release is dated on 2017-05-15. This seems to be an overkill, but it would allow us to avoid problems with pdf format nuances that can be not supported in minor libraries.
