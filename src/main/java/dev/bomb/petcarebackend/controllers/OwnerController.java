package dev.bomb.petcarebackend.controllers;

import dev.bomb.petcarebackend.models.OwnerModel;
import dev.bomb.petcarebackend.services.OwnerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/owner")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping("/getAll")
    public List<OwnerModel> findAllOwners() {
        return this.ownerService.findAllOwner();
    }
}
