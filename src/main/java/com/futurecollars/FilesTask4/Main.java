package com.futurecollars.FilesTask4;

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
        String text = "Kurs\nJava\nLekcja 6\nPliki\nWyj¹tki\nPliki\nKoniec Pliku";
        outputstream.write(text.getBytes());
        outputstream.close();
        searchWord("C:/Users/Asus/IdeaProjects/start2/src/main/resources/data.txt");


    }

    public static void searchWord(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {

            String line = br.readLine();
            while (line != null) {
                if (line.contains("Pliki")) {
                    System.out.println(line);
                    line = br.readLine();
                }
                else {
                    line = br.readLine();
                }
            }
        } finally {
            if (br != null) {
                br.close();
            }
        }
    }


}