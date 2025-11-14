package org.tuniway.tp1.Models;

import jakarta.persistence.* ;
import java.math.BigDecimal ;
import java.util.* ;

@Entity
public class Orders {
    @Id
    @TableGenerator(name="Orders")
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    Long id;
    String ref ;
    BigDecimal price ;

    @Temporal(TemporalType.DATE)
    Date date ;

    @ManyToOne
    Customer cus ;

    @ManyToMany(mappedBy="ord")
    List<Product> prods ;
}
