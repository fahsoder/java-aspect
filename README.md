# Java Aspect Logging Example

This project demonstrates how to use Aspect-Oriented Programming (AOP) in a Java application to implement logging using custom annotations. It uses Spring AOP to intercept method executions and log relevant information.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Customization](#customization)

## Prerequisites

- Java 11 or later
- Maven (for building and running the project)
- A basic understanding of Java and Spring AOP

## Getting Started

1. Clone this repository:

    ```sh
    git clone https://github.com/fahsoder/java-aspect.git
    ```

2. Navigate to the project directory:

    ```sh
    cd java-aspect
    ```

3. Build the project using Maven:

    ```sh
    mvn clean install
    ```

## Usage

1. Open the project in your favorite Java IDE.

2. Explore the `javaaspect.app.aspect.annotation` package to see the custom annotation `@LogExecutionTime` that is used to annotate methods you want to log execution time for.
3. Check the `javaaspect.app.aspect` package to find the `LogAspect` aspect that intercepts methods annotated with `@LogExecutionTime` and logs their execution time.

4. Run the `Application` class to start the Spring Boot application.

5. Import the java-aspect.postman_collection.json to your postman to trigger the sample controller endpoints and see the logs in the console.

   
## Customization

- You can customize the log messages in the methods of `javaaspect.app.service.MyService` when using the annotation class as needed.
- Feel free to explore other Spring AOP features and apply them to your project.

