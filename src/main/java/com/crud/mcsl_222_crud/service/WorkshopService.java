package com.crud.mcsl_222_crud.service;

import com.crud.mcsl_222_crud.model.WorkshopRegistration;
import com.crud.mcsl_222_crud.repository.WorkshopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkshopService {
    @Autowired
    private WorkshopRepository repository;

    public List<WorkshopRegistration> getAll() {
        return repository.findAll();
    }

    public WorkshopRegistration create(WorkshopRegistration registration) {
        return repository.save(registration);
    }

    public WorkshopRegistration update(Long id, WorkshopRegistration newReg) {
        return repository.findById(id).map(existing -> {
            existing.setName(newReg.getName());
            existing.setEmail(newReg.getEmail());
            existing.setPhone(newReg.getPhone());
            existing.setFeePaid(newReg.getFeePaid());
            return repository.save(existing);
        }).orElseThrow(() -> new RuntimeException("Registration not found"));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
