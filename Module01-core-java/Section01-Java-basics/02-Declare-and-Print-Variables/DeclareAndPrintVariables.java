import java.util.Scanner;

class DeclareAndPrintVariables {
    public static void main(String[] args) {
        System.out.println("Declare and print variables");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter gender: ");
        String gender = sc.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);

        sc.close();

    }

}

// Output
// Name: Gaurav  
// Age: 25  
// Gender: Male