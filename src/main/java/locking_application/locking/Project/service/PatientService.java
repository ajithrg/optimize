package locking_application.locking.Project.service;

import locking_application.locking.Project.dto.PatientUpdateDTO;
import locking_application.locking.Project.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public String storeUserData(PatientUpdateDTO dto){

        return "User data stored successfully";
    }
}
