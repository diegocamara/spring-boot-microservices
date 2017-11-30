package com.microservices.authserver.service.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.microservices.authserver.domain.User;
import com.microservices.authserver.repository.UserRepository;

@Service
public class MongoUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		User user = this.userRepository.findOne(userName);

		if (user == null) {
			throw new UsernameNotFoundException(userName);
		}

		return user;
	}

}
