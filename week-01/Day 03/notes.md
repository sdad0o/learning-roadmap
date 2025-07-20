
## 🏗️ Inheritance

**Inheritance** is a core concept in Object-Oriented Programming (OOP). It allows one class (a *subclass* or *child*) to inherit the properties and behaviors (fields and methods) of another class (the *superclass* or *parent*).

This promotes **code reuse**, **modularity**, and helps follow the **DRY** (Don't Repeat Yourself) principle.

### ✅ Real-World Analogy:
Think of a general class `Vehicle`, and a specific type like `Car`. A `Car` is a `Vehicle`, so it can inherit common properties like `speed`, `color`, and behaviors like `start()`, `stop()`.

### ✅ Java Example:

```java
// Abstract superclass
public abstract class Media {
    protected String title;
    protected String author;

    public Media(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Abstract method to be implemented by subclasses
    public abstract void display();
}
````

```java
// Concrete subclass
public class Book extends Media {
    public Book(String title, String author) {
        super(title, author);
    }

    @Override
    public void display() {
        System.out.println("Book: " + title + " by " + author);
    }
}
```

---

## 🧩 Interfaces

An **interface** in Java is a completely abstract class that defines a contract for what a class *can do*, without dictating how it must do it.

Interfaces are ideal for defining capabilities that may be shared across unrelated classes.

> Java 8 introduced **default methods**, and Java 9 introduced **private methods**, but for the sake of core OOP understanding, we'll focus on the classic usage.

### ✅ Use Case:

You want multiple unrelated classes to have a `print()` capability — this is where interfaces shine.

### ✅ Java Example:

```java
// Define a contract
public interface Printable {
    void print();
}
```

```java
// Book class implements Printable
public class Book extends Media implements Printable {
    public Book(String title, String author) {
        super(title, author);
    }

    @Override
    public void display() {
        System.out.println("Displaying Book: " + title);
    }

    @Override
    public void print() {
        System.out.println("Printing Book: " + title);
    }
}
```

```java
// Another implementation
public class EBook extends Media implements Printable {
    public EBook(String title, String author) {
        super(title, author);
    }

    @Override
    public void display() {
        System.out.println("Displaying EBook: " + title);
    }

    @Override
    public void print() {
        System.out.println("Printing EBook: " + title);
    }
}
```

---

## 🧠 Polymorphism

**Polymorphism** enables one interface to be used for a general class of actions. It allows methods to behave differently based on the object that is invoking them.

There are two main types in Java:

* **Compile-time polymorphism** (method overloading)
* **Runtime polymorphism** (method overriding — our focus today)

### ✅ Benefits:

* Write flexible and reusable code.
* Avoid excessive `if-else` or `switch` statements.
* Easily extend applications by adding new classes without changing existing code.

### ✅ Java Example:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Media> library = new ArrayList<>();

        library.add(new Book("1984", "George Orwell"));
        library.add(new EBook("Java Guide", "Mosh Hamedani"));

        for (Media media : library) {
            media.display();  // Calls the appropriate subclass method
            if (media instanceof Printable) {
                ((Printable) media).print();  // Cast to interface
            }
        }
    }
}
```

📌 Even though `media` is of type `Media`, the actual `display()` or `print()` called is determined by the object type (`Book` or `EBook`) at runtime.

---

## 🔍 Comparison: Inheritance vs Interfaces

| Feature           | Inheritance (`extends`)        | Interface (`implements`)            |
| ----------------- | ------------------------------ | ----------------------------------- |
| Relationship Type | IS-A                           | CAN-DO                              |
| Multiple support? | ❌ No (single inheritance only) | ✅ Yes (multiple interfaces allowed) |
| Purpose           | Reuse structure & behavior     | Share capabilities                  |
| Implementation    | Can have some implementations  | Must implement all methods (Java 7) |
| Fields            | Instance fields allowed        | Only constants allowed              |
| Access Modifiers  | Any (public, private, etc.)    | Methods are `public` by default     |
| Constructors      | Inherited from superclass      | Interfaces cannot have constructors |
| Use case          | Class hierarchy modeling       | Cross-cutting behavior              |

---

## 🎓 UML Diagram 

```
           +-----------------+
           |   <<abstract>>  |
           |     Media       |
           +-----------------+
           | - title         |
           | - author        |
           +-----------------+
           | +display()      |
           +-----------------+
                 /_\
                  |
      -------------------------
      |                       |
+-------------+       +--------------+
|    Book     |       |    EBook     |
+-------------+       +--------------+
| +display()  |       | +display()   |
| +print()    |       | +print()     |
+-------------+       +--------------+
        \                 /
         \               /
         +---------------+
         |  Printable    |
         +---------------+
         | +print()      |
         +---------------+
```

---

## 🧠 Reflection Prompt

💬 **What advantages does polymorphism offer?**

✅ **Answer:**

* **Code reusability**: You can use a single interface or abstract class reference to handle multiple types.
* **Flexibility**: Easily extend the system by adding new classes that implement a shared interface or extend a base class.
* **Maintainability**: Avoid hardcoded logic (e.g., switch or if-else trees). Add new behaviors without touching existing logic.
* **Decoupling**: Objects depend on abstractions, not concrete implementations (solid design principle: *Dependency Inversion*).

---

## ✅ Summary Checklist for Day 3

* [x] Created abstract class `Media` with `display()`.
* [x] Created interface `Printable` with `print()`.
* [x] Implemented `Book` and `EBook` with inheritance and interfaces.
* [x] Used `List<Media>` to demonstrate polymorphism.
* [x] Documented everything with explanations and a UML diagram.


