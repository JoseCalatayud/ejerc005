package es.santander.ascender.ejerc005.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.santander.ascender.ejerc005.model.Provincia;
import es.santander.ascender.ejerc005.repository.ProvinciaRepository;

@Service
@Transactional
public class ProvinciaService {
    @Autowired
    ProvinciaRepository pr;
    
    @Transactional(readOnly = true)
    public List<Provincia> readAll() {
        return pr.findAll();
    }
    @Transactional (readOnly = true)
    public Provincia read(Long id) {
        return pr.findById(id).get();
    }

    public Provincia create(Provincia p) {
        if (p.getId() != null) {
            throw new CrudSecurityException("Has tratado de crear un registro con el metodo modificar",
                    CRUDOperation.UPDATE, null);
        }
         return pr.save(p);
    }

    public Provincia update(Provincia p) {
        if (p.getId() == null) {
            throw new CrudSecurityException("Has tratado de modificar un registro con el metodo crear",
                    CRUDOperation.UPDATE, null);
        }
         return pr.save(p);
    }

    public void delete(Long id) {
        pr.deleteById(id);
    }

}
