package es.santander.ascender.ejerc005.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.santander.ascender.ejerc005.model.Provincia;

@Repository
public interface ProvinciaRepository extends JpaRepository<Provincia, Long> {

}
