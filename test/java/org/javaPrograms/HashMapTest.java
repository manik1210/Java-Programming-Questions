package org.javaPrograms;

import org.javaPrograms.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class HashMapTest {
    public static void main(String[] args) {
        LinkedList<Employee> employees= new LinkedList<>();
        employees.add(new Employee(15,"Mani",10000));
        employees.add(new Employee(25,"King",10000));
        employees.add(new Employee(25,"Raj",10000));
        employees.add(new Employee(35,"Rajini",10000));

        HashMap<Integer,ArrayList<Employee>> ageMap= new HashMap<>();
        ageMap.put(25,new ArrayList<>());
        for(Employee employee:employees){
            if(employee.getAge()==25){
                ageMap.get(25).add(employee);
            }
        }
        System.out.println(ageMap.get(25));
    }
}
