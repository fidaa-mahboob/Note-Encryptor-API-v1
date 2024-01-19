# Note Encryptor API v1

A RESTful API that can encrypt notes and store them in a database.

## Description

If you want to secure notes then this API is for you. It works by doing a POST request to an API endpoint that will encrypt and store the notes in backend MySQL database, If you want to get the notes back you only need a number key to decrypt the message. Further works will be done to add more features to the API. 

## Getting Started

### Requirements

* MySQL
* Java 17 or later
* Maven 3.5+
* VSCode or Intellij

### Installing

* To download the latest version of MySQL you need to go <a href="https://dev.mysql.com/downloads/mysql/">here</a>.
* In the installation phase, click through to the point you will be asked to setup a root user password.
* Open the terminal enter this ```sudo mysql --password``` and type password set previously.
* Create new database through this ```create database notes_db;```
* Then create new MySQL user```create user '<enter-username>'@'%' identified by '<enter-password>';```
* To gain access to you database you need to give permissions through this ```grant all on notes_db.* to '<enter-username>'@'%';```

### Running in your local environment

To do this you will need to change MySQL username and password located in ```src/main/resources/application.properties``` to the ones you have set during installation.

To start the spring boot application you will need to run this command at the project root location:

``` mvn install ```

Then once this command has run it generate a jar file. This can be found in the target folder.

``` java -jar ./target/*.jar ```


## Authors

Contributors names and contact info

Fidaa Mahboob  
ex. [@FidaaMahboob](https://www.fidaamahboob.com)

## Version History

* 1.0
    * Initial Release

