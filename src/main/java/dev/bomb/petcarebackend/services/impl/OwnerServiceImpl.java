package dev.bomb.petcarebackend.services.impl;

import dev.bomb.petcarebackend.models.OwnerModel;
import dev.bomb.petcarebackend.repositorys.OwnerRepository;
import dev.bomb.petcarebackend.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerServiceImpl implements OwnerService {

    private final OwnerRepository ownerRepository;

    public OwnerServiceImpl(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public List<OwnerModel> findAllOwner() {
        return this.ownerRepository.findAll();
    }

    @Override
    public Optional<OwnerModel> findById(Long id) {
        return this.ownerRepository.findById(id);
    }

    @Override
    public OwnerModel saveOwner(OwnerModel owner) {
        return this.ownerRepository.save(owner);
    }

    @Override
    public void deleteOwner(Long id) {
        this.ownerRepository.deleteById(id);
    }
}
