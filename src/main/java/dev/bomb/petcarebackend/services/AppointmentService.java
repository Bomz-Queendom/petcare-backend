package dev.bomb.petcarebackend.services;

import dev.bomb.petcarebackend.models.AppointmentModel;

import java.util.List;
import java.util.Optional;

public interface AppointmentService {
    List<AppointmentModel> findAppointmentAll();

    Optional<AppointmentModel> findByAppointmentId(Long id);

    Optional<AppointmentModel> findByOwnerId(Long id);

    AppointmentModel saveAppointment(AppointmentModel appointment);

    void deleteAppointmentByid(Long id);
}
