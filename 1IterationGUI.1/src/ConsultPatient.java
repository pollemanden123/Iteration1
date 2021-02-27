import javax.swing.*;

public class ConsultPatient {

    public JPanel createContentPane(){

        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);

        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(null);
        titlePanel.setLocation(0,60);
        titlePanel.setSize(300, 0);
        totalGUI.add(titlePanel);

        JLabel introLabel = new JLabel("Velkommen til CoronaNet!");
        introLabel.setLocation(-15,10);
        introLabel.setSize(200, 20);
        introLabel.setHorizontalAlignment(0);
        totalGUI.add(introLabel);

        JLabel selLabel = new JLabel("Følgende data kan tilgås:");
        selLabel.setLocation(-15,30);
        selLabel.setSize(195, 20);
        selLabel.setHorizontalAlignment(0);
        totalGUI.add(selLabel);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        buttonPanel.setLocation(5, 80);
        buttonPanel.setSize(250, 70);
        totalGUI.add(buttonPanel);

        JButton dataButton = new JButton("Patientdata");
        dataButton.setLocation(0, 0);
        dataButton.setSize(110, 30);
        buttonPanel.add(dataButton);

        JButton geoButton = new JButton("Geolokation");
        geoButton.setLocation(120, 0);
        geoButton.setSize(110, 30);
        buttonPanel.add(geoButton);

        JButton sensButton = new JButton("Sensordata");
        sensButton.setLocation(5, 40);
        sensButton.setSize(220, 30);
        buttonPanel.add(sensButton);

        totalGUI.setOpaque(true);
        return totalGUI;
    }
    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("CoronaNet - Konsultation");

        //Create and set up the content pane.
        ConsultPatient demo = new ConsultPatient();
        frame.setContentPane(demo.createContentPane());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 200);
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
