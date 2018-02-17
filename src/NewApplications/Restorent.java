package NewApplications;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.undo.UndoManager;
import javax.swing.undo.UndoableEdit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JOptionPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Restorent 
{

	private JFrame restorentPageFrame;
	private JTextArea receiptTA;
	private JTextField calculatorTF;
	private JTable table;
	private JTextField breakfastQtyTF;
	private JTextField mealsQtyTF;
	private JTextField chatsQtyTF;
	private JTextField coolDrinksQtyTF;
	private JTextField hotDrinksQtyTF;
	private JTextField subTotalTF;
	private JTextField taxTF;
	private JTextField grandTotalTF;
	private JButton breakfastAddBtn;
	private JButton mealsAddBtn;
	private JButton chatsAddBtn;
	private JButton coolDrinksAddBtn;
	private JButton hotDrinksAddBtn;
	//private String printNextLine="\n";
	private String receipt;
	private String pBreakfast;
	private String pMeals;
	private String pChats;
	private String pCoolDrinks;
	private String pHotDrinks;
	double subTotal;
	String subTotalS;
	double tax;
	String taxS;
	double grandTotal;
	String grandTotalS;
	
	private JComboBox breakfastComboBox;
	private JComboBox mealsComboBox;
	private JComboBox chatsComboBox;
	private JComboBox coolDrinksComboBox;
	private JComboBox hotDrinksComboBox;

	double qtyOfBreakfast;
	double priceOfBreakfast;
	double costOfCurdRice = 45.00;
	double costOfEdli = 45.00;
	double costOfOnionDosa = 45.00;
	double costOfLemonRice = 45.00;
	double costOfMasaleDosa = 45.00;
	double costOfPoori = 45.00;
	double costOfPuliyogare = 45.00;
	double costOfSetDosa = 45.00;
	double costOfVangiBaath = 45.00;
	double costOfVegPalav = 45.00;
	
	double qtyOfMeals;
	double priceOfMeals;
	double costOfFullMeals = 75.00;
	double costOfHalfMeals = 45.00;
	
	double qtyOfchats;
	double priceOfChats;
	double costOfBhelPoori = 35.00;
	double costOfChurumuri = 35.00;
	double costOfGobiCorn = 35.00;
	double costOfGobiManchurian = 35.00;
	double costOfMasalePoori = 35.00;
	double costOfPaaniPoori = 35.00;
	double costOfSevPoori = 35.00;
	double costOfSukkaPoori = 35.00;

	double qtyOfCoolDrinks;
	double priceOfCoolDrinks;
	double costOfAppleJuice = 30.00;
	double costOfGrapeJuice = 30.00;
	double costOfMangoJuice = 30.00;
	double costOfOrangeJuice = 30.00;
	double costOfPineAppleJuice = 30.00;

	
	double qtyOfHotDrinks;
	double priceOfHotDrinks;
	double costOfBournvita = 25.00;
	double costOfCoffee = 25.00;
	double costOfHorlicks = 25.00;
	double costOfTea = 25.00;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Restorent window = new Restorent();
					window.restorentPageFrame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Restorent() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		restorentPageFrame = new JFrame();
		restorentPageFrame.setBounds(0, 0, 1368, 689);
		restorentPageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		restorentPageFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.DARK_GRAY, 4));
		panel.setBounds(34, 103, 540, 217);
		restorentPageFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		//**************************************************** Breakfast label **************************************************
		JLabel breakfastLbl = new JLabel("Breakfast");
		breakfastLbl.setBounds(10, 11, 111, 28);
		breakfastLbl.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(breakfastLbl);
		
		//**************************************************** Meals label **************************************************
		JLabel mealsLbl = new JLabel("Meals");
		mealsLbl.setBounds(10, 50, 111, 28);
		mealsLbl.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(mealsLbl);
		
		
		//**************************************************** Chats label **************************************************
		JLabel chatsLbl = new JLabel("Chats");
		chatsLbl.setBounds(10, 89, 111, 28);
		chatsLbl.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(chatsLbl);
		
		//**************************************************** Cool Drinks label **************************************************
		JLabel coolDrinksLbl = new JLabel("Cool Drinks");
		coolDrinksLbl.setBounds(10, 128, 111, 28);
		coolDrinksLbl.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(coolDrinksLbl);
		
		//**************************************************** Hot Drinks label **************************************************
		JLabel hotDrinksLbl = new JLabel("Hot Drinks");
		hotDrinksLbl.setBounds(10, 167, 111, 28);
		hotDrinksLbl.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(hotDrinksLbl);
		
		//**************************************************** Breakfast drop down **************************************************
		breakfastComboBox = new JComboBox();
		breakfastComboBox.setBounds(131, 18, 130, 20);
		breakfastComboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Breakfast", "Curd rice", "Edli", "Onion dosa", "Lemon rice", "Masale dosa", "Poori", "Puliyogare", "Set dosa", "Vangi baath", "Veg palav"}));
		panel.add(breakfastComboBox);
		
		//**************************************************** Meals drop down **************************************************
		mealsComboBox = new JComboBox();
		mealsComboBox.setBounds(131, 57, 130, 20);
		mealsComboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Meals", "Full meals", "Half meals"}));
		panel.add(mealsComboBox);
		
		//**************************************************** Chats drop down **************************************************
		chatsComboBox = new JComboBox();
		chatsComboBox.setBounds(131, 96, 130, 20);
		chatsComboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Chats", "Bhel poori", "Churumuri", "Gobi corn", "Gobi manchurian", "Masale poori", "Paani poori", "Sev poori", "Sukka poori"}));
		panel.add(chatsComboBox);
		
		//**************************************************** Cool Drinks drop down **************************************************
		coolDrinksComboBox = new JComboBox();
		coolDrinksComboBox.setBounds(131, 135, 130, 20);
		coolDrinksComboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Cool drinks", "Apple Juice", "Grape Juice", "Mango Juice", "Orange Juice", "Pineapple Juice"}));
		panel.add(coolDrinksComboBox);
		
		//**************************************************** Hot Drinks drop down **************************************************
		hotDrinksComboBox = new JComboBox();
		hotDrinksComboBox.setBounds(131, 174, 130, 20);
		hotDrinksComboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Hot drinks", "Bournvita", "Coffee", "Horlicks", "Tea"}));
		panel.add(hotDrinksComboBox);
		
		//**************************************************** Quantity labels **************************************************
		JLabel lblQty = new JLabel("Qty");
		lblQty.setBounds(294, 21, 31, 14);
		lblQty.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblQty);
		
		JLabel label_1 = new JLabel("Qty");
		label_1.setBounds(294, 60, 31, 14);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Qty");
		label_2.setBounds(294, 99, 31, 14);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Qty");
		label_3.setBounds(294, 138, 31, 14);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Qty");
		label_4.setBounds(294, 177, 31, 14);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(label_4);
		
		//**************************************************** Quantity text fields **************************************************
		breakfastQtyTF = new JTextField();
		breakfastQtyTF.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyPressed(KeyEvent evt) 
			{
				if(evt.getKeyCode() == KeyEvent.VK_ENTER)
				{
					checkBreakfastEmptyFields();
				}
			}
			@Override
			public void keyTyped(KeyEvent evt) 
			{
				char c =evt.getKeyChar();
				//allow only alphabetic keys, numerical keys, back space key and delete key
				if (!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE))
				{
					evt.consume();
				}
			}
		});
		breakfastQtyTF.setBounds(335, 18, 86, 20);
		panel.add(breakfastQtyTF);
		breakfastQtyTF.setColumns(10);
		
		mealsQtyTF = new JTextField();
		mealsQtyTF.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyPressed(KeyEvent evt) 
			{
				if(evt.getKeyCode() == KeyEvent.VK_ENTER)
				{
					checkMealsEmptyFields();
				}
			}
			@Override
			public void keyTyped(KeyEvent evt) 
			{
				char c =evt.getKeyChar();
				//allow only alphabetic keys, numerical keys, back space key and delete key
				if (!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE))
				{
					evt.consume();
				}
			}
		});
		mealsQtyTF.setBounds(335, 57, 86, 20);
		mealsQtyTF.setColumns(10);
		panel.add(mealsQtyTF);
		
		chatsQtyTF = new JTextField();
		chatsQtyTF.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyPressed(KeyEvent evt) 
			{
				if(evt.getKeyCode() == KeyEvent.VK_ENTER)
				{
					checkChatsEmptyFields();
				}
			}
			@Override
			public void keyTyped(KeyEvent evt) 
			{
				char c =evt.getKeyChar();
				//allow only alphabetic keys, numerical keys, back space key and delete key
				if (!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE))
				{
					evt.consume();
				}
			}
		});
		chatsQtyTF.setBounds(335, 96, 86, 20);
		chatsQtyTF.setColumns(10);
		panel.add(chatsQtyTF);
		
		coolDrinksQtyTF = new JTextField();
		coolDrinksQtyTF.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyPressed(KeyEvent evt) 
			{
				if(evt.getKeyCode() == KeyEvent.VK_ENTER)
				{
					checkCoolDrinksEmptyFields();
				}
			}
			@Override
			public void keyTyped(KeyEvent evt) 
			{
				char c =evt.getKeyChar();
				//allow only alphabetic keys, numerical keys, back space key and delete key
				if (!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE))
				{
					evt.consume();
				}
			}
		});
		coolDrinksQtyTF.setBounds(335, 135, 86, 20);
		coolDrinksQtyTF.setColumns(10);
		panel.add(coolDrinksQtyTF);
		
		hotDrinksQtyTF = new JTextField();
		hotDrinksQtyTF.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyPressed(KeyEvent evt) 
			{
				if(evt.getKeyCode() == KeyEvent.VK_ENTER)
				{
					checkHotDrinksEmptyFields();
				}
			}
			@Override
			public void keyTyped(KeyEvent evt) 
			{
				char c =evt.getKeyChar();
				//allow only alphabetic keys, numerical keys, back space key and delete key
				if (!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE))
				{
					evt.consume();
				}
			}
		});
		hotDrinksQtyTF.setBounds(335, 174, 86, 20);
		hotDrinksQtyTF.setColumns(10);
		panel.add(hotDrinksQtyTF);
		
		//**************************************************** Breakfast add button **************************************************
		breakfastAddBtn = new JButton("Add");
		breakfastAddBtn.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyPressed(KeyEvent evt) 
			{
				if(evt.getKeyCode() == KeyEvent.VK_ENTER)
				{
					checkBreakfastEmptyFields();
				}
			}
		});
		breakfastAddBtn.addActionListener(new ActionListener() 
		{ 
			public void actionPerformed(ActionEvent arg0) 
			{
				checkBreakfastEmptyFields();
			}
		});
		breakfastAddBtn.setBounds(441, 17, 89, 23);
		panel.add(breakfastAddBtn);
		
		//**************************************************** Meals add button **************************************************
		mealsAddBtn = new JButton("Add");
		mealsAddBtn.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyPressed(KeyEvent evt) 
			{
				if(evt.getKeyCode() == KeyEvent.VK_ENTER)
				{
					checkMealsEmptyFields();
				}
			}
		});
		mealsAddBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				checkMealsEmptyFields();
			}
		});
		mealsAddBtn.setBounds(441, 56, 89, 23);
		panel.add(mealsAddBtn);
		
		//**************************************************** Chats add button **************************************************
		chatsAddBtn = new JButton("Add");
		chatsAddBtn.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyPressed(KeyEvent evt) 
			{
				if(evt.getKeyCode() == KeyEvent.VK_ENTER)
				{
					checkChatsEmptyFields();
				}
			}
		});
		chatsAddBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{ 
				checkChatsEmptyFields();
			}
		});
		chatsAddBtn.setBounds(441, 95, 89, 23);
		panel.add(chatsAddBtn);
		
		//**************************************************** Cool drinks add button **************************************************
		coolDrinksAddBtn = new JButton("Add");
		coolDrinksAddBtn.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyPressed(KeyEvent evt) 
			{
				if(evt.getKeyCode() == KeyEvent.VK_ENTER)
				{
					checkCoolDrinksEmptyFields();
				}
			}
		});
		coolDrinksAddBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				checkCoolDrinksEmptyFields();
			}
		});
		coolDrinksAddBtn.setBounds(441, 134, 89, 23);
		panel.add(coolDrinksAddBtn);
		
		//**************************************************** Hot drinks add button **************************************************
		hotDrinksAddBtn = new JButton("Add");
		hotDrinksAddBtn.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyPressed(KeyEvent evt) 
			{
				if(evt.getKeyCode() == KeyEvent.VK_ENTER)
				{
					checkHotDrinksEmptyFields();
				}
			}
		});
		hotDrinksAddBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent evt) 
			{ 	
				checkHotDrinksEmptyFields();
			}
		});
		hotDrinksAddBtn.setBounds(441, 173, 89, 23);
		panel.add(hotDrinksAddBtn);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.DARK_GRAY, 4));
		panel_1.setBounds(596, 103, 412, 217);
		restorentPageFrame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.DARK_GRAY, 4));
		panel_2.setBounds(596, 344, 412, 217);
		restorentPageFrame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		//**************************************************** Sub total label ******************************************************
		JLabel subtotalLbl = new JLabel("Sub Total");
		subtotalLbl.setFont(new Font("Tahoma", Font.BOLD, 14));
		subtotalLbl.setBounds(10, 11, 85, 24);
		panel_2.add(subtotalLbl);
		
		//**************************************************** Tax 5.0% label ******************************************************
		JLabel taxLbl = new JLabel("Tax 5.0%");
		taxLbl.setFont(new Font("Tahoma", Font.BOLD, 14));
		taxLbl.setBounds(10, 46, 85, 24);
		panel_2.add(taxLbl);
		
		//**************************************************** Grand total label ******************************************************
		JLabel totalLbl = new JLabel("Grand Total");
		totalLbl.setFont(new Font("Tahoma", Font.BOLD, 14));
		totalLbl.setBounds(10, 81, 85, 24);
		panel_2.add(totalLbl);
		
		//**************************************************** Sub total text field ******************************************************
		subTotalTF = new JTextField();
		subTotalTF.setBackground(Color.WHITE);
		subTotalTF.setEditable(false);
		subTotalTF.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent evt) 
			{
				char c =evt.getKeyChar();
				//allow only alphabetic keys, numerical keys, back space key and delete key
				if (!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE))
				{
					evt.consume();
				}
			}
		});
		subTotalTF.setBounds(120, 15, 148, 20);
		panel_2.add(subTotalTF);
		subTotalTF.setColumns(10);
		
		//**************************************************** Tax text field ******************************************************
		taxTF = new JTextField();
		taxTF.setBackground(Color.WHITE);
		taxTF.setEditable(false);
		taxTF.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent evt) 
			{
				char c =evt.getKeyChar();
				//allow only alphabetic keys, numerical keys, back space key and delete key
				if (!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE))
				{
					evt.consume();
				}
			}
		});
		taxTF.setColumns(10);
		taxTF.setBounds(120, 50, 148, 20);
		panel_2.add(taxTF);
		
		//**************************************************** Grand total text field ******************************************************
		grandTotalTF = new JTextField();
		grandTotalTF.setBackground(Color.WHITE);
		grandTotalTF.setEditable(false);
		grandTotalTF.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent evt) 
			{
				char c =evt.getKeyChar();
				//allow only alphabetic keys, numerical keys, back space key and delete key
				if (!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE))
				{
					evt.consume();
				}
			}
		});
		grandTotalTF.setColumns(10);
		grandTotalTF.setBounds(120, 85, 148, 20);
		panel_2.add(grandTotalTF);
		
		JButton btnSubmitt = new JButton("Submitt");
		btnSubmitt.setBounds(10, 152, 89, 23);
		panel_2.add(btnSubmitt);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.DARK_GRAY, 4));
		panel_3.setBounds(34, 344, 540, 217);
		restorentPageFrame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(331, 19, 0, 2);
		panel_3.add(separator);
		
		
		
		table = new JTable();
		table.setBounds(336, 20, 0, 0);
		panel_3.add(table);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new SoftBevelBorder(BevelBorder.RAISED, Color.BLACK, Color.DARK_GRAY, Color.BLACK, Color.DARK_GRAY));
		panel_4.setBounds(34, 585, 974, 54);
		restorentPageFrame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JButton eraseBtn = new JButton("Erase");
		eraseBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			
			}
		});
		eraseBtn.setBounds(30, 15, 89, 23);
		panel_4.add(eraseBtn);
		
		//********************************************* Receipt Button ***********************************************************
		JButton receiptBtn = new JButton("Receipt");
		receiptBtn.setBounds(210, 15, 89, 23);
		receiptBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				double qtyOfBreakfast = Double.parseDouble(coolDrinksQtyTF.getText());
				double qtyOfMeals = Double.parseDouble(coolDrinksQtyTF.getText());
				double qtyOfChats = Double.parseDouble(coolDrinksQtyTF.getText());
				double qtyOfCoolDrinks = Double.parseDouble(coolDrinksQtyTF.getText());
				double qtyOfHotDrinks = Double.parseDouble(coolDrinksQtyTF.getText());
			}
		});
		panel_4.add(receiptBtn);
		
		//******************************************* Reset Button ************************************************************
		
		JButton resetBtn = new JButton("Reset");
		resetBtn.setBounds(628, 15, 89, 23);
		resetBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				defaultValues();
			}
		});
		panel_4.add(resetBtn);
		
		//******************************************* Exit Button *****************************************************************
		
		JButton exitBtn = new JButton("Exit");
		exitBtn.setBounds(844, 15, 89, 23);
		exitBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent evt) 
			{
				System.exit(0);
			}
		});
		panel_4.add(exitBtn);
		
		//******************************************* Print Button *****************************************************************
		JButton printBtn = new JButton("Print");
		printBtn.setBounds(417, 15, 89, 23);
		printBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent evt) 
			{
				/*String printPrefix = "Uthsaahi Restorant";
				//\n is used to print "visit again" text in next line
				String printSuffix = "Thank you \nVisit again";*/
				try
				{
					boolean complete = receiptTA.print();
					if (complete)
					{
						JOptionPane.showMessageDialog(null, "Done Printing", "Information", JOptionPane.INFORMATION_MESSAGE);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Printing", "Printer", JOptionPane.ERROR_MESSAGE);
					}
				}
				catch (PrinterException e)
				{
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		panel_4.add(printBtn);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLACK, Color.DARK_GRAY));
		panel_5.setBounds(1018, 103, 308, 456);
		restorentPageFrame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 36, 288, 409);
		panel_5.add(tabbedPane);
		
		//*************************************************** Receipt Panel *********************************************************
		JPanel receiptPanel = new JPanel();
		tabbedPane.addTab("Receipt", null, receiptPanel, null);
		receiptPanel.setLayout(null);
		
		//*************************************************** Receipt Text area *********************************************************
		receiptTA = new JTextArea();
		receiptTA.setWrapStyleWord(true);
		receiptTA.setBackground(Color.WHITE);
		receiptTA.setEditable(false);
		receiptTA.setBounds(10, 11, 263, 359);
		receiptPanel.add(receiptTA);
		receiptTA.setColumns(10);
		receiptTA.setText("                          Uthsaahi Restorent\n");
		
		//*************************************************** Calculator Panel *********************************************************
		JPanel calculatorPanel = new JPanel();
		tabbedPane.addTab("Calculator", null, calculatorPanel, null);
		calculatorPanel.setLayout(null);
		
		calculatorTF = new JTextField();
		calculatorTF.setBounds(10, 11, 263, 40);
		calculatorPanel.add(calculatorTF);
		calculatorTF.setColumns(10);
		
		JButton button_1 = new JButton("1");
		button_1.setForeground(new Color(0, 0, 128));
		button_1.setBackground(new Color(192, 192, 192));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_1.setBounds(10, 267, 42, 47);
		calculatorPanel.add(button_1);
		
		JButton button_5 = new JButton("New button");
		button_5.setBounds(10, 95, 42, 47);
		calculatorPanel.add(button_5);
		
		JButton button = new JButton("New button");
		button.setBounds(62, 95, 42, 47);
		calculatorPanel.add(button);
		
		JButton button_13 = new JButton("New button");
		button_13.setBounds(116, 95, 42, 47);
		calculatorPanel.add(button_13);
		
		JButton button_17 = new JButton("New button");
		button_17.setBounds(168, 95, 42, 47);
		calculatorPanel.add(button_17);
		
		JButton button_21 = new JButton("New button");
		button_21.setBounds(220, 95, 42, 47);
		calculatorPanel.add(button_21);
		
		JButton button_2 = new JButton("2");
		button_2.setForeground(new Color(0, 0, 128));
		button_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_2.setBackground(Color.LIGHT_GRAY);
		button_2.setBounds(62, 267, 42, 47);
		calculatorPanel.add(button_2);
		
		JButton button_4 = new JButton("3");
		button_4.setForeground(new Color(0, 0, 128));
		button_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_4.setBackground(Color.LIGHT_GRAY);
		button_4.setBounds(116, 267, 42, 47);
		calculatorPanel.add(button_4);
		
		JButton button_10 = new JButton("6");
		button_10.setForeground(new Color(0, 0, 128));
		button_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_10.setBackground(Color.LIGHT_GRAY);
		button_10.setBounds(116, 211, 42, 47);
		calculatorPanel.add(button_10);
		
		JButton button_11 = new JButton("5");
		button_11.setForeground(new Color(0, 0, 128));
		button_11.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_11.setBackground(Color.LIGHT_GRAY);
		button_11.setBounds(62, 211, 42, 47);
		calculatorPanel.add(button_11);
		
		JButton button_12 = new JButton("4");
		button_12.setForeground(new Color(0, 0, 128));
		button_12.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_12.setBackground(Color.LIGHT_GRAY);
		button_12.setBounds(10, 211, 42, 47);
		calculatorPanel.add(button_12);
		
		JButton button_14 = new JButton("9");
		button_14.setForeground(new Color(0, 0, 128));
		button_14.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_14.setBackground(Color.LIGHT_GRAY);
		button_14.setBounds(116, 153, 42, 47);
		calculatorPanel.add(button_14);
		
		JButton button_15 = new JButton("8");
		button_15.setForeground(new Color(0, 0, 128));
		button_15.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_15.setBackground(Color.LIGHT_GRAY);
		button_15.setBounds(62, 153, 42, 47);
		calculatorPanel.add(button_15);
		
		JButton button_16 = new JButton("7");
		button_16.setForeground(new Color(0, 0, 128));
		button_16.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_16.setBackground(Color.LIGHT_GRAY);
		button_16.setBounds(10, 153, 42, 47);
		calculatorPanel.add(button_16);
		
		JButton button_3 = new JButton("0");
		button_3.setForeground(new Color(0, 0, 128));
		button_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_3.setBackground(Color.LIGHT_GRAY);
		button_3.setBounds(10, 323, 42, 47);
		calculatorPanel.add(button_3);
		
		JButton button_6 = new JButton("00");
		button_6.setForeground(new Color(0, 0, 128));
		button_6.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_6.setBackground(Color.LIGHT_GRAY);
		button_6.setBounds(62, 323, 42, 47);
		calculatorPanel.add(button_6);
		
		JButton button_7 = new JButton(".");
		button_7.setForeground(new Color(0, 0, 128));
		button_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_7.setBackground(Color.LIGHT_GRAY);
		button_7.setBounds(116, 323, 42, 47);
		calculatorPanel.add(button_7);
		
		JButton button_8 = new JButton("+");
		button_8.setForeground(new Color(0, 0, 128));
		button_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_8.setBackground(Color.LIGHT_GRAY);
		button_8.setBounds(168, 267, 42, 103);
		calculatorPanel.add(button_8);
		
		JButton button_9 = new JButton("=");
		button_9.setForeground(new Color(0, 0, 128));
		button_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_9.setBackground(Color.LIGHT_GRAY);
		button_9.setBounds(220, 323, 42, 47);
		calculatorPanel.add(button_9);
		
		JButton btnX = new JButton("X");
		btnX.setForeground(new Color(0, 0, 128));
		btnX.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnX.setBackground(Color.LIGHT_GRAY);
		btnX.setBounds(168, 211, 42, 47);
		calculatorPanel.add(btnX);
		
		JButton button_19 = new JButton("3");
		button_19.setForeground(new Color(0, 0, 128));
		button_19.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_19.setBackground(Color.LIGHT_GRAY);
		button_19.setBounds(168, 153, 42, 47);
		calculatorPanel.add(button_19);
		
		JButton button_20 = new JButton("%");
		button_20.setForeground(new Color(0, 0, 128));
		button_20.setFont(new Font("Tahoma", Font.BOLD, 8));
		button_20.setBackground(Color.LIGHT_GRAY);
		button_20.setBounds(220, 153, 42, 47);
		calculatorPanel.add(button_20);
		
		JButton button_22 = new JButton("/");
		button_22.setForeground(new Color(0, 0, 128));
		button_22.setFont(new Font("Tahoma", Font.BOLD, 16));
		button_22.setBackground(Color.LIGHT_GRAY);
		button_22.setBounds(220, 211, 42, 47);
		calculatorPanel.add(button_22);
		
		JButton button_23 = new JButton("-");
		button_23.setForeground(new Color(0, 0, 128));
		button_23.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_23.setBackground(Color.LIGHT_GRAY);
		button_23.setBounds(220, 267, 42, 47);
		calculatorPanel.add(button_23);
		
		JLabel lblNewLabel = new JLabel("UTHSAAHI RESTORENT");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setToolTipText("Name of the Restorent");
		lblNewLabel.setFont(new Font("Maiandra GD", Font.PLAIN, 50));
		lblNewLabel.setBounds(456, 11, 635, 81);
		restorentPageFrame.getContentPane().add(lblNewLabel);
	}
	
	private void defaultValues()
	{
		breakfastComboBox.setSelectedItem("Select Breakfast");
		mealsComboBox.setSelectedItem("Select Meals");
		chatsComboBox.setSelectedItem("Select Chats");
		coolDrinksComboBox.setSelectedItem("Select Cool drinks");
		hotDrinksComboBox.setSelectedItem("Select Hot drinks");
		breakfastQtyTF.setText("0");
		mealsQtyTF.setText("0");
		chatsQtyTF.setText("0");
		coolDrinksQtyTF.setText("0");
		hotDrinksQtyTF.setText("0");
		subTotalTF.setText("0.0");
		taxTF.setText("0.0");
		grandTotalTF.setText("0.0");
		tax = 0.0;
		subTotal = 0.0;
		grandTotal = 0.0;
		priceOfBreakfast = 0.0;
		priceOfMeals = 0.0;
		priceOfChats = 0.0;
		priceOfCoolDrinks = 0.0;
		priceOfHotDrinks = 0.0;
		
		receiptTA.setText("\tUthsaahi Restorent\n");
	}
	
	private void totalSum()
	{
		tax=subTotal*0.05;
		grandTotal=subTotal+tax;
		
		subTotalS = String.format("%.2f", subTotal);
		subTotalTF.setText(subTotalS);
		taxS = String.format("%.2f", tax);
		taxTF.setText(taxS);
		grandTotalS = String.format("%.2f", grandTotal);
		grandTotalTF.setText(grandTotalS);
	}
	
	private void checkBreakfastEmptyFields()
	{
		if(breakfastComboBox.getSelectedIndex() == 0 && breakfastQtyTF.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(null, "Please select breakfast & Qty", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		else if(breakfastQtyTF.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(null, "Please enter Qty", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		else if(breakfastComboBox.getSelectedIndex() == 0)
		{
			JOptionPane.showMessageDialog(null, "Please select breakfast", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		else
		{
			calculateAndReceiptBreakfast();
		}
	}
	
	private void calculateAndReceiptBreakfast()
	{
		qtyOfBreakfast = Double.parseDouble(breakfastQtyTF.getText());
		if(breakfastComboBox.getSelectedItem().equals("Curd rice"))
		{
			priceOfBreakfast = (qtyOfBreakfast * costOfCurdRice);
			pBreakfast = String.format("%.2f", priceOfBreakfast);
			receipt = "Curd rice: "+costOfCurdRice+" X "+qtyOfBreakfast+" = "+pBreakfast;
		}
		else if(breakfastComboBox.getSelectedItem().equals("Edli"))
		{
			priceOfBreakfast = (qtyOfBreakfast * costOfEdli);
			pBreakfast = String.format("%.2f", priceOfBreakfast);
			receipt = "Edli: "+costOfEdli+" X "+qtyOfBreakfast+" = "+pBreakfast;
		}
		else if(breakfastComboBox.getSelectedItem().equals("Onion dosa"))
		{
			priceOfBreakfast = (qtyOfBreakfast * costOfOnionDosa);
			pBreakfast = String.format("%.2f", priceOfBreakfast);
			receipt = "Onion dosa: "+costOfOnionDosa+" X "+qtyOfBreakfast+" = "+pBreakfast;
		}
		else if(breakfastComboBox.getSelectedItem().equals("Lemon rice"))
		{
			priceOfBreakfast = (qtyOfBreakfast * costOfLemonRice);
			pBreakfast = String.format("%.2f", priceOfBreakfast);
			receipt = "Lemon rice: "+costOfLemonRice+" X "+qtyOfBreakfast+" = "+pBreakfast;
		}
		else if(breakfastComboBox.getSelectedItem().equals("Masale dosa"))
		{
			priceOfBreakfast = (qtyOfBreakfast * costOfMasaleDosa);
			pBreakfast = String.format("%.2f", priceOfBreakfast);
			receipt = "Masale dosa: "+costOfMasaleDosa+" X "+qtyOfBreakfast+" = "+pBreakfast;
		}
		else if(breakfastComboBox.getSelectedItem().equals("Poori"))
		{
			priceOfBreakfast = (qtyOfBreakfast * costOfPoori);
			pBreakfast = String.format("%.2f", priceOfBreakfast);
			receipt = "Poori: "+costOfPoori+" X "+qtyOfBreakfast+" = "+pBreakfast;
		}
		else if(breakfastComboBox.getSelectedItem().equals("Puliyogare"))
		{
			priceOfBreakfast = (qtyOfBreakfast * costOfPuliyogare);
			pBreakfast = String.format("%.2f", priceOfBreakfast);
			receipt = "Puliyogare: "+costOfPuliyogare+" X "+qtyOfBreakfast+" = "+pBreakfast;
		}
		else if(breakfastComboBox.getSelectedItem().equals("Set dosa"))
		{
			priceOfBreakfast = (qtyOfBreakfast * costOfSetDosa);
			pBreakfast = String.format("%.2f", priceOfBreakfast);
			receipt = "Set dosa: "+costOfSetDosa+" X "+qtyOfBreakfast+" = "+pBreakfast;
		}
		else if(breakfastComboBox.getSelectedItem().equals("Vangi baath"))
		{
			priceOfBreakfast = (qtyOfBreakfast * costOfVangiBaath);
			pBreakfast = String.format("%.2f", priceOfBreakfast);
			receipt = "Vangi baath: "+costOfVangiBaath+" X "+qtyOfBreakfast+" = "+pBreakfast;
		}
		else if(breakfastComboBox.getSelectedItem().equals("Veg palav"))
		{
			priceOfBreakfast = (qtyOfBreakfast * costOfVegPalav);
			pBreakfast = String.format("%.2f", priceOfBreakfast);
			receipt = "Veg palav: "+costOfVegPalav+" X "+qtyOfBreakfast+" = "+pBreakfast;
		}
		receiptTA.append(receipt+"\n");
		subTotal=subTotal+priceOfBreakfast;
		totalSum();
	}
	
	private void checkMealsEmptyFields()
	{
		if(mealsComboBox.getSelectedIndex() == 0 && mealsQtyTF.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(null, "Please select meals & Qty", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		else if(mealsQtyTF.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(null, "Please enter Qty", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		else if(mealsComboBox.getSelectedIndex() == 0)
		{
			JOptionPane.showMessageDialog(null, "Please select meals", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		else
		{
			calculateAndReceiptMeals();
		}
	}
	
	private void calculateAndReceiptMeals()
	{
		qtyOfMeals = Double.parseDouble(mealsQtyTF.getText());
		if(mealsComboBox.getSelectedItem().equals("Full meals"))
		{
			priceOfMeals = (qtyOfMeals * costOfFullMeals);
			pMeals = String.format("%.2f", priceOfMeals);
			receipt = "Full meals: "+costOfFullMeals+" X "+qtyOfMeals+" = "+pMeals;
		}
		else if(mealsComboBox.getSelectedItem().equals("Half meals"))
		{
			priceOfMeals = (qtyOfMeals * costOfHalfMeals);
			pMeals = String.format("%.2f", priceOfMeals);
			receipt = "Half meals: "+costOfHalfMeals+" X "+qtyOfMeals+" = "+pMeals;
		}
		receiptTA.append(receipt+"\n");
		subTotal=subTotal+priceOfMeals;
		totalSum();
	}
	
	private void checkChatsEmptyFields()
	{
		if(chatsComboBox.getSelectedIndex() == 0 && chatsQtyTF.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(null, "Please select chats & Qty", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		else if(chatsQtyTF.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(null, "Please enter Qty", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		else if(chatsComboBox.getSelectedIndex() == 0)
		{
			JOptionPane.showMessageDialog(null, "Please select chats", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		else
		{
			calculateAndReceiptChats();
		}
	}
	
	private void calculateAndReceiptChats()
	{
		qtyOfchats = Double.parseDouble(chatsQtyTF.getText());
		if(chatsComboBox.getSelectedItem().equals("Bhel poori"))
		{
			priceOfChats = (qtyOfchats * costOfBhelPoori);
			pChats = String.format("%.2f", priceOfChats);
			receipt = "Bhel poori: "+costOfBhelPoori+" X "+qtyOfchats+" = "+pChats;
		}
		else if(chatsComboBox.getSelectedItem().equals("Churumuri"))
		{
			priceOfChats = (qtyOfchats * costOfChurumuri);
			pChats = String.format("%.2f", priceOfChats);
			receipt = "Churmuri: "+costOfChurumuri+" X "+qtyOfchats+" = "+pChats;
		}
		else if(chatsComboBox.getSelectedItem().equals("Gobi corn"))
		{
			priceOfChats = (qtyOfchats * costOfGobiCorn);
			pChats = String.format("%.2f", priceOfChats);
			receipt = "Gobi corn: "+costOfGobiCorn+" X "+qtyOfchats+" = "+pChats;
		}
		else if(chatsComboBox.getSelectedItem().equals("Gobi manchurian"))
		{
			priceOfChats = (qtyOfchats * costOfGobiManchurian);
			pChats = String.format("%.2f", priceOfChats);
			receipt = "Gobi manchoorian: "+costOfGobiManchurian+" X "+qtyOfchats+" = "+pChats;
		}
		else if(chatsComboBox.getSelectedItem().equals("Masale poori"))
		{
			priceOfChats = (qtyOfchats * costOfMasalePoori);
			pChats = String.format("%.2f", priceOfChats);
			receipt = "Masale poori: "+costOfMasalePoori+" X "+qtyOfchats+" = "+pChats;
		}
		else if(chatsComboBox.getSelectedItem().equals("Paani poori"))
		{
			priceOfChats = (qtyOfchats * costOfPaaniPoori);
			pChats = String.format("%.2f", priceOfChats);
			receipt = "Paani poori: "+costOfPaaniPoori+" X "+qtyOfchats+" = "+pChats;
		}
		else if(chatsComboBox.getSelectedItem().equals("Sev poori"))
		{
			priceOfChats = (qtyOfchats * costOfSevPoori);
			pChats = String.format("%.2f", priceOfChats);
			receipt = "Sev poori: "+costOfSevPoori+" X "+qtyOfchats+" = "+pChats;
		}
		else if(chatsComboBox.getSelectedItem().equals("Sukka poori"))
		{
			priceOfChats = (qtyOfchats * costOfSukkaPoori);
			pChats = String.format("%.2f", priceOfChats);
			receipt = "Sukka poori: "+costOfSukkaPoori+" X "+qtyOfchats+" = "+pChats;
		}
		receiptTA.append(receipt+"\n");
		subTotal=subTotal+priceOfChats;
		totalSum();
	}
	
	private void checkCoolDrinksEmptyFields()
	{
		if(coolDrinksComboBox.getSelectedIndex() == 0 && coolDrinksQtyTF.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(null, "Please select cool drinks & Qty", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		else if(coolDrinksQtyTF.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(null, "Please enter Qty", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		else if(coolDrinksComboBox.getSelectedIndex() == 0)
		{
			JOptionPane.showMessageDialog(null, "Please select cool drinks", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		else
		{
			calculateAndReceiptCoolDrinks();
		}
	}
	
	private void calculateAndReceiptCoolDrinks()
	{	
		qtyOfCoolDrinks = Double.parseDouble(coolDrinksQtyTF.getText());
		if(coolDrinksComboBox.getSelectedItem().equals("Apple Juice"))
		{
			priceOfCoolDrinks = (qtyOfCoolDrinks * costOfAppleJuice);
			pCoolDrinks = String.format("%.2f", priceOfCoolDrinks);
			receipt = "Apple Juice: "+costOfAppleJuice+" X "+qtyOfCoolDrinks+" = "+pCoolDrinks;
		}
		else if(coolDrinksComboBox.getSelectedItem().equals("Grape Juice"))
		{
			priceOfCoolDrinks = (qtyOfCoolDrinks * costOfGrapeJuice);
			pCoolDrinks = String.format("%.2f", priceOfCoolDrinks);
			receipt = "Grape Juice: "+costOfGrapeJuice+" X "+qtyOfCoolDrinks+" = "+pCoolDrinks;
		}
		else if(coolDrinksComboBox.getSelectedItem().equals("Mango Juice"))
		{
			priceOfCoolDrinks = (qtyOfCoolDrinks * costOfMangoJuice);
			pCoolDrinks = String.format("%.2f", priceOfCoolDrinks);
			receipt = "Mango Juice: "+costOfMangoJuice+" X "+qtyOfCoolDrinks+" = "+pCoolDrinks;
		}
		else if(coolDrinksComboBox.getSelectedItem().equals("Orange Juice"))
		{
			priceOfCoolDrinks = (qtyOfCoolDrinks * costOfOrangeJuice);
			pCoolDrinks = String.format("%.2f", priceOfCoolDrinks);
			receipt = "Orange Juice: "+costOfOrangeJuice+" X "+qtyOfCoolDrinks+" = "+pCoolDrinks;
		}
		else if(coolDrinksComboBox.getSelectedItem().equals("Pineapple Juice"))
		{
			priceOfCoolDrinks = (qtyOfCoolDrinks * costOfPineAppleJuice);
			pCoolDrinks = String.format("%.2f", priceOfCoolDrinks);
			receipt = "Pineapple Juice: "+costOfPineAppleJuice+" X "+qtyOfCoolDrinks+" = "+pCoolDrinks;
		}
		receiptTA.append(receipt+"\n");
		subTotal=subTotal+priceOfCoolDrinks;
		totalSum();
	}

	private void checkHotDrinksEmptyFields()
	{
		if(hotDrinksComboBox.getSelectedIndex() == 0 && hotDrinksQtyTF.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(null, "Please select hot drinks & Qty", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		else if(hotDrinksQtyTF.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(null, "Please enter Qty", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		else if(hotDrinksComboBox.getSelectedIndex() == 0)
		{
			JOptionPane.showMessageDialog(null, "Please select hot drinks", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		else
		{
			calculateAndReceiptHotDrinks();
		}
	}
	
	private void calculateAndReceiptHotDrinks()
	{	
		qtyOfHotDrinks = Double.parseDouble(hotDrinksQtyTF.getText());	
		if(hotDrinksComboBox.getSelectedItem().equals("Bournvita"))
		{
			priceOfHotDrinks = (qtyOfHotDrinks * costOfBournvita);
			pHotDrinks = String.format("%.2f", priceOfHotDrinks);
			receipt = "Bournvita: "+costOfBournvita+" X "+qtyOfHotDrinks+" = "+pHotDrinks;
		}
		else if(hotDrinksComboBox.getSelectedItem().equals("Coffee"))
		{
			priceOfHotDrinks = (qtyOfHotDrinks * costOfCoffee);
			pHotDrinks = String.format("%.2f", priceOfHotDrinks);
			receipt = "Coffee: "+costOfCoffee+" X "+qtyOfHotDrinks+" = "+pHotDrinks;
		}
		else if(hotDrinksComboBox.getSelectedItem().equals("Horlicks"))
		{
			priceOfHotDrinks = (qtyOfHotDrinks * costOfHorlicks);
			pHotDrinks = String.format("%.2f", priceOfHotDrinks);
			receipt = "Horlicks: "+costOfHorlicks+" X "+qtyOfHotDrinks+" = "+pHotDrinks;
		}
		else if(hotDrinksComboBox.getSelectedItem().equals("Tea"))
		{
			priceOfHotDrinks = (qtyOfHotDrinks * costOfTea);
			pHotDrinks = String.format("%.2f", priceOfHotDrinks);
			receipt = "Tea: "+costOfTea+" X "+qtyOfHotDrinks+" = "+pHotDrinks;
		}
		receiptTA.append(receipt+"\n");
		subTotal=subTotal+priceOfHotDrinks;
		totalSum();
	}
}
