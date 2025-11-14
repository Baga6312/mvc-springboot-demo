package org.tuniway.tp1.Models;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    BigDecimal price;
    String description;

    @ManyToOne
    Provider pro;

    @ManyToOne
    SubCategory sub;

    @ManyToMany
    @JoinTable(
            name ="product_orders",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns =@JoinColumn(name = "ordres_id")
    )
    List<Orders> ord;
    // getters and setters
    public void setId(Long id) {this.id = id;}
    public void setOrd(List<Orders> ord) {this.ord = ord;}

    public void setSub(SubCategory sub) {this.sub = sub;}
    public void setPro(Provider pro) {this.pro = pro;}

    public void setDescription(String description) {this.description = description;}
    public void setPrice(BigDecimal price) {this.price = price;}

    public void setName(String name) {this.name = name;}
    public Long getId() {return id;}

    public List<Orders> getOrd() {return ord;}
    public SubCategory getSub() {return sub;}

    public Provider getPro() {return pro;}
    public String getDescription() {return description;}

    public BigDecimal getPrice() {return price;}
    public String getName() {return name;}
}
