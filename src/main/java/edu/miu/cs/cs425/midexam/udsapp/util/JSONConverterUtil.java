package edu.miu.cs.cs425.midexam.udsapp.util;

import edu.miu.cs.cs425.midexam.udsapp.dto.AppointmentDTO;
import org.json.JSONArray;

import java.util.Arrays;

public class JSONConverterUtil {

    public static String convertPatientArrayToJSON(AppointmentDTO[] patients) {
        JSONArray jsonArray = new JSONArray();
        Arrays.stream(patients).forEach(patient -> {
            jsonArray.put(patient.toJSON());
        });
        return jsonArray.toString(2);
    }

}
