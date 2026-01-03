class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        System.out.println("Swapping two numbers without third variable:");

        int a = 10;
        int b = 20;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap: a = " + a + ", b = " + b);

    }
}