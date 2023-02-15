/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 *
 * @author Usuario
 */
public class Alumno
        extends Persona
{

    protected int registro;
    protected int promedio;

    public Alumno(int registro,
            int promedio,
            String nombre,
            String apellido,
            int edad)
    {
        super(nombre,
                apellido,
                edad);
        this.registro = registro;
        this.promedio = promedio;
    }

    public Alumno()
    {
        super(null,
                null,
                0);
        this.registro = 21100100;
        this.promedio = 10;
    }

    public void setRegistro(int registro)
    {
        this.registro = registro;
    }

    public void setPromedio(int promedio)
    {
        this.promedio = promedio;
    }

    public int getRegistro()
    {
        return registro;
    }

    public int getPromedio()
    {
        return promedio;
    }

}
