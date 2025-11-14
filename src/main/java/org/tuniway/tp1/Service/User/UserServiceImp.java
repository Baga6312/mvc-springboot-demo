package org.tuniway.tp1.Service.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tuniway.tp1.Models.User;
import org.tuniway.tp1.Repository.UserRepository;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository userRepository ;

    @Override
    public User creatUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @Override
    public User getUserByID(Long id){
        return userRepository.findById(id);
    }

    @Override
    public User updateUser(User user){
        return userRepository.saveAndFlush(user);
    }

    @Override
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
