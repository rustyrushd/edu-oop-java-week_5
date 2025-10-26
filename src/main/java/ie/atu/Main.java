package ie.atu;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);
        int age = 0;
        while(true) {
            System.out.println("Enter your age:");
            String text = scan1.nextLine().trim();
            try {
                age = Integer.parseInt(text);
                System.out.println("Your entered " + age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please try again. " + e.getMessage());
            }
        }
    }
}