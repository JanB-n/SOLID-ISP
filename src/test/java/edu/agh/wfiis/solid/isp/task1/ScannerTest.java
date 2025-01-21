package edu.agh.wfiis.solid.isp.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScannerTest {

    private final Scanner underTest = new Scanner();

    @Test
    void testScannerScan() {
        String scannedContent = underTest.scan();
        assertNotNull(scannedContent);
        assertEquals("Scanned content from Scanner.", scannedContent);
    }
}
