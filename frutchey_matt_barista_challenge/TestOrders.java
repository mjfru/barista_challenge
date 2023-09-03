import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
    //! Menu Items
    Item drink1 = new Item("Mocha", 4.5);
    Item drink2 = new Item("Drip Coffee", 2.5);
    Item drink3 = new Item("Latte", 4.0);
    Item drink4 = new Item("Cappuccino", 3.5);
    
    //! Order Variables (Order1, etc.)
    // TODO: Make 2 Unspecified guests:

    Order order1 = new Order();
    Order order2 = new Order();
    System.out.println(order1.getCustomerName());
    order1.displayOrder();
    System.out.println(order2.getCustomerName());

    // TODO: Make 3 Orders using the overloaded constructor to give each a name for their order:
    Order order3 = new Order("Jim");
    Order order4 = new Order("Satoko");
    Order order5 = new Order("Austin");
    System.out.println(order3.getCustomerName());

    // TODO: Add at least 2 items to each of the orders using the addItem method:
    order1.addItem(drink2);
    order1.addItem(drink3);

    order2.addItem(drink1);
    order2.addItem(drink1);

    order3.addItem(drink1);
    order3.addItem(drink4);

    order4.addItem(drink4);
    order4.addItem(drink2);

    order5.addItem(drink3);
    order5.addItem(drink4);

    // TODO: Test your getStatusMessage method by setting some orders to ready and printing the messages for each order.
    order1.setOrderReady(true);
    order2.setOrderReady(true);
    order4.setOrderReady(true);

    System.out.println(order1.orderStatus());
    System.out.println(order2.orderStatus());
    System.out.println(order3.orderStatus());
    System.out.println(order4.orderStatus());
    System.out.println(order5.orderStatus());

    // TODO: Test the total by printing the return value like so: 'System.out.println(order1.getOrderTotal())'.
    System.out.println(order1.getOrderTotal());
    System.out.println(order2.getOrderTotal());
    System.out.println(order3.getOrderTotal());
    System.out.println(order4.getOrderTotal());
    System.out.println(order5.getOrderTotal());

    // TODO: Call the display method on all orders:
    order1.displayOrder();
    order2.displayOrder();
    order3.displayOrder();
    order4.displayOrder();
    order5.displayOrder();

    };
}