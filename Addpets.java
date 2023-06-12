import java.awt.EventQueue;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JComboBox;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.*;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.MatteBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.DefaultComboBoxModel;

public class Addpets extends JFrame {

	JFrame addpetframe;
	private JTextField petnamefield;

	private JTextField petagefield;

	private JTextField petbreedfield;
	private JTextField colortextfield;
	private JTextField birthdaytextfield;
	private JComboBox<String> petgenderfield, pettypefield;
	private JLabel Logo;
	private JLabel InpuDataLabel;
	private JLabel colorLAbel;
	private JLabel breedLabel;
	private JLabel sexLabel;
	private JLabel AgeLabel;
	private JLabel bdayLabel;
	private JLabel nameLabel;
	private JButton inputButton;
	private JButton ClearButton;
	private JPanel panel;
	private JButton choosepet;
	private JTextField microchiptextfield;
	private JTextField registerednamefield;
	private JLabel filloutlbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addpets window = new Addpets();
					window.addpetframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Addpets() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		addpetframe = new JFrame();
		addpetframe.setBounds(100, 100, 830, 797);
		addpetframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		addpetframe.getContentPane().setBackground(new Color(240, 240, 240));
		addpetframe.getContentPane().setLayout(null);

		
		// Create a new JTextField for entering birthday information
		birthdaytextfield = new JTextField();
		birthdaytextfield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(82, 82, 82)));
		//birthdaytextfield.setFont((FieldsFont.deriveFont(Font.BOLD, 13)));
		birthdaytextfield.setColumns(10);
		birthdaytextfield.setBackground(new Color(232, 237, 236));
		birthdaytextfield.setBounds(276, 464, 296, 38);
		addpetframe.getContentPane().add(birthdaytextfield);
		birthdaytextfield.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calculateAge();
			}
		});
		// This JTextField for entering pet name information
		petnamefield = new JTextField();
		petnamefield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(82, 82, 82)));
		//petnamefield.setFont((FieldsFont.deriveFont(Font.BOLD, 13)));
		petnamefield.setBackground(new Color(232, 237, 236));
		petnamefield.setBounds(75, 303, 382, 36);
		addpetframe.getContentPane().add(petnamefield);
		petnamefield.setColumns(10);
		
		petagefield = new JTextField();
		petagefield.setEditable(false);
		petagefield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(82, 82, 82)));
		//petagefield.setFont((FieldsFont.deriveFont(Font.BOLD, 13)));
		petagefield.setBackground(new Color(232, 237, 236));
		petagefield.setBounds(582, 464, 182, 38);
		addpetframe.getContentPane().add(petagefield);
		petagefield.setColumns(10);

		petgenderfield = new JComboBox<String>();
		// This JTextField for entering pet gender information
		petgenderfield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(82, 82, 82)));
		//petgenderfield.setFont((FieldsFont.deriveFont(Font.BOLD, 13)));
		petgenderfield.setBackground(new Color(232, 236, 237));
		petgenderfield.setBounds(75, 465, 182, 36);
		petgenderfield.addItem("Male");
		petgenderfield.addItem("Female");
		addpetframe.getContentPane().add(petgenderfield);
		// This JTextField for entering pet breed information
		petbreedfield = new JTextField();
		petbreedfield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(82, 82, 82)));
		//petbreedfield.setFont((FieldsFont.deriveFont(Font.BOLD, 13)));
		petbreedfield.setBackground(new Color(232, 237, 236));
		petbreedfield.setBounds(349, 531, 415, 38);
		addpetframe.getContentPane().add(petbreedfield);
		petbreedfield.setColumns(10);
		// This JTextField for entering pet color information
		colortextfield = new JTextField();
		colortextfield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(82, 82, 82)));
		//colortextfield.setFont((FieldsFont.deriveFont(Font.BOLD, 13)));
		colortextfield.setBackground(new Color(232, 237, 236));
		colortextfield.setBounds(426, 381, 338, 38);
		addpetframe.getContentPane().add(colortextfield);
		colortextfield.setColumns(10);


		colorLAbel = new JLabel("Color");
		colorLAbel.setForeground(new Color(19, 0, 90));
		//colorLAbel.setFont((LabelsFont.deriveFont(Font.BOLD, 14)));
		colorLAbel.setBounds(426, 358, 127, 21);
		addpetframe.getContentPane().add(colorLAbel);

		breedLabel = new JLabel("Breed");
		breedLabel.setForeground(new Color(19, 0, 90));
		//breedLabel.setFont((LabelsFont.deriveFont(Font.BOLD, 14)));
		breedLabel.setBounds(349, 507, 127, 21);
		addpetframe.getContentPane().add(breedLabel);

		sexLabel = new JLabel("Sex");
		sexLabel.setForeground(new Color(19, 0, 90));
		//sexLabel.setFont((LabelsFont.deriveFont(Font.BOLD, 14)));
		sexLabel.setBounds(75, 442, 127, 21);
		addpetframe.getContentPane().add(sexLabel);

		AgeLabel = new JLabel("Age");
		AgeLabel.setForeground(new Color(19, 0, 90));
		//AgeLabel.setFont((LabelsFont.deriveFont(Font.BOLD, 14)));
		AgeLabel.setBounds(582, 442, 127, 21);
		addpetframe.getContentPane().add(AgeLabel);

		bdayLabel = new JLabel("Date of Birth");
		bdayLabel.setForeground(new Color(19, 0, 90));
		//bdayLabel.setFont((LabelsFont.deriveFont(Font.BOLD, 14)));
		bdayLabel.setBounds(276, 442, 127, 21);
		addpetframe.getContentPane().add(bdayLabel);

		nameLabel = new JLabel("Name");
		nameLabel.setForeground(new Color(19, 0, 90));
		//nameLabel.setFont((LabelsFont.deriveFont(Font.BOLD, 14)));
		nameLabel.setBounds(75, 271, 127, 21);
		addpetframe.getContentPane().add(nameLabel);

		

		inputButton = new JButton("Input all");
		// inputButton.setFont((buttonFont.deriveFont(Font.BOLD, 14)));
		inputButton.setBackground(new Color(19, 0, 90));
		inputButton.setForeground(new Color(255, 255, 255));
		inputButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Set the values in the PetProfile instance

				String petname = petnamefield.getText();
				String petmicrochip = microchiptextfield.getText();
				String petregistered = registerednamefield.getText();
				String petcolor = colortextfield.getText();
				String petgender = petgenderfield.getSelectedItem().toString();
				String petbday = birthdaytextfield.getText();
				String petage = petagefield.getText();
				String pettype = pettypefield.getSelectedItem().toString();
				String petbreed = petbreedfield.getText();
				// Check if any of the input fields are empty
				if (petname.isEmpty() || petmicrochip.isEmpty() || petregistered.isEmpty() || petbday.isEmpty()
				        || petage.isEmpty() || petgender.isEmpty() || pettype.isEmpty() || petbreed.isEmpty()
				        || petcolor.isEmpty()) {
				    // Display an error message if any fields are empty
				    JOptionPane.showMessageDialog(null, "Please fill in all fields.", "Field Error",
				            JOptionPane.ERROR_MESSAGE);
				} else {
				    // Create a new instance of PetProfile
				    PetProfile petwindow = new PetProfile();

				    // Set the text of the display components in the PetProfile window
				    petwindow.nameDisplay.setText(petname);
				    //petwindow.MicrochipDisplay.setText(petmicrochip);
				    //petwindow.registerednameDisplay.setText(petregistered);
				    petwindow.colorDisplay.setText(petcolor);
				    petwindow.genderDisplay.setText(petgender);
				    petwindow.bdayDisplay.setText(petbday);
				    petwindow.ageDisplay.setText(petage);
				    //petwindow.petTypeDisplay.setText(pettype);
				    petwindow.breedDisplay.setText(petbreed);

				    // Set the PetProfile window to be visible
				    petwindow.petProfileFrame.setVisible(true);

				    // Close the addpetframe
				    addpetframe.dispose();
				}

			}
		});
		inputButton.setBounds(445, 613, 284, 49);
		addpetframe.getContentPane().add(inputButton);

		ClearButton = new JButton("Clear Data");
		//ClearButton.setFont((buttonFont.deriveFont(Font.BOLD, 14)));
		ClearButton.setForeground(new Color(19, 0, 90));
		ClearButton.setBackground(new Color(246, 186, 111));
		ClearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if the user click Clear Data all fields will be clear
				clearFields();

			}
		});
		ClearButton.setBounds(115, 613, 284, 49);
		addpetframe.getContentPane().add(ClearButton);

		panel = new JPanel();
		panel.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(19, 0, 90)));
		panel.setBackground(new Color(21, 1, 90));
		panel.setBounds(0, 0, 1233, 116);
		addpetframe.getContentPane().add(panel);
		panel.setLayout(null);

		Logo = new JLabel("");
		Logo.setBounds(320, 17, 190, 96);
		panel.add(Logo);
		Logo.setIcon(new ImageIcon(Addpets.class.getResource("/images/SYSTEMLOGO 1.png")));

		InpuDataLabel = new JLabel("Add a Pet Record");
		InpuDataLabel.setBounds(268, 150, 319, 40);
		addpetframe.getContentPane().add(InpuDataLabel);
		InpuDataLabel.setForeground(new Color(0, 0, 0));
		InpuDataLabel.setFont(new Font("Dialog", Font.PLAIN, 40));
		// This JTextField for entering pet microchip information
		microchiptextfield = new JTextField();
		microchiptextfield.setFont(new Font("Zen Maru Gothic", Font.BOLD, 13));
		microchiptextfield.setColumns(10);
		microchiptextfield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(82, 82, 82)));
		microchiptextfield.setBackground(new Color(232, 237, 236));
		microchiptextfield.setBounds(476, 304, 288, 36);
		addpetframe.getContentPane().add(microchiptextfield);
		// This JTextField for entering pet registeredname information
		registerednamefield = new JTextField();
		registerednamefield.setFont(new Font("Zen Maru Gothic", Font.BOLD, 13));
		registerednamefield.setColumns(10);
		registerednamefield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(82, 82, 82)));
		registerednamefield.setBackground(new Color(232, 237, 236));
		registerednamefield.setBounds(75, 381, 341, 38);
		addpetframe.getContentPane().add(registerednamefield);

		JLabel lblRegisteredName = new JLabel("Registered Name");
		lblRegisteredName.setForeground(new Color(19, 0, 90));
		lblRegisteredName.setFont(new Font("Zen Maru Gothic Medium", Font.BOLD, 14));
		lblRegisteredName.setBounds(75, 350, 127, 21);
		addpetframe.getContentPane().add(lblRegisteredName);

		JLabel lblMicrochipRegistrationNumber = new JLabel("Microchip/ Registration Number");
		lblMicrochipRegistrationNumber.setForeground(new Color(0, 0, 0));
		lblMicrochipRegistrationNumber.setFont(new Font("Zen Maru Gothic Medium", Font.BOLD, 14));
		lblMicrochipRegistrationNumber.setBounds(476, 277, 253, 21);
		addpetframe.getContentPane().add(lblMicrochipRegistrationNumber);
		// This JComboBox for entering pet pet type information
		pettypefield = new JComboBox<String>();
		pettypefield.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(82, 82, 82)));
		pettypefield.setBounds(75, 534, 253, 36);
		pettypefield.addItem("Dog");
		pettypefield.addItem("Cat");
		addpetframe.getContentPane().add(pettypefield);

		JLabel PetTypefield = new JLabel("Pet Type");
		PetTypefield.setForeground(new Color(19, 0, 90));
		PetTypefield.setFont(new Font("Zen Maru Gothic Medium", Font.BOLD, 14));
		PetTypefield.setBounds(75, 513, 127, 21);
		addpetframe.getContentPane().add(PetTypefield);

		filloutlbl = new JLabel("Fill out all of the information required below.");
		filloutlbl.setFont(new Font("Dialog", Font.BOLD, 20));
		filloutlbl.setBounds(205, 198, 439, 23);
		addpetframe.getContentPane().add(filloutlbl);

	}

	private void clearFields() {
		// Clear the text fields
		petnamefield.setText("");
		microchiptextfield.setText("");
		registerednamefield.setText("");
		colortextfield.setText("");
		petgenderfield.setSelectedIndex(0);
		birthdaytextfield.setText("");
		petagefield.setText("");
		pettypefield.setSelectedIndex(0);
		petbreedfield.setText("");

	}

	private void calculateAge() {
		// Get the text from the birthdaytextfield
		String birthdayText = birthdaytextfield.getText();

		// Create a SimpleDateFormat to parse the date in the format "yyyy-MM-dd"
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		try {
		    // Parse the birthday text into a Date object
		    Date birthday = dateFormat.parse(birthdayText);

		    // Convert the Date to LocalDate
		    Instant instant = birthday.toInstant();
		    ZoneId zone = ZoneId.systemDefault();
		    LocalDate birthDate = instant.atZone(zone).toLocalDate();

		    // Get the current date
		    LocalDate today = LocalDate.now();

		    // Calculate the age using Period
		    Period period = Period.between(birthDate, today);
		    int age = period.getYears();

		    // Set the calculated age in the petagefield text field
		    petagefield.setText(String.valueOf(age));
		} catch (Exception e) {
		    // Handle invalid date format or other exceptions
		    petagefield.setText("Invalid Date");
		}

	}
}