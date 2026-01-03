class MainMethodStaticCheck {

    // If we remove 'static' from main method, the program will compile
    // but JVM will NOT be able to start execution.

    public void main(String[] args) {
        System.out.println("This program will not run");
    }

    /*
     * OBSERVED ERROR:
     * Error: Main method not found in class MainMethodStaticCheck,
     * please define the main method as:
     * public static void main(String[] args)
     *
     * REASON:
     * JVM looks for a specific entry point to start execution.
     * That entry point must be:
     * public static void main(String[] args)
     *
     * WHY main MUST be static:
     * - JVM starts execution WITHOUT creating an object
     * - static methods belong to the class, not to an object
     * - If main was non-static, JVM would need an object first
     * - But object creation itself needs main method
     * - This creates a circular dependency
     *
     * Hence, main method must be static.
     */
}