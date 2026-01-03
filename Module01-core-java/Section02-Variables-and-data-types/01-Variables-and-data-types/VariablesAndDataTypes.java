class VariablesAndDataTypes {
    public static void main(String[] args) {
        byte byteValue = 4;
        short shortValue = 8;
        int intValue = 16;
        long longValue = 32;
        float floatValue = 32.6f;
        double doubleValue = 64.8;
        char charValue = 'A';
        boolean booleanValue = false;

        System.out.println("Byte value: " + byteValue);
        System.out.println("Short value: " + shortValue);
        System.out.println("Int value: " + intValue);
        System.out.println("Long value: " + longValue);
        System.out.println("float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);
        System.out.println("Char value: " + charValue);
        System.out.println("Boolean value: " + booleanValue);
        System.out.println("-----------------------------------------");

        // Implicit casting (Widening)
        double intToDouble = intValue;

        // Explicit casting (Narrowing)
        int doubleToInt = (int) doubleValue;
        int floatToInt = (int) floatValue;

        System.out.println("Implicit int to double: " + intToDouble);
        System.out.println("Explicit double to int: " + doubleToInt);
        System.out.println("Explicit float to int: " + floatToInt);

    }
}


// Output
// Byte value: 4
// Short value: 8
// Int value: 16
// Long value: 32
// float value: 32.6
// Double value: 64.8
// Char value: A
// Boolean value: false
// -----------------------------------------
// Implicit int to double: 16.0
// Explicit double to int: 64
// Explicit float to int: 32