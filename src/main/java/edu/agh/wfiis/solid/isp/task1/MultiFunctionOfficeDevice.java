package edu.agh.wfiis.solid.isp.task1;

import edu.agh.wfiis.solid.isp.task1.OfficeDevice.Copying;
import edu.agh.wfiis.solid.isp.task1.OfficeDevice.Faxing;
import edu.agh.wfiis.solid.isp.task1.OfficeDevice.Printing;
import edu.agh.wfiis.solid.isp.task1.OfficeDevice.Scanning;

class MultiFunctionOfficeDevice implements Printing, Scanning, Copying, Faxing, Operable {
    @Override
    public void print(String document) {
        System.out.println("MultiFunctionDevice printing: " + document);
    }

    @Override
    public String scan() {
        String scannedContent = "Scanned content from MultiFunctionDevice";
        System.out.println("MultiFunctionDevice scanning...");
        return scannedContent;
    }

    @Override
    public void copy(String document) {
        System.out.println("MultiFunctionDevice copying: " + document);
    }

    @Override
    public void fax(String document) {
        System.out.println("MultiFunctionDevice sending fax: " + document);
    }

    @Override
    public void run(OfficeData officeData) {
        print(officeData.getToPrint());
        String scannedContent = scan();
        System.out.println("Scanned content: " + scannedContent);
        copy(officeData.getToCopy());
        fax(officeData.getToFax());
    }
}
