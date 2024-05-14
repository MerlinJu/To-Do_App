package src;

public class Task {
    private String description;
    private int id;
    private String difficulty;

//    Task Constructor
    public Task (int id, String description, String difficulty) {
        this.description = description;
        this.id = id;
        this.difficulty = difficulty;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}