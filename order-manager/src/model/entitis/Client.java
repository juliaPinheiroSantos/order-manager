package model.entitis;

import java.time.LocalDate;

public class Client {
  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  private LocalDate birthDate;

  public Client(){}

  public Client(String firstName, String lastName, String email, LocalDate birthDate){

  }

  public Client(Long id, String firstName, String lastName, String email, LocalDate birthDate){

  }

  public Long getId(){
    return this.id;
  }

  public void setFirstName(String firstName){
    if(firstName == null) throw new IllegalArgumentException("First name is empty!");
    this.firstName = firstName;
  }

  public String getFirstName(){
    return this.firstName;
  }

  public void setLastName(String lastName){
    if(lastName == null) throw new IllegalArgumentException("Last name is empty!");
    this.lastName = lastName;
  }

  public String getLastName(){
    return this.lastName;
  }

  public void setEmail(String email){
    if (email == null) throw new IllegalArgumentException("Email is empty!");
    this.email = email;
  }

  public String getEmail(){
    return this.email;
  }

  public LocalDate getBirthDate(){
    return this.birthDate;
  }

  @Override
  public String toString() {
    return "Client [getId()=" + getId() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
        + ", getEmail()=" + getEmail() + ", getBirthDate()=" + getBirthDate() + "]";
  }

  

  


}
