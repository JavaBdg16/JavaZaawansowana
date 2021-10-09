package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainThrows {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("file_name"))) {

            processFile(reader);

        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    static void processFile(BufferedReader reader) throws IOException {
        String inputLine = null;
        while ((inputLine = reader.readLine()) != null) {
            System.out.println(inputLine);
        }
    }
}
