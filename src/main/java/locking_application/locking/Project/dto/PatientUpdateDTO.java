package locking_application.locking.Project.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PatientUpdateDTO {
    private String contactInfo;
    private String diagnosis;

}
