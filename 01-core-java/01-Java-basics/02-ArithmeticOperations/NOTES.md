## Problem 02 Notes

- Difference between / and % operators?
- What happens when we divide two integers?
- What is operator precedence?
- Why does division sometimes give incorrect-looking results?

-----------------------------------------------------   

🧠 Interview-Ready Notes
1. Arithmetic Operators in Java

Java provides basic arithmetic operators:

+ → Addition

- → Subtraction

* → Multiplication

/ → Division

% → Modulus (remainder)

2. Integer Division in Java (VERY IMPORTANT)

When both operands are integers, Java performs integer division

Decimal part is discarded, not rounded

Example:

int a = 5 / 2;
System.out.println(a); // Output: 2

3. Why Parentheses Are Used
System.out.println("Addition:" + (num1 + num2));


Without parentheses:

"Addition:" + num1 + num2


➡ Output would be "Addition:124"

Because:

+ with String means String concatenation

4. How to Get Decimal Result
double result = num1 / (double) num2;
-------------------------------------------------------------------

🎯 Interview Questions WITH ANSWERS

❓ Q1. Difference between / and % operators?

Answer (Interview Ready):

/ → Gives quotient

% → Gives remainder

Example:

10 / 3 = 3
10 % 3 = 1

❓ Q2. What happens when we divide two integers in Java?

Answer:

Java performs integer division

Decimal part is discarded

Example:

5 / 2 = 2

❓ Q3. What is operator precedence?

Answer:

It defines which operator executes first

* and / have higher precedence than + and -

Example:

int x = 10 + 5 * 2; // Output: 20

❓ Q4. Why does division sometimes give incorrect-looking results?

Answer:

Because:

Both operands are integers

Java removes the decimal part

Example:

7 / 2 = 3  // not 3.5


Fix:

7 / 2.0 = 3.5

❓ Q5. What happens if we divide by zero?

Answer:

For int → ArithmeticException

For double → Infinity

Example:

int a = 10 / 0; // Runtime error