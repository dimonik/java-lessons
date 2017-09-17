package com.letiko;

import com.letiko.utils.CalculatorFrame;

import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                CalculatorFrame frame = new CalculatorFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
