package pha.phaspring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pha.phaspring.Model.EmergencyContact;

public interface EmergencyContactRepository extends JpaRepository <EmergencyContact, Integer> {
    
}
