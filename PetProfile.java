import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

public class PetProfile extends JFrame {
    
	
	private ArrayList<String> data;
	JFrame petProfileFrame;
	JLabel nameDisplay, bdayDisplay, ageDisplay, genderDisplay, breedDisplay, colorDisplay;
	private JButton immunizationsdewormingbutton;
	private JButton ConditionAllergies;
	private JButton signoutbttn;
	private JPanel panel;
	private JPanel AgeDisplayPanel;
	private JPanel GenderDisplayPanel;
	private JPanel ColorDisplayPanel;
	private JPanel BdayDiplayPanel;
	private JPanel BreedDisplayPanel;
	private JPanel HeaderPanel;
	private JLabel Logo;
	private JLabel HomeLabel;
	private JLabel AboutLabel;
	private JLabel ContactUsLabel;
	private JLabel petprofiledisplay;
	private JButton SaveDataButton;
	private JButton FindDatabutton;
	private JLabel ageLabel;
	private JLabel GenderLabel;
	private JLabel colorLabel;
	private JLabel bdayLabel;
	private JLabel breedLAbel;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PetProfile window = new PetProfile();
					window.petProfileFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PetProfile() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		petProfileFrame = new JFrame();
		petProfileFrame.setBounds(100, 100, 1250, 600);
		petProfileFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		petProfileFrame.getContentPane().setLayout(null);
        
