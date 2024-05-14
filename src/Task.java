package src;

public class Task {
    private String description;
    private int id;

    public Task (int id, String description) {
        this.description = description;
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

}
