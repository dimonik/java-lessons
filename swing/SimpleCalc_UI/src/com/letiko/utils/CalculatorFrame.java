package com.letiko.utils;

import javax.swing.*;

/**
 * Created by deusex on 11.09.17.
 */
public class CalculatorFrame extends JFrame
{
    public CalculatorFrame()
    {
        setTitle ("Simple Calculator");
        CalculatorPanel panel = new CalculatorPanel();
        add(panel);
        pack();
    }
}
