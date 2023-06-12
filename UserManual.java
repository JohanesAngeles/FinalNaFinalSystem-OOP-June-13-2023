import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserManual {
	
	private JPanel MenuPanel;
	
     
    public static void main(String[] args) {
    	UserManual aboutUs = new UserManual();
        aboutUs.body();
    	
    	
    }
    private void body() {
    	
        JFrame frmAboutUs = new JFrame("Scroll Multiple Images Example");
        frmAboutUs.setTitle("About Us");
        frmAboutUs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmAboutUs.setSize(1250, 870);

        // Create a panel to hold the images
        JPanel panel = new JPanel();
        panel.setBounds(new Rectangle(0, 0, 0, 0));
        panel.setBackground(new Color(255, 255, 255));
        panel.setLayout(null);
        
        MenuPanel = new JPanel();
        MenuPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        MenuPanel.setBackground(new Color(255, 255, 255));
        MenuPanel.setBounds(959, 84, 197, 195);
        MenuPanel.setVisible(false);
        panel.add(MenuPanel);
        MenuPanel.setLayout(null);
        
        JButton MyProfileButton = new JButton("My Profile");
        MyProfileButton.setBackground(new Color(255, 255, 255));
        MyProfileButton.setHorizontalAlignment(JButton.LEFT);
        MyProfileButton.setIcon(new ImageIcon(UserManual.class.getResource("/images/OwnersProfileSign.png")));
        MyProfileButton.setBounds(10, 32, 177, 38);
        MenuPanel.add(MyProfileButton);
        
        JButton UserSManualButton = new JButton("User's Manual");
        UserSManualButton.setBackground(new Color(255, 255, 255));
        UserSManualButton.setHorizontalAlignment(JButton.LEFT);
        UserSManualButton.setIcon(new ImageIcon(UserManual.class.getResource("/images/UserManualSign.png")));
        UserSManualButton.setBounds(10, 81, 177, 38);
        MenuPanel.add(UserSManualButton);
        
        JButton SignOutButton = new JButton("Sign Out");
        SignOutButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		
			    int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to sign out?", 
			    		"Confirmation", JOptionPane.YES_NO_OPTION);
                if (choice == JOptionPane.YES_OPTION) {
 
                
                	frmAboutUs.dispose();
                    
                }	
        		
        	}
        });
        SignOutButton.setBackground(new Color(255, 255, 255));
        SignOutButton.setHorizontalAlignment(JButton.LEFT);
        SignOutButton.setIcon(new ImageIcon(UserManual.class.getResource("/images/SigoutSign.png")));
        SignOutButton.setBounds(10, 130, 177, 38);
        MenuPanel.add(SignOutButton);
        
        JPanel UserManualPanel = new JPanel();
        UserManualPanel.setBackground(new Color(255, 255, 255));
        UserManualPanel.setBounds(0, 120, 1236, 2859);
        panel.add(UserManualPanel);
        UserManualPanel.setLayout(null);
        
        JLabel LabelUsersManual = new JLabel("");
        LabelUsersManual.setIcon(new ImageIcon(UserManual.class.getResource("/images/UsersManualLabel.png")));
        LabelUsersManual.setBounds(36, -19, 1137, 2743);
        UserManualPanel.add(LabelUsersManual);
  

        Font LabelsFont = null;
        try {
        	LabelsFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\NunitoSans_7pt_Condensed-SemiBold.ttf"));
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
        
      
 

        // Create a scroll pane and add the panel to it
        panel.setPreferredSize(new Dimension(1200, 2859));
        JScrollPane scrollPane = new JScrollPane(panel);
        
        JPanel HeaderPanel = new JPanel();
        HeaderPanel.setBorder(null);
        HeaderPanel.setBackground(new Color(19, 0, 90));
        HeaderPanel.setBounds(0, 0, 1215, 119);
        panel.add(HeaderPanel);
        HeaderPanel.setLayout(null);
        
        JLabel Logo = new JLabel("");
        Logo.setIcon(new ImageIcon(UserManual.class.getResource("/images/SYSTEMLOGO 1.png")));
        Logo.setBounds(10, 21, 171, 87);
        HeaderPanel.add(Logo);
        
        JLabel HomeLabel = new JLabel("Home");
        HomeLabel.setFont(LabelsFont.deriveFont(Font.PLAIN, 18));
        HomeLabel.setForeground(new Color(255, 255, 255));
        HomeLabel.setBounds(274, 51, 118, 14);
        HeaderPanel.add(HomeLabel);
        
        JLabel AboutLabel = new JLabel("About");
        AboutLabel.setFont(LabelsFont.deriveFont(Font.PLAIN, 18));
        AboutLabel.setForeground(new Color(255, 255, 255));
        AboutLabel.setBounds(394, 51, 118, 14);
        HeaderPanel.add(AboutLabel);
        
        JLabel ContactUsLabel = new JLabel("Contact Us");
        ContactUsLabel.setFont(LabelsFont.deriveFont(Font.PLAIN, 18));
        ContactUsLabel.setForeground(new Color(255, 255, 255));
        ContactUsLabel.setBounds(516, 51, 118, 14);
        HeaderPanel.add(ContactUsLabel);
        
        JButton MenuButton = new JButton("");
        MenuButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		boolean isMenuPanelVisible = MenuPanel.isVisible();
                MenuPanel.setVisible(!isMenuPanelVisible);
        		
        		
        	}
        });
        MenuButton.setBackground(new Color(19, 0, 90));
        MenuButton.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(19, 0, 90)));
        MenuButton.setBorderPainted(false);
        MenuButton.setIcon(new ImageIcon(UserManual.class.getResource("/images/MenuButton.png")));
        MenuButton.setBounds(990, 30, 135, 54);
        HeaderPanel.add(MenuButton);
        
        Font LabelsInAccountFont = null;
        try {
        	LabelsInAccountFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\NunitoSans_7pt_Condensed-Medium.ttf"));
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        
        scrollPane.getVerticalScrollBar().setUI(new CustomScrollbarUI());

        // Add the scroll pane to the frame's content pane
        frmAboutUs.getContentPane().add(scrollPane);

        frmAboutUs.setVisible(true);
    }

    public static class CustomScrollbarUI extends BasicScrollBarUI {
        @Override
        protected void configureScrollBarColors() {
            // Configure scrollbar colors here
            thumbColor = new Color(246, 186, 111); // Color of the thumb
            trackColor = new Color(240, 240, 240); // Color of the track
            setThumbHighlightColor(Color.YELLOW);
        }

        @Override
        protected JButton createDecreaseButton(int orientation) {
            return createZeroButton();
        }

        @Override
        protected JButton createIncreaseButton(int orientation) {
            return createZeroButton();
        }

        private JButton createZeroButton() {
            JButton button = new JButton();
            button.setPreferredSize(new Dimension(0, 0));
            button.setMinimumSize(new Dimension(0, 0));
            button.setMaximumSize(new Dimension(0, 0));
            return button;
        }
    }

	public static void setThumbHighlightColor(Color yellow) {
		// TODO Auto-generated method stub
		
	}
}
