package com.emrecan.springbootbookseller.repository;

import com.emrecan.springbootbookseller.model.Role;
import com.emrecan.springbootbookseller.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/**
 * @author Emrecan
 * @created 31/10/2021 - 23:31
 */
public interface IUserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    @Modifying
    @Query("update User set role = :role where username = :username")
    void updateUserRole(@Param("username") String username, @Param("role") Role role);

}
