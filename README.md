# Fleet Route Optimization System (CLI Based)

## 📌 Objective
The main objective of this project is to **optimize fleet routes and minimize fuel cost** by comparing multiple routes and selecting the most cost-effective option based on distance, fuel rate, and vehicle mileage.

---

## 🛠️ Features
- Add vehicles and routes through CSV files
- Calculate fuel cost for each route
- Compare multiple routes and select the minimum cost route
- Command Line Interface (CLI) based interaction
- Object-Oriented and design-pattern driven architecture

---

## 📂 Input & Output Files

### Input Files
- **routes.csv**  
  Contains route details such as route ID, distance, and route legs.

- **fleet.csv**  
  Contains vehicle details such as vehicle ID, type, mileage, and capacity.

### Output File
- **plan.txt**  
  Displays the optimized route plan along with the minimum cost calculation.

---

## 🔄 CLI Flow
1. Load vehicle and route data from CSV files  
2. Add route and vehicle details  
3. Simulate route traversal using loops  
4. Calculate cost for each route  
5. Compare route costs  
6. Generate optimized route plan  

---

## ⚙️ Core Logic
- Iterative path simulation using loops for route legs
- Fuel cost calculation using the formula: Cost = (Distance × Fuel Rate) / Mileage


- Route comparison to determine the minimum cost

---

## 📐 Mathematical Concepts Used
- Ratios and proportionality
- Optimization techniques
- Distance–Speed–Time calculations

---

## 🧱 Object-Oriented Design

### Classes
- **Vehicle (Abstract Class)**
  - Common properties: mileage, capacity
- **Truck** (extends Vehicle)
- **Van** (extends Vehicle)

### Interface
- **RoutePlanner**
  - Defines route planning behavior

---

## 🧩 Design Patterns Used
- **Strategy Pattern**  
  - Different cost calculation models for vehicles

- **Factory Pattern**  
  - Creates appropriate `RoutePlanner` objects based on input type

---

## 📚 Collections Framework Usage
- `Map<Route, Double>`  
  - Stores route and its corresponding cost

- `PriorityQueue`  
  - Retrieves the route with the minimum cost efficiently

---

## ⚠️ Exception Handling
Custom exceptions are used to ensure robust execution:

- **RouteNotFoundException**  
  Thrown when a specified route does not exist

- **OverCapacityException**  
  Thrown when vehicle load exceeds its capacity

---

## 🚀 How to Run
1. Place `routes.csv` and `fleet.csv` in the project directory  
2. Compile and run the main CLI class  
3. View the optimized plan in `plan.txt`

---

## 🧪 Technologies Used
- Java
- Java Collections Framework
- File Handling (CSV)
- Object-Oriented Programming
- Design Patterns

---

## ✅ Conclusion
This project demonstrates how **optimization techniques, OOP principles, and design patterns** can be combined to build a real-world transportation and logistics system that efficiently reduces operational costs.


