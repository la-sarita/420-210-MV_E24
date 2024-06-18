package projectManager;

public class Task {
    private String description;
    private Status status = Status.NOT_STARTED;
    private int duration;
    private int priority;

    public Task(){
        description = "";
        duration = 0;
        priority = -1;
    }

    public Task(String description, int duration, int priority) {
        this.description = description;
        this.duration = duration;
        this.priority = priority;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Description : \t" + description +
                "\nStatus : \t" + status +
                "\nDuration : \t" + duration +
                "\nPriority : \t" + priority;
    }
}
