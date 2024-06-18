import biblio.Date;
import biblio.Dimension;
import biblio.Livre;
import projectManager.Project;
import projectManager.Status;
import projectManager.Task;

public class Main {
    public static void main(String[] args) {
        Dimension dim1 = new Dimension(11, 8.5f);
        Dimension dim2 = new Dimension();
        Date d1 = new Date(2023,(byte)11,(byte)14);
        Livre livre1 = new Livre ("000111", "Le long silence", "Hares", "Pablo",
                (short) 167, new Dimension(17.4f, 12.1f), d1);
        System.out.println(dim1);
        System.out.println(dim2);
        System.out.println(livre1);
        System.out.println(livre1.reference());
        System.out.println(Livre.getDatePubPlusAncienne());
        System.out.println(Livre.getDatePubPlusRecente());
        System.out.println(new Date().estEgale(new Date(2024,(byte)6,(byte)17)));
        System.out.println(new Date().equals(new Date(2024,(byte)6,(byte)17)));

        Project project1 = new Project();
        Project project2 = new Project(5);
        System.out.println(project1);
        System.out.println(project2);
        Task task1 = new Task();
        Task task2 = new Task("Task 2 ", 8, 2);
        Task task3 = new Task("Task 3 ", 4, 3);
        Task task4 = new Task("Task 4 ", 2, 1);
        Task task5 = new Task("Task 5 ", 1, 3);
        project1.addTask(task1);
        project1.addTask(task2);
        project2.addTask(task3);
        project2.addTask(task4);
        project2.addTask(task5);
        task2.setStatus(Status.IN_PROGRESS);
        project1.setStatus(Status.IN_PROGRESS);
        task5.setStatus(Status.DONE);
        project2.setStatus(Status.IN_PROGRESS);
        System.out.println(project1);
        System.out.println(project2);
        project1.showTasks();
        project2.showTasks();
    }
}