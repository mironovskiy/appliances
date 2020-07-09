package by.epamtc.task.main;

import by.epamtc.task.parser.Parser;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Parser parser = new Parser();
        List<Object> appliances = parser.findAppliance("VacuumCleaner", "WAND_TYPE", "all-in-one");

        for (int i = 0; i < appliances.size(); i++) {
            System.out.println(appliances.get(i).toString());
        }
    }
}
