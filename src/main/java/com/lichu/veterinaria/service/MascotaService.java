package com.lichu.veterinaria.service;

import com.lichu.veterinaria.model.Mascota;
import com.lichu.veterinaria.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    @Override
    public List<Mascota> getMascotaRequired() {
        List<Mascota> listaMascotas = mascoRepo.findAll();
        List<Mascota> listaMascotasRet = new ArrayList<>();
        for (Mascota masco: listaMascotas){
            if(masco.getRaza().equals("caniche") && masco.getEspecie().equals("perro")){
                listaMascotasRet.add(masco);
            }
        }

        return listaMascotasRet;
    }

}
