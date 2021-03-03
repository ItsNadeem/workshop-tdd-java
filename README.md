# Workshop TDD - Java


[![Build Status](https://travis-ci.org/rafaelspinto/workshop-tdd-java.svg?branch=master)](https://travis-ci.org/rafaelspinto/workshop-tdd-java) 
[![Quality Gate](https://sonarcloud.io/api/badges/gate?key=workshop:tdd-java)](https://sonarcloud.io/dashboard?id=workshop%3Atdd-java)

Test Driven Development.

Tests serve 3 purposes
Acceptance Criteria - Ensures developed code meets specifications
Regression Testing - Ensures new changes don't impact previous developed code
Documentation - Demonstrates how the application behaves


Test First Development is a process that consists of 
turning the requirements of the software application into specific test cases (acceptance criteria) 
and then implement the source code.

This process uses the red/green/refactor a pattern and consists of the following steps:

1. Create Test
2. Run Tests (should fail - Red)
3. Write Code
4. Run Tests (should pass - Green)
5. Refactor 
   Repeat
   
## Quick-start

## Requirements

## Naming conventions

To achieve a proper documentation, a good staring point is to create naming conventions for the tests.

1. What is being tested
2. What is the scenario (input)
3. What should be the outcome (Output)

Naming conventions example: testingX_scenario_outcome

Calculator - Simple example to get you started

LoginManager - Working with exceptions