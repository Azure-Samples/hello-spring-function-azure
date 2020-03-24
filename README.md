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

This branch uses __Gradle__ to build the application:
 
- It uses the Azure Functions Plugin for Gradle, documented at [https://github.com/microsoft/azure-gradle-plugins/tree/master/azure-functions-gradle-plugin](https://github.com/microsoft/azure-gradle-plugins/tree/master/azure-functions-gradle-plugin)
- Use the `master` branch to use __Maven__ instead: [Switch to the `master` branch](../../tree/master/)

## Features

This is just a "Hello, world", but it uses domain objects so it's easy to extend to do something more complex.

## Getting Started

### Prerequisites

This project uses the Gradle Wrapper, so all you need is Java installed.

### Installation

- Clone the project: `git clone https://github.com/Azure-Samples/hello-spring-function-azure.git`
- Build the project: `gradle azureFunctionsPackage`

### Quickstart

Once the application is built, you can run it locally using the Azure Function Gradle plug-in:

`gradle azureFunctionsRun`

And you can test it using a cURL command:

`curl http://localhost:7071/api/hello -d "{\"name\":\"Azure\"}"`

## Deploying to Azure Function

Deploy the application on Azure Functions with the Azure Function Gradle plug-in:

`gradle azureFunctionsDeploy`
