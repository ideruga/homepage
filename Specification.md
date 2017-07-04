# Functional Specification
## Intro
The goal of this project is to create a miniature personal web page frame built on the modern Java stack. It should be easily customisable and deployable. 

Apart developing personal experience with the given technologies, it aims at providing examples of a real-world usage.

## Requirements
### Internationalisation
Every section of the website should be localized (Fr/En/Es/Ru).

### PDF Export
CV/Bio section should be exportable to PDF format ("Download PDF" button)

### Mobile Friendly
This should be achieved by using the Bootstrap scaling mechanics.
**N.B.:** no parallax effect, since it is not very well supported by mobile browsers (costly redrawing, AFAIK)

## Contents

### CV/Résumé/Bio



# Technical specification
## Technologies

| Build | UI |  Server | DB | Deployment
|---|---|---|---|---
| Gradle | Angular 4 | Spring | Postgres | AWS
|| Bootstrap | JPA | Liquibase | Docker

### PDF Export
Here is the [proposed list](https://stackoverflow.com/questions/2510560/pdf-library-for-java) of the pdf generating libraries. The default choice is Apache PdfBox. The last release is dated on 2017-05-15. This seems to be an overkill, but it would allow us to avoid problems with pdf format nuances that can be not supported in minor libraries.
