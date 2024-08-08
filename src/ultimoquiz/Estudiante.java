/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultimoquiz;

/**
 *
 * @author sebastian
 */
class Estudiante {

    public String nombreEstudiante;
    public String curso;
    public String profesor;
    public int calificacion;
    //Creamos los actores 

    public Estudiante(String nombreEstudiante, String curso, String profesor, int calificacion) {
        this.nombreEstudiante = nombreEstudiante;
        this.curso = curso;
        this.profesor = profesor;
        this.calificacion = calificacion;
        //Creamos los constructores
    }
 
    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    //Creamos los sets and gets 
}

