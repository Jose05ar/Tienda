
package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;


@Data
@Entity
@Table(name="categoria")
public class Categoria implements Serializable {
    
    private static final long serialVersionUID =1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Long idCategoria;
    private String description;
    private String rutaImagen;
    private boolean activo;

    public Categoria() {
    }

    public Categoria(Long idCategoria, String description, String rutaImagen, boolean activo) {
        this.description = description;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
     
}
