package task1;

import java.util.concurrent.atomic.AtomicInteger;

public class Task {

    private static AtomicInteger idCounter=new AtomicInteger(0);

    private int id;
    private String name;
   private Status status;

    public Task(String name) {
        this.id = idCounter.addAndGet(1);
        this.name = name;
        this.status = Status.InProgress;
    }

       public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "task1.Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
