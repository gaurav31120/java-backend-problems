// File name: ClassNameFileNameMismatch.java

// Public class name does NOT match file name
public class WrongClassName {

    public static void main(String[] args) {
        System.out.println("This code will not compile");
    }

    /*
     * OBSERVED ERROR:
     * error: class WrongClassName is public, should be declared in a file
     * named WrongClassName.java
     *
     * EXPLANATION:
     * - In Java, a public class must have the same name as the file
     * - The Java compiler uses the file name to locate the public class
     * - This rule avoids ambiguity during class loading
     *
     * NOTE:
     * - If the class is NOT public, file name and class name can differ
     */
}