package com.ejemplo.libreria.Util;

import org.springframework.stereotype.Component;

import com.ejemplo.libreria.Model.Libros;

@Component
public class ValidaLIbros {
    public Libros libro;

    public boolean tituloValido(){
        return libro.getTitulo() !=null && !Boolean.parseBoolean(libro.getTitulo());


    }

}
