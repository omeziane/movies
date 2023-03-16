# movies

run the application with mvn spring-boot:run
there are two controllers

To add a movies: Please use this endpoint with its body

URL   : http://localhost:8080/movies
METHOD: POST
BODY  :
{
"id": 1,
"title": "The Shawshank Redemption",
"genre": "Drama",
"releaseYear": 1994,
"director": "Frank Darabont"
}


To get all movies:
URL   : http://localhost:8080/movies
METHOD: GET

To get all movies with the recommandations:
URL   : http://localhost:8080/recommendations/{genre} 
METHOD: GET

The database set with h2 is accessible in http://localhost:8080/h2-console
