class Monitor {
    private int monitorSize;
    private String color;
    private int power;

    public Monitor(int monitorSize, String color, int power) {
        this.monitorSize = monitorSize;
        this.color = color;
        this.power = power;

    }

    public void printInfo() {
        System.out.println("The spec of the monitor");
        System.out.println("Size: " + monitorSize + " inch");
        System.out.println("Color: " + color);
        System.out.println("Power: " + power + "W");
    }
}

class Computer {
    private String cpu;
    private int memory;
    private int hd;
    private String color;
    private int power;

    public Computer(String processor, int memoryGB, int hddCapacity, String color, int power) {
        this.cpu = processor;
        this.memory = memoryGB;
        this.hd = hddCapacity;
        this.color = color;
        this.power = power;
    }


    public void printInfo() {
        System.out.println("The spec of the computer");
        System.out.println("CPU: " + cpu);
        System.out.println("Memory: " + memory + "GB");
        System.out.println("HDD: " + hd + "TB");
        System.out.println("Color: " + color);
        System.out.println("Power: " + power + "W");
    }
}

class PersonalComputer {
    private Computer computer;
    private Monitor monitor;

    public PersonalComputer(Computer computer, Monitor monitor) {
        this.computer = computer;
        this.monitor = monitor;
    }

    public void turnOn() {
        System.out.println("Turning on the computer.");
        System.out.println("Turning on the monitor.");
    }

    public void printInfo() {
        computer.printInfo();
        monitor.printInfo();
    }
}

public class Homework5 {
    public static void main(String[] args) {
        // Create a Monitor
        Monitor monitor = new Monitor(24, "Black", 45);

        // Create a Computer
        Computer computer = new Computer("Core i7", 16, 2, "White", 500);

        // Create a PersonalComputer with the Computer and Monitor
        PersonalComputer personalComputer = new PersonalComputer(computer, monitor);

        // Turn on the PersonalComputer
        personalComputer.turnOn();

        // Print information about the PersonalComputer
        personalComputer.printInfo();
    }
}
