package com.ejemplo.libreria.Servicio;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.libreria.Model.Libros;
import com.ejemplo.libreria.RepoLibros.I_Repolibros;

@Service
public class ServicioLibro implements I_ServicioLibro{

    private final I_Repolibros i_repo;

    @Autowired    
    public ServicioLibro(I_Repolibros i_repo){
        this.i_repo = i_repo;
    }
       
    @Override 
    public List<Libros> ObtenerTodos(){
        return i_repo.findAll();
    }

    @Override
    public Optional<Libros> obtenerPorId(long id){
        return i_repo.findById(id);
    }

    @Override
    public Libros guardar(Libros libro){
        i_repo.save(libro);
        return libro;
    }

    @Override
    public void eliminarPorId(long id){
    i_repo.deleteById(id);
    }

    @Override
    public String buscalibroPorTitulo(String titulo){
    boolean encontrado = i_repo.findAll().stream()
                        .anyMatch(libros -> libros.getTitulo() 
                        !=null && libros.getTitulo().equalsIgnoreCase(titulo));
                    return encontrado ? "Libro encontrado" : "Libro no encontrado";
                    }
    }







/* 
    public String BuscaLibro( String titulo){
        if ("EL quijote".equalsIgnoreCase(titulo)){
            return "Libro econtrado";}
            else {
                return "Libro NO encontrado";
            }
        }
            */
    





