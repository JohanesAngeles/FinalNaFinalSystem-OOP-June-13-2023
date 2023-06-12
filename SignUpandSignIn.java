import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.io.*;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import javax.swing.JLayeredPane;
import java.awt.SystemColor;


public class SignUpandSignIn extends JFrame {

	JFrame signupframe;
	private File file;
	private JLayeredPane layeredPane;
	private JButton SignInPanelButton;
	private JButton SignUpPanelBotton;
	private JLabel Logo;
	private JPanel SignUpPanel;
	private JButton signUpButton;
	private JPasswordField passwordFieldSIgnUp;
	private JTextField emailFieldSignUp;
	private JTextField contacttextfield;
	private JTextField fullname;
	private JLabel PasswordLabelSignUp;
	private JLabel EmailLAbelSignUp;
	private JLabel ContactsNoLabelSignUp;
	private JLabel NameLabelSignUp;
	private JPanel SignInPanel;
	private JButton SignInButton;
	private JPasswordField passwordFieldLogin;
	private JTextField EmailFieldLogin;
	private JLabel passwordLabelLogin;
	private JLabel EmailLAbelLogin;
	private JLabel LoginAccountLabel;
	private JLabel WelcomeLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpandSignIn window = new SignUpandSignIn();
					window.signupframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public void switchPanels(JPanel panel) {
	    layeredPane.removeAll();
	    layeredPane.add(panel);
	    layeredPane.repaint();
	    layeredPane.revalidate();
	}


	
	
	public SignUpandSignIn() {

		initialize();
	}

	public JTextField getFullname() {
		return fullname;
	}

	public void setFullname(JTextField fullname) {
		this.fullname = fullname;
	}

	public JTextField getEmailtxtfield() {
		return emailFieldSignUp;
	}

	public void setEmailtxtfield(JTextField emailtxtfield) {
		this.emailFieldSignUp = emailtxtfield;
	}

	public JPasswordField getPasswordsignin() {
		return passwordFieldSIgnUp;
	}

	public void setPasswordsignin(JPasswordField passwordsignin) {
		this.passwordFieldSIgnUp = passwordsignin;
	}

	public JTextField getContacttextfield() {
		return contacttextfield;
	}

