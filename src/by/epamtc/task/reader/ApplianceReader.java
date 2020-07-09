package by.epamtc.task.reader;

import by.epamtc.task.parser.Parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApplianceReader {
    private List<Object> appliances = new ArrayList<Object>();

    public List<Object> findAppliance(String nameOfAppliances, String parameterName, String parameterValue) throws IOException {
        String note;
        String parameter = parameterName + "=" + parameterValue;
        BufferedReader bufferedReader = new BufferedReader(new FileReader("appliances_db.txt"));

        while ((note = bufferedReader.readLine()) != null) {
            if ((note.contains(nameOfAppliances) == true) && (note.contains(parameter) == true)){
                Parser parser = new Parser();
                appliances.add(parser.parse(note));
            }
        }

        return appliances;
    }
}
