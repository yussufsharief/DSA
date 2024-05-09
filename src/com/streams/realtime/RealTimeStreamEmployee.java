package com.streams.realtime;

import com.concurrency.practice.ConversionOverload;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RealTimeStreamEmployee {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        // How many male and female employees are there in the organization?
        employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting())).
        forEach((k,v)-> System.out.println(k+" "+v));

        //Print name of all Departments in organization
        employeeList.stream().map(Employee::getDepartment).distinct().toList().forEach(System.out::println);

        //Average Age of male and female employee
        employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge))).
                forEach((k,v)-> System.out.println(k+" "+v));
        //DEtails of highest paid employee in the organization
        employeeList.stream().max(Comparator.comparing(Employee::getSalary)).stream().toList().forEach(System.out::println);
            Map<String,String> map= new HashMap();
            Set<String> set  = new HashSet<>();

        //get Name of All Employees joined after 2015
        employeeList.stream().filter(employee -> employee.yearOfJoining>2015).map(Employee::getName).toList().forEach(System.out::println);

        //Count number of Employees in each department
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting())).
        forEach((k,v)-> System.out.println(k +" "+ v));

        //Average salary of each Department
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary))).
        forEach((k,v)-> System.out.println(k + " " +v));

        //Get Details of Youngest Employee in PD department
        System.out.println(employeeList.stream().filter(employee -> employee.getDepartment().equalsIgnoreCase("Product Development")).min(Comparator.comparing(Employee::getAge)).get());

        //Most Work experience in ORG
        System.out.println(employeeList.stream().min(Comparator.comparing(Employee::getYearOfJoining)).get());

        //Ma;e and female count in sales and marketing
        employeeList.stream().filter(employee -> employee.getDepartment().equalsIgnoreCase("Sales and Marketing")).
                collect(Collectors.groupingBy(Employee::getGender,Collectors.counting())).
        forEach((k,v)-> System.out.println(k +" "+ v));


        //Male and Female avg salary
        employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary))).
                forEach((k,v)-> System.out.println(k +" "+ v));

        //List of all employee names in each departments
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().stream()
                .forEach(k-> System.out.println(k.getKey() +" "+ k.getValue()));

        //what is average and total salary of whole org;
         System.out.println(employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getAverage());
    // Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
        employeeList.stream().collect(Collectors.partitioningBy(employee -> employee.getAge()>25)).
                forEach((k,v)-> System.out.println(k + "" +v));
        //Who is the oldest employee in the organization? What is his age and which department he belongs to?
        System.out.println(employeeList.stream().max(Comparator.comparing(Employee::getAge)).get().getAge());
        System.out.println(employeeList.stream().max(Comparator.comparing(Employee::getAge)).get().getDepartment());
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)));

        employeeList.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList()).forEach(System.out::println);
        employeeList.stream().map(emp->Optional.ofNullable(emp)).filter(Optional::isPresent).sorted(Comparator.comparing(employee -> employee.get().getAge())).collect(Collectors.toList());

        System.out.println(employeeList.stream().max(Comparator.comparing(Employee::getSalary)).stream().skip(1).findFirst());
    }





}
