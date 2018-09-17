# CS4227---Project
Extended Hotel Reservation System for CS4227 - Software Design

# A project designed to reinforce the learning of design and architectural patterns. Patterns utilised in this project include:

# Command
The command design pattern was used to encapsulate the menu requests in the user interface of the enitire system. The command classes we created allowed us to have a convenient middle layer between the GUI and business logic of the application. 

# Factory
The factory design pattern allowed us to define an interface for creating an object but allowed the subclass to decide which object to instantiate. This allowed a class to defer it's instantiation to subclasses allowing more customisation in object creation. 

# Singleton
The singeton design pattern allowed us to create only one instance of our menu types for the GUI and create a global point of access to it. This removed the need of creating multiple of the same menu objects when creating or calling a button or label object of that class. 

# Repository
Utilised this pattern to promote extensibilty within the system. This pattern allowed us to create a single point to make changes in our data access which gave us the options of updating or improving our data access in future iterations of the system. 

# Interceptor 
The implementation of the interceptor pattern was a compulsory part of this project. We implemented this pattern for the creation of a time tracking system in our application. We used the interceptor to intercept a user's login and track time spent within the system and how much time spent in certain aspects of the system. This also provided a base for the introduction of further data analysis in future interations of the system.  
