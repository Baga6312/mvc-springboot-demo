package org.tuniway.tp1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.tuniway.tp1.Models.Product;
import java.util.List ;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("SELECT p FROM Product p WHERE p.id = :id")
    public List<Product> getProdById(Long id);

    @Query("SELECT p FROM Product p WHERE p.name = :name")
    public List<Product> getProdByName(String name);

    public List<Product> getAllProduct();
    public Product creatProduct(Product prod);
    public Product updateProduct(Product prod);
    public void deleteProduct(Long id);
}
