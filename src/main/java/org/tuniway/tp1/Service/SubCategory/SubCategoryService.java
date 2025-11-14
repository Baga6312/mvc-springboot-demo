package org.tuniway.tp1.Service.SubCategory;

import org.tuniway.tp1.Models.SubCategory;

import java.util.List;

public interface SubCategoryService {
    SubCategory getCategoryById(Long id) ;
    SubCategory getSubCategoryByTitle(String title) ;

    // standard crud
    List<SubCategory> getAllCategory() ;
    SubCategory creatSubCategory(SubCategory sub);
    SubCategory updateSubCategory(SubCategory sub);
    void deleteSubCategory(Long id);
}
