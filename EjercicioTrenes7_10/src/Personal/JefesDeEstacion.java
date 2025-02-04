package Personal;

import java.time.LocalDate;

public class JefesDeEstacion extends Persona{

 
    private LocalDate fecha;

    public JefesDeEstacion(String nombre, String dni, LocalDate fecha) {
        this.nombre = nombre;
        this.dni = dni;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "JEFE DE ESTACION: " + nombre + ", DNI " + dni + ", FECHA NOMBRAMIENTO: " + fecha;
    }
    
}
