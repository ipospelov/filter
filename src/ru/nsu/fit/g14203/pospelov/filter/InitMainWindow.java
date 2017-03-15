package ru.nsu.fit.g14203.pospelov.filter;

import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.*;

import ru.nsu.cg.MainFrame;
import ru.nsu.fit.g14203.pospelov.filter.View.InitView;
import ru.nsu.fit.g14203.pospelov.filter.View.Zone;

/**
 * Main window class
 * @author Vasya Pupkin
 */
public class InitMainWindow extends MainFrame {
	/**
	 * Default constructor to create main window
	 */
	private JScrollPane scrollPane;
	public InitMainWindow()
	{
		super(800, 600, "Init application");
		//setLayout(new FlowLayout());
		scrollPane = new JScrollPane(new Zone(350,350));
		setLocationRelativeTo(null);
		add(scrollPane, BorderLayout.CENTER);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		try
		{
			addSubMenu("File", KeyEvent.VK_F);
			addMenuItem("File/Exit", "Exit application", KeyEvent.VK_X, "Exit.gif", "onExit");
			addSubMenu("Help", KeyEvent.VK_H);
			addMenuItem("Help/About...", "Shows program version and copyright information", KeyEvent.VK_A, "About.gif", "onAbout");
			
			addToolBarButton("File/Exit");
			addToolBarSeparator();
			addToolBarButton("Help/About...");
			
			//add(new InitView());
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
	}

	/**
	 * Help/About... - shows program version and copyright information
	 */
	public void onAbout()
	{
		JOptionPane.showMessageDialog(this, "Init, version 1.0\nCopyright � 2010 Vasya Pupkin, FF, group 1234", "About Init", JOptionPane.INFORMATION_MESSAGE);
	}
	
	/**
	 * File/Exit - exits application
	 */
	public void onExit()
	{
		System.exit(0);
	}
	
	/**
	 * Application main entry point
	 * @param args command line arguments (unused)
	 */
	public static void main(String[] args)
	{
		InitMainWindow mainFrame = new InitMainWindow();
		mainFrame.setVisible(true);
	}
}
