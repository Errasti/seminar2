import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileExport {
    public static void exportFile() throws IOException {
        ArrayList<Person> data = PersonData.createPersonData();
        String text = String.valueOf(Person.createStringOfData(data));
        FileWriter writer = new FileWriter("tree.txt");
        writer.write(text);
        writer.flush();
    }
}
