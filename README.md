# Page Object Model (POM) Automation Framework – PHPTRAVELS

## Overview

This project is a Selenium-based UI automation framework built using the Page Object Model (POM) design pattern.

It automates an end-to-end user flow on the PHPTRAVELS application including login, service selection, cart management, checkout, and invoice generation.

The goal of this project is to demonstrate real-world automation flow design, reusable framework structure, and maintainable test architecture.

---

## Application Under Test

PHPTRAVELS – Client Area & Services Module

---

## Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Page Object Model (POM)
- ExtentReports
- RemoteWebDriver

---

## Framework Structure

- **pages/** → Page Object classes for each UI screen
- **testcases/** → TestNG test scripts for end-to-end scenarios
- **wrappers/** → Reusable Selenium wrapper methods (click, enter, verify, etc.)
- **base configuration** → Driver and test setup handled via ProjectSpecificWrappers

---

## Test Flow Covered

This framework automates the complete user journey:

Login → Navigate to Services → Select Mobile Service → Add to Cart → Checkout → Validate Product → Complete Order → Generate Invoice

---

## Key Features

- Page Object Model implementation for maintainability
- End-to-end real-world user flow automation
- Reusable wrapper methods for Selenium actions
- Frame handling for reCAPTCHA interaction
- ExtentReports integration for test execution reporting
- Method chaining for readable test scripts

---

## Important Scenarios Covered

- User login with credentials
- Handling reCAPTCHA frame
- Service selection (Mobile)
- Cart validation
- Checkout process
- Order completion
- Invoice generation and validation

---

## Automation Approach

The framework is designed to simulate real user behavior by chaining page actions across multiple modules.

Each page class handles only UI interactions, while test cases define the business flow.

---

## QA Design Principles Used

- Separation of concerns (Page vs Test logic)
- Reusable framework components
- Modular page structure
- Real-world end-to-end scenario simulation
- Frame handling and dynamic UI interaction

---

This project is part of my QA Automation Portfolio:
https://github.com/sumitbiddu/qa-automation-portfolio

## Author

QA Automation Engineer | Selenium | Java | TestNG | POM Framework
