package model.entitis;

public class OrderItem {
  private Long id;
  private Product product;
  private Integer quantity;
  private Double price;

  public OrderItem(){}

  public OrderItem(Product product, Integer quantity, Double price){
    this.setProduct(product);
    this.setQuantity(quantity);
    this.setPrice(price);
  }

  public OrderItem(Long id, Product product, Integer quantity, Double price){
    this.setProduct(product);
    this.setQuantity(quantity);
    this.setPrice(price);
    this.id = id;
  }


  public Long getId(){
    return this.id;
  }

  public void setProduct(Product product){
    this.product = product;
  }

  public Product getProduct(){
    return this.product;
  }

  public void setQuantity(Integer quantity){
    if (quantity == null) {
      throw new IllegalArgumentException("Quantity is empty!");
    }

    if(quantity < 0){
      throw new IllegalStateException("Quantity is invalid!");
    }
    this.quantity = quantity;


  }

  public Integer getQuantity(){
    return this.quantity;
  }

  public void setPrice(Double price){
    if (price == null){
      throw new IllegalArgumentException("Price is empty!");
    }

    if (price < 0.00){
      throw new IllegalStateException("Price is invalid!");
    }

    this.price = price;
  }

  public Double getPrice(){
    return this.price;
  }

  public Double subTotal(){
    return getPrice() * getQuantity();
  }

  @Override
  public String toString() {
    return "OrderItem [getId()=" + getId() + ", getProduct()=" + getProduct() + ", getQuantity()=" + getQuantity()
        + ", getPrice()=" + getPrice() + "]";
  }

  

  



}
