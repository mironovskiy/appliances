package by.epamtc.task.parser;

import by.epamtc.task.entity.*;

public class Parser {
    private String separatorRegEx = "[^\\w\\.\\-]+";

    public Object parse(String note){
        String[] splittedNote = note.split(separatorRegEx);
        Object appliance = new Object();

        switch (splittedNote[0]){
            case "Oven":
                appliance = parseStringToOven(note);
                break;
            case "Laptop":
                appliance = parseStringToLaptop(note);
                break;
            case "Refrigerator":
                appliance = parseStringToRefrigerator(note);
                break;
            case "VacuumCleaner":
                appliance = parseStringToVacuumCleaner(note);
                break;
            case "TabletPC":
                appliance = parseStringToTabletPC(note);
                break;
            case "Speakers":
                appliance = parseStringToSpeakers(note);
                break;
        }
        return appliance;
    }

    private Object parseStringToOven(String string){
        String[] splittedString = string.split(separatorRegEx);
        Oven oven = new Oven(splittedString[2], splittedString[4], splittedString[6], splittedString[8], splittedString[10], splittedString[12]);
        return oven;
    }

    private Object parseStringToLaptop(String string){
        String[] splittedString = string.split(separatorRegEx);
        Laptop laptop = new Laptop(splittedString[2], splittedString[4], splittedString[6], splittedString[8], splittedString[10],splittedString[12]);
        return laptop;
    }

    private Object parseStringToRefrigerator(String string){
        String[] splittedString = string.split(separatorRegEx);
        Refrigerator refrigerator = new Refrigerator(splittedString[2], splittedString[4], splittedString[6], splittedString[8], splittedString[10], splittedString[12]);
        return refrigerator;
    }

    private VacuumCleaner parseStringToVacuumCleaner(String string){
        String[] splittedString = string.split(separatorRegEx);
        VacuumCleaner vacuumCleaner = new VacuumCleaner(splittedString[2], splittedString[4], splittedString[6], splittedString[8], splittedString[10], splittedString[12]);
        return vacuumCleaner;
    }

    private Object parseStringToTabletPC(String string){
        String[] splittedString = string.split(separatorRegEx);
        TabletPC tabletPC = new TabletPC(splittedString[2], splittedString[4], splittedString[6], splittedString[8], splittedString[10]);
        return tabletPC;
    }

    private Object parseStringToSpeakers(String string){
        String[] splittedString = string.split(separatorRegEx);
        Speakers speakers = new Speakers(splittedString[2], splittedString[4], splittedString[6], splittedString[8]);
        return speakers;
    }

}