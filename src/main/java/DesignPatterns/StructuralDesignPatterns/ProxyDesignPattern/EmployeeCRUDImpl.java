package DesignPatterns.StructuralDesignPatterns.ProxyDesignPattern;

public class EmployeeCRUDImpl implements EmployeeCRUD{

    @Override
    public void createEmployee(String client, EmployeeDAO employeeDAO) {
        System.out.println("user created");
    }

    @Override
    public void deleteEmployee(String client, int id) {
        System.out.println("user deleted");
    }

    @Override
    public EmployeeDAO getEmployee(String client, int id) {
       return new EmployeeDAO(1,"raj");
    }
}
