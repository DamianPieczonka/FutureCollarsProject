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
        String text = "Kurs\nJava\nLekcja 6\nPliki\nWyj¹tki\nPliki\nKoniec Pliku";
        outputstream.write(text.getBytes());
        outputstream.close();
        readEverySecondLine("C:/Users/Asus/IdeaProjects/start2/src/main/resources/data.txt");


    }

    public static void readEverySecondLine( String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            String line = br.readLine();
            int index = 0;
            while (line != null) {
                if (index % 2 == 0) {
                    System.out.println(line);
                    line = br.readLine();
                    index++;
                } else {
                    line = br.readLine();
                    index++;
                }
            }
        } finally {
            if (br != null) {
                br.close();
            }
        }
    }


}