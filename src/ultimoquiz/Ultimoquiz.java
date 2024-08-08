/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ultimoquiz;

import javax.swing.JOptionPane;

/**
 *
 * @author sebastian
 */
public class Ultimoquiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestionEstudiantes Estudiante1 = new GestionEstudiantes(10);//Creamos el arreglo con la cantidad de estudiantes
        Estudiante1.agregarEstudiantes(); //llamamos los metodos
        Estudiante1.mostrarInformacion(); //llamamos los metodos x2
        Estudiante1.mostrarNotas();//llamamos los metodos x3
    }
}


