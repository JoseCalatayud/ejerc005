package es.santander.ascender.ejerc005.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.santander.ascender.ejerc005.model.Documento;
import es.santander.ascender.ejerc005.repository.DocumentoRepository;

@Service
@Transactional
public class DocumentoService {

    DocumentoRepository dr;

    

}
