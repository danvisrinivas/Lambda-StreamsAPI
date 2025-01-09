# GIT LINK for hands-on
https://github.com/danvisrinivas/Lambda-StreamsAPI

# Lambda Functions - Key Benefits

## 1. Memory Efficiency
- **Reduced Boilerplate Code:**  
  Lambda expressions allow concise representations of functions without the need for creating separate classes or anonymous inner classes, leading to smaller codebases and reduced memory footprint.

- **Lazy Evaluation:**  
  In functional programming, Lambda functions can delay the execution of code until it's actually needed. This avoids unnecessary computations and saves memory by not holding intermediate states.

- **No Object Creation Overhead:**  
  Traditional anonymous classes require the instantiation of new objects, whereas Lambda functions leverage existing method references, reducing the memory required for object creation.

## 2. Improved Performance
- **Increased CPU Efficiency:**  
  Lambda functions often allow **parallel stream operations** in languages like Java, taking advantage of multi-core processors for faster execution of tasks.

- **Reduced Class File Size:**  
  Lambdas reduce the overall size of the class files by eliminating the need for inner classes or additional classes, leading to quicker class loading times and better runtime performance.

- **Optimized JVM Operations:**  
  Modern JVMs optimize Lambda functions through **invokedynamic** calls, which result in better runtime performance and quicker method dispatches compared to traditional object-oriented calls.

## 3. Enhanced Code Readability
- **More Concise Code:**  
  Lambda functions lead to more readable and maintainable code, reducing the complexity of callbacks.

- **Functional Style Programming:**  
  They enable a more functional style of programming, which often results in more declarative and less error-prone code.

# Streams and Functional Interfaces

## 1. Overview of Streams
- **Streams** provide a powerful and flexible way to process data in a functional style. They allow us to perform operations on a sequence of elements such as filtering, mapping, and reducing data with ease.
- Stream operations are **lazy** , meaning that intermediate operations (like filter and map) do not get executed until a terminal operation (like forEach) is invoked.

## 2. Functional Interfaces in Streams
Streams leverage **Functional Interfaces** to perform various operations. These interfaces allow functional-style operations like filtering, mapping, or consuming elements.

### a. Predicate (Used in `filter`)
- **Predicate** is a functional interface that represents a boolean-valued function of one argument.
- **filter** operation in streams uses `Predicate` to test each element and return a new stream containing only elements that match the provided condition.
- This interface is particularly useful for defining conditions and filtering data sets based on dynamic criteria.

### b. Function (Used in `map`)
- **Function** is a functional interface that takes one input and produces a result.
- **map** operation uses `Function` to transform elements of the stream. Each element is passed to the function, and the result is returned as part of a new stream.
- It's used when you want to apply a transformation (e.g., converting one type to another) to each element in a stream.

### c. Consumer (Used in `forEach`)
- **Consumer** is a functional interface that accepts a single input argument and performs an operation without returning any result.
- **forEach** uses `Consumer` to perform an action on each element of the stream, usually for tasks like logging, collecting, or processing the data.
- This is primarily used for performing side effects, as it doesn’t return any result.

### d. Supplier
- **Supplier** is a functional interface that doesn't take any arguments but supplies (returns) a result of a given type.
- Though not directly part of the core stream operations, `Supplier` can be used in scenarios where you need to provide a new value or resource, such as initializing objects or providing default values.

# Optional Class

## 1. Overview of Optional Class
- **Optional** is a container class introduced in Java 8 that can hold either a value or be empty (representing the absence of a value).
- It is used to prevent **NullPointerExceptions** by explicitly dealing with the potential absence of values, encouraging more robust and readable code.
- Optional is particularly useful for **method return types** where null could be returned, replacing nulls with Optional instances.

## 2. Key Benefits of Optional
- **Null Safety:**  
  Helps in eliminating `null` checks in code by using **Optional** instead of returning `null`, thus preventing `NullPointerException` at runtime.

## 3. Common Operations on Optional
### a. `isPresent()`
- **isPresent()** checks if there is a value inside the Optional. Returns `true` if a value is present, and `false` otherwise.

### b. `ifPresent()`
- **ifPresent()** allows performing an action if a value is present. It accepts a **Consumer** to handle the value when it's available, avoiding explicit `null` checks.

### c. `orElse()`
- **orElse()** provides a default value if the Optional is empty. This eliminates the need for manual null handling and ensures that some fallback value is always provided.

### d. `orElseGet()`
- **orElseGet()** is similar to `orElse()`, but it accepts a **Supplier** that provides a value lazily, allowing more efficient handling in scenarios where the default value is expensive to compute.

### e. `orElseThrow()`
- **orElseThrow()** throws an exception if the Optional is empty. This is useful for handling error cases explicitly, avoiding silent failures when a value is missing.

### f. `map()`
- **map()** is used to transform the value inside the Optional, applying a **Function** to it and returning a new Optional containing the transformed value.
