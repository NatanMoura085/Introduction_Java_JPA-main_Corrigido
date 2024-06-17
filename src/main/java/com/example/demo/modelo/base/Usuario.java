package com.example.demo.modelo.base;

import jakarta.persistence.*;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;

    public Usuario(){

    }

    public Usuario(String nome,String email){
        this.nome = nome;
        this.email = email;
    }


    public Long getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome =nome;
    }
    public void setEmail(String email){
        this.email = email;
    }

}
