import java.util.Scanner;

public class vote {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("valid age for the voter for polling a vote");

        System.out.println("Enter the Name:");
        String name = input.nextLine();
        System.out.println("enter the age:");
        int age = input.nextInt();

        if (age > 18) {

            System.out.println(name+","+" you are eligible to vote.");
        }
        else {
            System.out.println(name+","+"you are not eligible to vote ");
        }
    }
}
