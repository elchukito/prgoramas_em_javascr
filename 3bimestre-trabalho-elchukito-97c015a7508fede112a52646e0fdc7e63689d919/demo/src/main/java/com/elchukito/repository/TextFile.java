package com.elchukito.repository;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TextFile {
    private String filePath = "arquivo.txt";

    public TextFile() {
    }

    public void writeTextFile(String content) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true));
            bw.write(content);

            bw.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void deleteTextFile() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
            bw.write("");

            bw.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public List<String> readTextFile() {
        Path path = Paths.get(filePath);

        try {
            BufferedReader br = new BufferedReader(new FileReader("arquivo.txt"));

            List<String> data = Files.readAllLines(path);
            
                br.close();
                return data;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public String readTextLine(int lineNumber) {
        Path path = Paths.get(filePath);

        try {
            BufferedReader br = new BufferedReader(new FileReader("arquivo.txt"));

            List<String> data = Files.readAllLines(path);
            
            br.close();
            return data.get(lineNumber);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
