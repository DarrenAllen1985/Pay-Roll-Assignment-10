package com.darren.factory.user;

import com.darren.domain.user.Employee;
import com.darren.util.Misc;

public class EmployeeFactory {

    public static Employee buildEmployee(String firstName, String lastName){
        return new Employee.Builder()
                .employeeNumber(Misc.generateId())
                .employeeFirstName(firstName)
                .employeeLastName(lastName)
                .build();
    }

}
