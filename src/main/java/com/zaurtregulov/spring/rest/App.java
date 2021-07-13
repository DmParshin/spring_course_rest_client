package com.zaurtregulov.spring.rest;

import com.zaurtregulov.spring.rest.configuration.MyConfig;
import com.zaurtregulov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
        
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee employee = communication.getEmployee(2);
//        System.out.println(employee);

//        Employee employee = new Employee("Sveta", "Sokolova", "HR", 900);
//        communication.saveEmpoyee(employee);

//        Employee employee = new Employee("Sveta", "Sokolova", "IT", 1900);
//        employee.setId(10);
//        communication.saveEmpoyee(employee);

//        communication.deleteEmployee(10);
    }
}
