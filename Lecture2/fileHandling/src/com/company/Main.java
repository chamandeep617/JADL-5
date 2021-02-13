package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("/home/chamandeep/Desktop/input.txt");
        FileWriter out = new FileWriter("/home/chamandeep/Desktop/output.txt");

        int c;
        while((c = in.read()) != -1){
            out.write(c);
        }

        in.close();
        out.close();
	// write your code here
    }
}
