package com.ejemplo.libreria.RepoLibros;

import java.util.List;
import java.util.Optional;

import com.ejemplo.libreria.Model.Libros;

public interface I_Repolibros {
    List<Libros> findAll();
    //Optional<Libros>findById(long id);
    //void save(Libros libro);
    void deleteById (long id);
    Optional<Libros> findById(long id);
    void save(Libros libro);
    Optional<Libros> findById(Long idLibro);
   
    

}
