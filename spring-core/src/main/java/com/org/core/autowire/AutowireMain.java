package com.org.core.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ehimnay on 07/03/2017.
 */
public class AutowireMain {
        public static void main(String...args){
                ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
                EmployeeByName employeeByName = (EmployeeByName) context.getBean("employeeByName");
                System.out.println(employeeByName.getName());
                System.out.println(employeeByName.getEmployer().getName());

                EmployeeByType employeeByType = (EmployeeByType) context.getBean("employeeByType");
                System.out.println(employeeByType.getName());
                System.out.println(employeeByType.getEmployer().getName());

                EmployeeByConstructor employeeByConstructor = (EmployeeByConstructor) context.getBean("employeeByConstructor");
                System.out.println(employeeByConstructor.getName());
                System.out.println(employeeByConstructor.getEmployer().getName());

                /*EmployeeByAutoDetect employeeByAutoDetect = (EmployeeByAutoDetect) context.getBean("employeeByAutoDetect");
                System.out.println(employeeByAutoDetect.getName());
                System.out.println(employeeByAutoDetect.getEmployer().getName());*/
        }
}
