/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Actividad1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int edad = 0, registro = 0, promedio = 0, opc = 0;
        String nombreAlumno = null, apellidoAlumno = null;
        Alumno Ivan = new Alumno();
        Alumno Charlie = new Alumno(2211011,
                20,
                "Ivan",
                "Ramirez",
                20);

        Scanner lector = new Scanner(System.in);
        while (opc != 5)
        {
            System.out.println(
                    "-MENU-\n1.Capturaer el Objeto1\n2.Mostrar el Objeto1\n3.Capturar el Objeto2\n4.Mostrar el Objeto2\n5.Salir\nSelecciona opcion:");
            opc = lector.nextInt();
            switch (opc)
            {
                case 1:
                    System.out.println("Ingerese el Nombre del alumno:");
                    nombreAlumno = lector.next();
                    System.out.println("Ingerese el Apellido del alumno:");
                    apellidoAlumno = lector.next();
                    System.out.println("Ingerese el Registro del alumno:");
                    registro = lector.nextInt();
                    System.out.println("Ingerese el Edad del alumno:");
                    edad = lector.nextInt();
                    System.out.println("Ingerese el Promedio del alumno:");
                    promedio = lector.nextInt();
                    Ivan.setApellido(apellidoAlumno);
                    Ivan.setNombre(nombreAlumno);
                    Ivan.setEdad(edad);
                    Ivan.setPromedio(promedio);
                    Ivan.setRegistro(registro);
                    System.out.flush();
                    break;
                case 2:
                    System.out.println(
                            "Nombre del alumno:" + nombreAlumno);
                    nombreAlumno = Ivan.getNombre();
                    System.out.println(
                            "Apellido del alumno: " + apellidoAlumno);
                    apellidoAlumno = Ivan.getApellido();
                    System.out.println("Edad del alumno:" + edad);
                    edad = Ivan.getEdad();
                    System.out.println(
                            "Registro del alumno:" + registro);
                    registro = Ivan.getRegistro();
                    System.out.println(
                            "Promedio del alumno:" + promedio);
                    promedio = Ivan.getPromedio();
                    System.out.flush();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
            }

        }
    }

}
