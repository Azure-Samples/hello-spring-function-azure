---
page_type: sample
languages:
- java
products:
- azure
description: "This is a sample application to showcase the use of Spring Cloud Function on top of Azure Functions."
urlFragment: hello-spring-function-azure
---

# Example "Hello, world" Spring Boot application that runs on Azure Functions

This is a sample application to showcase the use of Spring Cloud Function on top of Azure Functions.

## Features

This is just a "Hello, world", but it uses domain objects so it's easy to extend to do something more complex.

## Getting Started

### Prerequisites

This project uses the Maven Wrapper, so all you need is Java installed.

### Installation

- Clone the project: `git clone https://github.com/Azure-Samples/hello-spring-function-azure.git`
- Build the project: `./mvnw clean package`

### Quickstart

Once the application is built, you can run it locally using the Azure Function Maven plug-in:

`./mvnw azure-functions:run`

And you can test it using a cURL command:

`curl http://localhost:7071/api/hello -d "{\"name\":\"Azure\"}"`

## Deploying to Azure Function

Deploying the application on Azure Function with the Azure Function Maven plug-in:

`./mvnw azure-functions:deploy`
