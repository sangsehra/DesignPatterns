package DesignPatterns.StructuralDesignPatterns.ProxyDesignPattern;

public class EmployeeCRUDProxy implements EmployeeCRUD{

    EmployeeCRUDImpl employeeCRUD = new EmployeeCRUDImpl();

    @Override
    public void createEmployee(String client, EmployeeDAO employeeDAO) throws Exception {
        if(client.equals("ADMIN")){
            employeeCRUD.createEmployee(client,employeeDAO);
        } else
          throw new Exception("PERMISSION Denied");
    }

    @Override
    public void deleteEmployee(String client, int id) throws Exception {
        if(client.equals("ADMIN")){
            employeeCRUD.deleteEmployee(client,id);
        }
        else
         throw new Exception("PERMISSION Denied");
    }

    @Override
    public EmployeeDAO getEmployee(String client, int id) throws Exception {
        if(client.equals("ADMIN") || client.equals("USER")){
            return employeeCRUD.getEmployee(client,id);
        }
        else
         throw new Exception("PERMISSION Denied");
    }
}
