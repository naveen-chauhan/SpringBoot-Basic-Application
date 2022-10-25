package com.naveen.basic.naveen.project.repository;

import com.naveen.basic.naveen.project.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author naveen.chauhan on 25/10/22
 */
public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUsername(String s);
}
