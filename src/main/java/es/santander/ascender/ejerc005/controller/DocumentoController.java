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

import es.santander.ascender.ejerc005.model.Documento;
import es.santander.ascender.ejerc005.service.DocumentoService;

@RestController
@RequestMapping("/api/documento")
public class DocumentoController {
    
    @Autowired
    DocumentoService ds;
    @GetMapping
    public List<Documento> read() {
        return ds.readAll();
    }
    @GetMapping("/{id}")
    public Documento read(@PathVariable Long id) {
        return ds.read(id);
    }
    @PostMapping
    public Documento create(@RequestBody Documento d) {
        return ds.create(d);
    }
    @PutMapping
    public void update(@RequestBody Documento d) {
        ds.update(d);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        ds.delete(id);
    }

}
