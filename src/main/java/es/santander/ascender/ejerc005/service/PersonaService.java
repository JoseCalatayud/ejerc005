package es.santander.ascender.ejerc005.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.santander.ascender.ejerc005.model.Persona;
import es.santander.ascender.ejerc005.repository.PersonaRepository;

@Service
@Transactional
public class PersonaService {
    @Autowired
    PersonaRepository pr;

    public List<Persona> read() {
        return pr.findAll();
    }

    public Persona read(Long id) {
        return pr.findById(id).get();
    }

    public Persona create(Persona p) {
        if(p.getId()!= null ){
            throw new CrudSecurityException("Han tratado de modificar un registro de persona usando el metodo crear",
            CRUDOperation.CREATE, p.getId());
        }
       return pr.save(p);
    }

    public Persona update(Persona p) {
        
        return pr.save(p);
    }

    public void delete(Long id) {
        pr.deleteById(id);
    }
}
