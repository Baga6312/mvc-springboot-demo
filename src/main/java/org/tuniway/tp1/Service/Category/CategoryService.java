package org.tuniway.tp1.Service.Category;

import org.tuniway.tp1.Models.Category;
import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Category> getCategoryById(Long id);
    List<Category> getCategoryByTitle(String title);

    Category getCategoryByTitle();

    List<Category> getAllCategory() ;
    Category createCategory(Category cat);
    Category updateCategory(Category cat);
    void deleteCategory(Long id);
}
