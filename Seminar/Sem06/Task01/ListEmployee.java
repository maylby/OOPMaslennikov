package OOP.Seminar.Sem06.Task01;

import java.util.ArrayList;

public class ListEmployee {
    ArrayList<Employee> EmployeeList = new ArrayList<Employee>();
    
    public void saveEmployee(Employee employee) {
        EmployeeList.add(employee);
    }
}
