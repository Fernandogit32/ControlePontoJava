package com.company.Model;

public class Operador extends Funcionario {
    private double valorHora;

    public Operador(int idFuncionario, String nome, String email, String documento, double valorHora) {
        super(idFuncionario, nome, email, documento);
        this.valorHora= valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public String imprimir(){
        return "-------------- \nFuncionario Operador "+ super.imprimir();
    }
}
