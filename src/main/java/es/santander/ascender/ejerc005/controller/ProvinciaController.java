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

import es.santander.ascender.ejerc005.model.Provincia;
import es.santander.ascender.ejerc005.service.ProvinciaService;

@RestController
@RequestMapping("/api/provincia")
public class ProvinciaController {
    @Autowired
    ProvinciaService ps;

    @GetMapping
    public List<Provincia> read() {
        return ps.readAll();
    }

    @GetMapping("/{id}")
    public Provincia read(@PathVariable Long id) {
        return ps.read(id);
    }

    @PostMapping
    public void create(@RequestBody Provincia p) {
        ps.create(p);
    }

    @PutMapping
    public void update(@RequestBody Provincia p) {
        ps.update(p);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        ps.delete(id);
    }
}
