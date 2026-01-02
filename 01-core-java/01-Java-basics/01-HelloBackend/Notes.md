1 What is the role of the main method?

2 Why does Java execution start from main?

3 Meaning of public, static, void, String[]


🔹 Why does Java execution start from main()?

JVM looks for a specific entry point to start execution.

That entry point is:

public static void main(String[] args)


Without main, JVM does not know where to begin.

Interview line:

“main is the entry point of a Java application where JVM starts execution.”

🔹 Why is main() static?

JVM calls main() without creating an object.

static methods belong to the class, not to objects.

If main were non-static, JVM would need an object first → chicken-and-egg problem.

Interview line:

“main is static so JVM can invoke it without creating an instance of the class.”

🔹 Meaning of public static void main(String[] args)

public → JVM must be able to access it from anywhere

static → No object required

void → JVM does not expect a return value

String[] args → Command-line arguments

🔹 Why must class name match file name?

Java compiler enforces this rule for public classes.

File name = class name → avoids ambiguity during class loading.

Interview line:

“In Java, a public class name must match the file name to ensure correct class loading.”

🔹 What happens when you run a Java program?

javac HelloBackend.java

Compiles source code

Generates HelloBackend.class

java HelloBackend

JVM loads the .class file

JVM looks for main()

Execution starts from main

🔹 JDK vs JRE vs JVM (1-line clarity)

JVM → Executes bytecode

JRE → JVM + core libraries

JDK → JRE + compiler + dev tools

Interview shortcut:

“JDK contains JRE, and JRE contains JVM.”