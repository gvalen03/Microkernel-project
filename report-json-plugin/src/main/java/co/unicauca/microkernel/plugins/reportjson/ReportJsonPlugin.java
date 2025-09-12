package co.unicauca.microkernel.plugins.reportjson;

import co.unicauca.microkernel.common.entities.Project;
import co.unicauca.microkernel.common.entities.Report;
import co.unicauca.microkernel.common.interfaces.IReportPlugin;
import java.util.List;

public class ReportJsonPlugin implements IReportPlugin {

    public String generateReport(Report report) {
        StringBuilder sb = new StringBuilder();
        sb.append("[\n");

        for (int i = 0; i < report.getProject().size(); i++) {
            Project p = report.getProject().get(i);
            sb.append("  {\n");
            sb.append("    \"id\": \"").append(p.getId()).append("\",\n");
            sb.append("    \"nombre\": \"").append(p.getNombreProyecto()).append("\",\n");
            sb.append("    \"fechaFormatoA\": \"").append(p.getFechaAprobacionFormatoA()).append("\",\n");

            // Manejar lista de estudiantes (simple: tomar primero y segundo si hay)
            List<String> est = p.getEstudiantes();
            sb.append("    \"estudiante1\": \"").append(est.size() > 0 ? est.get(0) : "").append("\",\n");
            sb.append("    \"estudiante2\": \"").append(est.size() > 1 ? est.get(1) : "").append("\",\n");

            sb.append("    \"profesor\": \"").append(p.getProfesor()).append("\",\n");
            sb.append("    \"tipo\": \"").append(p.getTipo()).append("\",\n");
            sb.append("    \"programa\": \"").append(p.getPrograma()).append("\"\n");
            sb.append("  }");

            if (i < report.getProject().size() - 1) sb.append(",");
            sb.append("\n");
        }

        sb.append("]");
        return sb.toString();
    }
    
}
