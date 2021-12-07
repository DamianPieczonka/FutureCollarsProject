package com.futurecollars.FilesTask6;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

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
        copyFile(file.getAbsolutePath());

    }

    public static void copyFile(String path) throws IOException, URISyntaxException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            URL resourcePath2 = Main.class.getResource("/outputstream.txt");
            assert resourcePath2 != null;
            File file2 = new File(resourcePath2.toURI());
            file2.createNewFile();
            OutputStream outputstream2 = new FileOutputStream(file2);
            List<String> list = new ArrayList<>();
            String line = br.readLine();
            while (line != null) {
                outputstream2.write(line.toUpperCase().getBytes());
                outputstream2.write("\n".getBytes());
                list.add(line);
                line = br.readLine();
            }
            outputstream2.close();
        } finally {
            br.close();
        }
    }


}
