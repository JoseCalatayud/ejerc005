package es.santander.ascender.ejerc005.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.santander.ascender.ejerc005.model.Pais;
import es.santander.ascender.ejerc005.repository.PaisRepository;

@Service
@Transactional
public class PaisService {

    @Autowired
    PaisRepository pr;

    @Transactional(readOnly = true)
    public List<Pais> readAll() {
        return pr.findAll();
    }

    @Transactional(readOnly = true)
    public Pais read(Long id) {
        return pr.findById(id).get();
    }

    public Pais create(Pais p) {
        if(p.getId()!= null ){
            throw new CrudSecurityException("Han tratado de crear un registro usando el metodo modificar",
            CRUDOperation.CREATE, p.getId());
        }  
        return pr.save(p);
    }

    public Pais update(Pais p) {
        if(p.getId()== null ){
            throw new CrudSecurityException("Han tratado de modificar un registro usando el metodo crear",
            CRUDOperation.CREATE, p.getId());
        }  
        return pr.save(p);
    }

    public void delete(Long id) {
        pr.deleteById(id);
    }


}
