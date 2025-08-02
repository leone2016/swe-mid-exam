package edu.miu.cs.cs425.midexam.udsapp;

import edu.miu.cs.cs425.midexam.udsapp.service.AppointmentService;
import edu.miu.cs.cs425.midexam.udsapp.util.JSONConverterUtil;

public class UDSApp {
    public static void main(String[] args) {
        System.out.println("Hello! Welcome UDS Dental Appointment Management App!");
        System.out.println("Starting the application tasks...");
        System.out.println("Task 1: list of only the Appointments which are booked in a given Quarter of a given year (e.g. 1st Quarter of the year 2025).");
        System.out.println("__________________________________________________________________________");
        // Process data
        AppointmentService service = new AppointmentService();
        service.printAppointmentsForQuarter(2025, 1);

    }
}
