package locking_application.locking.Project.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddressDTO {
    private Integer id;
    private String city;
    private String state;
    private Long pincode;
    private String country;
}
