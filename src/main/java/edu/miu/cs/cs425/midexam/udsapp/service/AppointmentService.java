package edu.miu.cs.cs425.midexam.udsapp.service;

import edu.miu.cs.cs425.midexam.udsapp.dao.AppointmentDAO;
import edu.miu.cs.cs425.midexam.udsapp.dto.AppointmentDTO;
import edu.miu.cs.cs425.midexam.udsapp.model.Appointment;
import org.json.JSONArray;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class AppointmentService {
    private final AppointmentDAO appointmentDAO;

    public AppointmentService() {
        this.appointmentDAO = AppointmentDAO.getInstance();
    }


    public void printAppointmentsForQuarter(int year, int quarter) {
        Appointment[] appointments = appointmentDAO.getPatients();

        int startMonth = (quarter - 1) * 3 + 1;
        int endMonth = startMonth + 2;

        JSONArray jsonArray = Arrays.stream(appointments)
                .filter(appt -> {
                    LocalDate date = appt.getDate();
                    return date.getYear() == year &&
                            date.getMonthValue() >= startMonth &&
                            date.getMonthValue() <= endMonth;
                })
                .sorted(Comparator.comparing(Appointment::getDate).reversed())
                .map(appt -> new AppointmentDTO(
                        appt.getAppointmentId(),
                        appt.getDate(),
                        appt.getTime(),
                        appt.getPatient()
                ).toJSON())
                .collect(JSONArray::new, JSONArray::put, JSONArray::putAll);

        System.out.println(jsonArray.toString(2)); // Pretty print
    }
}
