# Java Input Handling – Interview Notes

## 1. How do you take input in Java?
Java provides multiple ways to take input:
- Scanner (most commonly used)
- BufferedReader (fast input)
- Console (rarely used)

In interviews, **Scanner** and **BufferedReader** are most important.

---

## 2. Scanner Class (Most Common)

### Import
```java
import java.util.Scanner;
Create Scanner Object
Scanner sc = new Scanner(System.in);
```

## 3.Common Scanner Methods
Method	Purpose
nextLine()	    Read full line (String)
next()	        Read single word
nextInt()	    Read integer
nextDouble()	Read decimal value
nextBoolean()	Read true/false

## 4. MOST IMPORTANT INTERVIEW QUESTION ⭐
Q: Why do we need sc.nextLine() after nextInt()?

Answer:
nextInt() reads only the number, not the newline character (\n).
The leftover newline is consumed by the next nextLine(), causing it to skip input.
So we explicitly call nextLine() to consume the newline.

## 5. What Happens If We Don’t Consume Newline?

Input gets skipped

String variable becomes empty

Program behaves unexpectedly

This is a very common beginner mistake.

## 6. Should age be String or int?

Correct Answer:
Age should be int because:

It represents numeric data

Allows validation and calculations

Follows type safety

Using String is acceptable only for beginner practice.

## 7. Scanner vs BufferedReader (Interview Comparison)
Scanner	BufferedReader
Easy to use	Faster
Slower	Slightly complex
Beginner friendly	Preferred in competitive coding
Parses input automatically	Manual parsing required

## 8. BufferedReader Example (For Knowledge)
BufferedReader br = new BufferedReader(
    new InputStreamReader(System.in)
);

String name = br.readLine();
int age = Integer.parseInt(br.readLine());

## 9. Interview One-Liners (MEMORIZE)

"Scanner is easy but slower than BufferedReader."

"nextInt() does not consume newline."

"Always close Scanner to avoid resource leak."

"Use proper data types for better type safety."