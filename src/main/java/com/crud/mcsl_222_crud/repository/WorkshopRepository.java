package com.crud.mcsl_222_crud.repository;

import com.crud.mcsl_222_crud.model.WorkshopRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkshopRepository extends JpaRepository<WorkshopRegistration, Long> {
}
