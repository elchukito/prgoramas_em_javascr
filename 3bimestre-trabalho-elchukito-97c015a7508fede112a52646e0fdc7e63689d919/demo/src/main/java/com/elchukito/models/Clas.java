package com.elchukito.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.elchukito.models.Student;
import com.elchukito.repository.StudentFileRepository;

public class Clas {
    private String name;
    private ArrayList<Student> students;

    public Clas(String name, ArrayList<Student> students) {
        this.name = name;
        this.students = students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public static ArrayList<Student> listStudents() {
        StudentFileRepository sfr = new StudentFileRepository();
        List<String> data = sfr.load();
        Clas clas = new Clas("Turma X", new ArrayList<>());

        try {
            for(int i = 0; data.get(i) != null; i++) {
                if(data.get(i) != null) {
                    String[] parts = data.get(i).split(";");
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

                        clas.addStudent(student);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return clas.getStudents();
    }

    public String getName() {
        return name;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public String SetName(String name) {
        return this.name = name;
    }
    public ArrayList<Student> SetStudents(ArrayList<Student> students) {
        return this.students = students;
    }
}
