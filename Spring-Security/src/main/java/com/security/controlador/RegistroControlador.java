package com.security.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.crud.categoria.service.ICategoriaService;
import com.crud.producto.service.IProductoService;

@Controller
public class RegistroControlador {

    @Autowired
    private ICategoriaService categoriaServicio;

    @Autowired
    private IProductoService productoServicio;

    @GetMapping("/index")
    public String index() {
        return "index"; 
    }

    @GetMapping("/productos")
    public String mostrarProductos(Model modelo) {
        modelo.addAttribute("productos", productoServicio.listarProductos());
        return "productos"; 
    }

    @GetMapping("/categorias")
    public String mostrarCategorias(Model modelo) {
        modelo.addAttribute("categorias", categoriaServicio.listarCategorias());
        return "categorias"; 
    }
    
    @GetMapping("/mostrarCategorias") 
    public String mostrarCategoriasOtraRuta(Model modelo) {
        modelo.addAttribute("categorias", categoriaServicio.listarCategorias());
        return "categorias"; 
    }
    
    @GetMapping("/mostrarProductos") 
    public String mostrarProductosOtraRuta(Model modelo) {
        modelo.addAttribute("productos", productoServicio.listarProductos());
        return "productos"; 
    }
}

