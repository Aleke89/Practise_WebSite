package com.example.CAR__KIT.repositories;


import com.example.CAR__KIT.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}