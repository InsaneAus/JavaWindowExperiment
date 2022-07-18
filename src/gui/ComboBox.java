package gui;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBox extends JFrame implements ActionListener {
	public JComboBox comboBox;
	ComboBox() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		Integer[] animalds = {2, 4, 8, 9};
		
		String[] animals = {"dog", "cat", "bird"};
		comboBox = new JComboBox(animals);
		comboBox.addActionListener(this);
		
		//comboBox.setEditable(true);
		//System.out.println(comboBox.getItemCount());
		comboBox.addItem("horse");
		comboBox.insertItemAt("pig", 0);
		comboBox.setSelectedIndex(0);
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ComboBox();
		System.out.println(sum(5));
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == comboBox) {
			System.out.println(comboBox.getSelectedItem());
		}
	}
	public static int sum(int k) {
		if (k > 0) {
			return k + sum(k-1);
		}
		return 0;
	}

}
