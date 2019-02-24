package com.demo.deploy.rep;

import com.demo.deploy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyUserRep extends JpaRepository<User, String> {
}
