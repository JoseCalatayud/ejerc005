package es.santander.ascender.ejerc005.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank    
    private String nombre;
    @NotBlank
    private String apellidos;
    @Positive
    private int edad;
    @NotNull
    private Long provincia_Id;

    public Persona() {
    }

    public Persona(String nombre, String apellidos, int edad, Long provincia_Id) {
        
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.provincia_Id = provincia_Id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Long getProvincia() {
        return provincia_Id;
    }

    public void setProvincia(Long provincia_Id) {
        this.provincia_Id = provincia_Id;
    }
}
