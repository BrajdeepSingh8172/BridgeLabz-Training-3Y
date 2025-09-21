package hospital;

import java.util.*;

interface Payable {
    double calculatePayment();
}

class Patient {
    private String id;
    private String name;
    private String medicalHistory;
    protected boolean emergency;

    public Patient(String id, String name) {
        this(id, name, "", false);
    }

    public Patient(String id, String name, String medicalHistory, boolean emergency) {
        this.id = id;
        this.name = name;
        this.medicalHistory = medicalHistory;
        this.emergency = emergency;
    }

    public String getSummary() {
        return "Patient[id=" + id + ", name=" + name + "]";
    }

    public void displayInfo() {
        System.out.println(getSummary());
    }
}

class InPatient extends Patient {
    private int roomNumber;

    public InPatient(String id, String name, String medicalHistory, int roomNumber, boolean emergency) {
        super(id, name, medicalHistory, emergency);
        this.roomNumber = roomNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("InPatient: " + getSummary() + ", room=" + roomNumber);
    }
}

class OutPatient extends Patient {
    public OutPatient(String id, String name) {
        super(id, name, "", false);
    }

    @Override
    public void displayInfo() {
        System.out.println("OutPatient: " + getSummary());
    }
}

class Doctor {
    private String name;
    private String specialization;
    private double rating;

    public Doctor(String name, String specialization, double rating) {
        this.name = name;
        this.specialization = specialization;
        this.rating = rating;
    }

    public void displayInfo() {
        System.out.println("Doctor[name=" + name + ", spec=" + specialization + ", rating=" + rating + "]");
    }
}

class Bill implements Payable {
    private double amount;
    private double taxPercent;
    private double discountPercent;

    public Bill(double amount, double taxPercent, double discountPercent) {
        this.amount = amount;
        this.taxPercent = taxPercent;
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculatePayment() {
        double discount = amount * discountPercent / 100.0;
        double taxed = (amount - discount) * (1 + taxPercent / 100.0);
        return taxed;
    }
}

public class HospitalDemo {
    public static void main(String[] args) {
        Patient p1 = new InPatient("P001", "Alice", "Diabetes", 101, true);
        Patient p2 = new OutPatient("P002", "Bob");
        Doctor d = new Doctor("Dr. Singh", "Cardiology", 4.6);
        p1.displayInfo();
        p2.displayInfo();
        d.displayInfo();

        Bill bill = new Bill(10000, 5, 10); // amount, tax%, discount%
        System.out.println("Total payable: " + bill.calculatePayment());
    }
}
