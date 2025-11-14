package org.tuniway.tp1.Models;

import jakarta.persistence.* ;
import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;
    String title ;
    String description ;

    @OneToMany(mappedBy="cat")
    List<SubCategory> subcat ;

    public Long getId(){return this.id;}
    public void setId(Long id){this.id = id;}

    public String getTit(){return this.title ;}
    public void setTit(String title){this.title=title;}

    public String getDesc(){return this.description;}
    public void setDesc(String desc){this.description=desc;}

    public List<SubCategory> getSubCat(){return this.subcat;}
    public void setSubCat(List<SubCategory> subcat){this.subcat = subcat;}
}