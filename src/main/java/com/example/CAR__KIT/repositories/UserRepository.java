package com.example.CAR__KIT.repositories;



import com.example.CAR__KIT.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
