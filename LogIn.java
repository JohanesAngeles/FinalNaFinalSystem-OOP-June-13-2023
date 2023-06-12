import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;

public class LogIn {
    JFrame loginframe;
    private JTextField emailtextField;
    private JPasswordField passwordField;
    private JButton signInButton;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LogIn window = new LogIn();
                    window.loginframe.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public LogIn() {
        initialize();
    }

    private void initialize() {
        loginframe = new JFrame();
        loginframe.getContentPane().setBackground(new Color(173, 228, 219));
        loginframe.setBounds(100, 100, 1250, 600);
        loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginframe.getContentPane().setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(19, 0, 90)));
        panel.setBounds(46, 76, 448, 448);
        loginframe.getContentPane().add(panel);
        panel.setLayout(null);
        
        Font buttonFont = null;
        try {
        	buttonFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Black.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(buttonFont);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
                signInButton = new JButton("Sign In");
                signInButton.setFont(buttonFont.deriveFont(Font.PLAIN, 14));
                signInButton.setBackground(new Color(19, 0, 90));
                signInButton.setForeground(new Color(255, 255, 255));
                signInButton.setBounds(167, 298, 111, 37);
                panel.add(signInButton);
                
                Font fieldsFont = null;
                try {
                	fieldsFont  = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Regular.ttf"));
                    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                    ge.registerFont(fieldsFont );
                } catch (FontFormatException | IOException e) {
                    e.printStackTrace();
                }
                        passwordField = new JPasswordField();
                        passwordField.setFont(fieldsFont .deriveFont(Font.PLAIN, 13));
                        passwordField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
                        passwordField.setBounds(50, 250, 340, 37);
                        panel.add(passwordField);
                        passwordField.setBackground(new Color(236, 233, 233));
                        
                        emailtextField = new JTextField();
                        emailtextField.setFont(fieldsFont .deriveFont(Font.PLAIN, 13));
                        emailtextField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
                        emailtextField.setBounds(50, 202, 340, 37);
                        panel.add(emailtextField);
                        emailtextField.setBackground(new Color(236, 233, 233));
                        emailtextField.setColumns(10);
                                
                JButton SignUpButton = new JButton("Sign Up");
                SignUpButton.setFont(buttonFont.deriveFont(Font.PLAIN, 14));
                SignUpButton.setForeground(new Color(19, 0, 90));
                SignUpButton.setBackground(new Color(246, 186, 111));
                SignUpButton.setBounds(299, 389, 123, 33);
                panel.add(SignUpButton);
                                        
                JLabel logo = new JLabel("");
                logo.setIcon(new ImageIcon(LogIn.class.getResource("/images/pawFileLogo.png")));
                logo.setBounds(134, 25, 185, 90);
                panel.add(logo);
                
                Font SignInAccountFont = null;
                try {
                	SignInAccountFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\PatuaOne-Regular.ttf"));
                } catch (FontFormatException | IOException e) {
                    e.printStackTrace();
                }
                
                JLabel SignInAccountLabel = new JLabel("Sign in to your account.");
                SignInAccountLabel.setForeground(new Color(19, 0, 90));
                SignInAccountLabel.setFont((SignInAccountFont.deriveFont(Font.BOLD, 24)));
                SignInAccountLabel.setBounds(50, 153, 340, 38);
                panel.add(SignInAccountLabel);
                
                Font DontHaveAccountFont = null;
                try {
                	DontHaveAccountFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Medium.ttf"));
                    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                    ge.registerFont(DontHaveAccountFont);
                } catch (FontFormatException | IOException e) {
                    e.printStackTrace();
                }
                
                JLabel DontHaveAccountLabel = new JLabel("Don’t have an account?");
                DontHaveAccountLabel.setFont((DontHaveAccountFont.deriveFont(Font.BOLD, 14)));
                DontHaveAccountLabel.setBounds(145, 386, 154, 39);
                panel.add(DontHaveAccountLabel);
                SignUpButton.addActionListener(new ActionListener() {
                     public void actionPerformed(ActionEvent e) {
                       SignUp window = new SignUp();
                       window.signupframe.setVisible(true);
                       loginframe.dispose();
              }
        });
                emailtextField.addFocusListener(new FocusAdapter() {
                 @Override
                public void focusGained(FocusEvent e) {
                   if (emailtextField.getText().equals("Email")) {
                     emailtextField.setText("");
             }
         }

                                    @Override
                                    public void focusLost(FocusEvent e) {
                                        if (emailtextField.getText().equals("")) {
                                            emailtextField.setText("Email");
                                        }
                                    }
                                });
                        passwordField.addFocusListener(new FocusAdapter() {
                            @Override
                            public void focusGained(FocusEvent e) {
                                if (passwordField.getText().equals("Passwordd")) {
                                    passwordField.setText("");
                                }
                            }

                            @Override
                            public void focusLost(FocusEvent e) {
                                if (passwordField.getText().equals("")) {
                                    passwordField.setText("Password");
                                }
                            }
                        });
                signInButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String Email;
                        String password;
                        Email = emailtextField.getText();
                        password = passwordField.getText();
                        if (isValidLogin(Email, password)) {
                            JOptionPane.showMessageDialog(null, "Login Successful");
                            Pets window = new Pets();
                            window.petframe.setVisible(true);
                            loginframe.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Incorrect username. Please try again.");
                        }
                    }
                });
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
}
