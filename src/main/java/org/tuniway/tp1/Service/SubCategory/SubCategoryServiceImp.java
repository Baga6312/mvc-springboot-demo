package org.tuniway.tp1.Service.SubCategory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tuniway.tp1.Models.SubCategory;
import org.tuniway.tp1.Repository.SubCategoryRepository;
import java.util.List;

@Service
public class SubCategoryServiceImp implements SubCategoryService{
    @Autowired
    private SubCategoryRepository subcategoryRepository ;
    @Override
    public SubCategory getCategoryById(Long id){return subcategoryRepository.findById(id);}

    @Override
    public SubCategory getSubCategoryByTitle(String title){return subcategoryRepository.find(title);}

    @Override
    public List<SubCategory> getAllCategory(){return subcategoryRepository.findAll();}

    @Override
    public SubCategory creatSubCategory(SubCategory sub){return subcategoryRepository.save(sub);}

    @Override
    public SubCategory updateSubCategory(SubCategory sub){return subcategoryRepository.saveAndFlush(sub);}

    @Override
    public void deleteSubCategory(Long id){subcategoryRepository.findById(id);}
}
