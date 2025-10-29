package com.campusdual.classroom;

public class Exercise {
    public static void main(String[] args) {
        Person p = new Person("John", "Smith");
        Teacher t = new Teacher("Maria", "Montessori", "Educación");
        PoliceOfficer po = new PoliceOfficer("Jake", "Peralta", "B-99");
        Doctor d = new Doctor("Gregory", "House", "Nefrología e Infectología");

        System.out.println("--- Person ---");
        p.getDetails();

        System.out.println("\n--- Teacher ---");
        t.getDetails();

        System.out.println("\n--- PoliceOfficer ---");
        po.getDetails();

        System.out.println("\n--- Doctor ---");
        d.getDetails();
    }
}