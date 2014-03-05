package Ownership;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class OwnershipGUI extends JFrame {

	private JPanel contentPane;
	
	private JTextField textField_NewHuman;
	private JTextField textField_BuyDog;
	
	private JTextArea textArea_ErrorMessage;
	private JTextArea textArea_Info;
	
	private JButton btn_NewHuman;
	private JButton btn_BuyDog;
	private JButton btn_PrintInfo;
	
	//array for man & dog
	static Human man;
	static Dog dog;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OwnershipGUI frame = new OwnershipGUI();
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
	public OwnershipGUI() {

		
		
		//settings for window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// J lable for name of the program
		JLabel lblHumansDogs = new JLabel("Humans & Dogs");
		lblHumansDogs.setFont(new Font("Lucida Grande", Font.PLAIN, 29));
		lblHumansDogs.setBounds(118, 6, 226, 74);
		contentPane.add(lblHumansDogs);
		
		
		
		
		// Buttons
		
		//Button for "new Human"
		JButton btn_NewHuman = new JButton("New Human");
		btn_NewHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
					if (textField_NewHuman.getText().length() >= 3){
						man = new Human(textField_NewHuman.getText());
						
					}else{
						System.out.println("fail");
						textArea_ErrorMessage.setText("Name too short");
						
					}
					
				}
			});
		btn_NewHuman.setBounds(314, 75, 117, 29);
		contentPane.add(btn_NewHuman);
		
		// button for "buy dog"
		JButton btn_BuyDog = new JButton("Buy Dog");
		btn_BuyDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(man != null){
					Dog dog = new Dog();
					dog.setName(textField_BuyDog.getText());
					man.buyDog(dog);
					
					} else {
						textArea_ErrorMessage.setText("No human avalable to buy dog");
				}
			}
		});
		btn_BuyDog.setBounds(314, 107, 117, 29);
		contentPane.add(btn_BuyDog);
		
		
		//button for "print info"
		JButton btn_PrintInfo = new JButton("Print Info");
		btn_PrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_Info.setText(man.getInfo());
				}
		});
		btn_PrintInfo.setBounds(169, 163, 117, 29);
		contentPane.add(btn_PrintInfo);
		
		
		
		// Textfields
		
		//Textfield for "new human"
		textField_NewHuman = new JTextField();
		textField_NewHuman.setBounds(43, 74, 259, 28);
		contentPane.add(textField_NewHuman);
		textField_NewHuman.setColumns(10);
		
		// textfield for "buy dog"
		textField_BuyDog = new JTextField();
		textField_BuyDog.setBounds(43, 106, 259, 28);
		contentPane.add(textField_BuyDog);
		textField_BuyDog.setColumns(10);
		
		
		
		
		
		//Lables
		
		// Lable for Info
		JLabel lblInfo = new JLabel("Info");
		lblInfo.setBounds(40, 191, 61, 16);
		contentPane.add(lblInfo);
		
		//Lable for "Error Message"
		JLabel lblErorMessage = new JLabel("Error Message");
		lblErorMessage.setBounds(44, 336, 94, 16);
		contentPane.add(lblErorMessage);
		
		
		// Text Areas
		
		//Text area for Info
		textArea_Info = new JTextArea();
		textArea_Info.setBounds(43, 219, 388, 108);
		contentPane.add(textArea_Info);
		
		
		// Text area for Error Message
		textArea_ErrorMessage = new JTextArea();
		textArea_ErrorMessage.setBounds(43, 364, 388, 64);
		contentPane.add(textArea_ErrorMessage);
	}
}
