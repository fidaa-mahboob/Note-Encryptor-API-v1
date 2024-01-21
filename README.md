# Note Encryptor API v1

A RESTful API that can encrypt notes and store them in a database.

## Description

If you want to secure notes then this API is for you. It works by doing a POST request to an API endpoint that will encrypt and store the notes in backend MySQL database, If you want to get the notes back you only need a number key to decrypt the message. Further works will be done to add more features to the API. 

## Usage

To use this API it is recommended to use postman and hit endpoint detailed in this section.

1.  ```localhost:8080/notes/all ```

This endpoint gets all the note data stored in the MySQL database.

<img width="1643" alt="Screenshot 2024-01-21 at 23 24 16" src="https://github.com/fidaa-mahboob/Note-Encryptor-API-v1/assets/151159499/7c5bf9a9-e34a-4c9b-bff6-8444ea037581">

2.  ```localhost:8080/notes/delete/<id>```

To delete any notes just enter the id number and this is the message returned upon success.

<img width="1605" alt="Screenshot 2024-01-21 at 23 28 34" src="https://github.com/fidaa-mahboob/Note-Encryptor-API-v1/assets/151159499/8e3e7a7f-10b3-4ac3-8dd9-173790760420">

3.  ```localhost:8080/notes/add```

To add to the MySQL database you need to do a POST request with a request body detailing the title, message and encryption key number. The output shows a json with encrypted content that has been added to database. 

<img width="1612" alt="Screenshot 2024-01-21 at 23 36 14" src="https://github.com/fidaa-mahboob/Note-Encryptor-API-v1/assets/151159499/725a5de5-b357-4e25-9a29-7dd855300a47">

4.  ```localhost:8080/notes/decrypt/get/<id>?key=<key-value>```

This endpoint takes in an id number and the key number used to encrypt the note and returns a decrypted version of the note. Thus is shown as the output as see below. 

<img width="1618" alt="Screenshot 2024-01-21 at 23 38 47" src="https://github.com/fidaa-mahboob/Note-Encryptor-API-v1/assets/151159499/cbc9c659-d43e-4207-8ca9-57cc064cee72">


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

