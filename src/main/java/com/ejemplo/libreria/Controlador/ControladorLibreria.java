package com.ejemplo.libreria.Controlador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.libreria.Model.Libros;
//import com.ejemplo.libreria.RepoLibros.Repolibros;
import com.ejemplo.libreria.Servicio.I_ServicioLibro;
//import com.ejemplo.libreria.Servicio.ServicioLibro;

//import es.blackleg.libdam.objects.Libro;

//import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/libros")
public class ControladorLibreria {
        private final I_ServicioLibro i_servicio;


        public ControladorLibreria(I_ServicioLibro i_servicio) {
            this.i_servicio = i_servicio;
        }

        @GetMapping("/todos")
        public List<Libros>listar(){
            return i_servicio.ObtenerTodos();
        }
        
        @GetMapping("/{id}")
        public ResponseEntity<Libros>obtenerPorId(@PathVariable long id){
            Optional<Libros> libro = i_servicio.obtenerPorId(id);
            return libro.map(ResponseEntity::ok).orElseGet(()->
            ResponseEntity.notFound().build());
        }

        @PostMapping("path")
          public ResponseEntity<Libros> crear(@RequestBody Libros libro){
            i_servicio.guardar(libro);
            return ResponseEntity.ok(libro);
          }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> eliminar(@PathVariable long id){
            i_servicio.eliminarPorId(id);
            return ResponseEntity.noContent().build();
        }  
        }
        
        
        
        


        
/* 
        @GetMapping("/{titulo}")
        public String DameLibro (@PathVariable String titulo){
            return libroServicio.buscalibroPorTitulo(titulo);

        }
        @GetMapping("/todos")
        public List<Libros>dimeTodos(){
            return libroRepositorio.findAll();

        }
        
        @GetMapping("/id/{id}")
        public ResponseEntity<Libros>BuscaId(@PathVariable long id){
            return libroRepositorio.BuscaId(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
            

        }
        
        @GetMapping("/clone")
        public String probarClone(){
            Libros original= new Libros(1L,"Miguel de Cervantes", "El Quijote", LocalDate.of(1605, 1, 16));
            Libros copia = original.clone();
            
            return "original: " + original.toString() + " ! COpia: " + copia.toString();

        }
*/
        


