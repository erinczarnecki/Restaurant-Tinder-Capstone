## Money Transfer Capstone
This was a capstone project completed for [Merit America's](https://meritamerica.org/) Fullstack Java Web Developer Bootcamp - A 31-week intensive program focused on Full Stack Web Application Development, including hands-on 
coursework in Java Development, Client-Server Programming (SQL + Spring), and Frontend Development (Classic Web + React).  

Program Capstone Project 3 of 3.  

## Project Description
This application helps people make a decision which restaurant they should visit based upon their preference. Users can register, login, invite friends to eat at specific restaurants (guest users can vote on selected restaurants), and view restaurant finalists.

## Table of Contents
- [Money Transfer Capstone](#money-transfer-capstone)
- [Project Description](#project-description)
- [Table of Contents](#table-of-contents)
- [Project Requirements](#project-requirements)
- [Running the Application](#running-the-application)
  - [Requirements](#requirements)
  - [Getting Started](#getting-started)
- [Team Members](#team-members)

---
## Project Requirements
1. Users: An authenticated user in the system so that recommendations are able to be tailored and remembered when the user comes back to the application.
   - Register: New users need the ability to create an account so that restaurant preferences and selections can be made
     - If an account already exists, the user is told that the email address is already in use
     - User needs an email and password to register
     - Before registering the user must confirm their password
     - Password criteria: 1 Capital Letter, 1 lowercase letter, 1 number, minimum of 8 characters
     - Create database and tables to store the user data
   - Login: Users need the ability to login to the application to see personalized restaurant recommendations or set up a matching session
     - User is prompted for their login credentials (email and password) to login
     - After successful login, a "Log out" button is visible on the page & the UI no longer shows a login button in the nav
     - If the user attempts to log in with the wrong credentials, they are shown a message indicating that they have invalid credentials
2. Home Page: Home page should have links to upcoming events, restaurant search, and navbar
3. Invite out to eat: Users can "invite" 1 or more people to visit a restaurant with them. 
   - Invitees will be able to indicate their preference for or against certain restaurants.
   - Invitees need not be a registered user in the system
   - Person creating the invitation must first set parameters (location) and a decision date/time
   - A unique invitation link is generated for each invitee
   - Everyone sees the same available restaurant options using the filter set by the person who created the invite
   - Invitees can access the link up until the decision date/time
4. Vote on restaurants: People invited out to eat can indicate preference for or against certain restaurants by giving them a thumbs up or thumbs down.
    - All people attending the outing can visit the link to see a list of restaurants that meet the search criteria
    - All attendees can see the list and provide a vote to indicate their preference for or against that restaurant
    - After the expiration date/time, invitees are shown a page that indicates they are no longer able to submit their preferences
5. View restaurant finalists: Users can view a list of restaurants that did not receive any negative votes from their invited guests
    - After the deadline has passed, the person who invited guests is able to see a list of the finalist restaurants that did not receive any thumbs down ratings.
    - The list is presented with a UI similar to the "View Restaurants" page

## Running the Application

### Requirements
- [JDK 11](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- IDE - The program built with [IntelliJ](https://www.jetbrains.com/idea/)
- [PostgreSQL](https://www.postgresql.org/)
- [pgAdmin](https://www.pgadmin.org/download/)

### Getting Started
1. Download code and open with IDE capable of running Java programs
2. Load the Maven file in the root folder
3. To begin the application, run the VendingMachineCLI.java in an IDE.
   - The program requires at least Java 10 to be run. 
   - If running in an IDE, ensure a resource folder is included with all files in the same location they are set in this zip file
4. Set up "tenmo" database
5. Backend Instructions can be found in the [Java README](/java/README.md)
6. Frontend Instructions can be found in the [Frontend README](/frontend/README.md)

## Team Members
- Erin Czarnecki - <a href="https://www.linkedin.com/in/erin-czarnecki" target="_blank">LinkedIn</a> - <a href="https://github.com/erinczarnecki" target="_blank">GitHub</a>
- Nikolai Dolganov - <a href="https://www.linkedin.com/in/nikolai-dolganov/" target="_blank">LinkedIn</a> - <a href="https://github.com/NikD1162" target="_blank">GitHub</a>
- Andres Landinez - <a href="https://www.linkedin.com/in/andres-landinez-m/" target="_blank">LinkedIn</a> 
- Wilson Ramirez - <a href="https://www.linkedin.com/in/wilramprogramming/" target="_blank">LinkedIn</a> - <a href="https://github.com/WilRamProgramming" target="_blank">GitHub</a>
