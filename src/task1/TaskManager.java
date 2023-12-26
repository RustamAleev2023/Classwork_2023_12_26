package task1;

import java.util.ArrayList;

public class TaskManager {
//    private task1.Task task;
    private ArrayList<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask (Task task){
        tasks.add(task);
    }

    public void deleteTask(Task task){
        tasks.remove(task);
    }

    public void updateTask(Task updatingTask, Status status){
        updatingTask.setStatus(status);
    }

    public void info(){
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}
