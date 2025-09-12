package co.unicauca.microkernel.business;


import co.unicauca.microkernel.common.entities.Report;
import co.unicauca.microkernel.common.interfaces.IReportPlugin;
import co.unicauca.microkernel.plugin.manager.ReportPluginManager;

public class ReportService {

     public String generateReport(Report report) throws Exception {

        String formatType = report.getFormatType();
        
        ReportPluginManager manager = ReportPluginManager.getInstance();
        IReportPlugin plugin = manager.getReportPlugin(formatType);

        if (plugin == null) {
            throw new Exception("No hay un plugin disponible para el formato indicado: " + report);
        }
        return plugin.generateReport(report);

    }
}