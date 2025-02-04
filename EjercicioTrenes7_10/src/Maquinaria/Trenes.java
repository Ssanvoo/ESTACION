package Maquinaria;

import Personal.Maquinistas;

public class Trenes {

    private Locomotoras locomotora;
    private Vagon vagones[];
    private Maquinistas maquinista;
    private int numVagones;

    public Trenes(Locomotoras locomotora, Maquinistas maquinista) {
        this.locomotora = locomotora;
        this.maquinista = maquinista;
        vagones = new Vagon[5];
        numVagones = 0;
    }
    public void enganchaVagon(int cargaMax, int cargaActual, String mercancia){
        if (numVagones > 4){
            System.out.println("No se pueden acoplar mas vagones");
        } else {
            Vagon v = new Vagon(numVagones,cargaMax, cargaActual, mercancia);
            vagones[numVagones] = v;
            numVagones++;
        }
    }

    public void detallesVagon(){
        System.out.println("VAGONES---------------");
        for (int i = 0; i < vagones.length; i++) {
            if (vagones[i] == null){
                System.out.print("");
            }
            else {
                System.out.println("Vagon " + i + ": " + vagones[i]);
            }
        }
    }
}
