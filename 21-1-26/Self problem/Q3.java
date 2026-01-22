import java.util.ArrayList;

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }

    void showDoctors() {
        System.out.println("Patient: " + name);
    }
}

class Doctor {
    String name;
    ArrayList<Patient> patients = new ArrayList<>();

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient p) {
        patients.add(p);
        System.out.println("Doctor " + name + " is consulting patient " + p.name);
    }

    void showPatients() {
        System.out.println("Doctor: " + name + " has patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.name);
        }
    }
}

class Hospital {
    String name;
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();

    Hospital(String name) {
        this.name = name;
    }

    void addDoctor(Doctor d) {
        doctors.add(d);
    }

    void addPatient(Patient p) {
        patients.add(p);
    }

    void showAll() {
        System.out.println("Hospital: " + name);

        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println("- " + d.name);
        }

        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.name);
        }
    }
}

public class Q3 {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("City Hospital");

        Doctor d1 = new Doctor("Dr. Kapoor");
        Doctor d2 = new Doctor("Dr. Rao");

        Patient p1 = new Patient("Rohit");
        Patient p2 = new Patient("Anjali");
        Patient p3 = new Patient("Suresh");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        hospital.addPatient(p1);
        hospital.addPatient(p2);
        hospital.addPatient(p3);

        d1.consult(p1);
        d1.consult(p2);

        d2.consult(p2);
        d2.consult(p3);

        System.out.println();
        hospital.showAll();
        System.out.println();

        d1.showPatients();
        System.out.println();
        d2.showPatients();
    }
}
