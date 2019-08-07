package com.darren.factory.user;

import com.darren.domain.user.EmployeeGender;

public class EmployeeGenderFactory {

    public static EmployeeGender buildEmployeeGender(String empId,String genderId){
        return new EmployeeGender(empId, genderId);
    }
}
