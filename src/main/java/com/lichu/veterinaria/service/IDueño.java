package com.lichu.veterinaria.service;

import com.lichu.veterinaria.model.Dueño;

import java.util.List;

public interface IDueño {

    public void saveDueño(Dueño due);

    public List<Dueño> getDueños();

    public void editDueño(Dueño due);

    public void findDueño(Long id);

    public void deleteDueño(Long id);

}
