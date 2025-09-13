package co.unicauca.microkernel.plugins.reporthtml;

import co.unicauca.microkernel.common.entities.Project;
import co.unicauca.microkernel.common.entities.Report;
import co.unicauca.microkernel.common.interfaces.IReportPlugin;
/**
 * Plugin para reporte html
 * @author Valentina
 */
public class ReportHtmlPlugin implements IReportPlugin {

    @Override
    public String generateReport(Report report) {
        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html>\n");
        sb.append("<html lang=\"es\">\n");
        sb.append("<head>\n");
        sb.append("  <title>Reporte de Proyectos de Grado</title>\n");
        sb.append("</head>\n");
        sb.append("<body>\n");
        sb.append("  <h1>Reporte de Proyectos de Grado</h1>\n");
        sb.append("  <table>\n");
        sb.append("    <thead>\n");
        sb.append("      <tr>\n");
        sb.append("        <th>ID</th>\n");
        sb.append("        <th>Nombre del Proyecto</th>\n");
        sb.append("        <th>Fecha aprobacion formato A</th>\n");
        sb.append("        <th>Estudiante(s)</th>\n");
        sb.append("        <th>Profesor</th>\n");
        sb.append("        <th>Tipo</th>\n");
        sb.append("        <th>Programa</th>\n");
        sb.append("      </tr>\n");
        sb.append("    </thead>\n");
        sb.append("    <tbody>\n");

        for (Project p : report.getProject()) {
            sb.append("    <tr>\n");
            sb.append("      <td>").append(p.getId()).append("</td>\n");
            sb.append("      <td>").append(p.getNombreProyecto()).append("</td>\n");
            sb.append("      <td>").append(p.getFechaAprobacionFormatoA()).append("</td>\n");
            sb.append("      <td>").append(String.join(", ", p.getEstudiantes())).append("</td>\n");
            sb.append("      <td>").append(p.getProfesor()).append("</td>\n");
            sb.append("      <td>").append(p.getTipo()).append("</td>\n");
            sb.append("      <td>").append(p.getPrograma()).append("</td>\n");
            sb.append("    </tr>\n");
        }

        sb.append("  </tbody>\n");
        sb.append("</table>\n</body>\n</html>");
        return sb.toString();
    }
}

