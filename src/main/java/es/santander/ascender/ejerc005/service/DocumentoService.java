package es.santander.ascender.ejerc005.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.santander.ascender.ejerc005.model.Documento;
import es.santander.ascender.ejerc005.repository.DocumentoRepository;

@Service
@Transactional
public class DocumentoService {
    @Autowired
    DocumentoRepository dr;

    @Transactional (readOnly = true)
    public List<Documento> readAll() {
        return dr.findAll();
    }
    @Transactional (readOnly = true)
    public Documento read(Long id) {
        return dr.findById(id).get();
    }

    public Documento create(Documento d) {
        if(d.getId()!= null ){
            throw new CrudSecurityException("Han tratado de crear un registro de persona usando el metodo modificar",
            CRUDOperation.CREATE, d.getId());
        }
       return dr.save(d);
    }

    public Documento update(Documento d) {
        if(d.getId()== null ){
            throw new CrudSecurityException("Han tratado de modificar un registro de persona usando el metodo crear",
            CRUDOperation.CREATE, d.getId());
        }        
        return dr.save(d);
    }

    public void delete(Long id) {
        dr.deleteById(id);
    }

}
