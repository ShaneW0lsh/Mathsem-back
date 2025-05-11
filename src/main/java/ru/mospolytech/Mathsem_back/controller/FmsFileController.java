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
import ru.mospolytech.Mathsem_back.model.entity.FmsFile;
import ru.mospolytech.Mathsem_back.repository.FmsFileRepository;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("api/files")
public class FmsFileController {

    private final FmsFileRepository fileRepo;

    @GetMapping("/{id}")
    public ResponseEntity<FmsFile> getFile(@PathVariable Integer id) {
        return fileRepo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public FmsFile createFile(@RequestBody FmsFile file) {
        return fileRepo.save(file);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFile(@PathVariable Integer id) {
        if (fileRepo.existsById(id)) {
            fileRepo.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
