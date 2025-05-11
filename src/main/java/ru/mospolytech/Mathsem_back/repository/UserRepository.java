package ru.mospolytech.Mathsem_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mospolytech.Mathsem_back.model.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
