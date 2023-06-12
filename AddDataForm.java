import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.io.File;
import java.io.IOException;
import javax.swing.JPanel;

public class AddDataForm {
    private JFrame frame;
    private JTextField nameField;
    private JTextField weightField;
    private JTextField medicineField;
    private JTextField conditionField;
    private JTextField allergiesField;
    private KnownConditionandAllergies mainApp;
    private JLabel nameLabel;
    private JLabel weightLabel;
    private JLabel medicineLabel;
    private JLabel conditionLabel;
    private JLabel allergiesLabel;
    private JLabel logo;
    private JLabel inputNewDataLabel;
    private JPanel headerPanel;

    public AddDataForm(KnownConditionandAllergies app) {
        mainApp = app;
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 483, 753);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        Font customFont = loadFont("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\ZenMaruGothic-Black.ttf");
        Font labelFont = customFont.deriveFont(Font.PLAIN, 14); // Customize the font size and style as needed

        nameField = new JTextField();
        nameField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        nameField.setBackground(new Color(232, 237, 236));
        nameField.setBounds(54, 246, 352, 40);
        nameField.setFont(labelFont);
        frame.getContentPane().add(nameField);
        nameField.setColumns(10);

        weightField = new JTextField();
        weightField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        weightField.setBackground(new Color(232, 237, 236));
        weightField.setBounds(54, 309, 352, 40);
        weightField.setFont(labelFont);
        frame.getContentPane().add(weightField);
        weightField.setColumns(10);

        medicineField = new JTextField();
        medicineField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        medicineField.setBackground(new Color(232, 237, 236));
        medicineField.setBounds(54, 375, 352, 40);
        medicineField.setFont(labelFont);
        frame.getContentPane().add(medicineField);
        medicineField.setColumns(10);

        conditionField = new JTextField();
        conditionField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        conditionField.setBackground(new Color(232, 237, 236));
        conditionField.setBounds(54, 440, 352, 40);
        conditionField.setFont(labelFont);
        frame.getContentPane().add(conditionField);
        conditionField.setColumns(10);

        allergiesField = new JTextField();
        allergiesField.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        allergiesField.setBackground(new Color(232, 237, 236));
        allergiesField.setBounds(54, 506, 352, 40);
        allergiesField.setFont(labelFont);
        frame.getContentPane().add(allergiesField);
        allergiesField.setColumns(10);

        JButton addDataButton = new JButton("Input all");
        addDataButton.setForeground(new Color(255, 255, 255));
        addDataButton.setBackground(new Color(19, 0, 90));
        addDataButton.setBounds(54, 588, 170, 40);
        addDataButton.setFont(labelFont);
        frame.getContentPane().add(addDataButton);
        addDataButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String weight = weightField.getText();
                String medicine = medicineField.getText();
                String condition = conditionField.getText();
                String allergies = allergiesField.getText();

                mainApp.addInfoFromForm(name, weight, medicine, condition, allergies);
                clearFields();
                frame.dispose();
            }
        });

        JButton clearButton = new JButton("Clear Data");
        clearButton.setBackground(new Color(246, 186, 111));
        clearButton.setForeground(new Color(0, 0, 0));
        clearButton.setBounds(234, 588, 170, 40);
        clearButton.setFont(labelFont);
        frame.getContentPane().add(clearButton);

        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(54, 218, 106, 25);
        nameLabel.setFont(labelFont); // Set the custom font
        frame.getContentPane().add(nameLabel);

        weightLabel = new JLabel("Weight: ");
        weightLabel.setBounds(54, 284, 106, 25);
        weightLabel.setFont(labelFont); // Set the custom font
        frame.getContentPane().add(weightLabel);

        medicineLabel = new JLabel("Medicine: ");
        medicineLabel.setBounds(54, 350, 106, 25);
        medicineLabel.setFont(labelFont); // Set the custom font
        frame.getContentPane().add(medicineLabel);

        conditionLabel = new JLabel("Condition: ");
        conditionLabel.setBounds(54, 415, 106, 25);
        conditionLabel.setFont(labelFont); // Set the custom font
        frame.getContentPane().add(conditionLabel);

        allergiesLabel = new JLabel("Allergies: ");
        allergiesLabel.setBounds(54, 481, 106, 25);
        allergiesLabel.setFont(labelFont); // Set the custom font
        frame.getContentPane().add(allergiesLabel);

        Font inputFont = loadFont("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\PatuaOne-Regular.ttf");
        
        headerPanel = new JPanel();
        headerPanel.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(19, 0, 90)));
        headerPanel.setBackground(new Color(109, 169, 228));
        headerPanel.setBounds(0, 0, 467, 118);
        frame.getContentPane().add(headerPanel);
        headerPanel.setLayout(null);
        
                logo = new JLabel("");
                logo.setBounds(10, 21, 192, 73);
                headerPanel.add(logo);
                logo.setIcon(new ImageIcon(AddDataForm.class.getResource("/images/pawFileLogo.png")));
                inputNewDataLabel = new JLabel("Input new data.");
                inputNewDataLabel.setBounds(234, 29, 211, 50);
                headerPanel.add(inputNewDataLabel);
                inputNewDataLabel.setForeground(new Color(19, 0, 90));
                inputNewDataLabel.setFont((inputFont.deriveFont(Font.PLAIN, 28)));

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });
    }

    private Font loadFont(String fontPath) {
        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, new File(fontPath));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);
            return font;
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void clearFields() {
        nameField.setText("");
        weightField.setText("");
        medicineField.setText("");
        conditionField.setText("");
        allergiesField.setText("");
    }

    public void show() {
        frame.setVisible(true);
    }
}
