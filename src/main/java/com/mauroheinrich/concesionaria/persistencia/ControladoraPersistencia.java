
package com.mauroheinrich.concesionaria.persistencia;

import com.mauroheinrich.concesionaria.logica.Automovil;
import com.mauroheinrich.concesionaria.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    AutomovilJpaController autoJpa = new AutomovilJpaController();    

    public void agregarAutomovil(Automovil auto) {
        autoJpa.create(auto);
        }

    public List<Automovil> traerAutos() {
       return autoJpa.findAutomovilEntities();
    
    }

    public void borrarAuto(int idAuto) {
        try {
            autoJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
}
