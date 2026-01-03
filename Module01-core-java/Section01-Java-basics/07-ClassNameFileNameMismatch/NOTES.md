📝 Notes ✅ (INTERVIEW-READY)
## Why must public class name match file name?

- Java allows only one public class per file
- File name is used by compiler to identify the public class
- Enforced at compile time to avoid ambiguity

Rule:
public class X  → file name must be X.java

## What if class is not public?
- File name and class name can be different
- No compiler error

## Type of error
- Compile-time error

🎯 Interview Questions + Answers
Q1. Why Java enforces this rule only for public classes?

Answer:
Public classes are accessible everywhere, so Java enforces strict naming to ensure correct class loading.

Q2. Can a Java file contain multiple classes?

Answer:
Yes, but only one class can be public.

Q3. Is this a compile-time or runtime error?

Answer:
Compile-time error.