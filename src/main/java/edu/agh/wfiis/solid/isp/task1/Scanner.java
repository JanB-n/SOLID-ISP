package edu.agh.wfiis.solid.isp.task1;

import edu.agh.wfiis.solid.isp.task1.OfficeDevice.Scanning;

class Scanner implements Scanning, Operable {
    @Override
    public String scan() {
        String scannedContent = "Scanned content from Scanner.";
        System.out.println("Scanning document...");
        return scannedContent;
    }
    @Override
    public void run(OfficeData officeData) {
        String scannedContent = scan();
        System.out.println("Scanned content: " + scannedContent);
    }
}

