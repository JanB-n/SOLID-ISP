package edu.agh.wfiis.solid.isp.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {

    private final Printer printer = new Printer();


    @Test
    void testPrinterPrint() {
        assertDoesNotThrow(() -> printer.print("Test document"));
    }
}
