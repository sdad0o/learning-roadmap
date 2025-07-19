# Day two

## 🧱 **1. What is a Class in Java?**

A **class** is a blueprint for creating objects. It defines **what an object is** and **what it can do**.

Think of a class like a **template** for a car. It defines:

- What parts a car has (fields/attributes)
- What actions it can perform (methods)

### Example:

```java
public class Car {
    // fields (attributes)
    String brand;
    int year;

    // methods (behavior)
    void drive() {
        System.out.println("The car is driving.");
    }
}
```

---

## 🧩 **2. Fields (Instance Variables)**

**Fields** are variables that belong to a class. They store the **state/data** of an object.

### Example:

```java
String brand;   // field
int year;       // field
```

Each object created from the class gets **its own copy** of these fields.

---

## 🛠️ **3. Methods**

**Methods** are functions inside a class. They define **what actions the object can perform**.

A method can:

- Return a value
- Take parameters
- Modify object fields
- Call other methods

### Example:

```java
void drive() {
    System.out.println("The car is driving.");
}
```

### With Parameters and Return Value:

```java
int getAge(int currentYear) {
    return currentYear - year;
}
```

---

## 🧪 **4. Constructors**

A **constructor** is a special method used to **initialize** new objects. It has the same name as the class and no return type.

### Example:

```java
public Car(String brand, int year) {
    this.brand = brand;
    this.year = year;
}
```

You use it like this:

```java
Car myCar = new Car("Toyota", 2020);
```

---

## 📦 Full Example:

```java
public class Car {
    // Fields
    String brand;
    int year;

    // Constructor
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method
    public void drive() {
        System.out.println(brand + " is driving.");
    }

    public int getAge(int currentYear) {
        return currentYear - year;
    }
}
```

### Usage:

```java
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Honda", 2018);
        car.drive();  // Output: Honda is driving.
        System.out.println("Car age: " + car.getAge(2025));
    }
}
```

---

## 💡 Summary

| Concept         | Purpose                                 |
| --------------- | --------------------------------------- |
| **Class**       | Template for creating objects           |
| **Field**       | Stores data for each object             |
| **Method**      | Defines behavior (what the object does) |
| **Constructor** | Initializes objects when created        |

---
