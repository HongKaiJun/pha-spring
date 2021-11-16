package pha.phaspring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pha.phaspring.Model.ChildrenDetail;

@Repository
public interface ChildrenDetailRepository extends JpaRepository <ChildrenDetail, Integer> {
    
}
