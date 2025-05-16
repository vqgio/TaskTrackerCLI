import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TaskStorage {
    //creation of json file
    public static final String FILE_PATH = "tasks.json";

    public static void initializeStorage() {
        File file = new File(FILE_PATH);
        if(!file.exists()) {
            try {
                Files.write(Paths.get(FILE_PATH), "[]".getBytes());
                System.out.println(FILE_PATH + " has been created");
            } catch (IOException e) {
                System.err.println("error while creating file" + e.getMessage());
            }
        }
    }
    public static void saveTasks(String jsonData) {
        try {
            Files.write(Paths.get("tasks.json"), jsonData.getBytes());
        } catch (IOException e) {
            System.err.println("Error saving tasks" + e.getMessage());
        }
    }
    public static String loadTasks() {
        try {
            return Files.readString(Paths.get("tasks.json"));
        } catch (IOException e) {
            System.err.println("error while reading tasks" + e.getMessage());
            return "[]"; //default empty
        }
    }
}
