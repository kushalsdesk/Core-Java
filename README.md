## Core Java: A Branching Roadmap

[![](https://skillicons.dev/icons?i=java)](https://skillicons.dev)

**Progress:** 🟩🟩⬜⬜⬜⬜⬜⬜⬜

**1. Fundamentals (✅):**

- Data Types:
    - Primitive types (numeric, boolean, char) (✅)
    - Non-primitive types (String, arrays, objects) (✅)
    - Type casting and conversions (✅)
- Variables & Operators (✅):
    - Declaring and initializing variables (✅)
    - Arithmetic, relational, logical, and assignment operators (✅)
- Control Flow (✅):
    - `if`, `else`, `switch` statements for conditional branching (✅)
    - `for`, `while`, `do-while` loops for iteration (✅)
- Methods (✅):
    - Creating and invoking methods (✅)
    - Parameters, return values, method overloading (✅)
- Wrapper Class (✅):
    - Understanding the Difference between Primitive and Reference Types (✅)
    - Accessing the Methods to each Wrappers (✅)
- Introduction to OOP (✅):
    - Basic OOP concepts (objects, classes, inheritance, polymorphism) (✅)

**2. Arrays (✅):**

- Declaring and Creating:
    - Defining arrays with data types and sizes (✅)
    - Initializing elements using literal values or loops (✅)
- Accessing Elements:
    - Using indices to access and modify elements within bounds (✅)
- Multidimensional Arrays:
    - Creating arrays with more than one dimension (✅)
    - Nested access using multiple indices (✅)

**3. Strings (✅):**

- String Class:
    - Essential methods for manipulation (e.g., `length()`, `charAt()`, `substring()`, `concat()`, `indexOf()`) (✅)
    - String immutability: Understanding that Strings are unchangeable; creating new instances for modifications (✅)

**4. Package Management (❌):**

- Packages:
    - Organizing classes into logical groups (❌)
    - Accessing classes using import statements (❌)
- Access Modifiers:
    - public, private, protected, and default access control (❌)

**5. Object-Oriented Programming (❌):**

- Classes & Objects:
    - Class definition and members (variables, methods) (❌)
    - Object creation and instantiation (❌)
    - Member access using the `.` operator (❌)
- Abstraction:
    - Interfaces: Separating interface from implementation (❌)
    - Abstract classes: Providing partial implementation and enforcing specific methods in subclasses (❌)
- Encapsulation:
    - Data hiding and access control with public, private, protected modifiers (❌)
- Inheritance:
    - Single inheritance: Extending parent classes, method overriding using `super` keyword (❌)
- Polymorphism:
    - Method overloading: Having methods with the same name but different parameters (❌)
    - Method overriding: Redefining inherited methods in child classes (❌)
    - Abstract classes and interfaces: Defining contracts for subclasses to implement (❌)

**6. Exception Handling (❌):**

- Try-catch-finally:
    - Handling runtime errors gracefully (❌)
    - Catching specific exceptions with `catch` blocks (❌)
    - Ensuring resources are released with `finally` blocks (❌)
- Throwing and Catching Exceptions:
    - Throwing exceptions using `throw` keyword (❌)
    - Catching exceptions with appropriate handlers (❌)
- Common Exceptions:
    - Understanding common exceptions like `NullPointerException`, `IndexOutOfBoundsException`, etc. (❌)

**7. I/O Operations (❌):**

- File I/O:
    - Reading and writing data from files using streams (❌)
    - Classes like `FileInputStream`, `FileOutputStream` (❌)
- Standard I/O:
    - ✔System.in for user input (✅)
    - ✔System.out for printing output (✅)
    - ✔Using the `Scanner` class for simplified input with various data types (✅)

**8. Collections (❌):**

- Understanding Concepts:
   - ✔️Lists, Sets, Maps, and their common implementations (e.g., `ArrayList`, `HashSet`, `HashMap`) (✅)
- Adding, Removing, Accessing Elements:
   - **Lists:** `add()`, `remove()`, `get()`, `indexOf()`, `lastIndexOf()`, `subList()`
   - **Sets:** `add()`, `remove()`, `contains()`, `isEmpty()`, `iterator()`
   - **Maps:** `put()`, `get()`, `remove()`, `containsKey()`, `keySet()`, `entrySet()`
- Choosing the Right Collection:
   - **Lists:** Maintain order and allow duplicates (e.g., `ArrayList`, `LinkedList`).
   - **Sets:** Prevent duplicates and offer fast membership checks (e.g., `HashSet`, `TreeSet`).
   - **Maps:** Store key-value pairs for efficient retrieval by key (e.g., `HashMap`, `TreeMap`).
   - Consider factors like:
       - Need to preserve order?
       - Allow duplicates?
       - Efficiency of adding, removing, searching?

**9. Generics (❌):**

- Introduction:
   - Creating generic classes and methods for type safety and flexibility (❌)
- Syntax and Usage:
   - Understanding angle brackets (`<>`) for specifying type parameters (❌)
   - Benefits of using generics to avoid type casts and improve code reusability (❌)
- Common Generic Collections:
   - `ArrayList<T>`, `HashSet<T>`, `HashMap<K, V>` (❌)

**10. Lambda Expressions (❌):**

- Introduction:
   - Concise syntax for writing anonymous functions (❌)
- Syntax and Usage:
   - Understanding arrow notation (`->`) and capturing variables (❌)
   - Using lambda expressions with collections (e.g., `forEach()`, `filter()`) and streams (❌)
- Benefits:
   - Improve code readability and maintainability (❌)

**11. Concurrency (❌):**

- Introduction:
   - Understanding the need for concurrent programming (❌)
- Threads:
   - Creating and managing threads for parallel execution (❌)
   - Thread states (running, waiting, etc.) and synchronization (❌)
- Concurrency Concepts:
   - Thread pools for efficient management (❌)
   - `Fork/Join` framework for parallel processing (❌)
   - `CompletableFuture` for asynchronous programming (❌)

**🔭 Web Development:**

- **❤️Spring MVC:**
    - Model-View-Controller architecture (MVC) 
    - Building web applications with controllers, views, and models 
    - Dependency injection and Spring Boot for rapid development 
- **Hibernate:**
    - Object-relational mapping (ORM) for database access 
    - Persisting and retrieving data using entities and annotations 
    - Querying with HQL or native SQL 

**🔭 Graphical User Interfaces (GUI):** 

- **❤️JavaFX:**
    - Modern declarative UI building with FXML (❇)
    - Rich graphics capabilities for animations and effects (❇)
    - Scene Builder for visual UI design (❇)
- **Swing:**
    - Traditional Java GUI framework with event-driven approach (❇)
    - Components like buttons, text fields, menus, etc. (❇)
    - Layout managers for arranging components (❇)
