package edu.miu.cs.cs425.midexam.udsapp.dao;

import edu.miu.cs.cs425.midexam.udsapp.model.Appointment;
import edu.miu.cs.cs425.midexam.udsapp.model.Patient;

import java.time.LocalDate;
import java.time.LocalTime;

public class AppointmentDAO {
    private static AppointmentDAO instance;

    private Appointment[] appointments = null;

    private AppointmentDAO() {
    }

    public static synchronized AppointmentDAO getInstance() {
        if (instance == null) {
            // Lazy initialization of the singleton instance
            // This ensures that the instance is created only when it is needed.
            instance = new AppointmentDAO();
        }
        return instance;
    }

    private void loadData() {
        this.appointments = new Appointment[] {
                new Appointment(
                        1,
                        LocalDate.of(2025, 2, 28),
                        LocalTime.of(10, 5),
                        new Patient("John", "Smith", "(641) 001-1234", LocalDate.of(1987, 1, 19))
                ),
                new Appointment(
                        2,
                        LocalDate.of(2024, 12, 31),
                        LocalTime.of(13, 45),
                        new Patient("Anna", "Jones", "(319) 716-1987", LocalDate.of(2001, 7, 26))
                ),
                new Appointment(
                        3,
                        LocalDate.of(2025, 5, 4),
                        LocalTime.of(14, 0),
                        new Patient("Carlos", "Jimenez", "(319) 098-7711", LocalDate.of(1969, 11, 5))
                ),
                new Appointment(
                        4,
                        LocalDate.of(2025, 3, 16),
                        LocalTime.of(11, 15),
                        new Patient("Albert", "Einstein", "(641) 119-6142", LocalDate.of(1955, 12, 28))
                )
        };
    }



    public Appointment[] getPatients() {
        if (appointments == null || appointments.length == 0) {
            loadData();
        }
        return appointments;
    }
}
