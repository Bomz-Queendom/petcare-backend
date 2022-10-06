package dev.bomb.petcarebackend.controllers;

import dev.bomb.petcarebackend.models.AppointmentModel;
import dev.bomb.petcarebackend.services.AppointmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
    public final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @GetMapping("/getAll")
    public List<AppointmentModel> findAllAppointment() {
        return this.appointmentService.findAppointmentAll();
    }

    @PostMapping("/addOne")
    public AppointmentModel addAppointment(@RequestBody AppointmentModel appointmentModel) {
        return this.appointmentService.saveAppointment(appointmentModel);
    }

}
