import task1.Status;
import task1.Task;
import task1.TaskManager;
import task2.Product;
import task2.Store;
import task3.Bank;
import task3.BankAccount;
import task4.Student;
import task4.StudentManager;
import task5.Customer;
import task5.Order;
import task5.ProductTask5;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
        task5();
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
        Product product1 = new Product("Product1", 1, 10);
        Product product2 = new Product("Product2", 2, 10);
        Product product3 = new Product("Product3", 3, 10);
        Product product4 = new Product("Product4", 4, 10);
        Store store = new Store();
        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);
        store.addProduct(product4);
        store.info();
        store.price();
        store.update(product2, 20);
        store.info();
        store.price();
        store.sellProduct(product1, 5);
        store.info();
        store.price();
    }

    //Task3
    //3. Банковский счет
    //Создайте класс BankAccount с полями номер счета, имя
    //владельца и баланс. Реализуйте методы для пополнения счета,
    //снятия средств, проверки баланса и перевода средств между
    //счетами.
    public static void task3(){
        BankAccount account1 = new BankAccount("1", "Name1", 10);
        BankAccount account2 = new BankAccount("2", "Name2", 20);
        BankAccount account3 = new BankAccount("3", "Name3", 30);

        Bank bank = new Bank();
        bank.addAcc(account1);
        bank.addAcc(account2);
        bank.addAcc(account3);
        bank.info();
        System.out.println("==========================");
        bank.refill(account1, 100);
        bank.info();
        System.out.println("==========================");
        bank.withdraw(account1, 100);
        bank.info();
        System.out.println("==========================");
        bank.move(account3, account1, 10);
        bank.info();
        System.out.println("==========================");
        bank.checkBalance(account1);
    }


    //Task4
    //4. Управление студентами
    //Создайте класс Student с полями имя, возраст и средний балл.
    //Затем создайте класс StudentManager, который будет
    //управлять списком студентов. Реализуйте методы для
    //добавления студентов, удаления, обновления информации и
    //вывода информации о студентах с наивысшими баллами.
    public static void task4(){
        Student student1 = new Student("Name1", 21, 1);
        Student student2 = new Student("Name2", 22, 21);
        Student student3 = new Student("Name3", 23, 3);
        StudentManager manager = new StudentManager();
        manager.addStudent(student1);
        manager.addStudent(student2);
        manager.addStudent(student3);
        manager.info();
        System.out.println("===============");
        manager.delete(student2);
        manager.info();
        System.out.println("===============");
        manager.update(student1, 5);
        manager.info();
        System.out.println("===============");
        manager.getMaxAverage();

    }

    //Task5
    //5. Интернет-магазин заказов
    //Создайте классы Customer, Product и Order. Customer содержит
    //информацию о клиенте, Product - о продукте, а Order -
    //о заказе, который включает в себя информацию о клиенте,
    //товарах и общей стоимости. Реализуйте методы для
    //добавления товаров в заказ,
    //подсчета общей стоимости и вывода информации о заказе.
    public static void task5(){
        Customer customer = new Customer("Customer1");
        ProductTask5 product1 = new ProductTask5("Product1", 100);
        ProductTask5 product2 = new ProductTask5("Product2", 200);
        ProductTask5 product3 = new ProductTask5("Product3", 300);
        ProductTask5 product4 = new ProductTask5("Product4", 400);
        Order order = new Order(customer);
        order.addProduct(product1);
        order.addProduct(product2);
        order.addProduct(product3);
        order.addProduct(product4);
        order.info();
        System.out.println("TotalCost = " + order.getTotalCost());

    }


}
