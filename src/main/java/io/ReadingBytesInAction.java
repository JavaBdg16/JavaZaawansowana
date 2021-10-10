package io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

public class ReadingBytesInAction {

    public static void main(String[] args) {
        // readInts();
        readGzipInts();
    }

    private static void readGzipInts() {
        String fileName = "files/ints.bin.gz";
        File file = new File(fileName);

        try (InputStream inputStream = new FileInputStream(file);
             GZIPInputStream gzipInputStream = new GZIPInputStream(inputStream);
             DataInputStream dataInputStream = new DataInputStream(gzipInputStream)) {

            List<Integer> ints = new ArrayList<>();
            try {
                while (true) {
                    ints.add(dataInputStream.readInt());
                }
            } catch (EOFException ez) {
                // odczytałem wszystko, doszedłem do końca pliku
            }

            System.out.println(ints.size());

        } catch (IOException ex) {
            // TODO
        }
    }

    private static void readInts() {
        String fileName = "files/ints.bin";
        File file = new File(fileName);

        try (InputStream inputStream = new FileInputStream(file);
             DataInputStream dataInputStream = new DataInputStream(inputStream)) {

            List<Integer> ints = new ArrayList<>();
            try {
                while (true) {
                    ints.add(dataInputStream.readInt());
                }
            } catch (EOFException ez) {
                // odczytałem wszystko, doszedłem do końca pliku
            }

            System.out.println(ints.size());

        } catch (IOException ex) {
            // TODO
        }
    }
}
