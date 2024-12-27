package com.lichu.veterinaria.service;

import com.lichu.veterinaria.model.Dueño;
import com.lichu.veterinaria.repository.IDueñoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DueñoService implements IDueño {

    @Autowired
    private IDueñoRepository dueRepo;


    @Override
    public void saveDueño(Dueño due) {
        dueRepo.save(due);
    }

    @Override
    public List<Dueño> getDueños() {
        return dueRepo.findAll();
    }

    @Override
    public void editDueño(Dueño due) {
        saveDueño(due);
    }

    @Override
    public void findDueño(Long id) {
        dueRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteDueño(Long id) {
        dueRepo.deleteById(id);
    }

}
