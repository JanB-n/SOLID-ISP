package edu.agh.wfiis.solid.isp.task1;

import java.util.List;

class DeviceClient {

    private static final List<Operable> DEVICES = List.of(
            new Printer(),
            new Scanner(),
            new MultiFunctionOfficeDevice()
    );

    void useDevices(){
        OfficeData officeData = new OfficeData("Document to print", "Document to copy", "Document to fax");
        for (Operable device : DEVICES) {
            System.out.println("Using device: " + device.getClass().getSimpleName());

            device.run(officeData);

            System.out.println("----------------------");
        }
    }
    public static void main(String[] args) {
        var client = new DeviceClient();
        client.useDevices();
    }
}