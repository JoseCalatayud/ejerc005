package es.santander.ascender.ejerc005.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.santander.ascender.ejerc005.model.Continente;
import es.santander.ascender.ejerc005.service.ContinenteService;

@RestController
@RequestMapping("/api/continente")
public class ContinenteController {
    @Autowired
    ContinenteService cs;

    @GetMapping
    public List<Continente> readAll() {
        return cs.readAll();
    }

    @GetMapping("/{id}")
    public Continente read(@PathVariable Long id) {
        return cs.read(id);
    }
    @PostMapping
    public Continente create(@RequestBody Continente c) {
        return cs.create(c);
    }
    @PutMapping
    public Continente update(@RequestBody Continente c) {
        return cs.update(c);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        cs.delete(id);
    }

}
