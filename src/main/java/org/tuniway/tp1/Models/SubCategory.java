package org.tuniway.tp1.Models;

import jakarta.persistence.* ;
import java.util.List ;

@Entity
public class SubCategory{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id ;
    String title ;
    String description;

    @ManyToOne
    Category cat ;

    @OneToMany(mappedBy="sub")
    List<Product> products ;

    public Long getId(){return this.id ;}
    public void setId(Long id){this.id=id;}

    public String getTit(){return this.title;}
    public void setTit(String tit){this.title=tit;}

    public String getDesc(){return this.description;}
    public void setDesc(String desc){this.description = desc ;}
}