package edu.miu.cs.cs425.midexam.udsapp.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
    private int appointmentId;
    private LocalDate date;
    private LocalTime time;
    private Patient patient;

    public Appointment(int appointmentId, LocalDate date, LocalTime time, Patient patient) {
        this.appointmentId = appointmentId;
        this.date = date;
        this.time = time;
        this.patient = patient;
    }

    // Getters and setters
    public int getAppointmentId() { return appointmentId; }
    public LocalDate getDate() { return date; }
    public LocalTime getTime() { return time; }
    public Patient getPatient() { return patient; }

    @Override
    public String toString() {
        return "Appointment #" + appointmentId + " on " + date + " at " + time + " with " + patient.getFirstName() + " " + patient.getLastName();
    }
}
