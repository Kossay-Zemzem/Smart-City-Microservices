# Smart City Microservice Project


This repository serves as the central documentation for Smart City Microservices, an academic project developed in 2025.

## Project Overview

The goal of this project is to orchestrate independent services within a microservice architecture, simulating a smart city environment where various services communicate with each other and interact with clients through an orchestration layer. 

The system consists of three core microservices that handle the business logic:
* **Parking Service (Service Parking) :** Manages parking infrastructure, tracks available spaces, and handles reservation workflows.
* **Billing Service (Service Facture) :** Manages client records and tracks various invoice types such as electricity, water, and parking.
* **Transport Service (Service Transport) :** Manages public transit infrastructure, including available transport lines, routes, and terminal points.

### Project Scope
Development for each of the three core services focused primarily on core read/query workflows due to time constraints, as the project's main objective is microservice orchestration rather than exhaustive API development. While a fully complete API would include endpoints to create and delete administrative data from the system, these were deferred to a later phase, and sample data was manually injected for this initial release.

## Technologies & Tools

**Framework** : Spring Boot 

**API Styles & Protocols**: REST, GraphQL, SOAP

**Dependencies** : Lombok, Log4J, Spring Cloud Gateway, Netflix Eureka

**Database** : H2 Embedded Database


## Microservices included
 
Smart City project consists of 6 microservices in total , each has its own github repository linked below :

- **Discovery service** : https://github.com/Kossay-Zemzem/Smart-City-Discovery-Service

- **Gateway service** : https://github.com/Kossay-Zemzem/Smart-City-Gateway

- **Orchestrator service** : https://github.com/Kossay-Zemzem/SmartCity-Orchestrator

- **Transport service** : https://github.com/Kossay-Zemzem/Smart-City-Transport-Service

- **Parking service** : https://github.com/Kossay-Zemzem/Smart-City-Parking-Service

- **Billing service** : https://github.com/Kossay-Zemzem/Smart-City-Facture-Service

## System Design

The system is built around a microservice architecture including three core business services, supported by an orchestrator, a gateway, and a discovery service:


<img width="500" alt="Archi-SOC-Project drawio" src="https://github.com/user-attachments/assets/fa603e58-1b32-4cf7-a433-e042d1e75640" />

>

* **Orchestrator Service:** Serves as the single entry point for all web client requests and coordinates complex workflows across different domain services.
* **Gateway Service:** Built using Spring Cloud Gateway, it acts as the internal communication bridge through which the Orchestrator routes requests to the core services.
* **Discovery Service:** Built using Netflix Eureka, it enables dynamic service registration and discovery, allowing microservices to locate and communicate with each other reliably in a distributed environment.
* **Core Business Services:** The independent domain services (Parking, Billing, and Transport) handle specific smart city business logic.


### Communication Flow Example
Services interact dynamically to complete complex workflows. For example, reserving a parking spot follows this sequence:
1. The client sends a reservation request to the **Orchestrator Service** requesting to reserve a parking spot.
2. The Orchestrator calls the **Parking Service** (routed through the **Gateway**) to verify and lock an available parking spot.
3. Once the spot is successfully reserved, the Orchestrator then calls the **Billing Service (Factures)** (also via the **Gateway**) to generate and attach a corresponding invoice.
4. The details of the reservation including invoice details are finally sent back to the client.


## Database

This project uses an **H2 embedded database** for the three core services (Billing, Transport, and Parking). Data is saved under the `./data` directory of each service.

* You do not need to run any external database setup or SQL script execution.
* Test data is automatically injected upon the startup of each service. The data resets to its initial state on each restart to facilitate testing. In a production environment, this data would be preserved.


## How to start the project

**Prerequisite:** JDK 17 or higher is required.

To start all services, you need to execute the standard Spring Boot run command on each of the **6 services**. You can [clone the repository of each service] or clone this repository which which includes a demonstration copy of all 6 services. 

Bash

```
./mvnw spring-boot:run
```

1- Start Discovery service

2- Start Gateway service

3- Start Orchestrator service

4- Start Transport service

5- Start Parking service 

