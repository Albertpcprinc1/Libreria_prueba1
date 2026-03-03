package com.ejemplo.libreria.Model;
import java.time.LocalDate;


public class Libros implements Cloneable{
    private long idLibro;
    private String autor;
    private String titulo;
    private LocalDate fechaPublicacion;

    public Libros(long idLibro,String autor,String titulo,LocalDate fechaPublicacion){
        this.idLibro = idLibro;
        this.autor = autor;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        }

    public long getIdLibro() {
        return idLibro;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }
       
    @Override
    public Libros clone(){
        try{
            return (Libros) super.clone();
            } catch (CloneNotSupportedException ERROR){
                throw new AssertionError();
                }
    }

    @Override
    public String toString(){
        return "Libros: {" + " Id = " + idLibro + " , titulo = "+ titulo+ '\''+
        ", autor = "+ autor + '\'' + ", Fecha publicacion = "+ fechaPublicacion + '}';
    }
    public void setId(int idLibro) {
 
        
    }

    public void setTitulo(String autor) {
        
        
    }

    public void remove(Libros existing) {
        
        
    }


}
