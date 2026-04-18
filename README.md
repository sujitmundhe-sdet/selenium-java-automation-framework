# 🚀 Selenium Java Automation Framework

A scalable and maintainable **UI Test Automation Framework** built using **Selenium WebDriver, Java, and TestNG**.

This project demonstrates real-world automation practices using the **SauceDemo** application.

---

## 🌐 Application Under Test

- 🔗 https://www.saucedemo.com/
- A sample e-commerce web application used for UI automation practice

---

## 🧱 Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- Log4j2 (Logging)
- Extent Reports (Reporting)

---

## 🏗️ Framework Design

- Page Object Model (POM)
- BasePage with reusable methods
- Config-driven execution
- Explicit Wait handling
- Retry mechanism for flaky tests
- TestNG Listeners for reporting

---

## 📂 Project Structure
src/test/java
│
├── base
├── pages
├── tests
├── utils
├── listeners
├── reports

src/test/resources
│
├── config.properties
├── log4j2.xml


---

## 🧪 Test Scenarios Covered

- Login functionality
- Add product to cart
- Navigate to cart
- Checkout process
- End-to-End order placement

---

## ▶️ How to Run Tests

1. Clone the repository:

git clone https://github.com/your-username/selenium-java-automation-framework.git


2. Navigate to project folder:

cd selenium-java-automation-framework


3. Run tests:

mvn clean test


---

## 📊 Reports

- Extent Report generated at:

/reports/report.html


---

## 🧠 Key Highlights

- Clean and scalable architecture
- Reusable components using BasePage
- Robust synchronization using Explicit Waits
- Configurable test execution
- Designed for real-world automation scenarios

---

## 🚀 Future Enhancements

- Cucumber BDD Integration
- CI/CD using Jenkins
- Docker & Selenium Grid
- API + UI Integration (Rest Assured)

---

## 👤 Author

- Sujit Mundhe

---
