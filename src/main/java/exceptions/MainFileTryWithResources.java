package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;

public class MainFileTryWithResources {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("file_name"))) {

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

        }

    }
}
