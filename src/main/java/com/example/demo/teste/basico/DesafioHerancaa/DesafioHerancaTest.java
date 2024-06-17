package com.example.demo.teste.basico.DesafioHerancaa;

import com.example.demo.infra.DAO;
import com.example.demo.modelo.base.DesafioHeranca.ClassroomCourse;
import com.example.demo.modelo.base.DesafioHeranca.Course;
import com.example.demo.modelo.base.DesafioHeranca.OnlineCourse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioHerancaTest {
    public static void main(String[] args) {
        SpringApplication.run(DesafioHerancaTest.class,args);
        OnlineCourse onlineCourse = new OnlineCourse("PHP Programing",70,"RockSeat");
        ClassroomCourse classroomCourse = new ClassroomCourse("Room 102","Dr Smith","Analist System",90);
        DAO<Course> courseDAO = new DAO<>(Course.class);

        courseDAO.abrirT().incluir(onlineCourse).incluir(classroomCourse).fecharT().fecharManager();

    }
}
