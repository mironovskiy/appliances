package by.epamtc.task.parser;

import by.epamtc.task.appliance.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parser {
    private List<Object> appliances = new ArrayList<Object>();
    private String separatorRegEx = "[^\\w\\.\\-]+";

    public List<Object> findAppliance(String nameOfAppliances, String parameterName, String parameterValue) throws IOException {
        String note;
        String parameter = parameterName + "=" + parameterValue;
        BufferedReader bufferedReader = new BufferedReader(new FileReader("appliances_db.txt"));

        while ((note = bufferedReader.readLine()) != null) {
            if ((note.contains(nameOfAppliances) == true) && (note.contains(parameter) == true)){
                parse(nameOfAppliances, note);
            }
        }

        return appliances;
    }

    public void parse(String nameOfAppliances, String note){
        switch (nameOfAppliances){
            case "Oven":
                parseStringToOven(note);
                break;
            case "Laptop":
                parseStringToLaptop(note);
                break;
            case "Refrigerator":
                parseStringToRefrigerator(note);
                break;
            case "VacuumCleaner":
                parseStringToVacuumCleaner(note);
                break;
            case "TabletPC":
                parseStringToTabletPC(note);
                break;
            case "Speakers":
                parseStringToSpeakers(note);
                break;
        }
    }

    public void parseStringToOven(String string){
        String[] splittedString = string.split(separatorRegEx);
        Oven oven = new Oven(splittedString[2], splittedString[4], splittedString[6], splittedString[8], splittedString[10], splittedString[12]);
        appliances.add(oven);
    }

    public void parseStringToLaptop(String string){
        String[] splittedString = string.split(separatorRegEx);
        Laptop laptop = new Laptop(splittedString[2], splittedString[4], splittedString[6], splittedString[8], splittedString[10],splittedString[12]);
        appliances.add(laptop);
    }

    public void parseStringToRefrigerator(String string){
        String[] splittedString = string.split(separatorRegEx);
        Refrigerator refrigerator = new Refrigerator(splittedString[2], splittedString[4], splittedString[6], splittedString[8], splittedString[10], splittedString[12]);
        appliances.add(refrigerator);
    }

    public void parseStringToVacuumCleaner(String string){
        String[] splittedString = string.split(separatorRegEx);
        VacuumCleaner vacuumCleaner = new VacuumCleaner(splittedString[2], splittedString[4], splittedString[6], splittedString[8], splittedString[10], splittedString[12]);
        appliances.add(vacuumCleaner);
    }

    public void parseStringToTabletPC(String string){
        String[] splittedString = string.split(separatorRegEx);
        TabletPC tabletPC = new TabletPC(splittedString[2], splittedString[4], splittedString[6], splittedString[8], splittedString[10]);
        appliances.add(tabletPC);
    }

    public void parseStringToSpeakers(String string){
        String[] splittedString = string.split(separatorRegEx);
        Speakers speakers = new Speakers(splittedString[2], splittedString[4], splittedString[6], splittedString[8]);
        appliances.add(speakers);
    }

}