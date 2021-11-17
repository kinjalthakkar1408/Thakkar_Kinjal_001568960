package Business;

import Business.Employee.Employee;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
//        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
//        
//        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        Employee employee = system.getEmployeeDirectory().createEmployee("Employee");
        Employee delivery = system.getEmployeeDirectory().createEmployee("Delivery Guy");
        Employee customer = system.getEmployeeDirectory().createEmployee("Kinjal");
        Employee res_admin = system.getEmployeeDirectory().createEmployee("Restaurant Admin");
        
        UserAccount uo = system.getUserAccountDirectory().createUserAccount("customer", "customer", customer, new CustomerRole());
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        UserAccount ub = system.getUserAccountDirectory().createUserAccount("delivery", "delivery", delivery, new DeliverManRole());
        UserAccount uc = system.getUserAccountDirectory().createUserAccount("resadmin", "restaurant_admin", res_admin, new AdminRole());

        return system;
    }
    
}
