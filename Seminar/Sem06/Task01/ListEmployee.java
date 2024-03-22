package OOP.Seminar.Sem06.Task01;

import java.util.ArrayList;

public class ListEmployee {
    ArrayList<Employee> EmployeeList = new ArrayList<>(); // справа, в угловых скобках, 
                                                          // "Employee" можно не писать
    public void saveEmployee(Employee employee) {
        EmployeeList.add(employee);
    }
}
