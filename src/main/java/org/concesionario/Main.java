package org.concesionario;
import models.Accesorio;
import models.Coche;
import models.Ficha_Tecnica;
import models.Motor;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import repository.InventoryManager;
import utils.HibernateUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        InventoryManager inventoryManager = new InventoryManager();

        Date DiaHoy = new Date();
        Set<Accesorio> accesoriosCoche1 = new HashSet<>();
        Set<Accesorio> accesoriosCoche2 = new HashSet<>();
        Set<Accesorio> accesoriosCoche3 = new HashSet<>();

        Motor motorCoche1 = new Motor("MotorToyota", 200.0, "Gasolina", 1000.0);
        Motor motorCoche2 = new Motor("MotorRenault", 170.0, "Diesel", 1000.0);
        Motor motorCoche3 = new Motor("MotorPSA", 125.0, "Electrico", 1000.0);

        Ficha_Tecnica fichaTecnicaCoche1 = new Ficha_Tecnica(DiaHoy, true, 'B');
        Ficha_Tecnica fichaTecnicaCoche2 = new Ficha_Tecnica(DiaHoy, true, 'A');
        Ficha_Tecnica fichaTecnicaCoche3 = new Ficha_Tecnica(DiaHoy, true, '0');

        Accesorio accs1 = new Accesorio("asiento cuero", "La mejor tapiceria", 1500.00);
        Accesorio accs2 = new Accesorio("Ruedas de Nieve", "Ideal para cotas altas y frias", 1500.00);
        Accesorio accs3 = new Accesorio("asiento cuero", "La mejor tapiceria", 1500.00);

        Accesorio accs4 = new Accesorio("asiento cuero", "La mejor tapiceria", 1500.00);
        Accesorio accs5 = new Accesorio("Ruedas de Nieve", "Ideal para cotas altas y frias", 1500.00);
        Accesorio accs6 = new Accesorio("asiento cuero", "La mejor tapiceria", 1500.00);

        Accesorio accs7 = new Accesorio("asiento cuero", "La mejor tapiceria", 1500.00);
        Accesorio accs8 = new Accesorio("Ruedas de Nieve", "Ideal para cotas altas y frias", 1500.00);
        Accesorio accs9 = new Accesorio("asiento cuero", "La mejor tapiceria", 1500.00);

        accesoriosCoche1.add(accs1);
        accesoriosCoche1.add(accs2);
        accesoriosCoche1.add(accs3);

        accesoriosCoche2.add(accs4);
        accesoriosCoche2.add(accs5);
        accesoriosCoche2.add(accs6);

        accesoriosCoche3.add(accs7);
        accesoriosCoche3.add(accs8);
        accesoriosCoche3.add(accs9);

        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();

        coche1.setMarca("Toyota");
        coche1.setModelo("Corolla");
        coche1.setPrecio(20000.0);
        coche1.setMotor(motorCoche1);
        coche1.setFichaTecnica(fichaTecnicaCoche1);
        coche1.setAccesorios(accesoriosCoche1);

        coche2.setMarca("renault");
        coche2.setModelo("clio");
        coche2.setPrecio(10000.0);
        coche2.setMotor(motorCoche2);
        coche2.setFichaTecnica(fichaTecnicaCoche2);
        coche2.setAccesorios(accesoriosCoche2);

        coche3.setMarca("Citroen");
        coche3.setModelo("c3");
        coche3.setPrecio(10000.0);
        coche3.setMotor(motorCoche3);
        coche3.setFichaTecnica(fichaTecnicaCoche3);
        coche3.setAccesorios(accesoriosCoche3);

        inventoryManager.saveCoche(coche1);
        System.out.println("Coche1 Guardaddo");
        inventoryManager.saveCoche(coche2);
        System.out.println("Coche2 Guardaddo");
        inventoryManager.saveCoche(coche3);
        System.out.println("Coche3 Guardaddo");

        System.out.println("vehiculo guardado");









    }
}

