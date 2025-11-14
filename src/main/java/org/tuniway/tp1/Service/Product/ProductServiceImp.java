package org.tuniway.tp1.Service.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tuniway.tp1.Models.Product;
import org.tuniway.tp1.Repository.ProductRepository;
import java.util.List;

@Service
public class ProductServiceImp implements ProductService{
    @Autowired
    private ProductRepository productRepository ;

    @Override
    public Product creatProduct(Product prod) {return productRepository.save(prod);}

    @Override
    public List<Product> getAllProd() {return productRepository.findAll();}

    @Override
    public Product getProdByID(Long Id) {return productRepository.findById(Id);}

    @Override
    public Product updateProduct(Product prod) {return productRepository.saveAndFlush(prod);}

    @Override
    public void deleteProduct(Long id) {productRepository.deleteById(id);}
}
