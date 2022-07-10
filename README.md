# Enki - Hexagonal arquitecture 
This is a experimental project to test some features of hexagonal arquitecture with a simple domain of ``board game``. 
At this moment it has three modules:
- ``Application``: with only a use case createBoardGameCommandHandler.
- ``Domain``: core of business logic.
  - ``Domain Core``: contains entities, value objects...
  - ``Domain Service``: I'm not sure about that module but at this moment, it's the place where is the port (secondary and primary) of system.
- ``Infraestructure``: very incomplete at this moment. 
- ``Common``: contains base classes and general exceptions.

## How to build this project
#### Prerrequisites
- JDK 11
- Maven

#### Build
- Maven clean install
- Spring boot run
