import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;

import java.awt.GraphicsEnvironment;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.io.BufferedReader;
import java.io.BufferedWriter;



import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ownerprofile extends JFrame {
	JFrame ownerframe;

	JLabel nameLabel, phoneLabel, adressLabel;
	
	private ArrayList<String> data;
	private JLabel ProfilePicture;
	private JPanel PorfilePicturePanel;
	private JLabel Logo;
	private JPanel NamePanel;
	private JPanel PhoneNumberPanel;
	private JPanel addressPanel;
	private JLabel OwnersProfileLabel;
	private JLabel MypetsLabel;
	private JLabel AboutLabel;
	private JLabel ContactUsLabel;
	private JLabel NameLabel;
	private JLabel PhoneNoLAbel;
	private JLabel AddressLabel;
	
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ownerprofile window = new Ownerprofile();
					window.ownerframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ownerprofile() {

		initialize();
	}

	private void initialize() {
		data = new ArrayList<>();
		ownerframe = new JFrame();
		ownerframe.getContentPane().setBackground(new Color(240, 240, 240));
		ownerframe.setBounds(100, 100, 1250, 633);
		ownerframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ownerframe.getContentPane().setLayout(null);
				
		Font EditbuttonFont = null;
        try {
        	EditbuttonFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Bold.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(EditbuttonFont);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
				JButton SelectProfilePictureButton = new JButton("Edit Picture");
				SelectProfilePictureButton.setFont(EditbuttonFont.deriveFont(Font.BOLD, 15));
				SelectProfilePictureButton.setBackground(new Color(19, 0, 90));
				SelectProfilePictureButton.setForeground(new Color(255, 255, 255));
				SelectProfilePictureButton.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						
						JFileChooser fileChooser = new JFileChooser();
		                int option = fileChooser.showOpenDialog(Ownerprofile.this);
		                if (option == JFileChooser.APPROVE_OPTION) {
		                    File file = fileChooser.getSelectedFile();
		                    ImageIcon imageIcon = new ImageIcon(file.getPath());
		                    Image image = imageIcon.getImage().getScaledInstance(246, 270, Image.SCALE_SMOOTH);
		                    ProfilePicture.setIcon(new ImageIcon(image));
		                    
		                
		                }
		                
					}
						
						
		
				});
				
				JButton AddOwnnersInformationButton = new JButton("Edit Profile");
				AddOwnnersInformationButton.setFont(EditbuttonFont.deriveFont(Font.BOLD, 15));
				AddOwnnersInformationButton.setBackground(new Color(246, 186, 111));
				AddOwnnersInformationButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						Ownerinfo ownerinfo = new Ownerinfo();
						ownerinfo.ownerinfoframe.setVisible(true);
						ownerframe.dispose();
						
					}
				});
				AddOwnnersInformationButton.setBounds(74, 522, 266, 36);
				ownerframe.getContentPane().add(AddOwnnersInformationButton);
				SelectProfilePictureButton.setBounds(74, 475, 266, 36);
				ownerframe.getContentPane().add(SelectProfilePictureButton);
		
		PorfilePicturePanel = new JPanel();
		PorfilePicturePanel.setBackground(new Color(19, 0, 90));
		PorfilePicturePanel.setBounds(74, 141, 266, 323);
		ownerframe.getContentPane().add(PorfilePicturePanel);
		PorfilePicturePanel.setLayout(null);
		
		ProfilePicture = new JLabel("");
		ProfilePicture.setHorizontalAlignment(SwingConstants.CENTER);
		ProfilePicture.setBounds(10, 11, 246, 270);
		PorfilePicturePanel.add(ProfilePicture);
		ProfilePicture.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(109, 169, 255)));
		
		NamePanel = new JPanel();
		NamePanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		NamePanel.setBounds(367, 260, 451, 62);
		ownerframe.getContentPane().add(NamePanel);
		NamePanel.setLayout(null);
		        
		Font inputFont = null;
        try {
        	inputFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Regular.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(inputFont);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
				nameLabel = new JLabel("");
				nameLabel.setBounds(10, 15, 431, 36);
				NamePanel.add(nameLabel);
				nameLabel.setFont(inputFont.deriveFont(Font.BOLD, 18));
		
		PhoneNumberPanel = new JPanel();
		PhoneNumberPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		PhoneNumberPanel.setBounds(828, 260, 356, 62);
		ownerframe.getContentPane().add(PhoneNumberPanel);
		PhoneNumberPanel.setLayout(null);
		
				phoneLabel = new JLabel("");
				phoneLabel.setBounds(10, 15, 336, 36);
				PhoneNumberPanel.add(phoneLabel);
				phoneLabel.setFont(inputFont.deriveFont(Font.BOLD, 18));
		
		addressPanel = new JPanel();
		addressPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		addressPanel.setBounds(367, 356, 819, 108);
		ownerframe.getContentPane().add(addressPanel);
		addressPanel.setLayout(null);
		
				adressLabel = new JLabel("");
				adressLabel.setBounds(10, 42, 441, 36);
				addressPanel.add(adressLabel);
				adressLabel.setFont(inputFont.deriveFont(Font.BOLD, 18));
				
				Font OwnersProfileLabelFont = null;
                try {
                	OwnersProfileLabelFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\PatuaOne-Regular.ttf"));
                    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                    ge.registerFont(OwnersProfileLabelFont);
                } catch (FontFormatException | IOException e) {
                    e.printStackTrace();
                }
				
				OwnersProfileLabel = new JLabel("Owner Profile");
				OwnersProfileLabel.setForeground(new Color(19, 0, 90));
				OwnersProfileLabel.setFont(OwnersProfileLabelFont.deriveFont(Font.BOLD, 36));
				OwnersProfileLabel.setBounds(377, 141, 260, 62);
				ownerframe.getContentPane().add(OwnersProfileLabel);
				
				
				
				Font HeaderFont = null;
                try {
                	HeaderFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Regular.ttf"));
                    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                    ge.registerFont(HeaderFont);
                } catch (FontFormatException | IOException e) {
                    e.printStackTrace();
                }
				
				Font labelFont = null;
                try {
                	labelFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Medium.ttf"));
                    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                    ge.registerFont(labelFont);
                } catch (FontFormatException | IOException e) {
                    e.printStackTrace();
                }
                
				NameLabel = new JLabel("Name:");
				NameLabel.setFont(labelFont.deriveFont(Font.BOLD, 14));
				NameLabel.setBounds(367, 238, 118, 14);
				ownerframe.getContentPane().add(NameLabel);
				
				PhoneNoLAbel = new JLabel("Phone Number:");
				PhoneNoLAbel.setFont(labelFont.deriveFont(Font.BOLD, 14));
				PhoneNoLAbel.setBounds(828, 238, 118, 14);
				ownerframe.getContentPane().add(PhoneNoLAbel);
				
				AddressLabel = new JLabel("Address:");
				AddressLabel.setFont(labelFont.deriveFont(Font.BOLD, 14));
				AddressLabel.setBounds(367, 333, 118, 14);
				ownerframe.getContentPane().add(AddressLabel);
				
				Font buttonFont = null;
                try {
                	buttonFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Medium.ttf"));
                    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                    ge.registerFont(buttonFont);
                } catch (FontFormatException | IOException e) {
                    e.printStackTrace();
                }
				JButton findDataButton = new JButton("Find your Data");
				findDataButton.setForeground(new Color(255, 255, 255));
				findDataButton.setFont(buttonFont.deriveFont(Font.BOLD, 14));
				findDataButton.setBackground(new Color(19, 0, 90));
				findDataButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						importData();
		            
						
					}
				});
				findDataButton.setBounds(654, 475, 260, 36);
				ownerframe.getContentPane().add(findDataButton);
				
				JButton saveDataButton = new JButton("Save your Data");
				saveDataButton.setFont(buttonFont.deriveFont(Font.BOLD, 14));
				saveDataButton.setBackground(new Color(246, 186, 111));
				saveDataButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						exportData();
					}
				});
				saveDataButton.setBounds(924, 475, 260, 36);
				ownerframe.getContentPane().add(saveDataButton);
				
				JPanel panel = new JPanel();
				panel.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(19, 0, 90)));
				panel.setBackground(new Color(109, 169, 228));
				panel.setBounds(0, 0, 1234, 115);
				ownerframe.getContentPane().add(panel);
				panel.setLayout(null);
				
				Logo = new JLabel("");
				Logo.setBounds(10, 11, 167, 95);
				panel.add(Logo);
				Logo.setIcon(new ImageIcon(Ownerprofile.class.getResource("/images/pawFileLogo.png")));
				
				MypetsLabel = new JLabel("My Pets");
				MypetsLabel.setBounds(275, 40, 118, 40);
				panel.add(MypetsLabel);
				MypetsLabel.setFont(HeaderFont.deriveFont(Font.BOLD, 18));
				
				AboutLabel = new JLabel("About");
				AboutLabel.setBounds(403, 40, 118, 40);
				panel.add(AboutLabel);
				AboutLabel.setFont(HeaderFont.deriveFont(Font.BOLD, 18));
				
				ContactUsLabel = new JLabel("Contact Us");
				ContactUsLabel.setBounds(516, 40, 118, 40);
				panel.add(ContactUsLabel);
				ContactUsLabel.setFont(HeaderFont.deriveFont(Font.BOLD, 18));
	}

	    private void displayData() {
	        StringBuilder sb = new StringBuilder();
	        for (String item : data) {
	            sb.append(item);
	            sb.append("\n");
	        }
	    }
	    
	    private void exportData() {
	    	
	        String filePath = "C:\\Users\\Admin\\eclipse-workspace\\OwnersData";
	        String fileName = JOptionPane.showInputDialog(ownerframe, "Enter file name:");
	        if (fileName == null || fileName.trim().isEmpty()) {
	            JOptionPane.showMessageDialog(ownerframe, "File name is empty or canceled.");
	            return;
	        }

	        File file = new File(filePath, fileName + ".txt");

	        try {
	            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
	            writer.write("Name:");
	            writer.write(nameLabel.getText());
	            writer.newLine();
	            writer.write("Phone Number: ");
	            writer.write(phoneLabel.getText());
	            writer.newLine();
	            writer.write("Address: " + adressLabel.getText());
	            writer.write(adressLabel.getText());
	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	   private void importData() {
		        
			    String fileName = JOptionPane.showInputDialog(ownerframe, "Enter file name:");

			    if (fileName == null || fileName.trim().isEmpty()) {
			        JOptionPane.showMessageDialog(ownerframe, "File name is empty or canceled.");
			        return;
			    }
			    String folderPath = "C:\\Users\\Admin\\eclipse-workspace\\OwnersData";
			    String filePath = folderPath + "\\" + fileName + ".txt";
			    File file = new File(filePath);

			    if (!file.exists()) {
			        JOptionPane.showMessageDialog(ownerframe, "File does not exist.");
			        return;
			    }

			    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			        String name = reader.readLine();
			        String phone = reader.readLine();
			        String address = reader.readLine();
			        
			        // Set the imported data to the corresponding components
			        nameLabel.setText(name);
			        phoneLabel.setText(phone);
			        adressLabel.setText(address);

			        JOptionPane.showMessageDialog(ownerframe, "Data imported successfully.");
			    } catch (IOException e) {
			        e.printStackTrace();
			        JOptionPane.showMessageDialog(ownerframe, "Error occurred while importing data.");
			    }
			}
}


	

