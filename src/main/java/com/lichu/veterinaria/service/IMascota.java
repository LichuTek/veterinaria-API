package com.lichu.veterinaria.service;

import com.lichu.veterinaria.model.Dueño;
import com.lichu.veterinaria.model.Mascota;

import java.util.List;

public interface IMascota {
    public void saveMascota(Mascota mascota);

    public List<Mascota> getMascotas();

    public void editMascota(Mascota mascota);

    public void findMascota(Long id);

    public void deleteMascota(Long id);

}
