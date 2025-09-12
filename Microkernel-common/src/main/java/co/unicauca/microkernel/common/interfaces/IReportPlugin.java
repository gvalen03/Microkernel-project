package co.unicauca.microkernel.common.interfaces;

import co.unicauca.microkernel.common.entities.Report;

/**
 *
 * @author Valentina
 */
public interface IReportPlugin {
    String generateReport(Report report);
}
