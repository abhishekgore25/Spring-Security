package com.example.springsecuritypractice.service;

import com.example.springsecuritypractice.entity.CustomUserDetail;
import com.example.springsecuritypractice.entity.User;
import com.example.springsecuritypractice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.getById(1);
        if(user == null) {
            throw new UsernameNotFoundException("No USer");
        }
        return new CustomUserDetail(user);
    }
}
