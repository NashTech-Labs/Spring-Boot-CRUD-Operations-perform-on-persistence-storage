 # Spring-Boot-CRUD-Operations-perform-on-persistence-storage


## Requirements

1. Java - 11

2. Maven - 3.x.x

3. MySql - 3.x.x

## Steps to Set up :

*1. Clone the application*

````
git clone https://github.com/knoldus/Spring-Boot-CRUD-Operations-perform-on-persistence-storage.git
````

*2. Build and run the app using maven*


>> cd Spring-Boot-CRUD-Operations-perform-on-persistence-storage
> > > mvn package



2. Alternatively, you can run the app without packaging it using -

````
mvn spring-boot:run
````

The server will start at <http://localhost:8082>.

## Exploring the Rest APIs

###  Below is the code for the application.properties file
````
 server.port = 8082
 spring.datasource.driver-class-name = com.mysql.cj.jdbc.Driver
 spring.datasource.username = <database username>
 spring.datasource.password = <database password>
 spring.jpa.show-sql = true
 spring.datasource.url = jdbc:mysql://localhost:3306/<database>
 spring.jpa.hibernate.ddl-auto = update
 spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect
````

The application defines following REST APIs


1. GET /departments - Get All departments
2. POST /departments - Create a new departments
3. GET /departments/{id} - Retrieve a departments by Id
3. PUT /departments/{id} - Update a departments
4. DELETE /departments/{id} - Delete a departments

## Running integration tests

The project also contains integration tests for all the CRUD Rest APIs. For running the integration tests, go to the root directory of the project and type `mvn test` in your terminal