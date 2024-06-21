package eu.rdigitale.supernova;

import javax.swing.*;
import java.io.*;
import java.awt.*;

public class HtmlViewer {
    public static void show(String filePath) {
        // Create a new JFrame
        JFrame frame = new JFrame("HTML Viewer");
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
    }
}
