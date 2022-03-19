package com.harman.assessment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Vowelsfreq {

    public static void main(String[] args) {
        try {
            FileInputStream file=new FileInputStream("data.txt");//syntax for file input for reading
            int y=0,j=0,a=0,e=0,i=0,o=0,u=0;
            String z="";
            String vowel = "aeiou";
            while ( (y=file.read())!=-1){
                z=z+(char)y;
            }
            z=z.toLowerCase();
            System.out.println(z);
            for(j=0;j<z.length();j++) {
                int var =(int) z.charAt(j);
                if (var == 97) {
                    a++;
                } else if (z.charAt(j) == 101) {
                    e++;
                } else if (z.charAt(j) == 105) {
                    i++;
                } else if (z.charAt(j) == 111) {
                    o++;
                } else if (z.charAt(j) == 117) {
                    u++;
                } else continue;
            }
            System.out.print("a:"+a+" e:"+e+" i:"+i+" o:"+o+" u:"+u);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

