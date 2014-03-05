package BikeShop;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;

public class BikeStoreGUI extends JFrame {

	private JPanel contentPane;
	private JTextField Color;
	private JTextField Size;
	private JTextField textField_2;

	private BikeStore BikyStore;
	private JTextArea textArea;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnAddBike_1;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeStoreGUI frame = new BikeStoreGUI();
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
	public BikeStoreGUI() {
		
		BikyStore = new BikeStore();
		BikyStore.addBike("red",10,2500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		getContentPane().setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(22, 19, 186, 237);
		getContentPane().add(textPane);
		
		//button with function
		btnAddBike_1 = new JButton("Add Bike");
		btnAddBike_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BikyStore.addBike(Color.getText(), Integer.parseInt(Size.getText()),Integer.parseInt(textField_2.getText()));
				textArea.setText(BikyStore.getAllBikes());
			}
		});
		btnAddBike_1.setBounds(356, 158, 117, 29);
		contentPane.add(btnAddBike_1);
	
		

		
		//text area for applying text
		textArea = new JTextArea();
		textArea.setBounds(18, 17, 245, 242);
		contentPane.add(textArea);
		textArea.setText(BikyStore.getAllBikes());
		textArea.append(BikyStore.getAllBikes());
		
		//textfield for color
		Color = new JTextField();
		Color.setBounds(356, 29, 134, 29);
		contentPane.add(Color);
		Color.setColumns(10);
		

		//textfield for size
		Size = new JTextField();
		Size.setBounds(356, 73, 134, 28);
		contentPane.add(Size);
		Size.setColumns(10);
		
		// textfield for price
		textField_2 = new JTextField();
		textField_2.setBounds(356, 118, 134, 28);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		//Lable for Color
		JLabel lblColor1 = new JLabel("Color");
		lblColor1.setBounds(283, 35, 61, 16);
		contentPane.add(lblColor1);
		
		//Lable for Size
		JLabel lblSize1 = new JLabel("Size");
		lblSize1.setBounds(283, 79, 61, 16);
		contentPane.add(lblSize1);
		
		//Lable for Price
		JLabel lblPrice1 = new JLabel("Price");
		lblPrice1.setBounds(283, 124, 61, 16);
		contentPane.add(lblPrice1);
		

	
	}
	
	
}
