package org.tuniway.tp1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.tuniway.tp1.Models.SubCategory ;
import java.util.List;

@Repository
public interface SubCategoryRepository extends JpaRepository<SubCategory, Long> {
    @Query("SELECT s FROM SubCategory s WHERE s.id = :id")
    SubCategory getCategoryById(@Param("id") Long id);

    @Query("SELECT s FROM SubCategory s WHERE s.title = :title")
    SubCategory getSubCategoryByTitle(@Param("title") String title);

    List<SubCategory> getAllSubCategory();
    SubCategory createSubCategory(SubCategory sub);
    SubCategory updateSubCategory(SubCategory sub);
    void deleteSubCategory(Long id);
}
