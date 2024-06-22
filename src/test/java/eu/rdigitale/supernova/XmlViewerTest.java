package eu.rdigitale.supernova;

import org.junit.Test;

public class XmlViewerTest {
    @Test
    public void testMain() {
        var args = new String[] { 
            "../DOC/Fatture_Emesse/Ricevute_SdI/registrate/IT01234567890_12001.xml", 
            "../DOC/Fatture_Emesse/Ricevute_SdI/registrate/fatturapa_v1.2.xsl" };
        XmlViewer.main(args);
    }
}
