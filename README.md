# Fitness Club System

## Assignment 2
Creational Design Patterns: Factory Method & Abstract Factory

## Project Theme
Fitness Club System

This project demonstrates two creational design patterns:
- Factory Method
- Abstract Factory

The project is divided into two parts.

## Part A - Factory Method

The Factory Method pattern is used to create different types of workouts.

### Product
- Workout

### Concrete Products
- CardioWorkout
- StrengthWorkout
- YogaWorkout

### Creator
- WorkoutCreator

### Concrete Creators
- CardioWorkoutCreator
- StrengthWorkoutCreator
- YogaWorkoutCreator

The client does not create concrete workout objects directly.
Each concrete creator decides which workout object to create.

## Part B - Abstract Factory

The Abstract Factory pattern is used to create a family of related fitness plan products.

### Abstract Products
- WorkoutPlan
- MealPlan
- ProgressTracker

### Beginner Family
- BeginnerWorkoutPlan
- BeginnerMealPlan
- BeginnerProgressTracker

### Professional Family
- ProfessionalWorkoutPlan
- ProfessionalMealPlan
- ProfessionalProgressTracker

### Abstract Factory
- FitnessPlanFactory

### Concrete Factories
- BeginnerFitnessFactory
- ProfessionalFitnessFactory

Each factory creates a complete and compatible family of fitness products.

## Factory Method vs Abstract Factory

Factory Method creates one type of product and uses inheritance.

Abstract Factory creates a family of related products and uses composition.

In this project:

- Factory Method creates different Workout objects.
- Abstract Factory creates WorkoutPlan, MealPlan, and ProgressTracker as one family.

## SOLID Principles

### Open/Closed Principle
The system can be extended with new workout types or new fitness families without changing most existing code.

### Single Responsibility Principle
Each class has one main responsibility.
For example, each creator creates one type of workout and each factory creates one fitness family.

## Project Structure

src/
- factorymethod/
- abstractfactory/
- Main.java

## Author
Nuraly