package org.tuniway.tp1.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.tuniway.tp1.Models.Product;
import org.tuniway.tp1.Service.Product.ProductService;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    @RequestMapping("/addProduct")
    public String addProduct(Model model){
        Product product = new Product();
        model.addAttribute("ProductForm" , product) ;
        return "newProdcut" ;
    }

    @RequestMapping(value="/save" , method= RequestMethod.POST)
    public String saveProduct(@ModelAttribute("ProductForm") Product product) {

        productService.creatProduct(product);
        return "redirect:all";
    }
}
