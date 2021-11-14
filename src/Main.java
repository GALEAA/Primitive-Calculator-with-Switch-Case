import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, operations;

        Scanner input = new Scanner(System.in);
        System.out.print("Please write first number:   ");
        n1 = input.nextInt();

        System.out.print("Please write second number:   ");
        n2 = input.nextInt();

        System.out.println("1 - Addition\n 2 - Subtraction\n  3 - Multiplication\n   4 - Division ");
        System.out.print("Seçiminiz : ");
        operations = input.nextInt();

        System.out.println(operations);


        switch (operations) {
            case 1:
                System.out.println("Result is=  "+(n1+n2));
                break;
            case 2:
                System.out.println("Result is=  "+(n1-n2));
                break;
            case 3:
                System.out.println("Result is=  "+(n1*n2));
                break;
            case 4:
                System.out.println("Result is=  "+(n1/n2));
                break;
            default :
                System.out.println("Value is invalid");
        }


    }
}
