package com.futurecollars.FilesTask1;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class DataFile {

    public static void main (String[] args ) throws IOException {
        File file = new File("C:\\Users\\Asus\\IdeaProjects\\start2\\src\\main\\resources\\data.txt");
        file.createNewFile();
        OutputStream outputstream = new FileOutputStream(file);
        String text = "Kurs\nJava\nLekcja 6\nPliki\nWyjątki\nPliki\nKoniec Pliku";
        outputstream.write(text.getBytes(StandardCharsets.UTF_8));

    }
}
