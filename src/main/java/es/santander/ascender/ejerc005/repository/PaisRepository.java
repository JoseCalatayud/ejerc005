package es.santander.ascender.ejerc005.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.santander.ascender.ejerc005.model.Pais;
@Repository
public interface PaisRepository extends JpaRepository<Pais, Long> {

}
