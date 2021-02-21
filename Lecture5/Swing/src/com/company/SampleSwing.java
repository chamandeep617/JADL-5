package com.company;

import javax.swing.*;

public class SampleSwing {
    public static void main(String[] args) {
        JFrame f=new JFrame();//creating instance of JFrame

        JButton b=new JButton("Hey all !! ");//creating instance of JButton
        b.setBounds(30,100,500, 40);//x axis, y axis, width, height

        f.add(b);//adding button in JFrame

        f.setSize(1000,1000);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
    }
}
