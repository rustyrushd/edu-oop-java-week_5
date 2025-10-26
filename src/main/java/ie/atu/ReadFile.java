package ie.atu;

import java.io.*;

public class ReadFile
{
    public static void main(String[] args)
    {
        showFile();
    }

    static  void showFile()
    {
        try (BufferedReader br = new BufferedReader(new FileReader("namebook.txt"))) {
            System.out.println("Contents of namebook.txt:");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(" - " + line);
            }
        } catch (IOException ex) {
            System.out.println("Could not read file: " + ex.getMessage());
        }
    }
}
