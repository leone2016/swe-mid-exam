package edu.miu.cs.cs425.midexam.udsapp.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private List<Appointment> appointments;

    public Patient(String firstName, String lastName, String phoneNumber, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.appointments = new ArrayList<>();
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    // Getters and setters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getPhoneNumber() { return phoneNumber; }
    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public List<Appointment> getAppointments() { return appointments; }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + phoneNumber + "), DOB: " + dateOfBirth;
    }
}
