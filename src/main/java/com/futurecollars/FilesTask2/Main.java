package com.futurecollars.FilesTask2;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main (String[] args ) throws IOException {
        File file = new File("C:\\Users\\Asus\\IdeaProjects\\start2\\src\\main\\resources\\data.txt");
        file.createNewFile();
        OutputStream outputstream = new FileOutputStream(file);
        String text = "Kurs\nJava\nLekcja 6\nPliki\nWyjątki\nPliki\nKoniec Pliku";
        outputstream.write(text.getBytes());

        InputStream inputstream = new FileInputStream(file);
        int character = inputstream.read();
        while (character != -1) {
            System.out.print((char) character);
            character = inputstream.read();
        }


    }
}
