package dev.bomb.petcarebackend.services.impl;

import dev.bomb.petcarebackend.models.AppointmentModel;
import dev.bomb.petcarebackend.repositorys.AppointmentRepository;
import dev.bomb.petcarebackend.services.AppointmentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository appointmentRepository;

    public AppointmentServiceImpl(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public List<AppointmentModel> findAppointmentAll() {
        return this.appointmentRepository.findAll();
    }

    @Override
    public Optional<AppointmentModel> findByAppointmentId(Long id) {
        return this.appointmentRepository.findById(id);
    }

    @Override
    public Optional<AppointmentModel> findByOwnerId(Long id) {
        return this.appointmentRepository.findById(id);
    }

    @Override
    public AppointmentModel saveAppointment(AppointmentModel appointment) {
        return this.appointmentRepository.save(appointment);
    }

    @Override
    public void deleteAppointmentByid(Long id) {
        this.appointmentRepository.deleteById(id);
    }
}
