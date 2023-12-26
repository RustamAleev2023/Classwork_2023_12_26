import task1.Status;
import task1.Task;
import task1.TaskManager;
import task2.Product;
import task2.Store;

public class Main {
    public static void main(String[] args) {
//        task1();
        task2();
    }

    //Task1
//    1. Менеджер задач
//Создайте класс task1.Task с полями: id, название, описание и
//статус (например, "выполнено", "в процессе", "отложено").
//Затем создайте класс task1.TaskManager, который управляет списком
// объектов task1.Task. Реализуйте методы для добавления, удаления,
// обновления и вывода информации о задачах.
    public static void task1() {
        Task task1 = new Task("Task1");
        Task task2 = new Task("task2");
        Task task3 = new Task("Task3");
        Task task4 = new Task("Task4");

        TaskManager taskManager = new TaskManager();
        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);
        taskManager.addTask(task4);
        taskManager.info();
        System.out.println("=============================");
        taskManager.deleteTask(task2);
        taskManager.info();
        System.out.println("=============================");
        taskManager.updateTask(task3, Status.Done);
        taskManager.updateTask(task1, Status.InProgress);
        taskManager.updateTask(task4, Status.Delay);

        taskManager.info();
        System.out.println("=============================");
    }

    //Task2
    //Магазин и товары
    //Создайте класс Product с полями id, название, цена и
    //количество. Затем создайте класс Store, который будет
    //управлять инвентарем товаров. Реализуйте методы для
    //добавления товаров, продажи товаров, обновления информации
    //о товарах и вывода общей стоимости товаров на складе.
    public static void task2(){
        Product product1 = new Product("Product1", 2, 10);
        Store store = new Store();
        store.addProduct(product1);
        store.info();
    }


}
