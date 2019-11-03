package com.company.Model;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class RegistroPonto {
    private long idRegistroPonto;
    private Funcionario func;
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    public RegistroPonto(int idRegistroPonto,Funcionario func, LocalDate dataRegistro,
    LocalDateTime horaEntrada,LocalDateTime horaSaida){
        this.idRegistroPonto = idRegistroPonto;
        this.func = func;
        this.dataRegistro = dataRegistro;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }


    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    public long getIdRegistroPonto() {
        return idRegistroPonto;
    }

    public void setIdRegistroPonto(long idRegistroPonto) {
        this.idRegistroPonto = idRegistroPonto;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }


    public String apresentarRegistroPonto(){
       return func.imprimir()+"\nData de Regitro: "+getDataRegistro()
               +"\nHora de entrada: "+getHoraEntrada()+
               "\nHora deSaida: "+getHoraSaida()+"\n";
    }

}
