# Java Design Patterns Examples

## Overview

This project is designed for educational purposes, offering practical examples of various design patterns in Java. It serves as a learning resource for understanding the implementation and application of design patterns such as Adapter, Composite, Decorator, Facade, Factory, Proxy, and Singleton.

## Prerequisites

- Java JDK 11 or higher
- Gradle 7.4.2 or higher (the Gradle Wrapper is included, eliminating the need for a separate installation)

## Getting Started

### Clone the Repository

Clone the project to your local machine with the following command:

```bash
git clone https://github.com/pedro-lucinda/design-patterns-java.git
cd java-learn
```

### Build the Project

Build the project and compile all examples by running:

```bash
./gradlew build
```

## Running the Examples

Execute each design pattern example individually using the specified Gradle tasks. Below are the commands for each:

### Adapter Pattern

```bash
./gradlew runAdapterExample
```

### Composite Pattern

```bash
./gradlew runCompositeExample
```

### Decorator Pattern

```bash
./gradlew runDecoratorExample
```

### Facade Pattern

```bash
./gradlew runFacadeExample
```

### Factory Pattern

```bash
./gradlew runFactoryExample
```

### Proxy Pattern

```bash
./gradlew runProxyExample
```

### Singleton Pattern

```bash
./gradlew runSingletonExample
```

## Testing

Run the unit tests for these examples with:

```bash
./gradlew test
```

The project utilizes JUnit Jupiter for testing.

## Dependencies

This project uses:

- JUnit Jupiter for unit testing.
- Google Guava and JSON.org for additional functionality.


