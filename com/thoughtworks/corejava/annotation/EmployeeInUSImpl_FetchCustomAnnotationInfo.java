package com.thoughtworks.corejava.annotation;

import java.lang.annotation.Annotation;

/**
 * Created by rajatbhatnagar on 7/26/15.
 * This class demonstrates how we can fetch the custom annotation values
 * The custom annotation @EmployeeDetailsCustomAnnotation has already been applied to EmployeeInUS
 */
public class EmployeeInUSImpl_FetchCustomAnnotationInfo {
    public static void main(String[] args) {
        EmployeeInUS employeeInUS = new EmployeeInUS("Rita", "Minnesota", 99000);
        System.out.println("===================================");
        System.out.println("Employee in US Details");
        System.out.println("===================================");
        System.out.println("Employee Name :: " + employeeInUS.getEmpName());
        System.out.println("Employee Location :: " + employeeInUS.getEmpLOC());
        System.out.println("Employee Salary :: " + employeeInUS.getEmpSal());
        System.out.println("===================================");
        System.out.println("Fetching Custom annotation details :: ");
        System.out.println("===================================");
        //Fetch class to which custom annotation is applied
        Class classObj = employeeInUS.getClass();
        //Create Annotation obj
        Annotation annotation = classObj.getAnnotation(EmployeeDetailsCustomAnnotation.class);
        //Typecast to EmployeeDetailsCustomAnnotation
        EmployeeDetailsCustomAnnotation myCustomAnnotationDetails = (EmployeeDetailsCustomAnnotation) annotation;
        //Print the details of Custom Annotation
        System.out.println("MyCustomAnnotationDetails are :: ");
        System.out.println("myCustomAnnotationDetails NAME :: " + myCustomAnnotationDetails.employeeName());
        System.out.println("myCustomAnnotationDetails LOCATION :: " + myCustomAnnotationDetails.employeeLocation());
        System.out.println("myCustomAnnotationDetails SALARY :: " + myCustomAnnotationDetails.employeeSalary());
    }
}
