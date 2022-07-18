package gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class ProgressBar implements ActionListener {
	JProgressBar bar = new JProgressBar();
	JProgressBar armor = new JProgressBar();
	JLabel hpstatus = new JLabel();
	JLabel armorstatus = new JLabel();
	JFrame frame = new JFrame("Lambda Goes BRUH!!!!");
	JLabel alive_or_dead = new JLabel();
	JLabel armor_desc = new JLabel();
	JButton increaseHP = new JButton();
	JButton toxins = new JButton();
	JButton bullet_shot = new JButton();
	JButton increasearmor = new JButton();
	JButton retry = new JButton();
	int hp = 40;
	int armor_amount = 50;
	ImageIcon icon = new ImageIcon("src/gui/halflifelambda.png");
	ProgressBar() {
		
		
		retry.setText("Retry");
		retry.setFont(new Font("EDO SZ", Font.PLAIN, 35));
		retry.setBounds(375, 50, 175, 150);
		retry.setBackground(Color.black);
		retry.setForeground(Color.white);
		retry.addActionListener(this);
		retry.setFocusable(false);
		retry.setOpaque(true);
		
		hpstatus.setText("HP: " + hp);
		hpstatus.setFont(new Font("EDO SZ", Font.PLAIN, 25));
		hpstatus.setBounds(50, 10, 75, 35);
		hpstatus.setBackground(Color.green);
		hpstatus.setForeground(Color.black);
		hpstatus.setOpaque(true);
		
		armorstatus.setText("armor: " + armor_amount);
		armorstatus.setFont(new Font("EDO SZ", Font.PLAIN, 25));
		armorstatus.setBounds(50, 105, 125, 35);
		armorstatus.setBackground(Color.green);
		armorstatus.setForeground(Color.black);
		armorstatus.setOpaque(true);
		
		increaseHP.setForeground(Color.white);
		increaseHP.setBackground(Color.red);
		increaseHP.setText("Health");
		increaseHP.setBounds(50, 225, 175, 100);
		increaseHP.setFont(new Font("EDO SZ", Font.PLAIN, 25));
		increaseHP.setFocusable(false);
		increaseHP.addActionListener(this);
		increaseHP.setOpaque(true);
		
		toxins.setForeground(Color.green);
		toxins.setBackground(Color.black);
		toxins.setText("Toxins");
		toxins.setBounds(275, 225, 175, 100);
		toxins.setFont(new Font("EDO SZ", Font.PLAIN, 25));
		toxins.setFocusable(false);
		toxins.addActionListener(this);
		toxins.setOpaque(true);
		
		increasearmor.setForeground(Color.black);
		increasearmor.setBackground(new Color(0x00FFFF));
		increasearmor.setText("armor");
		increasearmor.setBounds(50, 350, 175, 100);
		increasearmor.setFont(new Font("EDO SZ", Font.PLAIN, 25));
		increasearmor.setFocusable(false);
		increasearmor.addActionListener(this);
		increasearmor.setOpaque(true);
		
		bullet_shot.setForeground(new Color(0xe6e03e));
		bullet_shot.setBackground(Color.black);
		bullet_shot.setText("Shot Down");
		bullet_shot.setBounds(275, 350, 175, 100);
		bullet_shot.setFont(new Font("EDO SZ", Font.PLAIN, 25));
		bullet_shot.setFocusable(false);
		bullet_shot.addActionListener(this);
		bullet_shot.setOpaque(true);
		
		alive_or_dead.setText("");
		alive_or_dead.setBounds(140, 10, 250, 35);
		alive_or_dead.setFont(new Font("EDO SZ", Font.PLAIN, 25));
		alive_or_dead.setForeground(Color.red);
		alive_or_dead.setVisible(false);
		
		armor_desc.setText("");
		armor_desc.setBounds(180, 105, 250, 35);
		armor_desc.setFont(new Font("EDO SZ", Font.PLAIN, 25));
		armor_desc.setForeground(Color.red);
		armor_desc.setVisible(false);
		
		bar.setValue(hp);
		bar.setBounds(50, 50, 300, 50);
		bar.setStringPainted(false);
		bar.setBackground(Color.black);
		bar.setForeground(Color.red);
		bar.setOpaque(true);
		
		armor.setValue(armor_amount);
		armor.setBounds(50, 145, 300, 50);
		armor.setStringPainted(false);
		armor.setBackground(Color.black);
		armor.setForeground(new Color(0x00FFFF));
		armor.setOpaque(true);

		frame.add(bar);
		frame.add(hpstatus);
		frame.add(alive_or_dead);
		frame.add(armor);
		frame.add(armorstatus);
		frame.add(increaseHP);
		frame.add(toxins);
		frame.add(bullet_shot);
		frame.add(increasearmor);
		frame.add(armor_desc);
		frame.add(retry);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(icon.getImage());
		frame.setSize(600, 600);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ProgressBar();
	}
	public void checkStatus() {
		/*
		while (counter >= 0) {
			bar.setValue(counter);
			if (counter == 20) {
				hpstatus.setText("HP: Low health");
				hpstatus.setForeground(Color.red);
				hpstatus.setBackground(Color.black);
			}
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter -= 1;
		}
		*/
		if (hp >= 100) {
			hp = 100;
			increaseHP.setEnabled(false);
			alive_or_dead.setText("Health is full");
			alive_or_dead.setVisible(true);
		} else {
			alive_or_dead.setVisible(false);
			increaseHP.setEnabled(true);
		}
		if (hp <= 0) {
			toxins.setEnabled(false);
			increaseHP.setEnabled(false);
			increasearmor.setEnabled(false);
			bullet_shot.setEnabled(false);
			alive_or_dead.setText("You are dead.");
			alive_or_dead.setVisible(true);
			hp = 0;
		} else {
			toxins.setEnabled(true);
		}
		displayLowHealth();
		
	}
	public void displayLowHealth() {
		if (hp <= 30 && hp > 0) {
			alive_or_dead.setVisible(true);
			alive_or_dead.setText("Low Health");
		} 
	}
	public void checkStatusarmor() {
		if (armor_amount == 100) {
			increasearmor.setEnabled(false);
			armor_desc.setText("Full armor!!");
			armor_desc.setVisible(true);
		} else if (hp > 0 & armor_amount < 100) {
			armor_desc.setVisible(false);
			increasearmor.setEnabled(true);
		}
		if (armor_amount <= 30) {
			armor_desc.setVisible(true);
			armor_desc.setText("Low on Armor");
		}
		if (armor_amount <= 0) {
			armor_desc.setVisible(true);
			armor_desc.setText("No Armor Left");
			armor_amount = 0;
		}
	}
	public void retry_again() {
		hp = 40;
		armor_amount = 50;
		bar.setValue(hp);
		armor.setValue(armor_amount);
		hpstatus.setText("HP: " + hp);
		armorstatus.setText("armor: " + armor_amount);
		checkStatus();
		checkStatusarmor();
		toxins.setEnabled(true);
		increaseHP.setEnabled(true);
		increasearmor.setEnabled(true);
		bullet_shot.setEnabled(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == increaseHP) {
			int healthIncrease = 10;
			if (hp + healthIncrease >= 100) {
				hp = 100;
			} else {
				hp += healthIncrease;
			}
			bar.setValue(hp);
			hpstatus.setText("HP: " + hp);
			checkStatus();
			checkStatusarmor();
			
		} else if (e.getSource() == toxins) {
			int healthDecrease = 10;
			if (hp <= healthDecrease) {
				hp = 0;
			} else {
				hp -= healthDecrease;
			}
			bar.setValue(hp);
			hpstatus.setText("HP: " + hp);
			checkStatus();
			checkStatusarmor();
			
		} else if (e.getSource() == bullet_shot) {
			int unarmoreddamage = 10;
			int armoreddamage = 3;
			if (hp > 0) {
				if (armor_amount > 0) {
					if (hp > armoreddamage) {
						hp -= armoreddamage;
						armor_amount -= 10;
					} else {
						hp = 0;
					}
				} else {
					armor_amount = 0;
					if (hp > unarmoreddamage) {
						hp -= unarmoreddamage;
					} else {
						hp = 0;
					}
				}
			} else {
				hp = 0;
			}
			bar.setValue(hp);
			armor.setValue(armor_amount);
			hpstatus.setText("HP: " + hp);
			armorstatus.setText("armor: " + armor_amount);
			checkStatus();
			checkStatusarmor();
		} else if (e.getSource() == increasearmor) {
			int armor_increment = 10;
			if (armor_amount + armor_increment >= 100) {
				armor_amount = 100;
			} else {
				armor_amount += armor_increment;
			}
			armor.setValue(armor_amount);
			armorstatus.setText("armor: " + armor_amount);
			checkStatus();
			checkStatusarmor();
		} else if (e.getSource() == retry) {
			retry_again();
		}
	
	}

}
