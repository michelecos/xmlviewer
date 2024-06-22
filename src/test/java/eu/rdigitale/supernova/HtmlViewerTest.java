package eu.rdigitale.supernova;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

import static org.junit.Assert.*;

@Slf4j
public class HtmlViewerTest {

    @Test
    public void testShow() throws InterruptedException {
        // Test file path
        String filePath = "../DOC/test.html";
        HtmlViewer.show(filePath);
        log.info("HtmlViewerTest.testShow() done");
    }
}