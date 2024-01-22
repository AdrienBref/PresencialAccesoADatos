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
        Set<Accesorio> accesorios = new HashSet<>();

        Motor motorCoche1 = new Motor("MotorToyota", 200.0, "Gasolina", 1000.0);
        Motor motorCoche2 = new Motor("MotorRenault", 170.0, "Diesel", 1000.0);
        Motor motorCoche3 = new Motor("MotorPSA", 125.0, "Electrico", 1000.0);
        Ficha_Tecnica fichaTecnicaCoche1 = new Ficha_Tecnica(DiaHoy, true, 'B');
        Ficha_Tecnica fichaTecnicaCoche2 = new Ficha_Tecnica(DiaHoy, true, 'A');
        Ficha_Tecnica fichaTecnicaCoche3 = new Ficha_Tecnica(DiaHoy, true, '0');

        Accesorio accs1 = new Accesorio("asiento cuero", "La mejor tapiceria", 1500.00);
        Accesorio accs2 = new Accesorio("Ruedas de Nieve", "Ideal para cotas altas y frias", 1500.00);
        Accesorio accs3 = new Accesorio("asiento cuero", "La mejor tapiceria", 1500.00);

        accesorios.add(accs1);
        accesorios.add(accs2);
        accesorios.add(accs3);

        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();

        coche1.setMarca("Toyota");
        coche1.setModelo("Corolla");
        coche1.setPrecio(20000.0);
        coche1.setMotor(motorCoche1);
        coche1.setFichaTecnica(fichaTecnicaCoche1);
        coche1.setAccesorios(accesorios);

        coche2.setMarca("renault");
        coche2.setModelo("clio");
        coche2.setPrecio(10000.0);
        coche2.setMotor(motorCoche2);
        coche2.setFichaTecnica(fichaTecnicaCoche2);
        coche2.setAccesorios(accesorios);

        coche3.setMarca("Citroen");
        coche3.setModelo("c3");
        coche3.setPrecio(10000.0);
        coche3.setMotor(motorCoche3);
        coche3.setFichaTecnica(fichaTecnicaCoche3);
        coche3.setAccesorios(accesorios);

        inventoryManager.saveCoche(coche1);
        inventoryManager.saveCoche(coche2);
        inventoryManager.saveCoche(coche3);

        System.out.println("vehiculo guardado");









    }
}

