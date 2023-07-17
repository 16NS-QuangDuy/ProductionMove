package com.hust.productionmove.security;

import com.hust.productionmove.entity.User;
import com.hust.productionmove.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomUserDetailService implements UserDetailsService {
    private UserRepository userRepository;

    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
//        CustomUserDetail customUserDetail = new CustomUserDetail(user);
//        customUserDetail.getAuthorities().clear();
//        user.getRoles().forEach(role -> {
//            customUserDetail.getAuthorities().add(new SimpleGrantedAuthority(role.getName()));
//        });
        return user;
    }

    public User loadUserById(String id) {
        User user = userRepository.findById(UUID.fromString(id))
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return user;
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
