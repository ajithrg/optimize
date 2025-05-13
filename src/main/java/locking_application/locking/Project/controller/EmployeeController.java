package locking_application.locking.Project.controller;


import locking_application.locking.Project.dto.PatientUpdateDTO;
import locking_application.locking.Project.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/optimize")
@RestController
@RequiredArgsConstructor
public class EmployeeController {

    private final PatientService patientService;

    @PostMapping
    public ResponseEntity<String> storeUserData(@RequestBody PatientUpdateDTO  dto){

    String userData=    patientService.storeUserData(dto);

        return ResponseEntity.ok("Stored Successfull");
    }
}
