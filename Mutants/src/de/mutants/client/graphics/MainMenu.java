package de.mutants.client.graphics;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainMenu {
	
	private JFrame Hauptmenu;
	
	//constructor gestartet, sobald new auf MainMenu ausgeführt wird.
	public MainMenu()
	{
		//Main Frame
		JFrame Hauptmenu = new JFrame("");
		Hauptmenu.setBounds(x, y, width, height);
		Hauptmenu.setVisible(true);
		
		//Hauptmenü Buttons
		JButton Singleplayer = new JButton();
	    Singleplayer.setText(Singleplayer);
	    Singleplayer.setBackground(Color.black);
	    Singleplayer.setForeground(Color.DARK_GRAY);
	    Singleplayer.setActionCommand(actionCommand);
	    Singleplayer.setBounds(x, y, 70,50);
	    
	    
		JButton Multiplayer = new JButton();
		Multiplayer.setActionCommand(actionCommand);
		Multiplayer.setForeground(Color.darkGray);
		Multiplayer.setBackground(Color.black);
		Multiplayer.setBounds(x, y,70,50;
		
		JButton Options = new JButton();
		Options.setActionCommand(actionCommand);
		Options.setForeground(Color.darkGray);
		Options.setBackground(Color.black);
		Options.setBounds(x, y, 70,50);
		
		JButton Tutorial = new JButton();
		Tutorial.setActionCommand(actionCommand);
	    Tutorial.setForeground(Color.darkGray);
		Tutorial.setBackground(Color.black);
		Tutorial.setBounds(x, y, width, height);
		
		JButton Close = new JButton();
		Close.setActionCommand(actionCommand);
		Close.setForeground(Color.darkGray);
		Close.setBackground(Color.black);
		Close.setBounds(x, y, 30,50);
		
		
		
		
		
	}
	
	
}
