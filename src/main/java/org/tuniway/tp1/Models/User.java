package org.tuniway.tp1.Models;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id ;
    String name ;
    private BigDecimal salary;
    private String phone ;
    private short age ;
    private String email ;
    private String password ;

    // getter and setters

    public Long getId(){return id ;}
    public void setId(Long id ){this.id  = id ;}

    public String getName(){return this.name ;}
    public void setName(String name) {this.name = name ;}

    public BigDecimal getSalary(){return this.salary ;}
    public void setSalary(BigDecimal salary) {this.salary= salary ;}

    public String getPhone() {return this.phone ;}
    public void setPhone(String phone) {this.phone = phone ;}

    public short getAge(){return this.age ;}
    public void setAge(short age) {this.age = age ;}

    public String getEmail() {return this.email  ;}
    public void setEmail(String email){this.email = email ;}

    public String getPassword(){return this.password ;}
    public void setPassword(String password) { this.password = password;}





}