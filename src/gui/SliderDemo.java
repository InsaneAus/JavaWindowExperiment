package gui;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
public class SliderDemo implements ChangeListener {
	
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	SliderDemo() {
		
		frame = new JFrame("Slider Demo");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0, 100);
		
		slider.setPreferredSize(new Dimension(400, 200));
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		slider.setPaintTrack(true);
		slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
		label.setFont(new Font("MV Boli", Font.PLAIN, 25));
		slider.setMajorTickSpacing(25);
		slider.setPaintLabels(true);
		//slider.setOrientation(SwingConstants.HORIZONTAL);
		slider.setOrientation(SwingConstants.VERTICAL);
		
		label.setText("°C = " + slider.getValue());
		slider.addChangeListener(this);
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(420, 420);
		frame.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SliderDemo();
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		label.setText("°C = " + slider.getValue());
	}

}
