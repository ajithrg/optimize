package locking_application.locking.Project.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
@Builder
@Table(name="staff_table")
@Entity
public class StaffEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer staffId;

    private String firstName;

    @Version
    private int versioning;
}
