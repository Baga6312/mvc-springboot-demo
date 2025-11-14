package org.tuniway.tp1.Service.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tuniway.tp1.Models.Category;
import org.tuniway.tp1.Repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService{
    @Autowired
    private CategoryRepository categoryRepository ;

    @Override
    public List<Category> getCategoryById(Long id) {return categoryRepository.findById(id); }

    @Override
    public List<Category> getCategoryByTitle(String title) {return categoryRepository.find(title); }

    @Override
    public List<Category> getAllCategory() {return categoryRepository.findAll();}

    @Override
    public Category createCategory(Category cat) {return categoryRepository.save(cat);}

    @Override
    public Category updateCategory(Category cat) {return categoryRepository.saveAndFlush(cat);}

    @Override
    public void deleteCategory(Long id) {categoryRepository.deleteById(id);}
}
