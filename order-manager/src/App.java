import java.time.Instant;
import java.time.LocalDate;

import model.entitis.Client;

import model.entitis.Order;
import model.entitis.OrderItem;
import model.entitis.Product;
import model.entitis.Status;

public class App {
    public static void main(String[] args) throws Exception {
        //criando componentes para fazer o "Order"
        Product product = new Product("Biscoito", 2.99);
        Client client = new Client("Julia", "Pinheiro", "julinhapinheiro@gmail.com", LocalDate.now());
        Status status = Status.PENDING_PAYMENT;
        OrderItem orderItem = new OrderItem(product, 200, 2.99);
        Order order = new Order(client,Instant.now(), status);
        
        order.addItem(orderItem);
        for(OrderItem item:order.getItems()){
           System.out.println(item.toString()); 
        }
    }
}
