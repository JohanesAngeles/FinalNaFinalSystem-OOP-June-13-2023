import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.border.MatteBorder;

public class Ownerinfo extends JFrame{

	JFrame ownerinfoframe;
	private JTextField nameJTextfield;
	private JTextField numberJTextfield;
	private JTextField adressJTextfield;
	private JLabel Logo;
	private JLabel FullNameLabel;
	private JLabel PhoneNumberLabel;
	private JLabel AddressLabel;
	private JLabel lblNewLabel;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ownerinfo window = new Ownerinfo();
					window.ownerinfoframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ownerinfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ownerinfoframe = new JFrame();
		ownerinfoframe.getContentPane().setBackground(new Color(240, 240, 240));
		ownerinfoframe.setBounds(100, 100, 636, 484);
		ownerinfoframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ownerinfoframe.getContentPane().setLayout(null);
		
		Font fieldFont = null;
        try {
        	fieldFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Regular.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(fieldFont);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
		
		
		nameJTextfield = new JTextField();
		nameJTextfield.setFont(fieldFont.deriveFont(Font.BOLD, 14));
		nameJTextfield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		nameJTextfield.setBackground(new Color(232, 237, 236));
		nameJTextfield.setBounds(104, 200, 400, 38);
		ownerinfoframe.getContentPane().add(nameJTextfield);
		nameJTextfield.setColumns(10);
		nameJTextfield.addFocusListener(new FocusAdapter() {

			@Override
			public void focusGained(FocusEvent e) {
				if (nameJTextfield.getText().equals("Name")) {
					nameJTextfield.setText("");
				}

			}

			@Override
			public void focusLost(FocusEvent e) {
				if (nameJTextfield.getText().equals("")) {
					nameJTextfield.setText("Name");
				}
			}
		});
		
		numberJTextfield = new JTextField();
		numberJTextfield.setFont(fieldFont.deriveFont(Font.BOLD, 14));
		numberJTextfield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		numberJTextfield.setBackground(new Color(232, 237, 236));
		numberJTextfield.setColumns(10);
		numberJTextfield.setBounds(104, 265, 400, 38);
		ownerinfoframe.getContentPane().add(numberJTextfield);
		numberJTextfield.addFocusListener(new FocusAdapter() {

			@Override
			public void focusGained(FocusEvent e) {
				if (numberJTextfield.getText().equals("Phone Number")) {
					numberJTextfield.setText("");
				}

			}

			@Override
			public void focusLost(FocusEvent e) {
				if (numberJTextfield.getText().equals("")) {
					numberJTextfield.setText("Phone Number");
				}
			}
		});
		
		adressJTextfield = new JTextField();
		adressJTextfield.setFont(fieldFont.deriveFont(Font.BOLD, 14));
		adressJTextfield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		adressJTextfield.setBackground(new Color(232, 237, 236));
		adressJTextfield.setColumns(10);
		adressJTextfield.setBounds(104, 331, 400, 38);
		ownerinfoframe.getContentPane().add(adressJTextfield);
		
		adressJTextfield.addFocusListener(new FocusAdapter() {

			@Override
			public void focusGained(FocusEvent e) {
				if (adressJTextfield.getText().equals("Adress")) {
					adressJTextfield.setText("");
				}

			}

			@Override
			public void focusLost(FocusEvent e) {
				if (adressJTextfield.getText().equals("")) {
					adressJTextfield.setText("Adress");
				}
			}
		});
		
		Logo = new JLabel("");
		Logo.setIcon(new ImageIcon(Ownerinfo.class.getResource("/images/pawFileLogo.png")));
		Logo.setBounds(223, 11, 183, 90);
		ownerinfoframe.getContentPane().add(Logo);
		
		 Font LabelFont = null;
         try {
        	 LabelFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Medium.ttf"));
             GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
             ge.registerFont(LabelFont);
         } catch (FontFormatException | IOException e) {
             e.printStackTrace();
         }
         
		FullNameLabel = new JLabel("Full Name:");
		FullNameLabel.setForeground(new Color(19, 0, 90));
		FullNameLabel.setFont(LabelFont.deriveFont(Font.BOLD, 14));
		FullNameLabel.setBounds(104, 184, 400, 14);
		ownerinfoframe.getContentPane().add(FullNameLabel);
		
		PhoneNumberLabel = new JLabel("Phone Number:");
		PhoneNumberLabel.setForeground(new Color(19, 0, 90));
		PhoneNumberLabel.setFont(LabelFont.deriveFont(Font.BOLD, 14));
		PhoneNumberLabel.setBounds(104, 250, 400, 14);
		ownerinfoframe.getContentPane().add(PhoneNumberLabel);
		
		AddressLabel = new JLabel("Address:");
		AddressLabel.setForeground(new Color(19, 0, 90));
		AddressLabel.setFont(LabelFont.deriveFont(Font.BOLD, 14));
		AddressLabel.setBounds(104, 314, 105, 14);
		ownerinfoframe.getContentPane().add(AddressLabel);
		
		 Font InputDataLabelFont = null;
         try {
        	 InputDataLabelFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\PatuaOne-Regular.ttf"));
             GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
             ge.registerFont(InputDataLabelFont);
         } catch (FontFormatException | IOException e) {
             e.printStackTrace();
         }
		
		lblNewLabel = new JLabel("Input Owner's Data");
		lblNewLabel.setForeground(new Color(19, 0, 90));
		lblNewLabel.setFont(InputDataLabelFont.deriveFont(Font.BOLD, 24));
		lblNewLabel.setBounds(205, 112, 216, 28);
		ownerinfoframe.getContentPane().add(lblNewLabel);
		
		Font ButtonlFont = null;
        try {
        	ButtonlFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Medium.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(ButtonlFont);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
        
		btnNewButton = new JButton("Input all data ");
		btnNewButton.setFont(ButtonlFont.deriveFont(Font.BOLD, 14));
		btnNewButton.setBackground(new Color(19, 0, 90));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String inputname = nameJTextfield.getText();
				String inputadress = adressJTextfield.getText();
				String inputnumber = numberJTextfield.getText();
				Ownerprofile window = new Ownerprofile();
				window.ownerframe.setVisible(true);
				window.nameLabel.setText(inputname);
				window.adressLabel.setText(inputadress);
				window.phoneLabel.setText(inputnumber);
				window.ownerframe.setVisible(true);
				ownerinfoframe.dispose();
			}
		});
			
		btnNewButton.setBounds(237, 380, 131, 37);
		ownerinfoframe.getContentPane().add(btnNewButton);
	}

}
