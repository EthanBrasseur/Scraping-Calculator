import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.*;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.TextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.List;

public class gui {

	private JFrame frame;
	private JTextField txtUrl;
	private JTextField txtUrl_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui window = new gui();
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
	public gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setForeground(new Color(255, 255, 255));
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txtUrl = new JTextField();
		txtUrl.setForeground(new Color(255, 255, 255));
		txtUrl.setBackground(new Color(0, 0, 0));
		txtUrl.setFont(new Font("ITF Devanagari Marathi", Font.PLAIN, 13));
		txtUrl.setEditable(false);
		txtUrl.setText("URL 1");
		txtUrl.setBounds(6, 55, 57, 26);
		frame.getContentPane().add(txtUrl);
		txtUrl.setColumns(10);

		txtUrl_1 = new JTextField();
		txtUrl_1.setForeground(new Color(255, 255, 255));
		txtUrl_1.setBackground(new Color(0, 0, 0));
		txtUrl_1.setFont(new Font("ITF Devanagari Marathi", Font.PLAIN, 13));
		txtUrl_1.setEditable(false);
		txtUrl_1.setText("URL 2");
		txtUrl_1.setBounds(6, 99, 57, 26);
		frame.getContentPane().add(txtUrl_1);
		txtUrl_1.setColumns(10);

		String[] sports = {"NFL", "NHL", "NBA"};
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("ITF Devanagari Marathi", Font.PLAIN, 13));
		comboBox.setSelectedIndex(-2);
		comboBox.setToolTipText("");
		comboBox.setBounds(6, 137, 124, 27);
		frame.getContentPane().add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(433, 269, -123, -232);
		frame.getContentPane().add(scrollPane);
		
		JList list = new JList();
		list.setBounds(37, 162, 57, -23);
		frame.getContentPane().add(list);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Arbitrage Calculator");
		lblNewJgoodiesLabel.setForeground(new Color(255, 255, 255));
		lblNewJgoodiesLabel.setFont(new Font("Monospaced", Font.BOLD, 18));
		lblNewJgoodiesLabel.setBounds(102, 6, 226, 31);
		frame.getContentPane().add(lblNewJgoodiesLabel);
		
		TextField textField_1 = new TextField();
		textField_1.setBackground(new Color(0, 0, 0));
		textField_1.setForeground(new Color(255, 255, 255));
		textField_1.setBounds(69, 59, 157, 22);
		frame.getContentPane().add(textField_1);
		
		TextField textField_1_1 = new TextField();
		textField_1_1.setForeground(Color.WHITE);
		textField_1_1.setBackground(Color.BLACK);
		textField_1_1.setBounds(69, 99, 157, 22);
		frame.getContentPane().add(textField_1_1);
		
		List list_1 = new List();
		list_1.setBounds(286, 55, 138, 76);
		frame.getContentPane().add(list_1);

		JComboBox<String> sportsComboBox = new JComboBox<String>();
		sportsComboBox.addItem("NHL");
		sportsComboBox.addItem("NBA");
		sportsComboBox.addItem("NFL");

	}
}
