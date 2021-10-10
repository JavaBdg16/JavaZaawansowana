package io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipFiles {

    public static void main(String[] args) {

        write();
        read();
    }

    private static void read() {
        String fileName = "files/archive.zip";
        File file = new File(fileName);

        try (InputStream inputStream = new FileInputStream(file);
             ZipInputStream zipInputStream = new ZipInputStream(inputStream);
             DataInputStream dataInputStream = new DataInputStream(zipInputStream)) {

            ZipEntry entry = zipInputStream.getNextEntry();
            while (entry != null) {
                if (entry.isDirectory()) {
                    System.out.println("Reading directory " + entry);
                } else {

                    if (entry.getName().endsWith(".bin")) {
                        List<Integer> ints = new ArrayList<>();
                        try {
                            while (true) {
                                ints.add(dataInputStream.readInt());
                            }
                        } catch (EOFException ez) {
                            // odczytałem wszystko, doszedłem do końca pliku
                        }

                        System.out.println("List if ints size = " + ints.size());
                    }

                    if (entry.getName().endsWith(".txt")) {
                        String content = dataInputStream.readUTF();
                        System.out.println("Text file content = " + content);
                    }

                }

                entry = zipInputStream.getNextEntry();
            }

        } catch (IOException ex) {

        }
    }

    private static void write() {
        String fileName = "files/archive.zip";
        File file = new File(fileName);

        try (OutputStream outputStream = new FileOutputStream(file);
             ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream);
             DataOutputStream dataOutputStream = new DataOutputStream(zipOutputStream)) {

            ZipEntry dirEntry = new ZipEntry("bin/");
            zipOutputStream.putNextEntry(dirEntry);

            ZipEntry binFileEntry = new ZipEntry("bin/ints.bin");
            zipOutputStream.putNextEntry(binFileEntry);

            for (int i = 0; i < 1000; i++) {
                dataOutputStream.writeInt(i);
            }

            ZipEntry textDirEntry = new ZipEntry("text/");
            zipOutputStream.putNextEntry(textDirEntry);

            ZipEntry textFileEntry = new ZipEntry("text/file.txt");
            zipOutputStream.putNextEntry(textFileEntry);

            dataOutputStream.writeUTF("Lorem ipsum bla bla bla");

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
