package com.futurecollars.FilesTask5;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
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
        reverseOrder(file.getAbsolutePath());

    }

    public static void reverseOrder(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            List<String> list = new ArrayList<>();
            String line = br.readLine();
            while (line != null) {
                list.add(line);
                line = br.readLine();
            }
            Collections.reverse(list);
            System.out.println(list);

        } finally {
            br.close();
        }
    }


}
