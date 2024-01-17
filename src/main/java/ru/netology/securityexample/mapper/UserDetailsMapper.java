package ru.netology.securityexample.mapper;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import ru.netology.securityexample.entity.Role;
import ru.netology.securityexample.entity.User;

@Component
public class UserDetailsMapper {

    public UserDetails mapUserToUserDetails(User user) {
       return new org.springframework.security.core.userdetails.User(
               user.getUsername(),
               user.getPassword(),
               user.getRoles().stream().map(Role::getName).map(SimpleGrantedAuthority::new).toList()
       );
    }
}