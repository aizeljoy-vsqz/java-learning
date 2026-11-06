# Object-Oriented Programming (OOP) – Design Process

## 1. What is the Design Process?

The **OOP Design Process** is the process of planning and organizing a software system before writing the actual code.

It helps us identify:

- What the system should do.
- What objects or classes are needed.
- How classes are connected.
- What responsibilities each class should have.

**Remember:**

- Analysis = What does the system need?
- Design = How will we structure the solution?
- Implementation = How will we write the code?

---

## 2. Steps in the OOP Design Process

We will use a **Student Management System** as an example.

### Step 1: Identify Requirements

**Question: What should the system do?**

Requirements describe the features and functions the system must provide.

Example:

- Add students.
- Store student information.
- Record student grades.
- View student information.

### Step 2: Identify Use Cases

**Question: Who uses the system, and what can they do?**

A use case describes an interaction between an actor and the system to achieve a goal.

Example:

|   | Actor   | Use Case                 |
| - | ------- | ------------------------ |
|   | Teacher | Add Student              |
|   | Teacher | Record Grades            |
|   | Teacher | View Student Information |

Key terms:

- Actor = Person or external system interacting with the application.
- Use Case = Action or goal performed using the system.

### Step 3: Identify Conceptual Classes

**Question: What are the important things in the system?**

Conceptual classes represent important real-world concepts in the problem domain.

Example:

- Student
- Teacher
- Grade

At this stage, we are identifying concepts, not writing Java code yet.

### Step 4: Identify Relationships Between Classes

**Question: How are the classes connected?**

Classes do not always work independently. They interact with one another.

Example:

- A Teacher records grades.
- A Student receives grades.
- A Grade belongs to a Student.

Common relationships:

- Association = One class is connected to another.
- Aggregation = A weak whole-part relationship.
- Composition = A strong whole-part relationship.
- Inheritance = One class inherits from another.

### Step 5: Design and Derive Software Classes

**Question: What attributes and methods should each class have?**

Now we turn the conceptual classes into software design elements.

Example:

**Student Class**

Attributes:

- name
- studentId

Methods:

- displayInfo()
- updateInfo()

**Grade Class**

Attributes:

- subject
- score

Methods:

- displayGrade()
- calculateAverage()

Important distinction:

- Conceptual Class = Represents an important concept in the real world.
- Software Class = Defines how that concept will be represented in the program.

### Step 6: Assign Responsibilities

**Question: What should each class know and do?**

A responsibility defines what a particular class is expected to handle.

Example:

| Class   | Responsibility             |
| ------- | -------------------------- |
| Student | Manage student information |
| Teacher | Record student grades      |
| Grade   | Store and calculate grades |

Why is this important?

We don't want one class to handle everything. Each class should have responsibilities that make sense for its purpose.

This makes code easier to maintain, understand, and modify.

### Step 7: Implement Using Java

**Question: How do we turn the design into actual code?**

After identifying the classes, attributes, methods, relationships, and responsibilities, we can start coding.

Example:

```java
class Student {

    String name;
    int studentId;

    void displayInfo() {
        System.out.println(name);
        System.out.println(studentId);
    }
}
```

Creating an object:

```java
public class Main {

    public static void main(String[] args) {

        Student student = new Student();

        student.name = "Alex";
        student.studentId = 101;

        student.displayInfo();
    }
}
```

Output:

```text
Alex
101
```

---

## 3. Complete Design Process Summary

| Step                  | Main Question                           | Purpose                      |
| --------------------- | --------------------------------------- | ---------------------------- |
| 1. Requirements       | What should the system do?              | Understand system needs      |
| 2. Use Cases          | Who uses the system?                    | Identify user interactions   |
| 3. Conceptual Classes | What are the important concepts?        | Discover real-world objects  |
| 4. Relationships      | How are they connected?                 | Understand class connections |
| 5. Software Classes   | What attributes and methods are needed? | Design program structure     |
| 6. Responsibilities   | What should each class do?              | Assign tasks to classes      |
| 7. Implementation     | How do we code it?                      | Build the actual program     |

## 4. Important Concepts to Remember

### Analysis vs. Design vs. Implementation

| Phase                    | Meaning                                                         |
| ------------------------ | --------------------------------------------------------------- |
| Object-Oriented Analysis | Understand the problem and identify what the system needs.      |
| Object-Oriented Design   | Plan the classes, relationships, methods, and responsibilities. |
| Implementation           | Translate the design into Java code.                            |

### Conceptual Classes vs. Software Classes

| Conceptual Class                              | Software Class                                     |
| --------------------------------------------- | -------------------------------------------------- |
| Represents a real-world concept.              | Represents a program structure.                    |
| Identified during analysis.                   | Developed during design.                           |
| Example: Student                              | Example: `class Student`                           |
| Focuses on what exists in the problem domain. | Focuses on how it will be represented in software. |

---

## 5. Easy Way to Memorize

**Requirements → Use Cases → Conceptual Classes → Relationships → Software Classes → Responsibilities → Implementation**

Remember these questions:

1. What does the system need?
2. Who will use the system?
3. What important things exist?
4. How are those things connected?
5. What classes, attributes, and methods do we need?
6. What should each class do?
7. How do we implement everything in Java?

**Final takeaway:**

OOP Design is not just about writing classes. It is about deciding how to organize your program so that every class has a purpose and works properly with other classes.

The goal is to create software that is organized, reusable, understandable, and maintainable.
