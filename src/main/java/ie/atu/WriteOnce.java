package ie.atu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteOnce
{
	public static void main(String[] args)
	{
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter the file name (e.g. namebook.txt): ");
        String fileName = scan1.nextLine().trim();

        System.out.println("Please enter a name to save in " + fileName + ": ");
        String name = scan1.nextLine().trim();

        try(PrintWriter out = new PrintWriter(new FileWriter(fileName, true))) {
            out.println(name);
            System.out.println("Saved to " + fileName);
        } catch (IOException ex) {
            System.err.println("Error writing to: " + ex.getMessage());
        }
    }
}
