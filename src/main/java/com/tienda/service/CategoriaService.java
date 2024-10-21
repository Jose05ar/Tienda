
package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public interface CategoriaService {
    
    
    public List<Categoria> getCategorias(boolean activos);
    
}
