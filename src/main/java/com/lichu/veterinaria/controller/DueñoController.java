package com.lichu.veterinaria.controller;

import com.lichu.veterinaria.model.Dueño;
import com.lichu.veterinaria.repository.IDueñoRepository;
import com.lichu.veterinaria.service.DueñoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DueñoController {
    @Autowired
    private DueñoService dueRepo;

    @PostMapping("duenio/crear")
    public void crearDuenio(@RequestBody Dueño due){
        dueRepo.saveDueño(due);
    }

    @DeleteMapping("duenio/borrar/{id}")
    public void deleteDuenio(@PathVariable Long id){
        dueRepo.deleteDueño(id);
    }

    @PutMapping("duenio/editar")
    public void editDuenio(@RequestBody Dueño due){
        dueRepo.editDueño(due);
    }



}
