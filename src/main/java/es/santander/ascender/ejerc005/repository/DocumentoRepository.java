package es.santander.ascender.ejerc005.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.santander.ascender.ejerc005.model.Documento;
@Repository
public interface DocumentoRepository extends JpaRepository<Documento, Long> {

}
