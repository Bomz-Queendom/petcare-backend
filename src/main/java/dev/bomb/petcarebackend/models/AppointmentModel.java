package dev.bomb.petcarebackend.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Appointment")
public class AppointmentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private Long bookingId;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private OwnerModel ownerModelId;

    @Column(name = "type")
    private String type;

    @Column(name = "date")
    private Date date;

    @Column(name = "note")
    private String note;

    public AppointmentModel() {
    }

    public AppointmentModel(Long bookingId, OwnerModel ownerModelId, String type, Date date, String note) {
        this.bookingId = bookingId;
        this.ownerModelId = ownerModelId;
        this.type = type;
        this.date = date;
        this.note = note;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public OwnerModel getOwnerId() {
        return ownerModelId;
    }

    public void setOwnerId(OwnerModel ownerModelId) {
        this.ownerModelId = ownerModelId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
