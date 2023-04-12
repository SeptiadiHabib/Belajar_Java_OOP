package Belajar.java.now.application;

import Belajar.java.now.data.Company;

public class CompanyApp {
    public static void main(String[] args) {

        Company company = new Company();
        company.setName("M&E Group");

        Company.Employee employee = company.new Employee();
        employee.setName("Septiadi Habib");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company2 = new Company();
        company2.setName("Blm ada");

        Company.Employee employee2 = company2. new Employee();
        employee2.setName("Bambang");

        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());


    }
}
