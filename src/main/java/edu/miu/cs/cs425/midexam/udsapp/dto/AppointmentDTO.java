package edu.miu.cs.cs425.midexam.udsapp.dto;

import edu.miu.cs.cs425.midexam.udsapp.model.Patient;
import org.json.JSONObject;

import java.time.LocalDate;
import java.time.LocalTime;

public record AppointmentDTO(
        int appointmentId,
        LocalDate date,
        LocalTime time,
        Patient patient
) {
    public JSONObject toJSON() {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("appointmentId", appointmentId);
        jsonObject.put("appointmentDate", date.toString());
        jsonObject.put("appointmentTime", time.toString());

            jsonObject.put("patientFirstName", patient.getFirstName());
            jsonObject.put("patientLastName", patient.getLastName());
            jsonObject.put("patientPhoneNumber",
                    (patient.getPhoneNumber() != null) ? patient.getPhoneNumber() : "null");
            jsonObject.put("patientDateOfBirth",
                    (patient.getDateOfBirth() != null) ? patient.getDateOfBirth().toString() : "null");

        return jsonObject;
    }
}
