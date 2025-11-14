package org.tuniway.tp1.Service.Product;

import org.tuniway.tp1.Models.Product;
import java.util.List ;

public interface ProductService {
    Product creatProduct(Product prod);
    List<Product> getAllProd() ;
    Product getProdByID(Long Id) ;
    Product updateProduct(Product prod) ;
    void deleteProduct(Long id) ;
}
