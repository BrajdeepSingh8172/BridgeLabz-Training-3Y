import java.util.*;

class Patient {
    private String name;
    public Patient(String name) { this.name = name; }
    public String getName() { return name; }
}

class Doctor {
    private String name;
    public Doctor(String name) { this.name = name; }
    public void consult(Patient p) {
        System.out.println("Doctor " + name + " consulting patient " + p.getName());
    }
}

class Hospital {
    private String name;
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();

    public Hospital(String name) { this.name = name; }

    public void addDoctor(Doctor d) { doctors.add(d); }
    public void addPatient(Patient p) { patients.add(p); }

    public void showHospital() {
        System.out.println("Hospital: " + name);
        for (Doctor d : doctors) System.out.println("Doctor: " + d);
        for (Patient p : patients) System.out.println("Patient: " + p);
    }
}

public class HospitalDoctorsPatients {
    public static void main(String[] args) {
        Hospital h = new Hospital("City Hospital");
        Doctor d1 = new Doctor("Dr. Arjun");
        Patient p1 = new Patient("Kavita");
        h.addDoctor(d1);
        h.addPatient(p1);
        d1.consult(p1);
    }
}