package src.macro.seqitems;

import src.macro.MacroForm;

import javax.swing.*;

public class Macro {
    public void Macro(){
        MacroForm mac = new MacroForm();
        JFrame frame = new JFrame("Bad Macro");
        frame.setContentPane(mac.mainPanel);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
