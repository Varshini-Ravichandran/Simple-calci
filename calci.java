import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calci {

	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 387, 478);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 18));
		textField.setBounds(30, 10, 302, 67);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnbackspace = new JButton("\uF0E7");
		btnbackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String backSpace=null;
			if(textField.getText().length()>0)
			{
				StringBuilder str=new StringBuilder(textField.getText());
				str.deleteCharAt(textField.getText().length()-1);
				backSpace=str.toString();
				textField.setText(backSpace);
			
			}
			}
		});
		btnbackspace.setFont(new Font("wingdings", Font.BOLD, 15));
		btnbackspace.setBounds(30, 117, 50, 44);
		frame.getContentPane().add(btnbackspace);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(30, 171, 50, 44);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(30, 225, 50, 44);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(30, 279, 50, 44);
		frame.getContentPane().add(btn1);
		
		JButton btnclear = new JButton("C");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnclear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnclear.setBounds(113, 117, 50, 44);
		frame.getContentPane().add(btnclear);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(113, 171, 50, 44);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(113, 225, 50, 44);
		frame.getContentPane().add(btn5);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(30, 335, 50, 44);
		frame.getContentPane().add(btn0);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btndot.getText();
				textField.setText(number);
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndot.setBounds(113, 335, 50, 44);
		frame.getContentPane().add(btndot);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(113, 279, 50, 44);
		frame.getContentPane().add(btn2);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn00.setBounds(194, 117, 50, 44);
		frame.getContentPane().add(btn00);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(194, 171, 50, 44);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(194, 225, 50, 44);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(194, 279, 50, 44);
		frame.getContentPane().add(btn3);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String answer;
			second=Double.parseDouble(textField.getText());
			if(operation =="+")
			{
				result=first+second;
				answer=String.format("%.2f", result);
			    textField.setText(answer);
			}
			else if(operation =="-")
			{
				result=first-second;
				answer=String.format("%.2f", result);
			    textField.setText(answer);
			}
			else if(operation =="*")
			{
				result=first*second;
				answer=String.format("%.2f", result);
			    textField.setText(answer);
			}
			else if(operation =="/")
			{
				result=first/second;
				answer=String.format("%.2f", result);
			    textField.setText(answer);
			}
			else if(operation =="%")
			{
				result=first%second;
				answer=String.format("%.2f", result);
			    textField.setText(answer);
			}
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnequal.setBounds(194, 335, 50, 44);
		frame.getContentPane().add(btnequal);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			first=Double.parseDouble(textField.getText());
			textField.setText("");
			operation="+";
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnplus.setBounds(277, 117, 50, 44);
		frame.getContentPane().add(btnplus);
		
		JButton btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnminus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnminus.setBounds(277, 171, 50, 44);
		frame.getContentPane().add(btnminus);
		
		JButton btnmultiply = new JButton("*");
		btnmultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnmultiply.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnmultiply.setBounds(277, 225, 50, 44);
		frame.getContentPane().add(btnmultiply);
		
		JButton btndivide = new JButton("/");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btndivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btndivide.setBounds(277, 279, 50, 44);
		frame.getContentPane().add(btndivide);
		
		JButton btnpercentage = new JButton("%");
		btnpercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnpercentage.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnpercentage.setBounds(277, 335, 50, 44);
		frame.getContentPane().add(btnpercentage);
	}
}
