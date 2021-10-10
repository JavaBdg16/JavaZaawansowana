package io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class IoReaderInAction {

    public static void main(String[] args) {

        File file = new File("files/data.txt");
//        try {
//            System.out.println(file.getName());
//            System.out.println(file.exists());
//            if (!file.exists()) {
//                File parent = file.getParentFile();
//                parent.mkdirs();
//                file.createNewFile();
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        try (Reader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);

                String[] parts = line.split(";");
                for (String s : parts) {
                    System.out.println(s);
                }
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try (BufferedReader bufferedReader =
                     Files.newBufferedReader(Paths.get("files/data.txt"))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);

                String[] parts = line.split(";");
                for (String s : parts) {
                    System.out.println(s);
                }
            }

        } catch (IOException ex) {

        }
    }
}
