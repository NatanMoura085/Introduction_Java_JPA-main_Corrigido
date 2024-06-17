package com.example.demo.teste.basico.umpraum;

import com.example.demo.infra.DAO;
import com.example.demo.modelo.base.umpraum.Assento;
import com.example.demo.modelo.base.umpraum.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NovoCliente1Assento {
    public static void main(String[] args) {
        SpringApplication.run(NovoCliente1Assento.class,args);
        Assento assento = new Assento("7F");
        Cliente cliente = new Cliente("Mara",assento);
        DAO<Object> clienteDAO = new DAO<>();

        clienteDAO.abrirT().incluir(assento).incluir(cliente).fecharT().fecharManager();
    }
}
