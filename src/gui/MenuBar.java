package gui;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class MenuBar extends JFrame implements ActionListener {
	
	JMenuBar menuBar = new JMenuBar();
	
	JMenu fileMenu = new JMenu("File");
	JMenu editMenu = new JMenu("Edit");
	JMenu helpMenu = new JMenu("Help");
	
	JMenuItem loadItem = new JMenuItem("Load or l");
	JMenuItem saveItem = new JMenuItem("Save or s");
	JMenuItem exitItem = new JMenuItem("Exit or e");

	MenuBar() {
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setTitle("Menu System");
		this.setLayout(new FlowLayout());
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + f for file
		editMenu.setMnemonic(KeyEvent.VK_E); // Alt + e for edit
		helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + h for help
		loadItem.setMnemonic(KeyEvent.VK_L); // l for load
		saveItem.setMnemonic(KeyEvent.VK_S); // s for save
		exitItem.setMnemonic(KeyEvent.VK_E); // e for exit
		
		this.setJMenuBar(menuBar);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuBar();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == loadItem) {
			System.out.println("Load an item");
		} 
		if (e.getSource() == saveItem) {
			System.out.println("Save an item");
		} 
		if (e.getSource() == exitItem) {
			System.exit(0);
		}
	}

}
