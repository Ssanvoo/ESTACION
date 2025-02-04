

package Personal;


public class Mecanicos {
    private String nombre;
    private int telefono;
    private enum Especialidad{
        frenos, hidraulica, electricidad, motor;
    }
    private Especialidad especialidad;

    public Mecanicos(String nombre, int telefono, String especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = Especialidad.valueOf(especialidad);
        
    }

    @Override
    public String toString() {
        return "MECANICO: " + nombre + ", ESPECIALIDAD: " + especialidad; 
    }
    

}

