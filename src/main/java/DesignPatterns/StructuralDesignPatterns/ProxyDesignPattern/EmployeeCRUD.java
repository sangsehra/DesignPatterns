package DesignPatterns.StructuralDesignPatterns.ProxyDesignPattern;

public interface EmployeeCRUD {

    public void createEmployee(String client, EmployeeDAO employeeDAO) throws Exception;
    public void deleteEmployee(String client, int id) throws Exception;

    public EmployeeDAO getEmployee(String client, int id) throws Exception;
}
