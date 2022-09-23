# link_shortener  
Application for site link shortening.  
For start application need to start postgres server and create databse with name shortener_db.

POST http://localhost:8080/api/shortener/shorten?long_url= + real url for shortening  
GET http://localhost:8080/api/shortener/get_url?short_url= + short url for getting real url
