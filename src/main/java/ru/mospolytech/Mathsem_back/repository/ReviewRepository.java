package ru.mospolytech.Mathsem_back.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mospolytech.Mathsem_back.model.entity.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
