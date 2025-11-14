package org.tuniway.tp1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.tuniway.tp1.Models.User;
import java.util.List ;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.email = :email")
    User findByEmail(@Param("email") String email) ;

    @Query("SELECT u FROM User u WHERE u.name LIKE %:name%")
    List<User> findByNameContaining(@Param("email")String name);

    @Query(value="SELECT * FROM user WHERE email = :email")
    List<User> findByNameAndEmail(@Param("email") String email) ;
}
