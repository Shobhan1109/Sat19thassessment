package com.harman.assessment;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filecreation {
    public static void main(String[] args) {
        String data = "HAPPY NEW YEAR";
        try {
            FileOutputStream greeting = new FileOutputStream("data.txt");
            byte b[] = data.getBytes();
            greeting.write(b);
            greeting.close();
            System.out.println("File has been created.");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}