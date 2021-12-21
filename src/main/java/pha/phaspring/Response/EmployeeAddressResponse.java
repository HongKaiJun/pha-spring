package pha.phaspring.Response;

import pha.phaspring.Model.Employee;
import pha.phaspring.Model.EmployeeAddress;

public class EmployeeAddressResponse {
    private int addressId;
    private String pCity;
    private String pState;
    private String pPostcode;
    private String pCountry;
    private String pAddress;
    private String cCity;
    private String cState;
    private String cPostcode;
    private String cCountry;
    private String cAddress;

    
    public int getAddressId() {
        return addressId;
    }
    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }
    public String getpCity() {
        return pCity;
    }
    public void setpCity(String pCity) {
        this.pCity = pCity;
    }
    public String getpState() {
        return pState;
    }
    public void setpState(String pState) {
        this.pState = pState;
    }
    public String getpPostcode() {
        return pPostcode;
    }
    public void setpPostcode(String pPostcode) {
        this.pPostcode = pPostcode;
    }
    public String getpCountry() {
        return pCountry;
    }
    public void setpCountry(String pCountry) {
        this.pCountry = pCountry;
    }
    public String getpAddress() {
        return pAddress;
    }
    public void setpAddress(String pAddress) {
        this.pAddress = pAddress;
    }
    public String getcCity() {
        return cCity;
    }
    public void setcCity(String cCity) {
        this.cCity = cCity;
    }
    public String getcState() {
        return cState;
    }
    public void setcState(String cState) {
        this.cState = cState;
    }
    public String getcPostcode() {
        return cPostcode;
    }
    public void setcPostcode(String cPostcode) {
        this.cPostcode = cPostcode;
    }
    public String getcCountry() {
        return cCountry;
    }
    public void setcCountry(String cCountry) {
        this.cCountry = cCountry;
    }
    public String getcAddress() {
        return cAddress;
    }
    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    

    public EmployeeAddressResponse() {
    }
    
    public EmployeeAddressResponse (EmployeeAddress employeeAddress){
        this.addressId =employeeAddress.getAddressId();
        this.pCity = employeeAddress.getpCity();
        this.pState =employeeAddress.getpState();
        this.pPostcode = employeeAddress.getpPostcode();
        this.pCountry = employeeAddress.getpCountry();
        this.pAddress=employeeAddress.getpAddress();
        this.cCity = employeeAddress.getcCity();
        this.cState =employeeAddress.getcState();
        this.cPostcode = employeeAddress.getcPostcode();
        this.cCountry = employeeAddress.getcCountry();
        this.cAddress=employeeAddress.getcAddress();

    }

  
}
