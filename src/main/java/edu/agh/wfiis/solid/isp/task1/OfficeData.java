package edu.agh.wfiis.solid.isp.task1;

public class OfficeData {
    private final String toPrint;
    private final String toCopy;
    private final String toFax;

    public OfficeData(String toPrint, String toCopy, String toFax) {
        this.toPrint = toPrint;
        this.toCopy = toCopy;
        this.toFax = toFax;
    }

    public String getToPrint() {
        return toPrint;
    }
    public String getToCopy() {
        return toCopy;
    }
    public String getToFax() {
        return toFax;
    }
}
