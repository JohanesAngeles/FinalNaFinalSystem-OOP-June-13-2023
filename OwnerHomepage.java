import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OwnerHomepage extends JFrame{

	 JFrame ownerhomepage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OwnerHomepage window = new OwnerHomepage();
					window.ownerhomepage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OwnerHomepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ownerhomepage = new JFrame();
		ownerhomepage.setBounds(100, 100, 1250, 800);
		ownerhomepage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ownerhomepage.getContentPane().setLayout(null);
		
		JButton signout = new JButton("");
		signout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Display a confirmation dialog to the user
				 int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to sign out?", 
				    		"Confirmation", JOptionPane.YES_NO_OPTION);
					// Check if the user clicked the "Yes" option in the confirmation dialog
	                if (choice == JOptionPane.YES_OPTION) {		
	                	//Dispose petframe
	                	ownerhomepage.dispose();		                    
	                }
			
			}
		});
		
		JButton ownerprofilebutton = new JButton("");
		ownerprofilebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ownerprofile window = new Ownerprofile();
				window.ownerframe.setVisible(true);
				ownerhomepage.dispose();
				}
		});
		ownerprofilebutton.setIcon(new ImageIcon(OwnerHomepage.class.getResource("")));
		ownerprofilebutton.setBounds(1010, 123, 172, 37);
		ownerhomepage.getContentPane().add(ownerprofilebutton);
		signout.setBackground(new Color(109, 169, 228));
		signout.setBorder(null);
		signout.setIcon(new ImageIcon(OwnerHomepage.class.getResource("")));
		signout.setBounds(1155, 39, 38, 38);
		ownerhomepage.getContentPane().add(signout);
		
		JButton viewpetprofile = new JButton("");
		viewpetprofile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PetProfile window = new PetProfile();
				window.petProfileFrame.setVisible(true);
				ownerhomepage.dispose();
			}
		});
		viewpetprofile.setIcon(new ImageIcon(OwnerHomepage.class.getResource("")));
		viewpetprofile.setBounds(905, 215, 276, 295);
		ownerhomepage.getContentPane().add(viewpetprofile);
		
		JButton addpetbutton = new JButton("");
		addpetbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Addpets window = new Addpets();
				window.addpetframe.setVisible(true);
				
			}
		});
		addpetbutton.setIcon(new ImageIcon(OwnerHomepage.class.getResource("")));
		addpetbutton.setBounds(603, 215, 276, 295);
		ownerhomepage.getContentPane().add(addpetbutton);
	}
}
