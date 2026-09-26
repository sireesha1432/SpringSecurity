package com.Spring.Security.Repository;

import com.Spring.Security.Model.SecurityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SecurityRepo extends JpaRepository<SecurityEntity, Integer> {

    SecurityEntity findById(int id);
    Optional<SecurityEntity> findByname(String username);

}


