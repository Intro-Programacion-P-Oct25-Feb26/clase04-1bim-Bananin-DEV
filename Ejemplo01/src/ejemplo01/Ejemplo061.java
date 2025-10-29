/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo061 {
    public static void main(String[] args) {
        // Uso de printf
        // f: formato
        
        String nombre_estudiante = "Mateo Josue";
        String apellido_estudiante = "Valdivieso Tapia";
        String direccion = "Argelia";
        String universidad = "UTPL";
        String asignatura = "Introduccion a programacion";
        String paralelo = "A";
        int nacimiento = 2007;
        int ciclo = 1;
        
        System.out.printf("Nombre:\n\t%s\n\n%s\n\n%s\n\n%s\n\n%s\n\n%s\n\n%s\n\n%s", nombre_estudiante, apellido_estudiante, direccion, universidad, asignatura, paralelo, nacimiento, ciclo);
        
        
        
        // System.out.println(nombreEstudiante+" "+apellidoEstudiante+ " "+ 
        // nacimiento);
        // En printf; 
        // usamos %s para reemplazar las cadenas, enteros, decimales
        // usamos %d para reemplazar los valores enteros
        // usamos %f para reemplazar los valore decimales
        // System.out.printf("%s\n\n%s\n\n%s\n", nombreEstudiante, 
        //        apellidoEstudiante, nacimiento);
        // System.out.printf("Nombre:%s\n\n%s\n\n%s\n", nombreEstudiante, 
                // apellidoEstudiante, nacimiento);
        
        // System.out.printf("Nombre:%s\n\n%s\n\n%d\n", nombreEstudiante, 
                // apellidoEstudiante, nacimiento);
        
    }
}
