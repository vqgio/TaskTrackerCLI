import java.time.LocalDateTime;
import java.util.ArrayList;

public class Task {
    private ArrayList<Task> tasks;
    private int id;
    private String description;
    private String status; //todo, inprogress, done
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Task(ArrayList<Task> tasks, int id,
                String description, String status,
                LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.tasks = tasks;
        this.id = id;
        this.description = description;
        this.status = "todo";
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    public void setDescription(String description) {
        this.description = description;
        this.updatedAt = LocalDateTime.now();
    }
    public void setStatus(String status) {
        this.status = status;
        this.updatedAt = LocalDateTime.now();
    }
}
