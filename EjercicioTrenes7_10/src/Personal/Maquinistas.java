package Personal;

public class Maquinistas extends Persona{

    
    private double sueldo;
    private String rango;

    public Maquinistas(String nombre, String dni, double sueldo, String rango) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "MAQUINISTA RESPONSABLE: " +  nombre + ", Rango: " + rango;
    }

}
