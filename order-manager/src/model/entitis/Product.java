package model.entitis;

//import java.util.Objects;

public class Product {
  private Long id;
  private String name;
  private Double price;

  public Product(){}

  public Product(String name, Double price){
    this.setName(name);
    this.setPrice(price);
  }

  public Product(String name, Double price, Long id){
    this.setName(name);
    this.setPrice(price);
    this.id = id;
  }

  public void setName(String name){
    if(name == null) {
      throw new IllegalArgumentException("Name is empty");
    } 

    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public void setPrice(Double price){
    this.price = (price > 0.00) ? price : 0.00;
  }

  public Double getPrice(){
    return this.price;
  }

  public Long getId(){
    return this.id;
  }


  @Override
  public String toString(){
    return "Product:" + "\nID: " + getId() +"\nName: " + getName() + "\nPrice: " + getPrice(); 
  }


  /*/@Override
  id codificado
  public int hashCode(){
    return Objects.hash(id);
  }

  @Override //compara a referencia de um produto com outro produto
   public boolean equals(Object obj){
    if(this == obj){
      return true;
    }

    if(obj == null){
      return false;
    }

    if (getClass() != obj.getClass()){
      return false;
    }

    Product other = (Product) obj;
    return Objects.equals(id, other, id);


  }

  / */

}
