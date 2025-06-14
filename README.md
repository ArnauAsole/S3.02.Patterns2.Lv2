﻿# S3.02.Patterns2.Lv2

# 👁️ Stock Market Notification System using Observer Pattern

### 📄 Description – Exercise Statement
This exercise implements the Observer design pattern to simulate a stock market agent notifying various agencies about changes in the market.

The application is organized into the following components:

Observable: interface for stock agents that send notifications.

Observer: interface for agencies that receive updates.

StockAgent: a concrete Observable that holds market state and notifies observers.

AgentWolf and AgentCaptainTed: concrete Observers that react to stock updates.

Main: entry point of the program that wires everything together.

Summary of the exercise statement:

Design a system in which a stock market agent (Observable) notifies multiple stock agencies (Observers) when the market goes up or down. The Observable must maintain references to its Observers.

### 💻 Technologies Used
### 🧠 Java 17 (or later)

### 💡 IntelliJ IDEA as the development environment

### ☕ JDK (Java Development Kit)

### 📚 Java Standard Library (List, ArrayList, etc.)

### 🔗 Git and GitHub for version control

### 📋 Requirements
Java 17 or higher installed

IntelliJ IDEA (recommended)

Maven or Gradle (optional)

Internet connection (for dependencies or updates)

GitHub account (to clone or fork the repository)

### 🛠️ Installation
Clone the repository from GitHub:

```
git clone https://github.com/ArnauAsole/S3.01.Patterns.Lv1.git
```

Open the project in IntelliJ IDEA:

Go to File > Open... and select the project folder.

Ensure the correct JDK is configured:

File > Project Structure > Project SDK → select Java 17+

Build the project via Build > Build Project

### ▶️ Running the Project
Once the project is open in IntelliJ:

Open Main.java.

Click the green Run button (or press Ctrl+Shift+F10) to start the program.

### 🧪 Sample Flow:
AgentWolf and AgentCaptainTed subscribe to the StockAgent.

StockAgent changes market status (RISING, FALLING).

All observers are notified and print messages accordingly.

### 🌐 Deployment
This project is intended for educational/console use only.

However, you can package it into a .jar file via IntelliJ:

Go to File > Project Structure > Artifacts

Create a new JAR artifact

Build the JAR using Build > Build Artifacts

To run the JAR:

```
java -jar stock-observer.jar
```

### 🤝 Contributing
All contributions are welcome! To contribute:
Marc, Ana, Adrià, Javier, Ignasi, Alejandro, Vanina, Meritxell.

### 🔗 GitHub Repository
https://github.com/ArnauAsole/S3.01.Patterns.Lv1.git
