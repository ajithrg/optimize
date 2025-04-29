package locking_application.locking.Project.repository;

import locking_application.locking.Project.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<PatientEntity,Long> {
}
