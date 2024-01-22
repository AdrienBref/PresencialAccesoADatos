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
        Ficha_Tecnica fichaTecnicaCoche1 = new Ficha_Tecnica(DiaHoy, true, 'B');

        Accesorio accs1 = new Accesorio("asiento cuero", "La mejor tapiceria", 1500.00);
        Accesorio accs2 = new Accesorio("Ruedas de Nieve", "Ideal para cotas altas y frias", 1500.00);
        Accesorio accs3 = new Accesorio("asiento cuero", "La mejor tapiceria", 1500.00);

        accesorios.add(accs1);
        accesorios.add(accs2);
        accesorios.add(accs3);

        Coche coche1 = new Coche();

        coche1.setMarca("Toyota");
        coche1.setModelo("Corolla");
        coche1.setPrecio(20000.0);
        coche1.setMotor(motorCoche1);
        coche1.setFichaTecnica(fichaTecnicaCoche1);
        coche1.setAccesorios(accesorios);

        inventoryManager.saveCoche(coche1);

        System.out.println("vehiculo guardado");









    }
}

