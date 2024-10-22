// backend/src/main/java/com/rental/repository/UserRepository.java
package com.rental.repository;

import com.rental.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    // func
}