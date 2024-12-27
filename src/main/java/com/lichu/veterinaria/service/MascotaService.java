package com.lichu.veterinaria.service;

import com.lichu.veterinaria.model.Mascota;
import com.lichu.veterinaria.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService implements IMascota {
    @Autowired
    private IMascotaRepository mascoRepo;
    @Override
    public void saveMascota(Mascota mascota) {
        mascoRepo.save(mascota);
    }

    @Override
    public List<Mascota> getMascotas() {
        return mascoRepo.findAll();
    }

    @Override
    public void editMascota(Mascota mascota) {
        saveMascota(mascota);
    }

    @Override
    public void findMascota(Long id) {
        mascoRepo.findById(id);

    }

    @Override
    public void deleteMascota(Long id) {
        mascoRepo.deleteById(id);
    }
}
