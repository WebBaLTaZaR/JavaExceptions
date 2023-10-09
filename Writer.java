package HomeWork;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void createWriterFile() {
        try (FileWriter fWriter = new FileWriter(View.inputData[0])) {
            for (int i = 0; i < View.inputData.length; i++) {
                fWriter.write(View.inputData[i] + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
