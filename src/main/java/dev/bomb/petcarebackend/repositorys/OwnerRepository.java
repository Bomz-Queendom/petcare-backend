package dev.bomb.petcarebackend.repositorys;

import dev.bomb.petcarebackend.models.OwnerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<OwnerModel, Long> {
}
