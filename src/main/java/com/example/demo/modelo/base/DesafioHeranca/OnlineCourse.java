package com.example.demo.modelo.base.DesafioHeranca;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ONLINE")
public class OnlineCourse extends Course{
    private  String platforma;


    public OnlineCourse(){
   super();
    }

    public OnlineCourse(String name,int durationHours, String platform){
     super(name,durationHours);
     this.platforma =platform;
    }

  public String getPlatforma(){
        return platforma;
  }

  public void setPlatforma(String platforma){
        this.platforma = platforma;
  }

}
