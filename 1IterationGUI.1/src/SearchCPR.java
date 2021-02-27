import javax.swing.*;

public class SearchCPR {

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

        JLabel cprLabel = new JLabel("Indsæt CPR:");
        cprLabel.setLocation(-5,30);
        cprLabel.setSize(100, 20);
        cprLabel.setHorizontalAlignment(0);
        totalGUI.add(cprLabel);

        JPanel textPanel = new JPanel();
        textPanel.setLayout(null);
        textPanel.setLocation(0,50);
        textPanel.setSize(250,20);
        totalGUI.add(textPanel);

        JTextArea searchText = new JTextArea();
        searchText.setLocation(50,70);
        searchText.setSize(125, 20);
        totalGUI.add(searchText);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        buttonPanel.setLocation(0, 80);
        buttonPanel.setSize(250, 70);
        totalGUI.add(buttonPanel);

        JButton searchButton = new JButton("Søg");
        searchButton.setLocation(75, 40);
        searchButton.setSize(75, 30);
        buttonPanel.add(searchButton);

        totalGUI.setOpaque(true);
        return totalGUI;
    }
    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("CoronaNet - Konsultation");

        //Create and set up the content pane.
        SearchCPR demo = new SearchCPR();
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
