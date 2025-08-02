package model.entitis;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Order {
  private Long id;
  private List<OrderItem> items;
  private Client client;
  private Instant moment;
  private Status status;

  public Order(){}

  public Order(Client client, Instant moment, Status status){
    this.items = new ArrayList<OrderItem>();
    this.setClient(client);
    this.setMoment(moment);
    this.setStatus(status);
    
  }

  public Order(Long id, Client client, Instant moment, Status status){
    this.id = id;
    this.items = new ArrayList<OrderItem>();
    this.setClient(client);
    this.setMoment(moment);
    this.setStatus(status);
  }

  public Long getId(){
    return this.id;
  }

  public void setClient(Client client){
    this.client = client;
  }

  public Client getClient(){
    return this.client;
  }

  public void setMoment(Instant moment){
    this.moment = moment;
  }

  public Instant getMoment(){
    return this.moment;
  }

  public void setStatus(Status status){
    this.status = status;
  }

  public Status getStatus(){
    return this.status;
  }

  public List<OrderItem> getItems(){
    List<OrderItem> copyItems = new ArrayList<OrderItem>();
    // 1 - tipo, 2 - nome da variavel, 3 - lista
    for(OrderItem item:items){
      copyItems.add(item);
    }

    return copyItems;
    //ou return new ArrayList<OrderItemm>(items);
  }


  //métodos para adicionar e remover itens da lista, sem dar ao usuário acesso direto à lista
  public void addItem(OrderItem item){
    items.add(item);
  }

  public void removeItem(OrderItem item){
    items.remove(item);
  }


  public Double total(){
    Double total = 0.0;

    for(OrderItem item: items){
      total = total + item.subTotal();
    }

    return total;
  }

  @Override
  public String toString() {
    return "Order [getId()=" + getId() + ", getClient()=" + getClient() + ", getMoment()=" + getMoment()
        + ", getStatus()=" + getStatus() + ", getItems()=" + getItems() + ", total()=" + total() + "]";
  }
  

}
