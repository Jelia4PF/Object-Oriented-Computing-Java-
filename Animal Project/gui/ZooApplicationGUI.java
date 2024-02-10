package gui;
import javax.swing.*;

public class ZooApplicationGUI {
    public static void main(String[] args) {
        // Creating the main window
        JFrame frame = new JFrame("Zoo Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Creating a tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Adding tabs for different sections
        tabbedPane.addTab("Animals", createAnimalsPanel());
        tabbedPane.addTab("Aquatic", createAquaticPanel());
        tabbedPane.addTab("Staff", createstaffPanel()); 

        frame.add(tabbedPane);

        // Display the window
        frame.setVisible(true);
    }

    private static JPanel createAnimalsPanel() {
        // Create panel and components for the Animals tab
        JPanel panel = new JPanel();
        return panel;
    }

    private static JPanel createAquaticPanel() {
        // Panel and components for the Aquatic tab
        JPanel panel = new JPanel();
      
        return panel;
    }

    private static JPanel createstaffPanel() {
       
        JPanel panel = new JPanel();
       
        return panel;
    }

}
