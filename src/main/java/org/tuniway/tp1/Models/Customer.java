package org.tuniway.tp1.Models;

import jakarta.persistence.* ;
import java.util.List;


@Entity
public class Customer extends User{
    String address ;
    String city ;
    @OneToMany(mappedBy="cus")
    List<Orders> orders ;
}