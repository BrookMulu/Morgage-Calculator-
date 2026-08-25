package elijahbrookfinalproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
*@author Brook
*@author Grover
*/
public class PressListener implements ActionListener
{
    /*
    each PressListener object needs to "know" which LightTile it is 
    doing the listening for, since we need to know which tile is pressed.
    The way we do this is create a listener class that implements the
    ActionListener interface, but can possess a LightTile as an instance variable.
    This ensures the PressListener can manipulate it's LightTile object (myTile)
    using the public interface of the LightTile class.    
    */
    private Calculations newCalculations;
    protected JTextField textField;
    protected JTextArea textArea;
    
    
    public PressListener(Calculations myCalculations)
    {
        super();
        textField = new JTextField(20);
        newCalculations = myCalculations;
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        newCalculations.press();
    }
    
    
    
}
