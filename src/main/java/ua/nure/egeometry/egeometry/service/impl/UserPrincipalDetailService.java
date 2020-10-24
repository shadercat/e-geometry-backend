package ua.nure.egeometry.egeometry.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ua.nure.egeometry.egeometry.entity.UserEntity;
import ua.nure.egeometry.egeometry.principal.UserPrincipal;

@Service
public class UserPrincipalDetailService implements UserDetailsService {
    @Autowired
    private UserServiceImpl userService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserEntity person = userService.getByEmail(s);
        UserPrincipal userPrincipal = new UserPrincipal(person);

        return userPrincipal;
    }
}