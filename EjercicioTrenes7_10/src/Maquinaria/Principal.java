package Maquinaria;

import Personal.*;
import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
        Mecanicos m1 = new Mecanicos("Manuel", 656356644, "frenos");
        Locomotoras l1 = new Locomotoras("3340KTY", 670, 2006, m1);
        Maquinistas maq1 = new Maquinistas("Raluca", "12556870R", 1400.56, "Becario");
        Trenes t1 = new Trenes(l1, maq1);
        Vagon v1 = new Vagon(115679, 550, 1200, "Cafeteras alemanas");
        JefesDeEstacion j1 = new JefesDeEstacion("Mortadelo", "7793322H", LocalDate.of(2025, 1, 10));

        t1.enganchaVagon(180, 7000, "Pan");
        t1.enganchaVagon(5500, 5600, "peluches");
        t1.enganchaVagon(1999, 2000, "Peras");

        System.out.println(j1.toString());
        System.out.println(l1.toString());
        System.out.println(m1.toString());
        System.out.println(maq1.toString());    
        t1.detallesVagon();
        t1.enganchaVagon(500, 2000, "Teclados");
        t1.enganchaVagon(500, 56000, "Alimentos perecederos");
        t1.detallesVagon();
        t1.enganchaVagon(0, 2000, "Vacio ");
    }
}
