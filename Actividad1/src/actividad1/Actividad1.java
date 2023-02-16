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
        Alumno Objeto1 = new Alumno();
        Alumno Objeto2 = new Alumno();

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
                    Objeto1.setApellido(apellidoAlumno);
                    Objeto1.setNombre(nombreAlumno);
                    Objeto1.setEdad(edad);
                    Objeto1.setPromedio(promedio);
                    Objeto1.setRegistro(registro);
                    System.out.flush();
                    break;
                case 2:
                    System.out.println(
                            "Nombre del alumno:" + nombreAlumno);
                    nombreAlumno = Objeto1.getNombre();
                    System.out.println(
                            "Apellido del alumno: " + apellidoAlumno);
                    apellidoAlumno = Objeto1.getApellido();
                    System.out.println("Edad del alumno:" + edad);
                    edad = Objeto1.getEdad();
                    System.out.println(
                            "Registro del alumno:" + registro);
                    registro = Objeto1.getRegistro();
                    System.out.println(
                            "Promedio del alumno:" + promedio);
                    promedio = Objeto1.getPromedio();
                    System.out.flush();
                    break;
                case 3:
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
                    Objeto2.setApellido(apellidoAlumno);
                    Objeto2.setNombre(nombreAlumno);
                    Objeto2.setEdad(edad);
                    Objeto2.setPromedio(promedio);
                    Objeto2.setRegistro(registro);
                    System.out.flush();
                    break;
                case 4:
                    System.out.println(
                            "Nombre del alumno:" + nombreAlumno);
                    nombreAlumno = Objeto2.getNombre();
                    System.out.println(
                            "Apellido del alumno: " + apellidoAlumno);
                    apellidoAlumno = Objeto2.getApellido();
                    System.out.println("Edad del alumno:" + edad);
                    edad = Objeto2.getEdad();
                    System.out.println(
                            "Registro del alumno:" + registro);
                    registro = Objeto2.getRegistro();
                    System.out.println(
                            "Promedio del alumno:" + promedio);
                    promedio = Objeto2.getPromedio();
                    System.out.flush();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }

        }
    }

}
