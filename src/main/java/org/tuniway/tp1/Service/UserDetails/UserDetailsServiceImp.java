package org.tuniway.tp1.Service.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.tuniway.tp1.Models.User;
import org.tuniway.tp1.Repository.UserRepository;

import java.util.Collection;
import java.util.List;

@Service
public class UserDEtailsServiceImp implements UserDetails {
    @Autowired
    UserRepository userRepository ;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundExcepetion {
        User user = userRepository.findByUsername(username)
                .orElseThrow(()-> new UsernameNotFoundException(" user not found with username : " + username)) ;

        return UserDetailsImp.build(user);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public String getUsername() {
        return "";
    }
}
