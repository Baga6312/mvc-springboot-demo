package org.tuniway.tp1.Models;

import jakarta.persistence.* ;
import java.util.List ;

@Entity
public class Provider extends User {
    String matricule;
    String service ;
    String company ;

    @OneToMany(mappedBy="pro")
    List<Product> products ;


    // getter and setters
    public String getMat(){return this.matricule ;}
    public void setMat(String mat){this.matricule = mat;}

    public String getSer(){return this.service;}
    public void setSer(String service){ this.service = service;}

    public String getComp(){return this.company;}
    public void setComp(String comp){this.company=comp;}

    public List<Product> getProd(){return this.products ;}
    public void setProd(List<Product> prod){this.products = prod;}
}
