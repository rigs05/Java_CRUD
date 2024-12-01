package com.crud.mcsl_222_crud.controller;

import com.crud.mcsl_222_crud.model.WorkshopRegistration;
import com.crud.mcsl_222_crud.service.WorkshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workshop")
public class WorkshopController {
    @Autowired
    private WorkshopService service;

    @GetMapping("/registrations")
    public List<WorkshopRegistration> getAll() {
        return service.getAll();
    }

    @PostMapping("/register")
    public WorkshopRegistration register(@RequestBody WorkshopRegistration registration) {
        return service.create(registration);
    }

    @PutMapping("/update/{id}")
    public WorkshopRegistration update(@PathVariable Long id, @RequestBody WorkshopRegistration registration) {
        return service.update(id, registration);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
