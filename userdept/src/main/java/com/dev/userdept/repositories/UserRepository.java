package com.dev.userdept.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
