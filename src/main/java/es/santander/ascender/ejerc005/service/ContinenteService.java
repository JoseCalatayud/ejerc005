package es.santander.ascender.ejerc005.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.santander.ascender.ejerc005.model.Continente;
import es.santander.ascender.ejerc005.repository.ContinenteRepository;


@Service
@Transactional
public class ContinenteService {

    @Autowired
    ContinenteRepository cr;

    @Transactional (readOnly = true)
    public List<Continente> readAll() {
        return cr.findAll();
    }

    @Transactional (readOnly = true)
    public Continente read(Long id) {
        return cr.findById(id).get();
    }

    public Continente create(Continente p) { 
        if(p.getId()!= null ){
            throw new CrudSecurityException("Han tratado de crear un registro usando el metodo modificar",
            CRUDOperation.CREATE, p.getId());
        }       
        return cr.save(p);
    }

    public Continente update(Continente p) {    
        if(p.getId()!= null ){
            throw new CrudSecurityException("Han tratado de modificar un registro usando el metodo crear",
            CRUDOperation.CREATE, p.getId());
        }    
        return cr.save(p);
    }

    public void delete(Long id) {
        cr.deleteById(id);
    }


}
