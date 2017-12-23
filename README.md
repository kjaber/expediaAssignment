# expedia hotels finder

## General Information
This project is created to Expedia, as coding exercise.

### Assignment Site : 
https://gist.github.com/Jun-Dai/6101aadf80e47e6c46a3

### GitHub Link:
https://github.com/kjaber/expediahotelsfinder.git

### Heroku Link:
https://kamiliaexpediaassignment.herokuapp.com/


## Language and technologies
This web application was created by eclipse using maven with these specifications.

### Java 8 (used in search process using streaming java8 technology)

### jackson (used to parsing json format)

### jUnit


## How to install the project and deply it in localhost 

1- download the project

2- in you eclipse import the project as maven project

3- Build maven projectv

4- add the project in you server (tomcat)

5- in your browser, hit "[server name]:[port]/expediahotelsfinder/"


## Known Issues 
1- Json site URL is static in code: https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel
It can be better if i created a properties file to set the path dynamically



## Assumptions

1- Star Rate and Guest Rate max value = 5 

