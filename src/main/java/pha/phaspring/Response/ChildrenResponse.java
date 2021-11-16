package pha.phaspring.Response;

import java.sql.Date;

import pha.phaspring.Model.ChildrenDetail;


public class ChildrenResponse {
    private int childId;
    private String childName;
    private Date childDate;

    

    public ChildrenResponse() {
    }
    
    public int getChildId() {
        return childId;
    }
    public void setChildId(int childId) {
        this.childId = childId;
    }
    public String getChildName() {
        return childName;
    }
    public void setChildName(String childName) {
        this.childName = childName;
    }
    public Date getChildDate() {
        return childDate;
    }
    public void setChildDate(Date childDate) {
        this.childDate = childDate;
    }
    
    public ChildrenResponse (ChildrenDetail childrenDetail){
        this.childId = childrenDetail.getChildId();
        this.childName = childrenDetail.getChildName();
        this.childDate = childrenDetail.getChildDate();
    }

    
}
