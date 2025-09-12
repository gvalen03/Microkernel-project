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
        projects.add(new Project(1, "Sistema de Biblioteca", "2025-09-10", List.of("Valentina"), "Profesor Pérez", "Software", "Ingeniería"));
        projects.add(new Project(2, "Plataforma de Microkernel", "2025-09-11", List.of("Dayana"), "Profesor López", "Arquitectura", "Sistemas"));
        
        return projects;
    }
        
}
