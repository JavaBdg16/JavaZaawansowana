package io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IoWriterInAction {

    public static void main(String[] args) {

        String fileName = "files/data2.txt";

        try (Writer writer = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

        } catch (IOException ex) {

        }

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get(fileName));
             PrintWriter printWriter = new PrintWriter(bufferedWriter)) {

            printWriter.println("Hello World!");
            printWriter.printf("%d %o 0x%04x\n", 20, 20, 20);

        } catch (IOException ex) {

        }
    }
}
