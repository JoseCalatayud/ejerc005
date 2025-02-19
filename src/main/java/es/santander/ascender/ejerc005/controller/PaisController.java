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

import es.santander.ascender.ejerc005.model.Pais;
import es.santander.ascender.ejerc005.service.PaisService;


@RestController
@RequestMapping("/api/pais")
public class PaisController {
    @Autowired
    PaisService ps;

    @GetMapping
    public List<Pais> readAll() {
        return ps.readAll();
    }

    @GetMapping("/{id}")
    public Pais read(@PathVariable Long id) {
        return ps.read(id);
    }

    @PostMapping
    public Pais create(@RequestBody Pais p) {
        return ps.create(p);
    }

    @PutMapping
    public Pais update(@RequestBody Pais p) {
        return ps.update(p);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        ps.delete(id);
    }

}
