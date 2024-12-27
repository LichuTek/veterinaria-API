package com.lichu.veterinaria.controller;

import com.lichu.veterinaria.model.Mascota;
import com.lichu.veterinaria.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MascotaController {
    @Autowired
    private MascotaService mascotaServ;

    @PutMapping("/mascota/crear")
    public void crearMascota(@RequestBody Mascota masco){
        mascotaServ.saveMascota(masco);
    }

    @DeleteMapping("/mascota/borrar/{id}")
    public void borrarMascota(@PathVariable Long id){
        mascotaServ.deleteMascota(id);
    }

    @PutMapping("/mascota/editar")
    public void editarMascota(@RequestBody Mascota masco){
        mascotaServ.editMascota(masco);
    }

    @GetMapping("/mascota/traer")
    public List<Mascota> getMascotas(){
        return mascotaServ.getMascotas();
    }




}