6- Start Billing service (Service Facture)

7- Wait a few seconds before performing any API calls (Gateway service might take a few seconds to start routing to services )

8-  You can start making API calls to the `Orchestrator` service at `http://localhost:8080` using Postman (Refer to the Orchestrator API summary for available endpoints)

> [!IMPORTANT]
> This orchestrator intentionally includes generated sources in the `target` folder to facilitate demonstration and testing. **Generated sources are normally not versioned**, but an exception was made here because generating SOAP client stubs correctly can be tricky. These sources include the SOAP client stubs produced from the [Billing Service's WSDL specification](https://github.com/Kossay-Zemzem/Smart-City-Microservices/blob/main/specs/Facture-service.wsdl), which the Orchestrator needs in order to communicate with that service.
>
> Do not run `mvn clean` on the Orchestrator, as this deletes the `target` folder along with these sources. If you do you will have to regenerate them using the [wsimport command-line tool](https://docs.oracle.com/javase/8/docs/technotes/tools/unix/wsimport.html)


## API sepcifications

Detailed technical documentation for the orchestrator as well as each core microservice (OpenAPI, WSDL and SDL) can be found in the the designated [specs](./specs) folder in this repository.

## Orchestrator API Summary

> [You can read the original version of this API summary in French](./API_SUMMARY_FR.md)

All services can be reached by calling the following api endpoints through `http://localhost:8080` . 


| **Service**   | **Method** | **Endpoint**                                              | **Description**                                                                        |
| ------------- | ----------- | --------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| **Facture**  | GET         | `/smartcity/factures/clients`                             | Retrieves the complete list of customers.                                        |
| **Facture**  | GET         | `/smartcity/factures/clients/count`                       | Returns the total number of registered customers.                                        |
| **Facture**  | GET         | `/smartcity/factures/types`                               | Retrieves the available invoice types (e.g., ELECT, EAU, PARKING).                   |
| **Facture**  | GET         | `/smartcity/factures/{type}`                              | Retrieves all invoices of a given type (specified in the path).           |
| **Parking**   | GET         | `/smartcity/parking/etages`                               | Retrieves the list of all parking floors.                                       |
| **Parking**   | GET         | `/smartcity/parking/etages/{labelEtage}`                  | Returns the full details of a specific floor, identified by its label.                    |
| **Parking**   | GET         | `/smartcity/parking/etages/{labelEtage}/spots/{codeSpot}` | Returns the details of a specific parking spot, identified by its code and floor.       |
| **Parking**   | POST        | `/smartcity/parking/reservation`                          | Creates a new parking spot reservation and returns the associated invoice.       |
| **Parking**   | GET         | `/smartcity/parking/reservations`                         | Retrieves the list of all parking reservations.                               |
| **Parking**   | GET         | `/smartcity/parking/reservations/{refClient}`             | Retrieves the parking reservations of a specific customer, identified by customer reference.|
| **Parking**   | GET         | `/smartcity/parking/spots/empty`                          | Retrieves the floors that have available parking spots (detailed format). |
| **Parking**   | GET         | `/smartcity/parking/spots/empty/brief`                    | Retrieves the floors that have available parking spots (summary format).   |
| **Transport** | GET         | `/smartcity/transport/lignes`                             | Retrieves the list of all available transport lines.                      |
| **Transport** | GET         | `/smartcity/transport/lignes/{codeLigne}/trajets`         | Retrieves the trips associated with a specific transport line code.     |
| **Transport** | GET         | `/smartcity/transport/terminus`                           | Retrieves the list of all transport terminals.                                   |

## Future Enhancements

Developed as an academic project within a strict time limit, I prioritized core architectural concepts. However, numerous technical and user experience enhancements can be made inluding:

- **Docker Containerization:** Containerize each individual microservice using *Dockerfiles* and orchestrate them with *Docker Compose* to streamline deployment.

- **Configuration Service:** Integrate a dedicated *Configuration Server* to externalize and centralize configuration management

- **Front-End Client Integration:** Develop and integrate a *Front-End Client* to provide a user interface for easier interaction with the services.
