package ru.mospolytech.Mathsem_back.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mospolytech.Mathsem_back.model.entity.Review;
import ru.mospolytech.Mathsem_back.repository.ReviewRepository;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("api/reviews")
public class ReviewController {

    private final ReviewRepository reviewRepo;

    @GetMapping("/{id}")
    public ResponseEntity<Review> getReview(@PathVariable Integer id) {
        return reviewRepo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Review createReview(@RequestBody Review review) {
        return reviewRepo.save(review);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReview(@PathVariable Integer id) {
        if (reviewRepo.existsById(id)) {
            reviewRepo.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
