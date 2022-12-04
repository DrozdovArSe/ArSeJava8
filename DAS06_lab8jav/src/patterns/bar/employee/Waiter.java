package patterns.bar.employee;

import patterns.bar.data.Order;

public class Waiter {

    public void execute(Order order) {
        System.out.println("Официант получил " + order);
        order.execute();
    }
}
