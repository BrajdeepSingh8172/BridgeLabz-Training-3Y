import java.util.*;

interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId; this.name = name; this.age = age;
    }

    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public void getPatientDetails() {
        System.out.println(patientId + ": " + name + " (" + age + ")");
    }

    public abstract double calculateBill();
}

class InPatient extends Patient implements MedicalRecord {
    private List<String> records = new ArrayList<>();
    private double dailyRate;
    private int days;

    public InPatient(String id, String name, int age, double dailyRate, int days) {
        super(id,name,age); this.dailyRate = dailyRate; this.days = days;
    }

    @Override
    public double calculateBill() { return dailyRate * days; }

    @Override
    public void addRecord(String record) { records.add(record); }

    @Override
    public List<String> viewRecords() { return Collections.unmodifiableList(records); }
}

class OutPatient extends Patient implements MedicalRecord {
    private List<String> records = new ArrayList<>();
    private double consultationFee;

    public OutPatient(String id, String name, int age, double consultationFee) {
        super(id,name,age); this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() { return consultationFee; }

    @Override
    public void addRecord(String record) { records.add(record); }

    @Override
    public List<String> viewRecords() { return Collections.unmodifiableList(records); }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        InPatient ip = new InPatient("P001","Rita",45,2000,3);
        OutPatient op = new OutPatient("P002","Sunil",30,500);

        ip.addRecord("Surgery done");
        op.addRecord("Routine checkup");

        List<Patient> patients = Arrays.asList(ip, op);
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: Rs." + p.calculateBill());
            if (p instanceof MedicalRecord) {
                System.out.println("Records: " + ((MedicalRecord)p).viewRecords());
            }
        }
    }
}