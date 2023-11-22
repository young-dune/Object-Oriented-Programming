abstract class Printer {
    protected String model;
    protected int printedCount;
    protected int availableCount;

    public Printer(String model, int availableCount) {
        this.model = model;
        this.availableCount = availableCount;
    }

    public abstract boolean print();
}

class InkjetPrinter extends Printer {
    public InkjetPrinter(String model, int availableCount) {
        super(model, availableCount);
    }

    @Override
    public boolean print() {
        if (availableCount == 0) {
            System.out.println( model + " " + (printedCount + 1) + "매째 인쇄 실패 - 잉크 부족.");
            return false;
        } else {
            printedCount++;
            availableCount--;
            return true;
        }
    }
}

class LaserPrinter extends Printer {
    public LaserPrinter(String model, int availableCount) {
        super(model, availableCount);
    }

    @Override
    public boolean print() {
        if (availableCount == 0) {
            System.out.println(model + " " + (printedCount + 1) + "매째 인쇄 실패 - 토너 부족.");
            return false;
        } else {
            printedCount++;
            availableCount--;
            return true;
        }
    }
}

public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T720DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);

        while (inkjet.print());
        while (laser.print());
    }
}
