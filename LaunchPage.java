import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LaunchPage implements ActionListener{
	JFrame frame = new JFrame();
	JButton myButton = new JButton("Pisa");
	JLabel label = new JLabel();
	ImageIcon firstImage = new ImageIcon("FirstImage.PNG");
			
	LaunchPage()
	{
		// label constructor (image + text)
		label.setText("Welcome to Attu Island");
		label.setIcon(firstImage);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(000000));
        label.setFont(new Font("Verdana", Font.PLAIN, 50));
        label.setIconTextGap(75);
        
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.LEFT);
        label.setBounds(0,0,1500,1000);
        
		
		// button constructor
		myButton.setBounds(900, 260, 250, 40);
		myButton.setBackground(Color.ORANGE);
		myButton.setFocusable(false);
		myButton.addActionListener(this);
		
		
		
		//adds button and label
		frame.add(myButton);
		frame.add(label);
		
		//frame configs
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1280, 720);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(true);
		frame.getContentPane().setBackground(new Color(127, 154, 255));
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == myButton)
		{
			frame.dispose();
			NewWindow myWindow = new NewWindow();
		}
	}
}
