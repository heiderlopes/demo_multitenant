package br.com.heiderlopes.demomultitenant.controller;

import br.com.heiderlopes.demomultitenant.model.Nota;
import br.com.heiderlopes.demomultitenant.repository.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;

@RestController
@RequestMapping(value = "/nota")
public class NotaController {

    @Autowired
    private NotaRepository notaRepository;

    @GetMapping
    public Iterator<Nota> getAll() {
        return notaRepository.findAll().iterator();
    }

    @PostMapping
    public void save(@RequestBody Nota nota) {
        notaRepository.save(nota);
    }
}
