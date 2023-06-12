import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import java.awt.Color;

public class LoadingPage {

    private JFrame frame;
    private final JProgressBar progressBar = new JProgressBar();
    private final JLabel percentageLabel = new JLabel("0%");
    private final JLabel animatedImageLabel = new JLabel();
    private final JLabel animatedImageLabel2 = new JLabel();
    private int progressValue = 0;
    private Timer timer;
    private int imageXPosition = 30;
    private final JLabel logo = new JLabel("");

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LoadingPage window = new LoadingPage();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public LoadingPage() {
        initialize();
        startProgressBar();
        startImageAnimation();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(19, 0, 90));
        frame.setBounds(100, 100, 1250, 870);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
                animatedImageLabel.setBounds(140, 561, 159, 100);
                animatedImageLabel.setIcon(new ImageIcon(LoadingPage.class.getResource("/images/DoggoRunning.gif")));
                frame.getContentPane().add(animatedImageLabel);
        
        animatedImageLabel2.setBounds(912, 537, 159, 100);
        animatedImageLabel2.setIcon(new ImageIcon(LoadingPage.class.getResource("/images/catieeeRunning (2).gif")));
        frame.getContentPane().add(animatedImageLabel2);
        progressBar.setForeground(new Color(173, 228, 219));

        progressBar.setBounds(32, 713, 1170, 31);
        frame.getContentPane().add(progressBar);
        percentageLabel.setForeground(new Color(255, 255, 255));

        percentageLabel.setBounds(576, 648, 112, 27);
        frame.getContentPane().add(percentageLabel);
        ImageIcon animatedImageIcon = new ImageIcon(LoadingPage.class.getResource(""));
        ImageIcon animatedImageIcon2 = new ImageIcon(LoadingPage.class.getResource(""));
        
        logo.setIcon(new ImageIcon(LoadingPage.class.getResource("/images/LoadingLogo.png")));
        logo.setBounds(10, 70, 1170, 567);
        frame.getContentPane().add(logo);
    }

    private void startProgressBar() {
    	
    	 
    	
    	    timer = new Timer(40, event -> {
    	        if (progressValue >= 100) {
    	            timer.stop();
    	            // Do something when the progress is complete
    	        } else {
    	        	
    	        	Font PercentageFont = null;
    	            try {
    	           	 PercentageFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\NunitoSans_7pt_Condensed-ExtraBold.ttf"));
    	                GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    	                ge.registerFont(PercentageFont);
    	            } catch (FontFormatException | IOException e) {
    	                e.printStackTrace();
    	            }
    	            
    	            
    	            progressValue++;
    	            progressBar.setValue(progressValue);
    	            percentageLabel.setText(progressValue + "%");
    	            percentageLabel.setFont(PercentageFont.deriveFont(Font.PLAIN, 18));
    	            moveImage();
    	        }
    	    });
    	    timer.start();
    	    
    	    Font PawFont = null;
            try {
            	PawFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\eclipse-workspace\\MainSystemOOP\\src\\fonts\\NunitoSans_7pt_Condensed-ExtraBold.ttf"));
                GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                ge.registerFont(PawFont);
            } catch (FontFormatException | IOException e) {
                e.printStackTrace();
            }
            
    	    JLabel pawLabel = new JLabel("Give your pets the care they deserve, one record at a time......\r\n");
    	    pawLabel.setForeground(new Color(255, 255, 255));
    	    pawLabel.setFont(PawFont.deriveFont(Font.PLAIN, 18));
    	    pawLabel.setBounds(350, 675, 541, 27);
    	    frame.getContentPane().add(pawLabel);
    	}


    private void moveImage() {
        int progressBarWidth = progressBar.getWidth();
        int maxImageXPosition = progressBarWidth + progressBar.getX() - animatedImageLabel.getWidth() - 5;
        int currentImageXPosition = (int) ((progressValue / 100.0) * maxImageXPosition);
        animatedImageLabel.setLocation(currentImageXPosition, animatedImageLabel.getY());
        animatedImageLabel2.setLocation(currentImageXPosition, animatedImageLabel2.getY());
    }

    private void startImageAnimation() {
        Timer imageTimer1 = new Timer(100, event -> {
            int progressBarWidth = progressBar.getWidth();
            int maxImageXPosition = progressBar.getX() + progressBarWidth - animatedImageLabel.getWidth();
            int currentImageXPosition = (int) ((progressValue / 100.0) * maxImageXPosition);
            animatedImageLabel.setLocation(currentImageXPosition, animatedImageLabel.getY());
        });
        imageTimer1.setInitialDelay(0); // Start the first image animation immediately
        imageTimer1.start();
        
        Timer imageTimer2 = new Timer(100, event -> {
            int progressBarWidth = progressBar.getWidth();
            int maxImageXPosition = progressBar.getX() + progressBarWidth - animatedImageLabel2.getWidth();
            int currentImageXPosition = (int) ((progressValue / 100.0) * maxImageXPosition);
            animatedImageLabel2.setLocation(currentImageXPosition, animatedImageLabel2.getY());
        });
        imageTimer2.setInitialDelay(500); // Start the second image animation after a delay of 500 milliseconds
        imageTimer2.start();
    }
}
