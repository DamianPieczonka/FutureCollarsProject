package com.futurecollars.FilesTask2;
import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {
        URL resourcePath = Main.class.getResource("/data.txt");

        assert resourcePath != null;
        File file = new File(resourcePath.toURI());
        file.createNewFile();
        OutputStream outputstream = new FileOutputStream(file);
        String text = "Kurs\nJava\nLekcja 6\nPliki\nWyjątki\nPliki\nKoniec Pliku";
        outputstream.write(text.getBytes());
        outputstream.close();

        InputStream inputstream = new FileInputStream(file);
        int character = inputstream.read();
        while (character != -1) {
            System.out.print((char) character);
            character = inputstream.read();
        }
        inputstream.close();

    }
}
