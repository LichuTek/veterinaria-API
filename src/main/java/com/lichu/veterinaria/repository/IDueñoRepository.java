package com.lichu.veterinaria.repository;

import com.lichu.veterinaria.model.Dueño;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDueñoRepository extends JpaRepository <Dueño, Long> {
}
