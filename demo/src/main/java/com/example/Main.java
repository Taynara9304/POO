package com.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        Documento documento = new Documento();
        documento.setTipo("RG");
        documento.setEmissor("Receita Federal");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Fernanda");
        pessoa.setDocumento(documento);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("meuPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(pessoa);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}