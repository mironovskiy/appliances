package by.epamtc.task.appliance;

public class TabletPC {
    private String batteryCapacity;
    private String displayInches;
    private String memoryRom;
    private String flashMemoryCapacity;
    private String color;

    public TabletPC(String batteryCapacity, String displayInches, String memoryRom, String flashMemoryCapacity, String color) {
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "batteryCapacity='" + batteryCapacity + '\'' +
                ", displayInches='" + displayInches + '\'' +
                ", memoryRom='" + memoryRom + '\'' +
                ", flashMemoryCapacity='" + flashMemoryCapacity + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
