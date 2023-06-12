import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;

public class AddDataFormImmunization extends JFrame {
    private JTextField dateTextField;
    private JTextField weightTextField;
    private JTextField againstTextField;
    private JTextField manufacturerTextField;
    private JTextField lotNumberTextField;
    private JTextField veterinarianTextField;
    private JButton submitButton;
    private DefaultTableModel tableModel;
    private JPanel HeaderPanel;
    private JLabel Logo;
    private JLabel GroupOfPets;
    private JButton clearButton;
    private JLabel VeterinarianLabel;
    private JLabel ManufacturerLabel;
    private JLabel AgainstLabel;
    private JLabel LotNumberLAbel;
    private JLabel DateLabel;
    private JLabel WeightkgLabel;
    private JLabel HeaderLAbelImmunizationandDewormingInput;

    public AddDataFormImmunization(DefaultTableModel model) {
        setTitle("Immunizations and Deworming");
        setSize(1023, 835);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
         
        Font fieldsFont = null;
        try {
        	fieldsFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\NunitoSans_7pt_Condensed-Medium.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(fieldsFont);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
        
        
        
        // Create text fields for each column
        dateTextField = new JTextField();
        dateTextField.setFont(fieldsFont.deriveFont(Font.PLAIN, 15));
        dateTextField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(23, 23, 23)));
        dateTextField.setBackground(new Color(240, 240, 240));
        
        weightTextField = new JTextField();
        weightTextField.setFont(fieldsFont.deriveFont(Font.PLAIN, 15));
        weightTextField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        weightTextField.setBackground(new Color(240, 240, 240));
        
        againstTextField = new JTextField();
        againstTextField.setFont(fieldsFont.deriveFont(Font.PLAIN, 15));
        againstTextField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        againstTextField.setBackground(new Color(240, 240, 240));
        
        manufacturerTextField = new JTextField();
        manufacturerTextField.setFont(fieldsFont.deriveFont(Font.PLAIN, 14));
        manufacturerTextField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        manufacturerTextField.setBackground(new Color(240, 240, 240));
        
        lotNumberTextField = new JTextField();
        lotNumberTextField.setFont(fieldsFont.deriveFont(Font.PLAIN, 15));
        lotNumberTextField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        lotNumberTextField.setBackground(new Color(240, 240, 240));
        
        veterinarianTextField = new JTextField();
        veterinarianTextField.setFont(fieldsFont.deriveFont(Font.PLAIN, 15));
        veterinarianTextField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        veterinarianTextField.setBackground(new Color(240, 240, 240));

        // Set the bounds for the text fields
        dateTextField.setBounds(476, 369, 279, 40);
        weightTextField.setBounds(784, 369, 182, 40);
        againstTextField.setBounds(476, 444, 335, 40);
        manufacturerTextField.setBounds(476, 521, 491, 40);
        lotNumberTextField.setBounds(861, 444, 106, 40);
        veterinarianTextField.setBounds(476, 594, 491, 40);

        // Add the text fields to the frame
        getContentPane().add(dateTextField);
        getContentPane().add(weightTextField);
        getContentPane().add(againstTextField);
        getContentPane().add(manufacturerTextField);
        getContentPane().add(lotNumberTextField);
        getContentPane().add(veterinarianTextField);

