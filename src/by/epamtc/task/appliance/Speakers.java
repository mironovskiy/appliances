package by.epamtc.task.appliance;

public class Speakers {
    private String powerConsumption;
    private String numberOfSpeakers;
    private String frequencyRange;
    private String cordLength;

    public Speakers(String powerConsumption, String numberOfSpeakers, String frequencyRange, String cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption='" + powerConsumption + '\'' +
                ", numberOfSpeakers='" + numberOfSpeakers + '\'' +
                ", frequencyRange='" + frequencyRange + '\'' +
                ", cordLength='" + cordLength + '\'' +
                '}';
    }
}
