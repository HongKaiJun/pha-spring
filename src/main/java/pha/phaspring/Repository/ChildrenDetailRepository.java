package pha.phaspring.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pha.phaspring.Model.ChildrenDetail;

@Repository
public interface ChildrenDetailRepository extends JpaRepository <ChildrenDetail, Integer> {



    @Query ( value = "SELECT * FROM childrendetail cd INNER JOIN testing t on cd.testingId = t.id WHERE testingId=:testingId", nativeQuery=true)
    public List <ChildrenDetail> findBytestingId (Integer testingId);


}
