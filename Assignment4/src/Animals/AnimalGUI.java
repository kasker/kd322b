package Animals;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class AnimalGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalGUI frame = new AnimalGUI();
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
	public AnimalGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//textArea
		JTextArea textArea = new JTextArea();
		textArea.setBounds(17, 6, 398, 266);
		contentPane.add(textArea);
	
		//Array list for animals
		ArrayList<Animal> superIntressting = new ArrayList<Animal>();
		
		superIntressting.add(new Cat("mr muffin", 9, 2)); //array alltid length
		superIntressting.add(new Dog("Sarge", 5, false));
		superIntressting.add(new Dog("Stell", 4, true));
		superIntressting.add(new Snake("Bob", true));
		superIntressting.add(new Snake("mrs Fluffy Hair", false));
		
		
		String nothing = "";
		for(int i = 0; i < superIntressting.size(); i ++){ //arraylist alltid size
			Animal currentAnimal = superIntressting.get(i);
			nothing = nothing + currentAnimal.getInfo() + "\n";
		}
		
		textArea.setText(nothing);
		
		
		
		
		
		
		
		
	}

}
