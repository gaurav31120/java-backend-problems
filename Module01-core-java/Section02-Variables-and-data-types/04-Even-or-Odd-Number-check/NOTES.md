Interview-Ready Notes
🔹 What is % operator?

% is modulus operator

Returns remainder after division

9 % 2 = 1
10 % 2 = 0

🔹 Difference between / and %
Operator	Purpose	Example
/	Division	9 / 2 = 4
%	Remainder	9 % 2 = 1
🔹 What happens when we divide integers?
int a = 9 / 2;
System.out.println(a); // Output: 4


👉 Decimal part is discarded, not rounded.

🔹 Can % be used with negative numbers?

Yes.

-9 % 2 = -1


Sign follows dividend.

🎯 Interview Questions (with answers)
❓ Q1: How do you check even/odd without %?

Answer:

if ((num & 1) == 0) {
    // even
}


(Bitwise AND – advanced but impressive)

❓ Q2: Can % be used with floating numbers?

Answer:
Yes, but not recommended for even/odd logic.

5.5 % 2 = 1.5

❓ Q3: Time complexity?

Answer:
O(1) – constant time