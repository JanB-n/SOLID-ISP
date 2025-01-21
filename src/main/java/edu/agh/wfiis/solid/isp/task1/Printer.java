package edu.agh.wfiis.solid.isp.task1;

import edu.agh.wfiis.solid.isp.task1.OfficeDevice.Printing;

class Printer implements Printing, Operable {
    @Override
    public void print(String document) {
        System.out.println("Printer printing: " + document);
    }
    @Override
    public void run(OfficeData officeData) {
        print(officeData.getToPrint());
    }
}

