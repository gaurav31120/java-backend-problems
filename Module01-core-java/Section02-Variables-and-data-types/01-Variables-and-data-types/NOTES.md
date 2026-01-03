🧠 INTERVIEW-READY NOTES
1️⃣ What are Primitive Data Types in Java?

Java has 8 primitive types:

byte, short, int, long

float, double

char

boolean

They store actual values, not references.

2️⃣ Difference Between Implicit & Explicit Casting
Type	Description
Implicit Casting	Smaller → Larger type
Explicit Casting	Larger → Smaller type

Example:

double d = 10;        // implicit
int i = (int) 10.5;  // explicit

3️⃣ Why Explicit Casting is Dangerous?

Data loss may occur

Decimal part is truncated

(double) 10.9 → int = 10

4️⃣ Where Are Primitive Variables Stored?

Local variables → Stack

Instance variables → Heap (inside object)

Static variables → Method Area

5️⃣ Common Interview Trap Question ⚠️
float f = 10.5;   // ❌ compile error
float f = 10.5f;  // ✅ correct


Why?
👉 Java treats decimals as double by default.

🎯 INTERVIEW QUESTIONS + ANSWERS (VERY IMPORTANT)
Q1. What is default value of primitive variables?

👉 Local variables: NO default value
👉 Instance variables:

int → 0

boolean → false

char → '\u0000'

Q2. Why long needs L?
long l = 10000000000;  // ❌
long l = 10000000000L; // ✅


Because default integer literal is int.

Q3. Difference between float and double?
float	double
4 bytes	8 bytes
Less precision	More precision
Faster	Slower
Q4. Can boolean be converted to int?

❌ No — Java does not allow this. 
--------------------------------------------------------

🎯 Interview Questions + PERFECT Answers
Q1. What is implicit type casting?

Answer:

Implicit casting is automatic conversion done by Java when converting a smaller data type to a larger data type. It is safe and does not cause data loss.

Q2. What is explicit type casting?

Answer:

Explicit casting is manual conversion from a larger data type to a smaller one using a cast operator. It may cause data loss.

Q3. Why explicit casting is required?

Answer:

Because narrowing conversions can cause data loss, Java forces developers to explicitly confirm the conversion.

Q4. What happens when float is cast to int?

Answer:

The decimal part is truncated, not rounded.

Example:

(float) 32.9 → 32

Q5. Can implicit casting cause data loss?

Answer:

No, implicit casting is safe and does not cause data loss.