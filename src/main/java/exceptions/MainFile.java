package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainFile {

    public static void main(String[] args) {

        BufferedReader reader = null;
        try {

            reader = new BufferedReader(new FileReader("file_name"));
            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);
                String[] parts = inputLine.split(" ");
                String operation = parts[0];
                double leftValue = Double.parseDouble(parts[1]);
                double rightValue = Double.parseDouble(parts[2]);
            }

        } catch (Exception ex) {

            System.out.println("Error: " + ex.getMessage());

        } finally {

            try {
                System.out.println("Closing file - file_name");
                reader.close();
            } catch (IOException e) {
                System.out.println("Error closing file");
            }

        }

    }

}
