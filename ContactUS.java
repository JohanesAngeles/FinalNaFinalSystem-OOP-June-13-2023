import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import javax.swing.JScrollPane;

public class ContactUS {

    JFrame ContactUSframe;
	private JTextField firstNameField;
	private JTextField LastNameField;
	private JTextField EmailField;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactUS window = new ContactUS();
					window.ContactUSframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ContactUS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ContactUSframe = new JFrame();
		ContactUSframe.setBounds(100, 100, 1250, 634);
		ContactUSframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ContactUSframe.getContentPane().setLayout(null);
		
		JLabel Logo = new JLabel("");
		Logo.setBounds(10, 11, 169, 71);
		Logo.setIcon(new ImageIcon(ContactUS.class.getResource("/images/pawFileLogo.png")));
		ContactUSframe.getContentPane().add(Logo);
		
		JLabel headerLine = new JLabel("");
		headerLine.setBounds(30, 95, 1164, 14);
		headerLine.setIcon(new ImageIcon(ContactUS.class.getResource("/images/headerLine.png")));
		ContactUSframe.getContentPane().add(headerLine);
		
		
		 Font ContactUSBigLabelFont = null;
         try {
        	 ContactUSBigLabelFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\PatuaOne-Regular.ttf"));
         } catch (FontFormatException | IOException e) {
             e.printStackTrace();
         }
         
		JLabel ContactUSBigLabel = new JLabel("Contact Us");
		ContactUSBigLabel.setForeground(new Color(19, 0, 90));
		ContactUSBigLabel.setFont((ContactUSBigLabelFont.deriveFont(Font.BOLD, 60)));
		ContactUSBigLabel.setBounds(449, 120, 311, 55);
		ContactUSframe.getContentPane().add(ContactUSBigLabel);
		
		Font ExperienceFont = null;
        try {
        	ExperienceFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Regular.ttf"));
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
		
		JLabel ExperienceLabel = new JLabel("Experiencing a problem? Want to share your experience as a user of our system? Reach out to us by filling out the form.");
		ExperienceLabel.setForeground(new Color(19, 0, 90));
		ExperienceLabel.setFont((ExperienceFont.deriveFont(Font.BOLD, 18)));
		ExperienceLabel.setBounds(99, 186, 1012, 23);
		ContactUSframe.getContentPane().add(ExperienceLabel);
		
		Font dataFieldFont = null;
        try {
        	dataFieldFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Regular.ttf"));
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
		
		firstNameField = new JTextField();
		firstNameField.setFont((dataFieldFont.deriveFont(Font.BOLD, 15)));
		firstNameField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		firstNameField.setBackground(new Color(232, 237, 236));
		firstNameField.setBounds(54, 271, 360, 49);
		ContactUSframe.getContentPane().add(firstNameField);
		firstNameField.setColumns(10);
		
		LastNameField = new JTextField();
		LastNameField.setFont((dataFieldFont.deriveFont(Font.BOLD, 15)));
		LastNameField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		LastNameField.setBackground(new Color(232, 237, 236));
		LastNameField.setBounds(424, 271, 360, 49);
		ContactUSframe.getContentPane().add(LastNameField);
		LastNameField.setColumns(10);
		
		EmailField = new JTextField();
		EmailField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		EmailField.setBackground(new Color(232, 237, 236));
		EmailField.setBounds(794, 271, 360, 49);
		ContactUSframe.getContentPane().add(EmailField);
		EmailField.setColumns(10);
		
		Font FieldLabelFont = null;
        try {
        	FieldLabelFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Regular.ttf"));
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
		
		JLabel FirstNameLabel = new JLabel("FirstName");
		FirstNameLabel.setForeground(new Color(19, 0, 90));
		FirstNameLabel.setFont((FieldLabelFont.deriveFont(Font.BOLD, 14)));
		FirstNameLabel.setBounds(54, 247, 370, 23);
		ContactUSframe.getContentPane().add(FirstNameLabel);
		
		JLabel LastNameLabel = new JLabel("LastName");
		LastNameLabel.setForeground(new Color(19, 0, 90));
		LastNameLabel.setFont((FieldLabelFont.deriveFont(Font.BOLD, 14)));
		LastNameLabel.setBounds(424, 247, 370, 23);
		ContactUSframe.getContentPane().add(LastNameLabel);
		
		JLabel EmailLabel = new JLabel("Email");
		EmailLabel.setForeground(new Color(19, 0, 90));
		EmailLabel.setFont((FieldLabelFont.deriveFont(Font.BOLD, 14)));
		EmailLabel.setBounds(794, 247, 360, 23);
		ContactUSframe.getContentPane().add(EmailLabel);
		
		JLabel TellUsLabel = new JLabel("Tell us more about your experience. ");
		TellUsLabel.setForeground(new Color(19, 0, 90));
		TellUsLabel.setFont((FieldLabelFont.deriveFont(Font.BOLD, 14)));
		TellUsLabel.setBounds(54, 338, 370, 23);
		ContactUSframe.getContentPane().add(TellUsLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(54, 361, 1120, 144);
		ContactUSframe.getContentPane().add(scrollPane);
		
		
         
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setFont((FieldLabelFont.deriveFont(Font.BOLD, 14)));
		textArea.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		textArea.setBackground(new Color(232, 237, 236));
		
		Font buttonFont = null;
        try {
        	buttonFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Bold.ttf"));
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
        
		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				saveData();
				clearFields();
		
			}
		});
		submitButton.setFont((buttonFont.deriveFont(Font.BOLD, 14)));
		submitButton.setBackground(new Color(19, 0, 90));
		submitButton.setForeground(new Color(255, 255, 255));
		submitButton.setBounds(999, 516, 175, 40);
		ContactUSframe.getContentPane().add(submitButton);
		
		
		Font HeaderLabelFont = null;
        try {
        	HeaderLabelFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Regular.ttf"));
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
		
		
		JLabel MypetLabel = new JLabel("My Pets");
		MypetLabel.setFont(HeaderLabelFont.deriveFont(Font.BOLD, 18));
		MypetLabel.setBounds(281, 33, 118, 27);
		ContactUSframe.getContentPane().add(MypetLabel);
		
		JLabel AboutLabel = new JLabel("About");
		AboutLabel.setFont(HeaderLabelFont.deriveFont(Font.BOLD, 18));
		AboutLabel.setBounds(409, 33, 118, 27);
		ContactUSframe.getContentPane().add(AboutLabel);
		
		JLabel CotactUsLabel = new JLabel("Contact Us");
		CotactUsLabel.setFont(HeaderLabelFont.deriveFont(Font.BOLD, 18));
		CotactUsLabel.setBounds(514, 33, 118, 27);
		ContactUSframe.getContentPane().add(CotactUsLabel);
		
	}
		
		private void saveData() {
			String firstName = firstNameField.getText();
			String lastName = LastNameField.getText();
			String email = EmailField.getText();
			String experience = textArea.getText();
			
			try (BufferedWriter writer = new BufferedWriter(new FileWriter("Concern.txt", true))) {
				writer.write("FirstName: " + firstName);
				writer.newLine();
				writer.write("LastName: " + lastName);
				writer.newLine();
				writer.write("Email: " + email);
				writer.newLine();
				writer.write("Experience: " + experience);
				writer.newLine();
				writer.newLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		private void clearFields() {
			firstNameField.setText("");
			LastNameField.setText("");
			EmailField.setText("");
			textArea.setText("");
	}
}
