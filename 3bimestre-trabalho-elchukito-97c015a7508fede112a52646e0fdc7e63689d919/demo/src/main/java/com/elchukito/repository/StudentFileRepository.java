package com.elchukito.repository;

import java.util.List;
import java.util.ArrayList;

import com.elchukito.models.Student;
import com.elchukito.models.Clas;

public class StudentFileRepository {
    public StudentFileRepository() {
    }

    public void save(Student student) {
        TextFile tf = new TextFile();
        String content = student.getName() + ";" + student.getEmail() + ";" + student.getBirthday() + ";" + student.getCpf() + ";" +
                         student.getGrades().getGrade1() + ";" + student.getGrades().getGrade2() + ";" + student.getGrades().getGrade3() + ";" +
                         student.getGrades().getGrade4() + "\n";

        tf.writeTextFile(content);
    }

    public List<String> load() {
        TextFile tf = new TextFile();
        return tf.readTextFile();
    }

    public String loadLine(int lineNumber) {
        try {
            TextFile tf = new TextFile();
            String line = tf.readTextLine(lineNumber);
            return line;
        } catch (Exception e) {
        }
        return null;
    }

    public void deleteLine(int lineNumber) {
        ArrayList<Student> studentList = Clas.listStudents();

        try {
            studentList.remove(lineNumber);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        TextFile tf = new TextFile();
        tf.deleteTextFile();
        
        for (Student student : studentList) {
            save(student);
        }
    }

    public void updateLine(int lineNumber, Student student) {
        ArrayList<Student> studentList = Clas.listStudents();

        try {
            studentList.set(lineNumber, student);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        TextFile tf = new TextFile();
        tf.deleteTextFile();
        
        for (Student s : studentList) {
            save(s);
        }
    }
}
