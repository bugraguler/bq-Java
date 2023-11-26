package com.classes.class028;

public class StudentEncapsulationTester {
    public static void main(String[] args) {
        StudentEncapsulation s = new StudentEncapsulation();
        s.setName("Ali");
        s.setAge(22);
        System.out.println(s.getAge()+" "+s.getName());
    }
}
