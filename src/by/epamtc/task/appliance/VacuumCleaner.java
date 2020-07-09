package by.epamtc.task.appliance;

public class VacuumCleaner {
    private String powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private String motorSpeedRegulation;
    private String cleaningWidth;

    public VacuumCleaner(String powerConsumption, String filterType, String bagType, String wandType, String motorSpeedRegulation, String cleaningWidth) {
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "powerConsumption='" + powerConsumption + '\'' +
                ", filterType='" + filterType + '\'' +
                ", bagType='" + bagType + '\'' +
                ", wandType='" + wandType + '\'' +
                ", motorSpeedRegulation='" + motorSpeedRegulation + '\'' +
                ", cleaningWidth='" + cleaningWidth + '\'' +
                '}';
    }
}
