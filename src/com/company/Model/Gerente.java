package com.company.Model;

public class Gerente extends Funcionario {
    private String login;
    private String senha;

    public Gerente(int idFuncionario, String nome, String email, String documento, String login,String senha) {
        super(idFuncionario, nome, email, documento);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String imprimir(){
       return "-------------- \n Funcionario Gerente "+ super.imprimir();
    }
}
