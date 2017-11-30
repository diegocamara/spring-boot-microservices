package com.microservices.authserver.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microservices.authserver.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

}
