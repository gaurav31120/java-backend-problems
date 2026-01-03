📝 Notes:
🔹 What is swapping?

Swapping means exchanging the values of two variables.

🔹 Why do we need a third variable?

To temporarily store one value

Prevents data loss during reassignment

🔹 Swapping steps explained

Store a in temp

Assign b to a

Assign temp to b

🎯 Interview Questions + Answers
Q1. Why is a third variable required here?

Answer:
Because without a temporary variable, assigning a = b would overwrite the original value of a.

Q2. Is this the safest way to swap numbers?

Answer:
Yes. Using a third variable is the safest and most readable way. It avoids overflow issues and improves clarity.

Q3. Where are these variables stored in memory?

Answer:
They are local variables and are stored in stack memory.

Q4. Can we swap without using a third variable?

Answer:
Yes, using arithmetic or bitwise operators, but those methods are less readable and may cause overflow.