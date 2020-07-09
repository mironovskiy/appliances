package by.epamtc.task.appliance;

public class Oven {
    private String powerConsumption;
    private String weight;
    private String capacity;
    private String depth;
    private String height;
    private String width;

    public Oven(String powerConsumption, String weight, String capacity, String depth, String height, String width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Oven{" +
                "powerConsumption='" + powerConsumption + '\'' +
                ", weight='" + weight + '\'' +
                ", capacity='" + capacity + '\'' +
                ", depth='" + depth + '\'' +
                ", height='" + height + '\'' +
                ", width='" + width + '\'' +
                '}';
    }

}
