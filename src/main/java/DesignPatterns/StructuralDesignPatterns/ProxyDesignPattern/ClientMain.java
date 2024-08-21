package DesignPatterns.StructuralDesignPatterns.ProxyDesignPattern;

public class ClientMain {
    public static void main(String[] args) throws Exception {
        /*
        this design pattern is used between request and response as name suggests as a PROXY
        to verify requested user or some other things like cache etc
         */

        EmployeeCRUD employeeCRUD = new EmployeeCRUDProxy();

        employeeCRUD.createEmployee("ADMIN",new EmployeeDAO(1,"rajat"));

        employeeCRUD.createEmployee("USER",new EmployeeDAO(1,"rajat"));
    }
}
