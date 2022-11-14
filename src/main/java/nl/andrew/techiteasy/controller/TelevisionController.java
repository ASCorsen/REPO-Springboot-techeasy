package nl.andrew.techiteasy.controller;

import nl.andrew.techiteasy.exceptions.RecordNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TelevisionController {
    @GetMapping("/televisions/{id}")
    public ResponseEntity<Object> getTelivision (@PathVariable int id) {
        if (id < 10) {
            return ResponseEntity.ok("Artikel nummer: " + id + " Gelukt!");
        } else {
            throw new RecordNotFoundException("ID not found");
        }
    }

}
