package co.unicauca.microkernel.business;

import co.unicauca.microkernel.common.entities.Project;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Valentina
 */
public class ProjectService {
    
     public List<Project> getAll() {
        List<Project> projects = new ArrayList<>();
        projects.add(new Project(1, "Sistema de Biblioteca", "2025-09-10", List.of("Zoila Cerda","Dolores del Busto"), "Lic. Alan Brito Delgado", "Software", "Ingenieria"));//Opc: Dolores del Busto// Alma Marcela Gozo
        projects.add(new Project(2, "Plataforma de Microkernel", "2025-09-11", List.of("ChatYiPiTi"), "Ing. Aquiles Castro", "Arquitectura", "Sistemas"));//Opc: Elba Lasso //Armando Puerta de las Cazas
        
        return projects;
    }
        
}
