package com.example.inicial1.controllers;

import com.example.inicial1.entities.Persona;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    private List<Persona> personas = new ArrayList<>();

    @GetMapping("/{id}")
    public ResponseEntity<String> getPersona(@PathVariable Long id) {
        // Lógica para obtener la persona por ID
        String response = "Persona con ID: " + id;
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<String> getAllPersonas() {
        // Lógica para obtener todas las personas
        String response = "Lista de todas las personas";
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> createPersona(@RequestBody Persona persona) {
        // Lógica para crear una nueva persona
        String response = "Persona creada con éxito";
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updatePersona(@PathVariable Long id, @RequestBody Persona persona) {
        // Lógica para actualizar la persona por ID
        String response = "Persona actualizada con éxito";
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    // Puedes agregar el método DELETE si lo necesitas
}