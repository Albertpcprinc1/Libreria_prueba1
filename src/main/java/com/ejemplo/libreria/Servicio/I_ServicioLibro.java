package com.ejemplo.libreria.Servicio;
import com.ejemplo.libreria.Model.Libros;
import java.util.List;
import java.util.Optional;



public interface I_ServicioLibro {
    List<Libros>ObtenerTodos();
    Optional<Libros>obtenerPorId(long id);
    Libros guardar(Libros libro);
    void eliminarPorId(long id);
    String buscalibroPorTitulo(String titulo);
        


    

}