	public void setContacttextfield(JTextField contacttextfield) {
		this.contacttextfield = contacttextfield;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		signupframe = new JFrame();
		signupframe.setTitle("Login and Sign Up");
		signupframe.setBounds(100, 100, 1250, 870);
		signupframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		signupframe.getContentPane().setBackground(new Color(109, 169, 228));
		signupframe.getContentPane().setLayout(null);
		file = new File("user.txt");
		Color originalColor = Color.WHITE;

		Font buttonFont = null;
		try {
			buttonFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\NunitoSans_7pt_Condensed-Bold.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(buttonFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		Font fieldsFont = null;
		try {
			fieldsFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Bold.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(fieldsFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}

		Font LabelsFont = null;
		try {
			LabelsFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\NunitoSans_7pt_Condensed-Bold.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(LabelsFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(80, 240, 453, 501);
		signupframe.getContentPane().add(layeredPane);
		
		SignUpPanel = new JPanel();
		SignUpPanel.setLayout(null);
		SignUpPanel.setBackground(new Color(255, 255, 255));
		SignUpPanel.setBounds(0, 0, 453, 500);
		layeredPane.add(SignUpPanel, Integer.valueOf(0));
		
		signUpButton = new JButton("Sign Up");
		signUpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Fullname = fullname.getText();
				String contactno = contacttextfield.getText();
				String Email = emailFieldSignUp.getText();
				String password = new String(passwordFieldSIgnUp.getPassword());

				if (fullname.getText().isEmpty()) {
					fullname.setBackground(Color.RED);
					int option = JOptionPane.showOptionDialog(SignUpPanel, "Please enter the Full Name.", "Error",
							JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, null, null);
					if (option == JOptionPane.OK_OPTION) {
						fullname.setBackground(Color.WHITE);
					}
				} else {
					fullname.setBackground(Color.WHITE);
				}

				if (contacttextfield.getText().isEmpty()) {

					contacttextfield.setBackground(Color.RED);
					int option = JOptionPane.showOptionDialog(SignUpPanel, "Please enter the Contact Number.", "Error",
							JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, null, null);
					if (option == JOptionPane.OK_OPTION) {
						contacttextfield.setBackground(Color.WHITE);
					}
				} else {
					contacttextfield.setBackground(Color.WHITE);

				}

				// Check if any of the text fields are empty
				if (!Email.contains("@gmail.com") && !Email.contains("@yahoo.com") && !Email.contains("@outlook.com")) {
					emailFieldSignUp.setBackground(Color.RED);
				
					int option = JOptionPane.showOptionDialog(SignUpPanel, "Please enter the Email.", "Error",
							JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, null, null);
					emailFieldSignUp.setBackground(Color.RED);
					if (option == JOptionPane.OK_OPTION) {
						emailFieldSignUp.setBackground(Color.WHITE);

					} else {
						emailFieldSignUp.setBackground(Color.WHITE);

					}

					if (passwordFieldSIgnUp.getPassword().length == 0) {

						passwordFieldSIgnUp.setBackground(Color.RED);
						int option2 = JOptionPane.showOptionDialog(SignUpPanel, "Please enter the Password.", "Error",
								JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, null, null);
						if (option2 == JOptionPane.OK_OPTION) {
							passwordFieldSIgnUp.setBackground(Color.WHITE);
						}
					} else {
						passwordFieldSIgnUp.setBackground(Color.WHITE);
					}

				} else if (Fullname.isEmpty() || contactno.isEmpty() || Email.isEmpty()|| password.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please fill in all fields.", "Registration Error",
							JOptionPane.ERROR_MESSAGE);

				} else {
					try {
						FileWriter writer = new FileWriter(file, true);
						writer.write(Email + ":" + password + "\n");
						writer.close();
						JOptionPane.showMessageDialog(null, "Registration successful.", "Registration Success",
								JOptionPane.INFORMATION_MESSAGE);

					} catch (IOException ex) {
						JOptionPane.showMessageDialog(null, "Error registering user.", "Registration Error",
								JOptionPane.ERROR_MESSAGE);

					}

				}
				
				
			}
		});
		signUpButton.setForeground(Color.WHITE);
		signUpButton.setFont( buttonFont.deriveFont(Font.BOLD, 15));
		signUpButton.setBackground(new Color(19, 0, 90));
		signUpButton.setBounds(54, 352, 340, 37);
		SignUpPanel.add(signUpButton);
		
		
		passwordFieldSIgnUp = new JPasswordField();
		passwordFieldSIgnUp.setFont(new Font("Zen Maru Gothic", Font.BOLD, 13));
		passwordFieldSIgnUp.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		passwordFieldSIgnUp.setBackground(new Color(236, 233, 233));
		passwordFieldSIgnUp.setAlignmentY(0.0f);
		passwordFieldSIgnUp.setBounds(54, 310, 340, 31);
		SignUpPanel.add(passwordFieldSIgnUp);
		
		emailFieldSignUp = new JTextField();
		emailFieldSignUp.setFont(new Font("Zen Maru Gothic", Font.BOLD, 13));
		emailFieldSignUp.setColumns(10);
		emailFieldSignUp.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		emailFieldSignUp.setBackground(new Color(236, 233, 233));
		emailFieldSignUp.setBounds(54, 257, 340, 31);
		SignUpPanel.add(emailFieldSignUp);
		
		contacttextfield = new JTextField();
		contacttextfield.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
						char c = e.getKeyChar();

						if (!Character.isDigit(c)) {
							// Consume non-digit characters
							e.consume();
							return;
						}
						String currentText = contacttextfield.getText();

						if (currentText.length() >= 11) {
							// Consume input if the text length exceeds the limit
							e.consume();
							return;
						}
						if (currentText.isEmpty() && c != '0') {
							// Consume input if the first character is not '0'
							e.consume();
						}
					}
				});
				
				
		contacttextfield.setFont(new Font("Zen Maru Gothic", Font.BOLD, 13));
		contacttextfield.setColumns(10);
		contacttextfield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		contacttextfield.setBackground(new Color(236, 233, 233));
		contacttextfield.setBounds(54, 204, 340, 31);
		SignUpPanel.add(contacttextfield);
		
		fullname = new JTextField();
		fullname.setFont(new Font("Zen Maru Gothic", Font.BOLD, 13));
		fullname.setColumns(10);
		fullname.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		fullname.setBackground(new Color(236, 233, 233));
		fullname.setBounds(54, 151, 340, 31);
		SignUpPanel.add(fullname);
		
		
		
		
		
		PasswordLabelSignUp = new JLabel("Password:");
		PasswordLabelSignUp.setFont(LabelsFont.deriveFont(Font.BOLD, 15));
		PasswordLabelSignUp.setBounds(54, 287, 101, 25);
		SignUpPanel.add(PasswordLabelSignUp);
		
		EmailLAbelSignUp = new JLabel("Email: ");
		EmailLAbelSignUp.setFont(LabelsFont.deriveFont(Font.BOLD, 15));
		EmailLAbelSignUp.setBounds(54, 233, 101, 25);
		SignUpPanel.add(EmailLAbelSignUp);
		
		ContactsNoLabelSignUp = new JLabel("Contact Number: ");
		ContactsNoLabelSignUp.setFont(LabelsFont.deriveFont(Font.BOLD, 15));
		ContactsNoLabelSignUp.setBounds(54, 182, 157, 25);
		SignUpPanel.add(ContactsNoLabelSignUp);
		
		NameLabelSignUp = new JLabel("Name: ");
		NameLabelSignUp.setFont(LabelsFont.deriveFont(Font.BOLD, 15));
		NameLabelSignUp.setBounds(54, 126, 101, 25);
		SignUpPanel.add(NameLabelSignUp);
		
		
		Font CreateAccountFont = null;
		try {
			CreateAccountFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\PTSans-Bold.ttf"));
	    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		ge.registerFont(CreateAccountFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}
		
		JLabel CreateAnAccountLabel = new JLabel("Create an account.");
		CreateAnAccountLabel.setForeground(new Color(19, 0, 90));
		CreateAnAccountLabel.setFont(CreateAccountFont.deriveFont(Font.PLAIN, 40));
		CreateAnAccountLabel.setBounds(67, 64, 327, 37);
		SignUpPanel.add(CreateAnAccountLabel);
		
		JLabel footerSignUp = new JLabel("");
		footerSignUp.setIcon(new ImageIcon(SignUpandSignIn.class.getResource("/images/DogsandCatsFooter.png")));
		footerSignUp.setBounds(10, 303, 433, 197);
		SignUpPanel.add(footerSignUp);
		
		SignInPanel = new JPanel();
		SignInPanel.setLayout(null);
		SignInPanel.setBackground(new Color(255, 255, 255));
		SignInPanel.setBounds(0, 0, 453, 500);
		layeredPane.add(SignInPanel, Integer.valueOf(1));
		
		passwordFieldLogin = new JPasswordField();
		passwordFieldLogin.setFont(new Font("Zen Maru Gothic Medium", Font.PLAIN, 15));
		passwordFieldLogin.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		passwordFieldLogin.setBackground(new Color(236, 233, 233));
		passwordFieldLogin.setBounds(54, 267, 340, 31);
		SignInPanel.add(passwordFieldLogin);
		
		EmailFieldLogin = new JTextField();
		EmailFieldLogin.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
		EmailFieldLogin.setFont(new Font("Zen Maru Gothic Medium", Font.PLAIN, 15));
		EmailFieldLogin.setColumns(10);
		EmailFieldLogin.setBackground(new Color(236, 233, 233));
		EmailFieldLogin.setBounds(54, 214, 340, 31);
		SignInPanel.add(EmailFieldLogin);
		
		
		
		
        
		passwordLabelLogin = new JLabel("Password:");
		passwordLabelLogin.setFont(LabelsFont.deriveFont(Font.PLAIN, 15));
		passwordLabelLogin.setBounds(54, 242, 101, 25);
		SignInPanel.add(passwordLabelLogin);
		
		EmailLAbelLogin = new JLabel("Email: ");
		EmailLAbelLogin.setFont(LabelsFont.deriveFont(Font.PLAIN, 15));
		EmailLAbelLogin.setBounds(54, 189, 101, 25);
		SignInPanel.add(EmailLAbelLogin);
		
		
		Font LogInTitleFont = null;
		try {
			LogInTitleFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\PTSans-Bold.ttf"));
	    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		ge.registerFont(LogInTitleFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}
		
		LoginAccountLabel = new JLabel("Sign in to your account.");
		LoginAccountLabel.setForeground(new Color(19, 0, 90));
		LoginAccountLabel.setFont(LogInTitleFont.deriveFont(Font.PLAIN, 24));
		LoginAccountLabel.setBounds(100, 118, 259, 31);
		SignInPanel.add(LoginAccountLabel);
		
		WelcomeLabel = new JLabel("Welcome!");
		WelcomeLabel.setFont(LogInTitleFont.deriveFont(Font.PLAIN, 50));
		WelcomeLabel.setForeground(new Color(19, 0, 90));
		WelcomeLabel.setBounds(118, 83, 224, 37);
		SignInPanel.add(WelcomeLabel);
		
		SignInButton = new JButton("Sign In");
		SignInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 String Email;
                 String password;
                 Email = EmailFieldLogin.getText();
                 password = passwordFieldLogin.getText();
                 if (isValidLogin(Email, password)) {
                     JOptionPane.showMessageDialog(null, "Login Successful");
                     OwnerHomepage window = new OwnerHomepage();
                     window.ownerhomepage.setVisible(true);
                     signupframe.dispose();
                 } else {
                     JOptionPane.showMessageDialog(null, "Incorrect username. Please try again.");
                 }
                 
             }
			
			        private boolean isValidLogin(String Email, String password) {
					 try {
					     FileReader reader = new FileReader("user.txt");
					     BufferedReader bufferedReader = new BufferedReader(reader);
					     String line;
					     while ((line = bufferedReader.readLine()) != null) {
					         String[] parts = line.split(":");
					         if (parts[0].equals(Email) && parts[1].equals(password)) {
					             bufferedReader.close();
					             return true;
					         }
					     }
					     bufferedReader.close();
					 } catch (IOException click) {
					     click.printStackTrace();
					 }
					 return false;
					}
         });
		

		    

						
		SignInButton.setForeground(Color.WHITE);
		SignInButton.setFont( buttonFont.deriveFont(Font.BOLD, 15));
		SignInButton.setBackground(new Color(19, 0, 90));
		SignInButton.setBounds(54, 309, 340, 37);
		SignInPanel.add(SignInButton);
		
		JLabel FooterLogIn = new JLabel("");
		FooterLogIn.setIcon(new ImageIcon(SignUpandSignIn.class.getResource("/images/DogsandCatsFooter.png")));
		FooterLogIn.setBounds(10, 303, 433, 197);
		SignInPanel.add(FooterLogIn);
																		
																		
		Font PanelFont = null;
		try {
		PanelFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Medium.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(PanelFont);
			} catch (FontFormatException | IOException e) {
			e.printStackTrace();
			}
																		
		Font LogInAccountandCreateAccountLabelsFont = null;
		try {
		LogInAccountandCreateAccountLabelsFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\PatuaOne-Regular.ttf"));
	    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		ge.registerFont(LogInAccountandCreateAccountLabelsFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}
		
		
		
		SignInPanelButton = new JButton("Sign In");
		SignInPanelButton .setFont( buttonFont.deriveFont(Font.BOLD, 15));
	    SignInPanelButton.setBorderPainted(false);
		SignInPanelButton.setBorder(null);
		SignInPanelButton.setBackground(Color.WHITE);
		SignInPanelButton.addActionListener(new ActionListener() {
		 public void actionPerformed(ActionEvent e) {
																				
			Color customColor = new Color(173, 228, 219);
				switchPanels(SignInPanel);
		    SignInPanelButton.setBackground(customColor);
		    SignUpPanelBotton.setBackground(originalColor);
																				
	}
});
		SignInPanelButton.setBounds(357, 208, 89, 34);
	    signupframe.getContentPane().add(SignInPanelButton);	
	    
	    
	    SignUpPanelBotton = new JButton("Sign Up");
	    SignUpPanelBotton .setFont( buttonFont.deriveFont(Font.BOLD, 15));
		SignUpPanelBotton.setBorderPainted(false);
	    SignUpPanelBotton.setBorder(null);
	    SignUpPanelBotton.setBackground(Color.WHITE);
		SignUpPanelBotton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
																				
	      Color customColor = new Color(173, 228, 219);
		  switchPanels(SignUpPanel);
		  SignUpPanelBotton.setBackground(customColor);
		  SignInPanelButton.setBackground(originalColor);
																				
     }
});
		SignUpPanelBotton.setBounds(444, 208, 89, 34);
		signupframe.getContentPane().add(SignUpPanelBotton);
																		
	    Logo = new JLabel("");
		Logo.setIcon(new ImageIcon(SignUpandSignIn.class.getResource("/images/SignUpAndSignInAnimationBg.gif")));
	    Logo.setBounds(0, 0, 1234, 831);
	    signupframe.getContentPane().add(Logo);

		Font CreateAcoountLabelFont = null;
		try {
			CreateAcoountLabelFont = Font.createFont(Font.TRUETYPE_FONT, new File(
					"C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Bold.ttf"));
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(CreateAcoountLabelFont);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("PERSONAL.txt", true));
			writer.write(fullname + "," + contacttextfield + "," + emailFieldSignUp + "," + passwordFieldSIgnUp + "\n");
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error saving user data.");
		}
	}
}
	

	
	
