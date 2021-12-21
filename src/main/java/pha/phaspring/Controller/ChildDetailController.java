package pha.phaspring.Controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pha.phaspring.Model.ChildrenDetail;
import pha.phaspring.Repository.ChildrenDetailRepository;
import pha.phaspring.Response.ChildrenResponse;

@CrossOrigin(origins ="http://localhost:3000")
@RestController
@RequestMapping("/api/v1/employee")
public class ChildDetailController {
    


    @Autowired
    private ChildrenDetailRepository childrenDetailRepository;

    
    @GetMapping("/testing/{testingId}")
    public List<ChildrenResponse> getChildDetailbytestingId (@PathVariable Integer testingId){

        
        List<ChildrenDetail> childList = childrenDetailRepository.findBytestingId(testingId);
        List<ChildrenResponse> childResponseList = new ArrayList<ChildrenResponse>();

        childList.stream().forEach(child ->{ 
            childResponseList.add(new ChildrenResponse(child));
        });
        
       
        return childResponseList;
    }

    

}
