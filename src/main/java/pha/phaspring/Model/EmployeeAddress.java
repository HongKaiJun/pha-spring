package pha.phaspring.Model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employeeaddress")
public class EmployeeAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AddressID")
    private int addressId;

    @Column(name = "P_City")
    private String pCity;
    @Column(name = "P_State")
    private String pState;
    @Column(name = "P_PostCode")
    private String pPostcode;
    @Column(name = "P_Country")
    private String pCountry;
    @Column(name = "P_Address")
    private String pAddress;

    @Column(name = "C_City")
    private String cCity;
    @Column(name = "C_State")
    private String cState;
    @Column(name = "C_PostCode")
    private String cPostcode;
    @Column(name = "C_Country")
    private String cCountry;
    @Column(name = "C_Address")
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

}
