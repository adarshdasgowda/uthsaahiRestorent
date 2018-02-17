package NewApplications;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

public class asd {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					asd window = new asd();
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
	public asd() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.DARK_GRAY, 4));
		panel.setBounds(34, 103, 540, 217);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblMeals = new JLabel("Breakfast");
		lblMeals.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMeals.setBounds(10, 11, 111, 28);
		panel.add(lblMeals);
		
		JLabel label = new JLabel("Meals");
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(10, 50, 111, 28);
		panel.add(label);
		
		JLabel lblCoolDrinks = new JLabel("Cool Drinks");
		lblCoolDrinks.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCoolDrinks.setBounds(10, 128, 111, 28);
		panel.add(lblCoolDrinks);
		
		JLabel lblChats = new JLabel("Chats");
		lblChats.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblChats.setBounds(10, 89, 111, 28);
		panel.add(lblChats);
		
		JLabel lblHotDrinks = new JLabel("Hot Drinks");
		lblHotDrinks.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHotDrinks.setBounds(10, 167, 111, 28);
		panel.add(lblHotDrinks);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.DARK_GRAY, 4));
		panel_1.setBounds(596, 103, 412, 217);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.DARK_GRAY, 4));
		panel_2.setBounds(596, 344, 412, 217);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.DARK_GRAY, 4));
		panel_3.setBounds(34, 344, 540, 217);
		frame.getContentPane().add(panel_3);
		
		
		JButton btnNewButton = new JButton("New button");
		panel_3.add(btnNewButton);
		
		JSpinner spinner = new JSpinner();
		panel_3.add(spinner);
		
		JSeparator separator = new JSeparator();
		panel_3.add(separator);
		
		
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new SoftBevelBorder(BevelBorder.RAISED, Color.BLACK, Color.DARK_GRAY, Color.BLACK, Color.DARK_GRAY));
		panel_4.setBounds(34, 585, 974, 54);
		frame.getContentPane().add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLACK, Color.DARK_GRAY));
		panel_5.setBounds(1018, 103, 308, 456);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 36, 288, 409);
		panel_5.add(tabbedPane);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_6, null);
		panel_6.setLayout(null);
		
		
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setMinimum(10);
		scrollBar.setMaximum(359);
		scrollBar.setBackground(new Color(128, 128, 128));
		scrollBar.setForeground(new Color(0, 0, 0));
		scrollBar.setValue(100);
		scrollBar.setUnitIncrement(5);
		scrollBar.setBounds(256, 11, 17, 359);
		panel_6.add(scrollBar);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_7, null);
		panel_7.setLayout(null);
		
	
		
		JButton button_1 = new JButton("1");
		button_1.setForeground(new Color(0, 0, 128));
		button_1.setBackground(new Color(192, 192, 192));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_1.setBounds(10, 267, 42, 47);
		panel_7.add(button_1);
		
		JButton button_5 = new JButton("New button");
		button_5.setBounds(10, 95, 42, 47);
		panel_7.add(button_5);
		
		JButton button = new JButton("New button");
		button.setBounds(62, 95, 42, 47);
		panel_7.add(button);
		
		JButton button_13 = new JButton("New button");
		button_13.setBounds(116, 95, 42, 47);
		panel_7.add(button_13);
		
		JButton button_17 = new JButton("New button");
		button_17.setBounds(168, 95, 42, 47);
		panel_7.add(button_17);
		
		JButton button_21 = new JButton("New button");
		button_21.setBounds(220, 95, 42, 47);
		panel_7.add(button_21);
		
		JButton button_2 = new JButton("2\r\n\r\n");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_2.setForeground(new Color(0, 0, 128));
		button_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_2.setBackground(Color.LIGHT_GRAY);
		button_2.setBounds(62, 267, 42, 47);
		panel_7.add(button_2);
		
		JButton button_4 = new JButton("3");
		button_4.setForeground(new Color(0, 0, 128));
		button_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_4.setBackground(Color.LIGHT_GRAY);
		button_4.setBounds(116, 267, 42, 47);
		panel_7.add(button_4);
		
		JButton button_10 = new JButton("6");
		button_10.setForeground(new Color(0, 0, 128));
		button_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_10.setBackground(Color.LIGHT_GRAY);
		button_10.setBounds(116, 211, 42, 47);
		panel_7.add(button_10);
		
		JButton button_11 = new JButton("5");
		button_11.setForeground(new Color(0, 0, 128));
		button_11.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_11.setBackground(Color.LIGHT_GRAY);
		button_11.setBounds(62, 211, 42, 47);
		panel_7.add(button_11);
		
		JButton button_12 = new JButton("4");
		button_12.setForeground(new Color(0, 0, 128));
		button_12.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_12.setBackground(Color.LIGHT_GRAY);
		button_12.setBounds(10, 211, 42, 47);
		panel_7.add(button_12);
		
		JButton button_14 = new JButton("9");
		button_14.setForeground(new Color(0, 0, 128));
		button_14.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_14.setBackground(Color.LIGHT_GRAY);
		button_14.setBounds(116, 153, 42, 47);
		panel_7.add(button_14);
		
		JButton button_15 = new JButton("8");
		button_15.setForeground(new Color(0, 0, 128));
		button_15.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_15.setBackground(Color.LIGHT_GRAY);
		button_15.setBounds(62, 153, 42, 47);
		panel_7.add(button_15);
		
		JButton button_16 = new JButton("7");
		button_16.setForeground(new Color(0, 0, 128));
		button_16.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_16.setBackground(Color.LIGHT_GRAY);
		button_16.setBounds(10, 153, 42, 47);
		panel_7.add(button_16);
		
		JButton button_3 = new JButton("0");
		button_3.setForeground(new Color(0, 0, 128));
		button_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_3.setBackground(Color.LIGHT_GRAY);
		button_3.setBounds(10, 323, 42, 47);
		panel_7.add(button_3);
		
		JButton button_6 = new JButton("00");
		button_6.setForeground(new Color(0, 0, 128));
		button_6.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_6.setBackground(Color.LIGHT_GRAY);
		button_6.setBounds(62, 323, 42, 47);
		panel_7.add(button_6);
		
		JButton button_7 = new JButton(".");
		button_7.setForeground(new Color(0, 0, 128));
		button_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_7.setBackground(Color.LIGHT_GRAY);
		button_7.setBounds(116, 323, 42, 47);
		panel_7.add(button_7);
		
		JButton button_8 = new JButton("+");
		button_8.setForeground(new Color(0, 0, 128));
		button_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_8.setBackground(Color.LIGHT_GRAY);
		button_8.setBounds(168, 267, 42, 103);
		panel_7.add(button_8);
		
		JButton button_9 = new JButton("=");
		button_9.setForeground(new Color(0, 0, 128));
		button_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_9.setBackground(Color.LIGHT_GRAY);
		button_9.setBounds(220, 323, 42, 47);
		panel_7.add(button_9);
		
		JButton btnX = new JButton("X");
		btnX.setForeground(new Color(0, 0, 128));
		btnX.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnX.setBackground(Color.LIGHT_GRAY);
		btnX.setBounds(168, 211, 42, 47);
		panel_7.add(btnX);
		
		JButton button_19 = new JButton("3");
		button_19.setForeground(new Color(0, 0, 128));
		button_19.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_19.setBackground(Color.LIGHT_GRAY);
		button_19.setBounds(168, 153, 42, 47);
		panel_7.add(button_19);
		
		JButton button_20 = new JButton("%");
		button_20.setForeground(new Color(0, 0, 128));
		button_20.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_20.setBackground(Color.LIGHT_GRAY);
		button_20.setBounds(220, 153, 42, 47);
		panel_7.add(button_20);
		
		JButton button_22 = new JButton("/");
		button_22.setForeground(new Color(0, 0, 128));
		button_22.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_22.setBackground(Color.LIGHT_GRAY);
		button_22.setBounds(220, 211, 42, 47);
		panel_7.add(button_22);
		
		JButton button_23 = new JButton("-");
		button_23.setForeground(new Color(0, 0, 128));
		button_23.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_23.setBackground(Color.LIGHT_GRAY);
		button_23.setBounds(220, 267, 42, 47);
		panel_7.add(button_23);
		
		JLabel lblNewLabel = new JLabel("UTHSAAHI RESTORENT");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setToolTipText("Name of the Restorent");
		lblNewLabel.setFont(new Font("Maiandra GD", Font.PLAIN, 50));
		lblNewLabel.setBounds(456, 11, 635, 81);
		frame.getContentPane().add(lblNewLabel);
	}

}
