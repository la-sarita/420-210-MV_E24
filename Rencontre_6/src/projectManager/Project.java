package projectManager;

public class Project {
    private Task[] tasks;
    private Status status;
    private int nbTasks = 0;

    public Project() {
        this(10);
    }

    public Project(int capacity){
        status = Status.NOT_STARTED;
        tasks = new Task[capacity];
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void addTask(Task task){
        if(nbTasks < tasks.length){
            tasks[nbTasks] = task;
            nbTasks++;
        }
    }

    public void showTasks(){
        for(int i = 0; i < nbTasks; i++){
            System.out.println(tasks[i] + "\n==========================\n");
        }
    }

    public int getNbTasks(){
        return nbTasks;
    }

    public int getCapacity(){
        return tasks.length;
    }

    @Override
    public String toString() {
        return "This project is : " + status +
                " | contains : " + nbTasks + " / " + getCapacity() + " tasks";
    }
}
