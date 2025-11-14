package org.tuniway.tp1.Service.User;


import org.tuniway.tp1.Models.User;
import java.util.List ;

public interface UserService {
    User creatUser(User user) ;
    List<User> getUsers() ;
    User getUserByID(Long id);

    User getUserById(Long id);

    User updateUser(User user ) ;
    void deleteUser(Long id) ;

    User createUser(User user);

    List<User> getAllUsers();
}
