package pha.phaspring.Response;

import pha.phaspring.Model.SpouseDetail;

public class SpouseDetailResponse {

    private int spouseId;
    private String spouseName;
    private String occupation;
    private String contactNum;
    private String marriageCert;

    
    public int getSpouseId() {
        return spouseId;
    }
    public void setSpouseId(int spouseId) {
        this.spouseId = spouseId;
    }
    public String getSpouseName() {
        return spouseName;
    }
    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }
    public String getOccupation() {
        return occupation;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public String getContactNum() {
        return contactNum;
    }
    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }
    public String getMarriageCert() {
        return marriageCert;
    }
    public void setMarriageCert(String marriageCert) {
        this.marriageCert = marriageCert;
    }

    public SpouseDetailResponse() {
    }
    public SpouseDetailResponse(SpouseDetail spouseDetail) {
        this.spouseId = spouseDetail.getSpouseId();
        this.spouseName = spouseDetail.getSpouseName();
        this.occupation = spouseDetail.getOccupation();
        this.contactNum = spouseDetail.getContactNum();
        this.marriageCert = spouseDetail.getMarriageCert();
    }

    
    
}
