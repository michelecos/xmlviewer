package eu.rdigitale.supernova;

import java.io.File;

import javax.xml.transform.TransformerException;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

import static org.junit.Assert.*;

@Slf4j
public class XmlToHtmlConverterTest {
    @Test
    public void testConvertXmlToHtml() {
        // Test file paths
        var xmlFilePath = new File("../DOC/Fatture_Emesse/Ricevute_SdI/registrate/IT01234567890_12001.xml");
        var xsltFilePath = new File("../DOC/Fatture_Emesse/Ricevute_SdI/registrate/fatturapa_v1.2.xsl");
        var outputHtmlFilePath = new File("../DOC/Fatture_Emesse/Ricevute_SdI/registrate/fatturapa_v1.2.html");
        try {
            XmlToHtmlConverter.convertXmlToHtml(xmlFilePath, xsltFilePath, outputHtmlFilePath);
        } catch (TransformerException e) {
            log.error("XmlToHtmlConverterTest.testConvertXmlToHtml() failed");
            assertFalse(false);
            e.printStackTrace();
        }
    }
}
