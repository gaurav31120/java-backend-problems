📝 Notes
🔹 How swapping without a third variable works

Store sum in a

Derive original a using subtraction

Derive original b using subtraction

🔹 Limitation of this approach

Can cause integer overflow if numbers are very large

🎯 Interview Questions + Answers
Q1. Why does this approach work?

Answer:
Because the sum of two numbers is stored temporarily, allowing reconstruction of original values using subtraction.

Q2. What is the drawback of this approach?

Answer:
It can cause integer overflow if the sum exceeds the maximum value of int.

Q3. Which swap method is safer: with temp or without?

Answer:
Swapping with a third variable is safer and more readable.

Q4. Can we swap using multiplication and division?

Answer:
Yes, but it fails when one value is zero and is less safe.