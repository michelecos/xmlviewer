package eu.rdigitale.supernova;

import java.io.File;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XmlToHtmlConverter {
    public static void convertXmlToHtml(File xmlFile, File xsltFile, File outputHtmlFile) throws TransformerException   {
        TransformerFactory factory = TransformerFactory.newInstance();
        StreamSource xsltStream = new StreamSource(xsltFile);
        Transformer transformer = factory.newTransformer(xsltStream);

        StreamResult result = new StreamResult(outputHtmlFile);
        transformer.transform(new StreamSource(xmlFile), result);
    }
}
