package com.elchukito.routes;

import com.elchukito.controllers.IndexController;
import com.elchukito.controllers.StudentController;

import io.javalin.Javalin;

public class Root {
    private IndexController indexController = new IndexController();
    private StudentController studentController = new StudentController();

    public Root() {
        this.indexController = new IndexController();
        this.studentController = new StudentController();
    }

    public void registerRoots(Javalin app) {
        app.get("/", indexController.get);
        app.post("/viewStudent", studentController.view);
        app.get("/listStudents", studentController.list);
        app.get("/registerStudent", studentController.register);
        app.get("/selectStudent", studentController.select);
        app.post("/editStudent", studentController.edit);
        app.post("/deleteStudent", studentController.delete);
        app.post("/updateStudent", studentController.update);
    }
}
