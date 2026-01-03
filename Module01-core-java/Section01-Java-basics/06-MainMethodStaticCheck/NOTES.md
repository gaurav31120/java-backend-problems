🧠 Notes
🔹 Why must the main method be static?

JVM starts the program without creating any object

Static methods can be called using class name

Non-static methods need an object

JVM cannot create an object before execution starts

👉 Therefore, main must be static

🔹 What happens if static is removed?

Code compiles

Program fails at runtime

JVM throws:

Error: Main method not found

🔹 JVM Execution Flow (related to this problem)

JVM loads the class

JVM searches for:

public static void main(String[] args)


If not found → program terminates

🎯 Interview Questions + Perfect Answers
Q1. Can JVM call a non-static main method?

Answer:
No. JVM cannot call a non-static method without creating an object.

Q2. Why doesn’t Java allow main without static?

Answer:
Because JVM needs an entry point that can be called without object creation.

Q3. Can we overload main method?

Answer:
Yes, but JVM will only call:

public static void main(String[] args)

Q4. Is static mandatory for main?

Answer:
Yes. Without static, JVM cannot start the program.