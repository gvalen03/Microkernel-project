package co.unicauca.microkernel.presentation;

import co.unicauca.microkernel.business.ProjectService;
import co.unicauca.microkernel.business.ReportService;
import co.unicauca.microkernel.common.entities.Project;
import co.unicauca.microkernel.common.entities.Report;

import java.util.List;
import java.util.Scanner;

public class Console {
    private final ProjectService projectService;
    private final ReportService reportService;
   
    private final Scanner scanner;

    public Console(){
        projectService = new ProjectService();
        reportService = new ReportService();
        scanner = new Scanner(System.in);
    }

    public void start() {

        int option;

        System.out.println("Aplicacion de reportes");

        do {

            System.out.println();
            System.out.println("1. Imprimir reporte.");
            System.out.println("2. Salir.");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    handleReportOption();
                    break;
            }

        } while(option != 2);

        System.out.println("Aplicación terminada");
    }

    private void handleReportOption(){

        //Mostrar proyecto para el cual se hara el reporte.
        List<Project> projects = projectService.getAll();

        scanner.nextLine();

        System.out.println("Formato del reporte (html | json): ");
        String formatType = scanner.nextLine();

        Report reportEntity = new Report(projects, formatType);

        try {

            String report = reportService.generateReport(reportEntity);
            System.out.println("Reporte en formato " + formatType);
            System.out.println(report);

        } catch (Exception exception) {
            System.out.println("No fue posible realizar el reporte: " + exception.getMessage());
        }
    }
}
