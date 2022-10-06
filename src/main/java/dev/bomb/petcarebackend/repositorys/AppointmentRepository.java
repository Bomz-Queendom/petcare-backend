package dev.bomb.petcarebackend.repositorys;

import dev.bomb.petcarebackend.models.AppointmentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<AppointmentModel, Long> {
}
