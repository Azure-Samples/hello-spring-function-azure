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

## Build tool

This branch uses __Maven__ to build the application, please use the `gradle` branch to use __Gradle__ instead:

[Switch to the `gradle` branch](../../tree/gradle/)

This branch uses __Maven__ to build the application:
 
- It uses the Azure Functions Plugin for Maven, documented at [https://github.com/microsoft/azure-maven-plugins/tree/develop/azure-functions-maven-plugin](https://github.com/microsoft/azure-maven-plugins/tree/develop/azure-functions-maven-plugin)
- If you want to use __Gradle__ instead, please : [Switch to the `gradle` branch](../../tree/gradle/)

## Features

This is just a "Hello, world", but it uses domain objects so it's easy to extend to do something more complex.

## Getting Started

### Prerequisites

This project uses the Maven Wrapper, so all you need is Java installed.

### Installation

- Clone the project: `git clone https://github.com/Azure-Samples/hello-spring-function-azure.git`
- Configure the project to use your own resource group and your own application name (it should be unique across Azure)
  - Open the `pom.xml` file
  - Customize the `resourceGroup` and `appName` properties
- Build the project: `./mvnw clean package`

### Quickstart

Once the application is built, you can run it locally using the Azure Function Maven plug-in:

`./mvnw azure-functions:run`

And you can test it using a cURL command:

`curl http://localhost:7071/api/hello -d "{\"name\":\"Azure\"}"`

## Deploying to Azure Functions

Deploy the application on Azure Functions with the Azure Function Maven plug-in:

`./mvnw azure-functions:deploy`

You can then test the running application, by running a POST request:

```
curl https://<YOUR_SPRING_FUNCTION_NAME>.azurewebsites.net/api/hello -d "{\"name\":\"Azure\"}"
```

Or a GET request:

```
curl https://<YOUR_SPRING_FUNCTION_NAME>.azurewebsites.net/api/hello?name=Azure
```

Replace the `<YOUR_SPRING_FUNCTION_NAME>` part by the name of your Spring Function.
