import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Patient {
    private String id;
    private String name;
    private int age;
    private String gender;

    public Patient(String id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}

class Doctor {
    private String id;
    private String name;
    private String specialization;

    public Doctor(String id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }
}

class Appointment {
    private Patient patient;
    private Doctor doctor;
    private String date;

    public Appointment(Patient patient, Doctor doctor, String date) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    // Getters and setters
    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getDate() {
        return date;
    }
}

class HealthcareManagementSystem {
    private List<Patient> patients;
    private List<Doctor> doctors;
    private List<Appointment> appointments;

    public HealthcareManagementSystem() {
        patients = new ArrayList<>();
        doctors = new ArrayList<>();
        appointments = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void scheduleAppointment(Patient patient, Doctor doctor, String date) {
        appointments.add(new Appointment(patient, doctor, date));
    }

    // Additional methods for managing patients, doctors, appointments, etc.
}

class Main {
    public static void main(String[] args) {
        HealthcareManagementSystem system = new HealthcareManagementSystem();
        Scanner scanner = new Scanner(System.in);

        // Adding patients and doctors
        system.addPatient(new Patient("P001", "John Doe", 30, "Male"));
        system.addDoctor(new Doctor("D001", "Dr. Smith", "Cardiologist"));

        // Scheduling appointment
        System.out.println("Enter patient ID:");
        String patientId = scanner.nextLine();
        System.out.println("Enter doctor ID:");
        String doctorId = scanner.nextLine();
        System.out.println("Enter appointment date (YYYY-MM-DD):");
        String date = scanner.nextLine();

        Patient patient = findPatientById(system, patientId);
        Doctor doctor = findDoctorById(system, doctorId);

        if (patient != null && doctor != null) {
            system.scheduleAppointment(patient, doctor, date);
            System.out.println("Appointment scheduled successfully!");
        } else {
            System.out.println("Patient or doctor not found. Please check the IDs.");
        }

        scanner.close();
    }

    private static Patient findPatientById(HealthcareManagementSystem system, String id) {
        for (Patient patient : system.patients) {
            if (patient.getId().equals(id)) {
                return patient;
            }
        }
        return null;
    }

    private static Doctor findDoctorById(HealthcareManagementSystem system, String id) {
        for (Doctor doctor : system.doctors) {
            if (doctor.getId().equals(id)) {
                return doctor;
            }
        }
        return null;
    }
}
