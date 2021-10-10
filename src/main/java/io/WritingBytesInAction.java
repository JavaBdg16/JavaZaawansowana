package io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.GZIPOutputStream;

public class WritingBytesInAction {

    public static void main(String[] args) {
//        writeInts();
        // writeUtf();
        writeGzipInts();
    }

    private static void writeGzipInts() {
        String fileName = "files/ints.bin.gz";

        File file = new File(fileName);

        try (OutputStream outputStream = new FileOutputStream(file);
             GZIPOutputStream gzipOutputStream = new GZIPOutputStream(outputStream);
             DataOutputStream dataOutputStream = new DataOutputStream(gzipOutputStream)) {

            for (int i = 0; i < 1000; i++) {
                dataOutputStream.writeInt(i);
            }

        } catch (IOException ex) {

        }

        try {
            Path path = Paths.get(fileName);
            long size = Files.size(path);
            System.out.println(path + " size = " + size);
        } catch (IOException ex) {

        }
    }

    private static void writeInts() {
        String fileName = "files/ints.bin";

        File file = new File(fileName);

        try (OutputStream outputStream = new FileOutputStream(file);
             DataOutputStream dataOutputStream = new DataOutputStream(outputStream)) {

            for (int i = 0; i < 1000; i++) {
                dataOutputStream.writeInt(i);
            }

        } catch (IOException ex) {

        }

        try {
            Path path = Paths.get(fileName);
            long size = Files.size(path);
            System.out.println(path + " size = " + size);
        } catch (IOException ex) {

        }
    }

    private static void writeUtf() {

        String fileName = "files/strings.bin";
        File file = new File(fileName);

        try (OutputStream outputStream = new FileOutputStream(file);
             DataOutputStream dataOutputStream = new DataOutputStream(outputStream)) {

            dataOutputStream.writeUTF("Hello");

        } catch (IOException ex) {

        }

        try {
            Path path = Paths.get(fileName);
            long size = Files.size(path);
            System.out.println(path + " size = " + size);
        } catch (IOException ex) {

        }
    }
}
