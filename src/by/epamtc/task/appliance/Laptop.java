package by.epamtc.task.appliance;

public class Laptop {
    private String batteryCapacity;
    private String os;
    private String memoryRom;
    private String systemMemory;
    private String cpu;
    private String displayInchs;

    public Laptop(String batteryCapacity, String os, String memoryRom, String systemMemory, String cpu, String displayInchs) {
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInchs = displayInchs;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity='" + batteryCapacity + '\'' +
                ", os='" + os + '\'' +
                ", memoryRom='" + memoryRom + '\'' +
                ", systemMemory='" + systemMemory + '\'' +
                ", cpu='" + cpu + '\'' +
                ", displayInchs='" + displayInchs + '\'' +
                '}';
    }
}
