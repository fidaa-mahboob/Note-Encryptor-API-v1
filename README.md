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

### Executing program

* How to run the program
* Step-by-step bullets
```
code blocks for commands
```

## Help

Any advise for common problems or issues.
```
command to run if program contains helper info
```

## Authors

Contributors names and contact info

ex. Dominique Pizzie  
ex. [@DomPizzie](https://twitter.com/dompizzie)

## Version History

* 0.2
    * Various bug fixes and optimizations
    * See [commit change]() or See [release history]()
* 0.1
    * Initial Release

## License

This project is licensed under the [NAME HERE] License - see the LICENSE.md file for details

## Acknowledgments

Inspiration, code snippets, etc.
* [awesome-readme](https://github.com/matiassingers/awesome-readme)
* [PurpleBooth](https://gist.github.com/PurpleBooth/109311bb0361f32d87a2)
* [dbader](https://github.com/dbader/readme-template)
* [zenorocha](https://gist.github.com/zenorocha/4526327)
* [fvcproductions](https://gist.github.com/fvcproductions/1bfc2d4aecb01a834b46)
