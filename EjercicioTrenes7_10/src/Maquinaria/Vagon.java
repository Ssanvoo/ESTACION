package Maquinaria;

import java.util.Scanner;

public class Vagon {

    Scanner sc = new Scanner(System.in);
    private int id;
    private double cargaMax;
    private double cargaActual;
    private String tipoMercancia;

    public Vagon(int id, double cargaActual, double cargaMax, String tipoMercancia) {
        this.id = id;
        this.cargaMax = cargaMax;
        this.cargaActual = cargaActual;
        this.tipoMercancia = tipoMercancia;
        if (cargaActual > cargaMax) {
            System.out.println("La carga actual no puede sobrepasar la maxima");
            System.out.print("Vuelva a introducir la carga: ");
            cargaActual = sc.nextDouble();
        }
    }

    @Override
    public String toString() {
        return "Carga Maxima " + cargaMax + " Carga Actual: " + cargaActual + " Mercancia: " + tipoMercancia; 
    }
    
    

}
