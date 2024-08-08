/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultimoquiz;

import javax.swing.JOptionPane;


class GestionEstudiantes {

    public Estudiante[] estudiantes; //Creamos un nuevo arreglo 

    public GestionEstudiantes(int tamano) { //Creamos un nuevo constructor 
        estudiantes = new Estudiante[tamano]; //llamamos el arreglo 
    }

    public void agregarEstudiantes() {
        for (int i = 0; i < estudiantes.length; i++) { //Solicitamos los datos 
            String nombre = JOptionPane.showInputDialog("escriba el nombre del estudiante:"); //nombre
            String curso = JOptionPane.showInputDialog("escriba el curso del estudiante:");//curso
            String profesor = JOptionPane.showInputDialog("escriba el nombre del profesor:");//profesor
            int calificacion = Integer.parseInt(JOptionPane.showInputDialog("escriba la nota del estudiante:"));//nota 

            estudiantes[i] = new Estudiante(nombre, curso, profesor, calificacion); //Creamos un nuevo arreglo con estos parametros 
        }
    }

    public void mostrarInformacion() { //CrEamos un nuevo metodo 
        String resultado = "llista de estudiantes";
        for (int i = 0; i < estudiantes.length; i++) {
            Estudiante estudiante = estudiantes[i];
            if (estudiante != null) {
                resultado += "nombre: " + estudiante.getNombreEstudiante()
                        + ", curso: " + estudiante.getCurso()
                        + ", profesor: " + estudiante.getProfesor()
                        + ", calificacion: " + estudiante.getCalificacion();
            }
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    public void mostrarNotas() { //Creamos otro nuevo metodo para las notas 
        int cantidad = 0;
        int sumaCalificaciones = 0;
        int calificacionMayor = 0;
        int calificacionMenor = 100; 
        int contadorMayorPromedio = 0;
        int contadorMenorPromedio = 0;

        for (int i = 0; i < estudiantes.length; i++) {
            Estudiante estudiante = estudiantes[i];
            if (estudiante != null) {
                int calificacion = estudiante.getCalificacion();
                sumaCalificaciones = sumaCalificaciones+calificacion;
                cantidad++;

                if (calificacion > calificacionMayor) {
                    calificacionMayor = calificacion;
                }
                if (calificacion < calificacionMenor) {
                    calificacionMenor = calificacion;
                }
            }  //En este for lo que se hace es calcular cuales son las mayores y menores notas 
        }

        if (cantidad > 0) {
            int promedio = sumaCalificaciones / cantidad;

            String arribaPromedio = "notas arriba del promedio";
            String abajoPromedio = "notas por debajo del promedio ";

            for (int i = 0; i < estudiantes.length; i++) {
                Estudiante estudiante = estudiantes[i];
                if (estudiante != null) {
                    int calificacion = estudiante.getCalificacion();
                    if (calificacion > promedio) {
                        arribaPromedio += estudiante.getNombreEstudiante() + " - " + calificacion + "\n";
                        contadorMayorPromedio++;
                    } else if (calificacion < promedio) {
                        abajoPromedio += estudiante.getNombreEstudiante() + " - " + calificacion + "\n";
                        contadorMenorPromedio++;
                    }
                }
            } //En este oortro for lo que hacemos mas bien es calcular cuales estan arriba/abajo del promedio 

            String EstuMayor = "el  estudiante con la mejor nota ";
            String EstuMenor = "el estudiante con la peor nota  ";
            for (int i = 0; i < estudiantes.length; i++) {
                Estudiante estudiante = estudiantes[i];
                if (estudiante != null) {
                    if (estudiante.getCalificacion() == calificacionMayor) {
                        EstuMayor += estudiante.getNombreEstudiante() + calificacionMayor + "\n";
                    }
                    if (estudiante.getCalificacion() == calificacionMenor) {
                        EstuMenor += estudiante.getNombreEstudiante()  + calificacionMenor+"\n";
                    }
                } //Creamos nuevamente un for para ver cual estudiante es es el que tiene mayor/menor nota 
            }

            JOptionPane.showMessageDialog(null, EstuMayor);
            JOptionPane.showMessageDialog(null, EstuMenor);
            JOptionPane.showMessageDialog(null, "promedio de notas " + promedio);  //Imprimimos los datos que calculamos en los for
            JOptionPane.showMessageDialog(null, arribaPromedio);
            JOptionPane.showMessageDialog(null, abajoPromedio);
        } else {
            JOptionPane.showMessageDialog(null, "no hay estudiantes");
        }
    }
}
