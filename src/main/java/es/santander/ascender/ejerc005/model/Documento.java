package es.santander.ascender.ejerc005.model;

import java.time.LocalDate;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Length(max = 256)
    @NotBlank
    private String nombre;

    @Length(max = 15)
    private String extension;

    @NotBlank
    private Long personaId;

    @NotBlank
    private LocalDate fechaCreacion; // solo fecha

    @NotBlank
    private boolean borrado;

    public Documento() {
    }

    public Documento(String nombre, String extension, Long personaId,
            LocalDate fechaCreacion, boolean borrado) {
        this.id = null;
        this.nombre = nombre;
        this.extension = extension;
        this.personaId = personaId;
        this.fechaCreacion = fechaCreacion;
        this.borrado = borrado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Long getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Long personaId) {
        this.personaId = personaId;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
