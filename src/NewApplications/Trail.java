package NewApplications;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;

public class Trail {

	private JFrame frame;
	private JRadioButton jRadioButton1 = null;
	private JRadioButton jRadioButton2 = null;
	private ButtonGroup bg = new ButtonGroup();
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Trail window = new Trail();
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
	public Trail() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				JButton btnSubmit = new JButton("Submit");
				btnSubmit.setBounds(161, 112, 89, 23);
				frame.getContentPane().add(btnSubmit);
			}
		});
		btnNext.setBounds(172, 227, 89, 23);
		frame.getContentPane().add(btnNext);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
