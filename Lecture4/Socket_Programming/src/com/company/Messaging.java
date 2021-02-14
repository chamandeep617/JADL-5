package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Messaging extends Thread{

    Socket clientSocket;

    Messaging(Socket socket){
        this.clientSocket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);


            while (true) {
                String msg = in.readLine();
                System.out.println("Client sent : " + msg);
                out.println("Server has acknowledged this " + msg);
                if (msg.equals("exit")) {
                    break;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
