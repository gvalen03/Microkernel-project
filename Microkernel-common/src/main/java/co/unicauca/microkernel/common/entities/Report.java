package co.unicauca.microkernel.common.entities;

import java.util.List;

/**
 *
 * @author Valentina
 */
public class Report {
    private List<Project> project;
    private String formatType;

    public Report(List<Project> project, String formatType) {
        this.project = project;
        this.formatType = formatType;
    }

    public List<Project> getProject() {
        return project;
    }

    public void setProject(List<Project> project) {
        this.project = project;
    }

    public String getFormatType() {
        return formatType;
    }

    public void setFormatType(String formatType) {
        this.formatType = formatType;
    }

    
    
    
}
