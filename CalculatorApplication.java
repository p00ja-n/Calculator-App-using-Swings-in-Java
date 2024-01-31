import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class CalculatorApplication extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	String act;
	String s1;
	String s2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorApplication frame = new CalculatorApplication();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculatorApplication() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 685);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel head = new JLabel("Calculator");
		head.setForeground(new Color(0, 0, 128));
		head.setFont(new Font("Stencil", Font.BOLD, 28));
		head.setBounds(166, 10, 222, 54);
		contentPane.add(head);
		
		tf1 = new JTextField();
		tf1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		tf1.setBounds(10, 89, 499, 67);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		JButton b4 = new JButton("/");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1=tf1.getText();
				tf1.setText("");
				act="/";
			}
		});
		b4.setFont(new Font("Tahoma", Font.PLAIN, 35));
		b4.setBounds(378, 483, 112, 67);
		contentPane.add(b4);
		
		JButton b5 = new JButton("7");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=tf1.getText();
				s=s+"7";
				tf1.setText(s);
			}
		});
		b5.setFont(new Font("Tahoma", Font.PLAIN, 35));
		b5.setBounds(10, 252, 112, 67);
		contentPane.add(b5);
		
		JButton b6 = new JButton("8");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=tf1.getText();
				s=s+"8";
				tf1.setText(s);
			}
		});
		b6.setFont(new Font("Tahoma", Font.PLAIN, 35));
		b6.setBounds(132, 252, 112, 67);
		contentPane.add(b6);
		
		JButton b7 = new JButton("9");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=tf1.getText();
				s=s+"9";
				tf1.setText(s);
			}
		});
		b7.setFont(new Font("Tahoma", Font.PLAIN, 35));
		b7.setBounds(254, 252, 112, 67);
		contentPane.add(b7);
		
		JButton b8 = new JButton("x");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1=tf1.getText();
				tf1.setText("");
				act="x";
			}
		});
		b8.setFont(new Font("Tahoma", Font.PLAIN, 35));
		b8.setBounds(378, 252, 112, 67);
		contentPane.add(b8);
		
		JButton b9 = new JButton("4");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=tf1.getText();
				s=s+"4";
				tf1.setText(s);
			}
		});
		b9.setFont(new Font("Tahoma", Font.PLAIN, 35));
		b9.setBounds(10, 329, 112, 67);
		contentPane.add(b9);
		
		JButton b10 = new JButton("5");
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=tf1.getText();
				s=s+"5";
				tf1.setText(s);
			}
		});
		b10.setFont(new Font("Tahoma", Font.PLAIN, 35));
		b10.setBounds(132, 329, 112, 67);
		contentPane.add(b10);
		
		JButton b11 = new JButton("6");
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=tf1.getText();
				s=s+"6";
				tf1.setText(s);
			}
		});
		b11.setFont(new Font("Tahoma", Font.PLAIN, 35));
		b11.setBounds(254, 329, 112, 67);
		contentPane.add(b11);
		
		JButton b12 = new JButton("-");
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1=tf1.getText();
				tf1.setText("");
				act="-";
			}
		});
		b12.setFont(new Font("Tahoma", Font.PLAIN, 35));
		b12.setBounds(378, 329, 112, 67);
		contentPane.add(b12);
		
		JButton b13 = new JButton("1");
		b13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//for 1
				String s=tf1.getText();
				s=s+"1";
				tf1.setText(s);
			}
		});
		b13.setFont(new Font("Tahoma", Font.PLAIN, 35));
		b13.setBounds(10, 406, 112, 67);
		contentPane.add(b13);
		
		JButton b14 = new JButton("2");
		b14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=tf1.getText();
				s=s+"2";
				tf1.setText(s);
			}
		});
		b14.setFont(new Font("Tahoma", Font.PLAIN, 35));
		b14.setBounds(132, 406, 112, 67);
		contentPane.add(b14);
		
		JButton b15 = new JButton("3");
		b15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=tf1.getText();
				s=s+"3";
				tf1.setText(s);
			}
		});
		b15.setFont(new Font("Tahoma", Font.PLAIN, 35));
		b15.setBounds(254, 406, 112, 67);
		contentPane.add(b15);
		
		JButton b16 = new JButton("+");
		b16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1=tf1.getText();
				tf1.setText("");
				act="+";
			}
		});
		b16.setFont(new Font("Tahoma", Font.PLAIN, 35));
		b16.setBounds(378, 406, 112, 67);
		contentPane.add(b16);
		
		JButton b17 = new JButton("=");
		b17.addActionListener(new ActionListener() {
			// for equal
			public void actionPerformed(ActionEvent e) {
				s2=tf1.getText();
				if(act=="x")
				{
					int t=Integer.valueOf(s1)*Integer.valueOf(s2);
					tf1.setText(String.valueOf(t));
				}
				if(act=="+")
				{
					int t=Integer.valueOf(s1)+Integer.valueOf(s2);
					tf1.setText(String.valueOf(t));
					
				}
				if(act=="-")
				{
					if(Integer.valueOf(s1)>=Integer.valueOf(s2)) {
						int t=Integer.valueOf(s1)-Integer.valueOf(s2);
						tf1.setText(String.valueOf(t));
					}
					else {
						int t=Integer.valueOf(s2)-Integer.valueOf(s1);
						String n="-"+String.valueOf(t);
						tf1.setText(String.valueOf(n));
						
					}
					
					
				}
				if(act=="/")
				{
					float t=Float.valueOf(s1)/Float.valueOf(s2);
					tf1.setText(String.valueOf(t));
					
				}
				
			}
		});
		b17.setFont(new Font("Tahoma", Font.PLAIN, 35));
		b17.setBounds(256, 483, 112, 67);
		contentPane.add(b17);
		
		JButton b18 = new JButton("0");
		b18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=tf1.getText();
				s=s+"0";
				tf1.setText(s);
			}
		});
		b18.setFont(new Font("Tahoma", Font.PLAIN, 35));
		b18.setBounds(132, 483, 112, 67);
		contentPane.add(b18);
		
		JButton btnClear = new JButton("clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf1.setText("");
				s1="";
				s2="";
				act="";
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnClear.setBounds(10, 483, 112, 67);
		contentPane.add(btnClear);
	}
}
