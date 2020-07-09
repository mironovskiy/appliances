package by.epamtc.task.main;

import by.epamtc.task.reader.ApplianceReader;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        ApplianceReader applianceReader = new ApplianceReader();
        List<Object> appliances = applianceReader.findAppliance("VacuumCleaner", "WAND_TYPE", "all-in-one");

        for (int i = 0; i < appliances.size(); i++) {
            System.out.println(appliances.get(i).toString());
        }
    }
}
