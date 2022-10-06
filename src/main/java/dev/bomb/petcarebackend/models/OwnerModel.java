package dev.bomb.petcarebackend.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Owner")
public class OwnerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ownerId;

    private String fullName;


    public OwnerModel() {

    }

    public OwnerModel(Long ownerId) {
        this.ownerId = ownerId;
    }

    public OwnerModel(Long ownerId, String fullName) {
        this.ownerId = ownerId;
        this.fullName = fullName;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public String getFullName() {
        return fullName;
    }


    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}