        // Add KeyListeners to text fields
        addTextFieldKeyListener(dateTextField);
        addTextFieldKeyListener(weightTextField);
        addTextFieldKeyListener(againstTextField);
        addTextFieldKeyListener(manufacturerTextField);
        addTextFieldKeyListener(lotNumberTextField);
        addTextFieldKeyListener(veterinarianTextField);
        Font buttonFont = null;
        try {
        	buttonFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\NunitoSans_7pt_Condensed-Bold.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(buttonFont);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
        
        // Create the submit button
        submitButton = new JButton("Enter all data");
        submitButton.setFont(buttonFont.deriveFont(Font.PLAIN, 20));
        submitButton.setBorder(null);
        submitButton.setForeground(new Color(255, 255, 255));
        submitButton.setBackground(new Color(19, 0, 90));
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Reset text field colors
                resetTextFieldColors();

                // Get the data from the text fields
                String date = dateTextField.getText();
                double weight;
                String against = againstTextField.getText();
                String manufacturer = manufacturerTextField.getText();
                int lotNumber;
                String veterinarian = veterinarianTextField.getText();

                // Validate and parse the weight
                try {
                    weight = Double.parseDouble(weightTextField.getText());
                } catch (NumberFormatException ex) {
                	 JOptionPane.showMessageDialog(AddDataFormImmunization.this,
                             "Invalid input! Please enter a valid number for weight and lot number.",
                             "Data Type Error", JOptionPane.ERROR_MESSAGE);
                    weightTextField.setBackground(Color.RED);
                    return;
                }

                // Validate and parse the lot number
                try {
                    lotNumber = Integer.parseInt(lotNumberTextField.getText());
                } catch (NumberFormatException ex) {
                    lotNumberTextField.setBackground(Color.RED);
                    return;
                }
               
                // Create a new row with the data
                Object[] rowData = {date, weight, against, manufacturer, lotNumber, veterinarian};

                // Add the row to the table model
                model.addRow(rowData);

                // Clear the text fields
                dateTextField.setText("");
                weightTextField.setText("");
                againstTextField.setText("");
                manufacturerTextField.setText("");
                lotNumberTextField.setText("");
                veterinarianTextField.setText("");
               
				dispose();
            }
        });
        submitButton.setBounds(755, 666, 212, 49);
        getContentPane().add(submitButton);
        
        HeaderPanel = new JPanel();
        HeaderPanel.setBackground(new Color(19, 0, 90));
        HeaderPanel.setForeground(new Color(19, 0, 90));
        HeaderPanel.setBounds(0, 0, 1007, 116);
        getContentPane().add(HeaderPanel);
        HeaderPanel.setLayout(null);
        
        Logo = new JLabel("");
        Logo.setIcon(new ImageIcon(AddDataFormImmunization.class.getResource("/images/SYSTEMLOGO 1.png")));
        Logo.setBounds(393, 23, 199, 82);
        HeaderPanel.add(Logo);
        
        GroupOfPets = new JLabel("");
        GroupOfPets.setIcon(new ImageIcon(AddDataFormImmunization.class.getResource("/images/GorupofPEts.png")));
        GroupOfPets.setBounds(0, 103, 534, 682);
        getContentPane().add(GroupOfPets);
        
       
        
        clearButton = new JButton("Clear all data");
        clearButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		dateTextField.setText("");
        		weightTextField.setText("");
        		againstTextField.setText("");
        		manufacturerTextField.setText("");
        		lotNumberTextField.setText("");
        		veterinarianTextField.setText("");
        		
        	}
        });
        clearButton.setFont(buttonFont.deriveFont(Font.PLAIN, 20));
        clearButton.setBorder(null);
        clearButton.setBackground(new Color(246, 186, 111));
        clearButton.setBounds(476, 666, 212, 49);
        getContentPane().add(clearButton);
        
        Font LabelFont = null;
        try {
        	LabelFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\NunitoSans_7pt_Condensed-Bold.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(LabelFont);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
        
        
        VeterinarianLabel = new JLabel("Veterinarian");
        VeterinarianLabel.setFont(LabelFont.deriveFont(Font.PLAIN, 16));
        VeterinarianLabel.setBounds(476, 572, 144, 23);
        getContentPane().add(VeterinarianLabel);
        
        ManufacturerLabel = new JLabel("Manufacturer");
        ManufacturerLabel.setFont(LabelFont.deriveFont(Font.PLAIN, 16));
        ManufacturerLabel.setBounds(476, 496, 144, 23);
        getContentPane().add(ManufacturerLabel);
        
        AgainstLabel = new JLabel("Against");
        AgainstLabel.setFont(LabelFont.deriveFont(Font.PLAIN, 16));
        AgainstLabel.setBounds(476, 420, 144, 23);
        getContentPane().add(AgainstLabel);
        
        LotNumberLAbel = new JLabel("Lot Number");
        LotNumberLAbel.setFont(LabelFont.deriveFont(Font.PLAIN, 16));
        LotNumberLAbel.setBounds(861, 419, 144, 24);
        getContentPane().add(LotNumberLAbel);
        
        DateLabel = new JLabel("Date");
        DateLabel.setFont(LabelFont.deriveFont(Font.PLAIN, 16));
        DateLabel.setBounds(476, 344, 144, 23);
        getContentPane().add(DateLabel);
        
        WeightkgLabel = new JLabel("Weight (Kg)");
        WeightkgLabel.setFont(LabelFont.deriveFont(Font.PLAIN, 16));
        WeightkgLabel.setBounds(784, 344, 144, 23);
        getContentPane().add(WeightkgLabel);
        
        HeaderLAbelImmunizationandDewormingInput = new JLabel("");
        HeaderLAbelImmunizationandDewormingInput.setIcon(new ImageIcon(AddDataFormImmunization.class.getResource("/images/HEaderLabelImmuDeworm.png")));
        HeaderLAbelImmunizationandDewormingInput.setBounds(476, 185, 490, 116);
        getContentPane().add(HeaderLAbelImmunizationandDewormingInput);
    }

    private void addTextFieldKeyListener(JTextField textField) {
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Reset text field color when typing starts
                textField.setBackground(Color.WHITE);
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }

    private void resetTextFieldColors() {
    	    Color lightGray = new Color(240, 240, 240);
    	    dateTextField.setBackground(lightGray);
    	    weightTextField.setBackground(lightGray);
    	    againstTextField.setBackground(lightGray);
    	    manufacturerTextField.setBackground(lightGray);
    	    lotNumberTextField.setBackground(lightGray);
    	    veterinarianTextField.setBackground(lightGray);
    }
}
