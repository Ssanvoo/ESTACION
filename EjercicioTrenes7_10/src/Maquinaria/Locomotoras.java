

package Maquinaria;

import Personal.*;

public class Locomotoras {
    private String matricula;
    private int potencia;
    private int fabricacion;
    private Mecanicos mecanico;

    public Locomotoras(String matricula, int potencia, int fabricacion, Mecanicos mecanico) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.fabricacion = fabricacion;
        this.mecanico = mecanico;
    }

    @Override
    public String toString() {
        return "LOCOMOTORA "+ matricula +", Potencia: " + potencia + ", Mecanico: " + mecanico;
    }
    
    
    
}

