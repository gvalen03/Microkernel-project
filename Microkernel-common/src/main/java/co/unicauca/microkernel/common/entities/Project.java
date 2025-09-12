package co.unicauca.microkernel.common.entities;

import java.util.List;

/**
 *
 * @author Valentina
 */
public class Project {
    private int id;
    private String nombreProyecto;
    private String fechaAprobacionFormatoA;
    private List<String> estudiantes;
    private String profesor;
    private String tipo;
    private String programa;

    public Project() {
    }

    //Constructor principal (con lista de estudiantes)
    public Project(int id, String nombreProyecto, String fechaAprobacionFormatoA,
                   List<String> estudiantes, String profesor, String tipo, String programa) {
        this.id = id;
        this.nombreProyecto = nombreProyecto;
        this.fechaAprobacionFormatoA = fechaAprobacionFormatoA;
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.tipo = tipo;
        this.programa = programa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getFechaAprobacionFormatoA() {
        return fechaAprobacionFormatoA;
    }

    public void setFechaAprobacionFormatoA(String fechaAprobacionFormatoA) {
        this.fechaAprobacionFormatoA = fechaAprobacionFormatoA;
    }

    public List<String> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<String> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id: " + id +
                ", nombreProyecto: '" + nombreProyecto + '\'' +
                ", fechaAprobacionFormatoA: '" + fechaAprobacionFormatoA + '\'' +
                ", estudiantes: " + estudiantes +
                ", profesor: '" + profesor + '\'' +
                ", tipo: '" + tipo + '\'' +
                ", programa: '" + programa + '\'' +
                '}';
    }
}