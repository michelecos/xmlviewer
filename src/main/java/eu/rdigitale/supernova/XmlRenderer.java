package eu.rdigitale.supernova;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.xml.transform.TransformerException;

import lombok.extern.slf4j.Slf4j;

/**
 * Hello world!
 *
 */
@Slf4j
public class XmlRenderer {
    private String xslStylesheet;
    Properties properties = new Properties();

    public XmlRenderer() throws IOException {
        // Constructor logic goes here
        properties.load(XmlRenderer.class.getClassLoader().getResourceAsStream("xmlrenderer.properties"));
        xslStylesheet = properties.get("xslStylesheet").toString();
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java XmlRenderer arg1 arg2");
            System.exit(1); // Exit the program with an error code
        }

        var xmlFile = new File(args[0]);
        var xslStylesheet = new File(args[1]);
        var outputHtmlFile = new File("output.html");

        log.info("xmlrenderer working on {} with {}", xmlFile, xslStylesheet);

        try {
            XmlToHtmlConverter.convertXmlToHtml(xmlFile, xslStylesheet, outputHtmlFile);
            HtmlViewer.show(outputHtmlFile.getAbsolutePath());
        } catch (TransformerException e) {
            log.error("Errore durante il rendering di XML in HTML: {}", e.getMessage());
        }
    }
}
