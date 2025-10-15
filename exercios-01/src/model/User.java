package model;

import java.util.UUID;

public class User {

    private UUID id;
    private String nome;
    private String cpf;
    private String nasc;
    private String email;
    private String passworld;
    
    public User(String nome, String cpf, String nasc, String email, String passworld) {
        this.setId(UUID.randomUUID());
        this.nome = nome;
        this.cpf = cpf;
        this.nasc = nasc;
        this.email = email;
        this.passworld = passworld;
        
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNasc() {
        return nasc;
    }
    public void setNasc(String nasc) {
        this.nasc = nasc;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassworld() {
        return passworld;
    }
    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }

}
