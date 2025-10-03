package com.elchukito.controllers;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Map;

import com.elchukito.models.Clas;
import com.elchukito.models.Grades;
import com.elchukito.models.Student;
import com.elchukito.repository.StudentFileRepository;

import io.javalin.http.Handler;

public class StudentController {

    public Handler register = ctx -> {
        ctx.render("registerStudent.ftl");
    };

    public Handler view = ctx -> {
        String name = ctx.formParam("name");
        String email = ctx.formParam("email");
        String birthdayStr = ctx.formParam("birthday");
        LocalDate birthday = null;
        
        try {
            birthday = LocalDate.parse(birthdayStr);
        } catch (DateTimeParseException e) {
            ctx.status(400).result("Data de nascimento inválida.");
            return;
        }

        String grade1Str = ctx.formParam("grade1");
        String grade2Str = ctx.formParam("grade2");
        String grade3Str = ctx.formParam("grade3");
        String grade4Str = ctx.formParam("grade4");
        float grade1 = 0;
        float grade2 = 0;
        float grade3 = 0;
        float grade4 = 0;

        String formatedCpf = ctx.formParam("cpf");

        if(formatedCpf.length() != 14) {
            ctx.status(400).result("CPF inválido. Deve conter 11 dígitos numéricos.");
            return;
        }

        String cpf = Student.deformatCpf(formatedCpf);

        try {
            grade1 = Float.parseFloat(grade1Str);
        } catch (NumberFormatException e) {
            grade1 = 0;
        }
        try {
            grade2 = Float.parseFloat(grade2Str);
        } catch (NumberFormatException e) {
            grade2 = 0;
        }
        try {
            grade3 = Float.parseFloat(grade3Str);
        } catch (NumberFormatException e) {
            grade3 = 0;
        }
        try {
            grade4 = Float.parseFloat(grade4Str);
        } catch (NumberFormatException e) {
            grade4 = 0;
        }
 
        Grades grades = new Grades(grade1, grade2, grade3, grade4);
        Student student = new Student(name, birthday, cpf, email, grades);

        StudentFileRepository sfr = new StudentFileRepository();
        sfr.save(student);

        ctx.render("viewStudent.ftl", Map.of("student", student));
    };

    public Handler list = ctx -> {
        ctx.render("listStudents.ftl", Map.of("studentlist", Clas.listStudents()));
    };

    public Handler select = ctx -> {
        ctx.render("selectStudent.ftl", Map.of("studentlist", Clas.listStudents()));
    };

    public Handler edit = ctx -> {
        String cpf = ctx.formParam("cpf");
        Student student = new Student(null, null, null, null, null);
        int lineNumber = -1;

        System.out.println(cpf);
        try {
            lineNumber = Student.getLineNumber(cpf);
        } catch (Exception e) {
            return;
        }
        if(lineNumber == -1) {
            return;
        }
        
        student = Student.loadStudent(lineNumber);

        String grade1Str = String.valueOf(student.getGrades().getGrade1());
        String grade2Str = String.valueOf(student.getGrades().getGrade2());
        String grade3Str = String.valueOf(student.getGrades().getGrade3());
        String grade4Str = String.valueOf(student.getGrades().getGrade4());

        ctx.render("editStudent.ftl", Map.of("student", student, "grade1", grade1Str, "grade2", grade2Str, "grade3", grade3Str, "grade4", grade4Str, "lineNumber", lineNumber));
    };

    public Handler delete = ctx -> {
        StudentFileRepository sfr = new StudentFileRepository();
        int lineNumber = Student.getLineNumber(ctx.formParam("cpf"));
        if(lineNumber == -1) {
            return;
        }
        sfr.deleteLine(lineNumber);
        ctx.render("index.ftl");
    };

    public Handler update = ctx -> {
        StudentFileRepository sfr = new StudentFileRepository();
        int lineNumber = Integer.parseInt(ctx.formParam("lineNumber"));

        String name = ctx.formParam("name");
        String email = ctx.formParam("email");
        String birthdayStr = ctx.formParam("birthday");
        LocalDate birthday = null;
        
        try {
            birthday = LocalDate.parse(birthdayStr);
        } catch (DateTimeParseException e) {
            ctx.status(400).result("Data de nascimento inválida.");
            return;
        }

        String grade1Str = ctx.formParam("grade1");
        String grade2Str = ctx.formParam("grade2");
        String grade3Str = ctx.formParam("grade3");
        String grade4Str = ctx.formParam("grade4");
        float grade1 = 0;
        float grade2 = 0;
        float grade3 = 0;
        float grade4 = 0;

        String formatedCpf = ctx.formParam("cpf");

        if(formatedCpf.length() != 14) {
            ctx.status(400).result("CPF inválido. Deve conter 11 dígitos numéricos.");
            return;
        }

        String cpf = Student.deformatCpf(formatedCpf);

        try {
            grade1 = Float.parseFloat(grade1Str);
        } catch (NumberFormatException e) {
            grade1 = 0;
        }
        try {
            grade2 = Float.parseFloat(grade2Str);
        } catch (NumberFormatException e) {
            grade2 = 0;
        }
        try {
            grade3 = Float.parseFloat(grade3Str);
        } catch (NumberFormatException e) {
            grade3 = 0;
        }
        try {
            grade4 = Float.parseFloat(grade4Str);
        } catch (NumberFormatException e) {
            grade4 = 0;
        }
 
        Grades grades = new Grades(grade1, grade2, grade3, grade4);
        Student student = new Student(name, birthday, cpf, email, grades);

        sfr.updateLine(lineNumber, student);

        ctx.render("index.ftl");
    };
}