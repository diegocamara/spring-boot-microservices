package com.microservices.authserver.service.security;

import com.microservices.authserver.domain.User;
import com.microservices.authserver.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MongoUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        Optional<User> user = this.userRepository.findById(userName);

        if (!user.isPresent()) {
            throw new UsernameNotFoundException(userName);
        }

        return user.get();
    }

}
