package org.tuniway.tp1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.tuniway.tp1.Models.Category;
import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Query("SELECT c FROM Category c WHERE c.id = :id")
    Category getCategoryById(@Param("id") Long id);

    @Query("SELECT c FROM Category c WHERE c.title = :title")
    Category getCategoryByTitle(@Param("title") String title);

    List<Category> getAllCategory();
    Category createCategory(Category cat);
    Category updateCategory(Category cat);
    void deleteCategory(Long id);
}
