package ru.mospolytech.Mathsem_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mospolytech.Mathsem_back.model.entity.FmsFile;

@Repository
public interface FmsFileRepository extends JpaRepository<FmsFile, Integer> {
}
