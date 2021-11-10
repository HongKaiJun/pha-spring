package pha.phaspring.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pha.phaspring.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee,Integer>{

   // @Query(value = "SELECT * FROM employee e WHERE employeeaddress ea.AddressID = e.AddressID AND ea.P_City = :p_city",nativeQuery = true)
   // List<Employee> queryby (@Param("p_city") String p_city);


  //@Query (value = "select * from employee e where e.Id = :Id",nativeQuery = true)
  //List<Employee> queryBy (@Param("Id") Integer Id);

  //@Query (value = "SELECT e.ID,e.EmployeeID,e.EmpName,e.PassportNo,e.PassportCopy,e.MaritalStatus,e.PhoneNum,e.HouseNum,e.EmpEmail,e.AddressID,e.EmergencyContact,e.SpouseID,e.ChildID,e.PDPA, ea.C_City as CCity FROM employee e JOIN employeeaddress ea on e.AddressID =ea.AddressID where ea.Id = :Id",nativeQuery = true)
  //public List<Employee> queryBy(@Param("Id") Integer Id);

  @Query (value = "select * from employee e JOIN spousedetail sd on e.SpouseID = sd.SpouseID  where e.Id = :Id",nativeQuery = true)
  List<Employee> queryBy (@Param("Id") Integer Id);

  @Query (value ="select * from employee e JOIN spousedetail sd on e.SpouseID = sd.SpouseID",nativeQuery = true)
  List<Employee> getAll();
}



 