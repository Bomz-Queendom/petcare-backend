package dev.bomb.petcarebackend.services;

import dev.bomb.petcarebackend.models.OwnerModel;

import java.util.List;
import java.util.Optional;

public interface OwnerService {

    List<OwnerModel> findAllOwner();

    Optional<OwnerModel> findById(Long id);

    OwnerModel saveOwner(OwnerModel owner);

    void deleteOwner(Long id);

}
