package pha.phaspring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pha.phaspring.Model.EducationDetails;

public interface EducationDetailsRepository extends JpaRepository<EducationDetails, Integer> {


}
