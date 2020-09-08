# The Task App
This is a skeleton application that can be built out and expanded as core fundamentals are learned through the process.  In this application a user subscribes to an online task tracking system for themselves or their child. 

# Login Page
The user accesses the login page and there is a link to a registration page (not yet fully functional but routing is in place).  Routing and error components will be created to link pages and display url errors.  For demonstration purposes the username and pasword have been set at the back end and a JWT Token has been assigned to allow access.Login is completed via mandatory fields.  This information is retrieved by the server and the user can log in from the home page via JWT Token authorization.

# Welcome Page
Once the user logs in, they will access the welcome page and will be able to see a greeting with the username listed.  Upon clicking the Welcome Message button a customized welcome message will appear with their username which is populated with the Hello World Bean on the back end.  Users can access the their Task List by clicking on the hyperlink. 

# Task Page
Once the user accesses the Task List, they will will be able to view a dashboard that will allow them to create a task/chore list.  They can add, update, or delete items from the chore list (handled by API and database) and will be able to search the list for specific chore tasks to be completed via the Description field.  

# Logout Page
Once the user logs out there is a message thanking them for using the app and in the menu there is a link to return them to the Login Page.

Task App System Tech Stack Selection:
Version Control Sys: Github
Wireframe: Mockflow
Frontend: Angular,  IDE VS Code - Modules/Components, CSS, Bootstrap
Business Logic: Typescript
WebServer Imp: SpringBoot/RESTful 
Data Layer: H2 Embedded Memory DB
Web Server Cloud Dep: TBD (I have used Heroku)
Web App Cloud D: TBD (I have used Netlify)

Other Important Information:
# Todo

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 10.0.5.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `--prod` flag for a production build.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).
