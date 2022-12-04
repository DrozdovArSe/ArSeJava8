package patterns.barr;

import patterns.bar.data.Order;
import patterns.bar.data.Product;
import patterns.bar.employee.Barman;
import patterns.bar.employee.Waiter;

public class Bar {

    private static Bar instance = null;

    private final Barman barman;
    private final Waiter waiter;

    // Приватный конструктор: инстанцирование разрешено только внурти этого класса.
    private Bar() {
        this.barman = new Barman();
        this.waiter = new Waiter();
    }

    public void newOrder(Product product) {
        // Command - behavioral pattern (паттерны для взаимодействия классов).
        //
        // Создается конкретная комманда (Order), реализующая интерфейс Command,
        // которая просит получателя (Barman) совершить действие и отправляется
        // вызывающему (Waiter). Вызывающий - тот, кто знает когда дать эту
        // команду. Получатель - тот, кто знает что делать, когда дается 
        // конкретная команда.
        //
        // Таким образом, когда выполняется метод execute вызывающего, он,
        // в свою очередь, вызывает метод получателя, тем самым выполняя необходимые действия.
        Order order = new Order(barman, product);
        waiter.execute(order);
    }

    // Singleton - creational pattern (паттерны для инстанцирования классов).
    //
    // Создает только один объект класса, и предоставляет
    // только один глобальный доступ к этому объекту.
    public static Bar getInstance() {
        synchronized (Bar.class) {
            if (instance == null) {
                instance = new Bar();
            }
        }
        return instance;
    }
}
