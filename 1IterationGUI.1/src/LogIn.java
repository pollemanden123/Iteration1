import javax.swing.*;

public class LogIn {

    public JPanel createContentPane(){

        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);

        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(null);
        titlePanel.setLocation(0,60);
        titlePanel.setSize(200, 0);
        totalGUI.add(titlePanel);

        JLabel introLabel = new JLabel("Adgang til CoronaNet");
        introLabel.setLocation(-15,5);
        introLabel.setSize(170, 20);
        introLabel.setHorizontalAlignment(0);
        totalGUI.add(introLabel);

        JLabel userLabel = new JLabel("Brugernavn: ");
        userLabel.setLocation(-5,30);
        userLabel.setSize(100, 20);
        userLabel.setHorizontalAlignment(0);
        totalGUI.add(userLabel);

        JLabel pswLabel = new JLabel("Adgangskode: ");
        pswLabel.setLocation(0,55);
        pswLabel.setSize(100, 20);
        pswLabel.setHorizontalAlignment(0);
        totalGUI.add(pswLabel);

        JPanel textPanel = new JPanel();
        textPanel.setLayout(null);
        textPanel.setLocation(150,60);
        textPanel.setSize(200,0);
        totalGUI.add(textPanel);

        JTextArea userText = new JTextArea();
        userText.setLocation(150,30);
        userText.setSize(125, 20);
        totalGUI.add(userText);

        JPasswordField pswText = new JPasswordField();
        pswText.setLocation(150,55);
        pswText.setSize(125, 20);
        totalGUI.add(pswText);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        buttonPanel.setLocation(0, 80);
        buttonPanel.setSize(250, 40);
        totalGUI.add(buttonPanel);

        JButton loginButton = new JButton("Log ind");
        loginButton.setLocation(100, 10);
        loginButton.setSize(100, 30);
        buttonPanel.add(loginButton);

        totalGUI.setOpaque(true);
        return totalGUI;
    }
    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("CoronaNet - Login");

        //Create and set up the content pane.
        LogIn demo = new LogIn();
        frame.setContentPane(demo.createContentPane());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 175);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        })
        ;}
}
