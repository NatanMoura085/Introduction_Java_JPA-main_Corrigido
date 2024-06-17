package com.example.demo.modelo.base.DesafioHeranca;


import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "course_type")
public  abstract class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int durationHours;


    public Course(){

    }


    public Course(String name, int durationHours){
        this.name =name;
        this.durationHours =durationHours;
    }


    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getDurationHours(){
        return durationHours;
    }

    public void setId(Long id){
        this.id =id;
    }

    public void setName(String name){
        this.name =name;
    }
    public void setDurationHours(int durationHours){
        this.durationHours =durationHours;
    }

}
