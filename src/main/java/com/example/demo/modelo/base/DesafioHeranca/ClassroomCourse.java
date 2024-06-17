package com.example.demo.modelo.base.DesafioHeranca;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CLASSROOM")
public class ClassroomCourse  extends Course{
    private String location;
    private String instructor;



    public ClassroomCourse(){
        super();
    }

    public ClassroomCourse(String location, String instructor, String name,int durationHours){
        super(name,durationHours);
        this.location = location;
        this.instructor =instructor;

    }

  public String getLocation(){
        return location;
  }

  public String getInstructor(){
        return instructor;
  }


  public void setLocation(String location){
        this.location =location;
  }

  public void setInstructor(String instructor){
        this.instructor =instructor;
  }



}