		Font EditbuttonFont = null;
        try {
        	EditbuttonFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Bold.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(EditbuttonFont);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
        
		JButton editPetProfilebutton = new JButton("Edit Pet Profile");
		editPetProfilebutton.setFont(EditbuttonFont.deriveFont(Font.BOLD, 15));
		editPetProfilebutton.setBackground(new Color(246, 186, 111));
		editPetProfilebutton.setForeground(new Color(19, 0, 90));
		editPetProfilebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Addpets window = new Addpets();
				window.addpetframe.setVisible(true);
				petProfileFrame.dispose();
				

			}
		});

		immunizationsdewormingbutton = new JButton("");
		immunizationsdewormingbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImmunizationsDeworming immunizationsdeworming = new ImmunizationsDeworming();
				immunizationsdeworming.setVisible(true);
				petProfileFrame.dispose();
			}
		});

		ConditionAllergies = new JButton("");
		ConditionAllergies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KnownConditionandAllergies window = new KnownConditionandAllergies();
				window.KnownAllergiesAndConditionframe.setVisible(true);
				petProfileFrame.dispose();
			}
		});

		signoutbttn = new JButton("");
		signoutbttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to sign out?", "Confirmation",
						JOptionPane.YES_NO_OPTION);
				if (choice == JOptionPane.YES_OPTION) {
					petProfileFrame.dispose();
				}
			}
		});
		signoutbttn.setIcon(new ImageIcon(PetProfile.class.getResource("/images/SignoutButton.png")));
		signoutbttn.setBorder(null);
		signoutbttn.setBackground(new Color(109, 169, 229));
		signoutbttn.setBounds(1162, 39, 38, 38);
		petProfileFrame.getContentPane().add(signoutbttn);
		ConditionAllergies.setIcon(new ImageIcon(PetProfile.class.getResource("/images/KnownAllergiesButton.png")));
		ConditionAllergies.setBounds(787, 371, 407, 142);
		petProfileFrame.getContentPane().add(ConditionAllergies);
		immunizationsdewormingbutton.setIcon(new ImageIcon(PetProfile.class.getResource("/images/RegImmunizationButton.png")));
		immunizationsdewormingbutton.setBounds(351, 372, 407, 141);
		petProfileFrame.getContentPane().add(immunizationsdewormingbutton);
		editPetProfilebutton.setIcon(new ImageIcon(PetProfile.class.getResource("/images/editSign.png")));
		editPetProfilebutton.setBounds(64, 513, 265, 31);
		petProfileFrame.getContentPane().add(editPetProfilebutton);

		JButton petprofile1 = new JButton("Edit Pet Picture");
		
			
				
				

				petprofile1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JFileChooser fileChooser = new JFileChooser();
						int option = fileChooser.showOpenDialog(PetProfile.this);
						if (option == JFileChooser.APPROVE_OPTION) {
							File file = fileChooser.getSelectedFile();
							ImageIcon imageIcon = new ImageIcon(file.getPath());
							Image image = imageIcon.getImage().getScaledInstance(246, 270, Image.SCALE_SMOOTH);
							petprofiledisplay.setIcon(new ImageIcon(image));

						}
					}
				});

				

		petprofile1.setFont(EditbuttonFont.deriveFont(Font.BOLD, 15));
		petprofile1.setBounds(65, 511, 265, 28);
		petprofile1.setBackground(new Color(19, 0, 90));
		petprofile1.setForeground(new Color(255, 255, 255));
		
			
		

		petprofile1.setIcon(new ImageIcon(PetProfile.class.getResource("/images/cameraSign.png")));
		petprofile1.setBounds(64, 471, 265, 31);
		petProfileFrame.getContentPane().add(petprofile1);
        
		
		Font nameDisplayFont = null;
        try {
        	nameDisplayFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\PatuaOne-Regular.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(nameDisplayFont);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
        
        
		nameDisplay = new JLabel("");
		nameDisplay.setFont(nameDisplayFont.deriveFont(Font.BOLD, 48));
		nameDisplay.setBorder(null);
		nameDisplay.setBounds(351, 147, 265, 49);
		petProfileFrame.getContentPane().add(nameDisplay);
		
		panel = new JPanel();
		panel.setBackground(new Color(246, 186, 111));
		panel.setBounds(64, 140, 265, 321);
		petProfileFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
				petprofiledisplay = new JLabel("");
				petprofiledisplay.setBounds(10, 11, 246, 270);
				panel.add(petprofiledisplay);
				petprofiledisplay.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
			
				
				
				
				AgeDisplayPanel = new JPanel();
				
				AgeDisplayPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
				AgeDisplayPanel.setBounds(350, 218, 176, 62);
				petProfileFrame.getContentPane().add(AgeDisplayPanel);
				AgeDisplayPanel.setLayout(null);
				   
				
				Font DisplayFont = null;
		        try {
		        	DisplayFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Bold.ttf"));
		            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		            ge.registerFont(DisplayFont);
		        } catch (FontFormatException | IOException e) {
		            e.printStackTrace();
		        }
		        
		        Font DisplayLabelFont = null;
		        try {
		        	DisplayLabelFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Bold.ttf"));
		            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		            ge.registerFont(DisplayLabelFont);
		        } catch (FontFormatException | IOException e) {
		            e.printStackTrace();
		        }
						ageDisplay = new JLabel("");
						ageDisplay.setFont(DisplayFont.deriveFont(Font.BOLD, 20));
						ageDisplay.setBounds(10, 27, 152, 35);
						AgeDisplayPanel.add(ageDisplay);
						ageDisplay.setBorder(null);
						
						ageLabel = new JLabel("Age: ");
						ageLabel.setForeground(new Color(19, 0, 90));
						ageLabel.setFont(DisplayLabelFont.deriveFont(Font.BOLD, 18));
						ageLabel.setBounds(10, 0, 89, 27);
						AgeDisplayPanel.add(ageLabel);
						
						
						GenderDisplayPanel = new JPanel();
						GenderDisplayPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
						GenderDisplayPanel.setBounds(544, 218, 265, 62);
						petProfileFrame.getContentPane().add(GenderDisplayPanel);
						GenderDisplayPanel.setLayout(null);
						
								genderDisplay = new JLabel("");
								genderDisplay.setFont(DisplayFont.deriveFont(Font.BOLD, 20));
								genderDisplay.setBounds(10, 27, 218, 35);
								GenderDisplayPanel.add(genderDisplay);
								genderDisplay.setBorder(null);
								
								GenderLabel = new JLabel("Gender:");
								GenderLabel.setForeground(new Color(19, 0, 90));
								GenderLabel.setFont(DisplayLabelFont.deriveFont(Font.BOLD, 18));
								GenderLabel.setBounds(10, 0, 108, 27);
								GenderDisplayPanel.add(GenderLabel);
								
						
						ColorDisplayPanel = new JPanel();
						ColorDisplayPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
						ColorDisplayPanel.setBounds(835, 218, 360, 62);
						petProfileFrame.getContentPane().add(ColorDisplayPanel);
						ColorDisplayPanel.setLayout(null);
						
								colorDisplay = new JLabel("");						
								colorDisplay.setFont(DisplayFont.deriveFont(Font.BOLD, 20));
								colorDisplay.setBounds(10, 27, 315, 35);
								ColorDisplayPanel.add(colorDisplay);
								colorDisplay.setBorder(null);
								
								colorLabel = new JLabel("Color:");
								colorLabel.setForeground(new Color(19, 0, 90));
								colorLabel.setFont(DisplayLabelFont.deriveFont(Font.BOLD, 18));
								colorLabel.setBounds(10, 0, 80, 27);
								ColorDisplayPanel.add(colorLabel);
								
								
								BdayDiplayPanel = new JPanel();
								BdayDiplayPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
								BdayDiplayPanel.setBounds(351, 298, 363, 62);
								petProfileFrame.getContentPane().add(BdayDiplayPanel);
								BdayDiplayPanel.setLayout(null);
								
										bdayDisplay = new JLabel("");
										bdayDisplay.setFont(DisplayFont.deriveFont(Font.BOLD, 20));
										bdayDisplay.setBounds(10, 27, 335, 35);
										BdayDiplayPanel.add(bdayDisplay);
										bdayDisplay.setBorder(null);
										
										bdayLabel = new JLabel("Birthday:");
										bdayLabel.setForeground(new Color(19, 0, 90));
										bdayLabel.setFont(DisplayLabelFont.deriveFont(Font.BOLD, 18));
										bdayLabel.setBounds(10, 0, 160, 27);
										BdayDiplayPanel.add(bdayLabel);
										
								
								BreedDisplayPanel = new JPanel();
								BreedDisplayPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
								BreedDisplayPanel.setBounds(740, 298, 455, 62);
								petProfileFrame.getContentPane().add(BreedDisplayPanel);
								BreedDisplayPanel.setLayout(null);
								
										breedDisplay = new JLabel("");
										breedDisplay.setFont(DisplayFont.deriveFont(Font.BOLD, 20));
										breedDisplay.setBounds(10, 27, 435, 35);
										BreedDisplayPanel.add(breedDisplay);
										breedDisplay.setBorder(null);
										
										breedLAbel = new JLabel("Breed:");
										breedLAbel.setForeground(new Color(19, 0, 90));
										breedLAbel.setFont(DisplayLabelFont.deriveFont(Font.BOLD, 18));
										breedLAbel.setBounds(10, 0, 146, 27);
										BreedDisplayPanel.add(breedLAbel);
										
										
										HeaderPanel = new JPanel();
										HeaderPanel.setBackground(new Color(109, 169, 228));
										HeaderPanel.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(19, 0, 90)));
										HeaderPanel.setBounds(0, 0, 1234, 115);
										petProfileFrame.getContentPane().add(HeaderPanel);
										HeaderPanel.setLayout(null);
										
										Logo = new JLabel("");
										Logo.setIcon(new ImageIcon(PetProfile.class.getResource("/images/pawFileLogo.png")));
										Logo.setBounds(10, 21, 192, 71);
										HeaderPanel.add(Logo);
										
										Font HeaderFont = null;
						                try {
						                	HeaderFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Regular.ttf"));
						                    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
						                    ge.registerFont(HeaderFont);
						                } catch (FontFormatException | IOException e) {
						                    e.printStackTrace();
						                }
						                
										HomeLabel = new JLabel("Home");
										HomeLabel.setFont(HeaderFont.deriveFont(Font.BOLD, 18));
										HomeLabel.setBounds(290, 41, 118, 27);
										HeaderPanel.add(HomeLabel);
										
										AboutLabel = new JLabel("About");
										AboutLabel.setFont(HeaderFont.deriveFont(Font.BOLD, 18));
										AboutLabel.setBounds(402, 41, 118, 27);
										HeaderPanel.add(AboutLabel);
										
										ContactUsLabel = new JLabel("Contact Us");
										ContactUsLabel.setFont(HeaderFont.deriveFont(Font.BOLD, 18));
										ContactUsLabel.setBounds(530, 41, 118, 27);
										HeaderPanel.add(ContactUsLabel);
										
										
										Font SaveandFindbuttonFont = null;
								        try {
								        	SaveandFindbuttonFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Bold.ttf"));
								            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
								            ge.registerFont(SaveandFindbuttonFont);
								        } catch (FontFormatException | IOException e) {
								            e.printStackTrace();
								        }
										
										
										SaveDataButton = new JButton("Save Your Data");
										SaveDataButton.setFont(SaveandFindbuttonFont.deriveFont(Font.BOLD, 15));
										SaveDataButton.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												
												exportData();
												
											}
										});
										SaveDataButton.setForeground(new Color(19, 0, 90));
										SaveDataButton.setBackground(new Color(246, 186, 111));
										SaveDataButton.setBounds(1019, 177, 175, 31);
										petProfileFrame.getContentPane().add(SaveDataButton);
										
										FindDatabutton = new JButton("Find Your Data");
										FindDatabutton.setFont(SaveandFindbuttonFont.deriveFont(Font.BOLD, 15));
										FindDatabutton.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												
												importData();
												
											}
										});
										FindDatabutton.setForeground(new Color(255, 255, 255));
										FindDatabutton.setBackground(new Color(19, 0, 90));
										FindDatabutton.setBounds(835, 177, 175, 31);
										petProfileFrame.getContentPane().add(FindDatabutton);
		                                getContentPane().setLayout(null);
	}
		                                
		                                private void exportData() {
		                        	    	
		                        	        String filePath = "C:\\Users\\Admin\\eclipse-workspace\\PetsData";
		                        	        String fileName = JOptionPane.showInputDialog(petProfileFrame, "Enter file name:");
		                        	        if (fileName == null || fileName.trim().isEmpty()) {
		                        	            JOptionPane.showMessageDialog(petProfileFrame, "File name is empty or canceled.");
		                        	            return;
		                        	        }

		                        	        File file = new File(filePath, fileName + ".txt");

		                        	        try {
		                        	            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		                        	            
		                        	            writer.write(nameDisplay.getText());
		                        	            writer.newLine();
		                        	            writer.write(ageDisplay .getText());
		                        	            writer.newLine();
		                        	            writer.write(colorDisplay .getText());  
		                        	            writer.newLine();
		                        	            writer.write(bdayDisplay.getText());
		                        	            writer.newLine();
		                        	            writer.write(""+genderDisplay.getText());
		                        	            writer.newLine();
		                        	            writer.write("" + breedDisplay.getText());
		                        	            writer.close();
		                        	            
		                        	        } catch (IOException e) {
		                        	            e.printStackTrace();
		                       }
		                                }          	        
		                        	        
		                        	        private void importData() {
		                        		        
		                        			    String fileName = JOptionPane.showInputDialog(petProfileFrame, "Enter file name:");

		                        			    if (fileName == null || fileName.trim().isEmpty()) {
		                        			        JOptionPane.showMessageDialog(petProfileFrame, "File name is empty or canceled.");
		                        			        return;
		                        			    }
		                        			    String folderPath = "C:\\Users\\Admin\\eclipse-workspace\\PetsData";
		                        			    String filePath = folderPath + "\\" + fileName + ".txt";
		                        			    File file = new File(filePath);

		                        			    if (!file.exists()) {
		                        			        JOptionPane.showMessageDialog(petProfileFrame, "File does not exist.");
		                        			        return;
		                        			    }

		                        			    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
		                        			        String Petname = reader.readLine();
		                        			        String Age= reader.readLine();
		                        			        String Color= reader.readLine();
		                        			        String Birthday= reader.readLine();
		                        			        String Gender= reader.readLine();
		                        			        String Breed= reader.readLine();
		                        			        
		                        			        // Set the imported data to the corresponding components
		                        			        nameDisplay.setText(Petname);
		                        			        ageDisplay.setText(Age);
		                        			        colorDisplay.setText(Color);
		                        			        bdayDisplay.setText(Birthday);
		                        			        genderDisplay.setText(Gender);
		                        			        breedDisplay.setText(Breed);


		                        			        

		                        			        JOptionPane.showMessageDialog(petProfileFrame, "Data imported successfully.");
		                        			    } catch (IOException e) {
		                        			        e.printStackTrace();
		                        			        JOptionPane.showMessageDialog(petProfileFrame, "Error occurred while importing data.");
		                        			    }
		                        	    
         
	}
		                        	        private void displayData() {
		                        		        StringBuilder sb = new StringBuilder();
		                        		        for (String item : data) {
		                        		            sb.append(item);
		                        		            sb.append("\n");
		                        		        }
		                        		    }
		                        	        
}
