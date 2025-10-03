package com.elchukito.models;

import java.time.LocalDate;
import java.util.ArrayList;

import com.elchukito.repository.StudentFileRepository;

public class Student {
    private String name;
    private LocalDate birthday;
    private String cpf;
    private String email;
    private Grades grades;

    public Student(String name, LocalDate birthday, String cpf, String email, Grades grades) {
        this.name = name;
        this.birthday = birthday;
        this.cpf = cpf;
        this.email = email;
        this.grades = grades;
    }

    public static Student loadStudent(int lineNumber) {
        StudentFileRepository sfr = new StudentFileRepository();
        String data = null;

        try {
            data = sfr.loadLine(lineNumber);
        } catch (Exception e) {

        }

        Clas clas = new Clas("Turma X", new ArrayList<>());

        try {
            if(data != null) {
                String[] parts = data.split(";");
                if(parts.length >= 8) {
                    String name = parts[0];
                    String email = parts[1];
                    LocalDate birthday = LocalDate.parse(parts[2]);
                    String cpf = parts[3];
                    float grade1 = Float.parseFloat(parts[4]);
                    float grade2 = Float.parseFloat(parts[5]);
                    float grade3 = Float.parseFloat(parts[6]);
                    float grade4 = Float.parseFloat(parts[7]);

                    Grades grades = new Grades(grade1, grade2, grade3, grade4);
                    Student student = new Student(name, birthday, cpf, email, grades);

                    return student;
                } 
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static int getLineNumber(String cpf) {
        StudentFileRepository sfr = new StudentFileRepository();
        ArrayList<Student> students = Clas.listStudents();
        for(int i = 0; i < students.size(); i++) {
            if(students.get(i).getCpf().equals(cpf)) {
                return i;
            }
        }

        return -1;
    }

    // public static String formatCpf(String cpf) {

    // }

    public static String deformatCpf(String cpf) {
        return cpf.substring(0, 3) + cpf.substring(4, 7) + cpf.substring(8, 11) + cpf.substring(12, 14);
    }

    public Student getStudent() {
        return this;
    }

    public String getName() {
        return name;
    }
    public LocalDate getBirthday() {
        return birthday;
    }

    public String getCpf() {
        return cpf;
    }
    public String getEmail() {
        return email;
    }
    public Grades getGrades() {
        return grades;
    }
    public String SetName(String name) {
        return this.name = name;
    }
    public LocalDate SetBirthday(LocalDate birthday) {
        return this.birthday = birthday;
    }
    public String SetCpf(String cpf) {
        return this.cpf = cpf;
    }
    public String SetEmail(String email) {
        return this.email = email;
    }
    public Grades SetGrades(Grades grades) {
        return this.grades = grades;
    }

    public String toString() {
        return this.name;
    }
}
