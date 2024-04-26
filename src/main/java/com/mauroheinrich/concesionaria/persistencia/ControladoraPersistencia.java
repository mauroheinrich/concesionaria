
package com.mauroheinrich.concesionaria.persistencia;

import com.mauroheinrich.concesionaria.logica.Automovil;


public class ControladoraPersistencia {
    
    AutomovilJpaController autoJpa = new AutomovilJpaController();    

    public void agregarAutomovil(Automovil auto) {
        autoJpa.create(auto);
        }
    
}
