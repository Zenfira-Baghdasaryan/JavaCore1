package classwork.homework1.medicalCenter.storage;

import classwork.homework1.medicalCenter.model.Doctor;
import classwork.homework1.medicalCenter.model.Patient;
import classwork.homework1.medicalCenter.model.Person;
import classwork.homework1.medicalCenter.util.DateUtil;

import javax.swing.plaf.PanelUI;
import java.util.Date;

public class PersonStorage {
    private Person[] persons = new Person[10];

    private int size;

    public void add(Person person) {
        if (persons.length == size) {
            extend();
        }
        persons[size++] = person;
    }

    private void extend() {
        Person[] tmp = new Person[persons.length + 10];
        System.arraycopy(persons, 0, tmp, 0, persons.length);
        persons = tmp;
    }

    public void printDoctors() {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor) {
                System.out.println(person);
            }
        }
    }

    public void searchDoctorByProfession(String profession) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor) {
                Doctor doctor = (Doctor) person;
                if (doctor.getProfession().equals(profession)) {
                    System.out.println(doctor);
                }
            }
        }
    }

    public void deleteDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person.getId().equals(id) && person instanceof Doctor) {
                deleteByIndex(i);
            }

        }
    }

    private void deleteByIndex(int i) {
        for (int j = i; j < size; j++) {
            persons[j] = persons[j + 1];

        }
        size--;
    }

    public Doctor getDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person.getId().equals(id) && person instanceof Doctor)
                return (Doctor) person;
        }
        return null;
    }

    public void printAllPatientByDoctor(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Patient) {
                Patient patient = (Patient) person;
                if (patient.getDoctor().equals(doctor)) {
                    System.out.println(patient);
                }

            }
        }
    }

    public void printTodaysPatients() {
        Date today = new Date();
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient) {
                Patient patient = (Patient) persons[i];
                if (DateUtil.isSameDay(today, patient.getRegisterDateTime())) ;
                System.out.println(patient);
            }
        }
    }

    public boolean isDoctorAvailable(Doctor doctor, Date registerDateTime) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Patient) {
                Patient patient = (Patient) person;
                if (patient.getDoctor().equals(doctor) && patient.getRegisterDateTime().equals(registerDateTime)) ;
                return false;
            }
        }
        return false;
    }
}