package eu.rdigitale.supernova;

import java.awt.BorderLayout;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class HtmlViewer {
    public static void show(String filePath) {
        // Create a new JFrame
        JFrame frame = new JFrame("HTML Viewer");

        // Add the close button to the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Create a JEditorPane to display the HTML content
        JEditorPane editorPane = new JEditorPane();
        editorPane.setEditable(false);

        // Load the HTML file into the JEditorPane
        try {
            File htmlFile = new File(filePath);
            editorPane.setPage(htmlFile.toURI().toURL());
        } catch (IOException e) {
            e.printStackTrace();
            editorPane.setContentType("text/html");
            editorPane.setText("<html>Could not load HTML content</html>");
        }

        // Add the JEditorPane to a JScrollPane to make it scrollable
        JScrollPane scrollPane = new JScrollPane(editorPane);
        
        // Add the JScrollPane to the JFrame
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        // Make the JFrame visible
        frame.setVisible(true);
        // Create an event loop to keep the frame open until closed
        while (frame.isVisible()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
