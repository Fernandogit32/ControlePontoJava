package com.company.Model;

public abstract  class Funcionario {
    private int idFuncionario;
    private String nome;
    private String email;
    private String documento;

    public Funcionario(int idFuncionario, String nome, String email, String documento){
        this.idFuncionario =idFuncionario;
        this.nome = nome;
        this.email = email;
        this.documento = documento;
    }

    public int getIdFincionario() {
        return idFuncionario;
    }

    public void setIdFincionario(int idFincionario) {
        this.idFuncionario = idFincionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }


    public String imprimir(){
        return nome;
    }
}

