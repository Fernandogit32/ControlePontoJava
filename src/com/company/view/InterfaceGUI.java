package com.company.view;
import com.company.Model.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class InterfaceGUI  extends JFrame implements ActionListener, WindowListener {
    protected Dimension dFrame,dButton, dTextArea, dLabel,dTextField;
    protected Button cmdEntrada, cmdSaida;
    protected TextArea txtLog;
    protected Label lblCodigo;
    protected TextField txtCodigo;
    protected TextField codigo;
    Funcionario  funOperador =  new Operador(1, "Fernando", "fernandovieira@hotmail.com", "36548792456",10.20);
    Funcionario  funGerente =  new Gerente(2, "João", "Joao@hotmail.com", "25478954789","Joao","123");
    Funcionario funSecretaria =  new Secretaria(3, "Julia", "Julia@hotmail.com", "25478954789","3657987458","2");
   int cont = 0;
    RegistroPonto r1 = null;
    RegistroPonto r2 = null;
    RegistroPonto r3 = null;

    public InterfaceGUI() {
        dFrame = new Dimension(400,450);
        dButton = new Dimension(150,22);
        dTextArea = new Dimension(350,200);
        dLabel = new Dimension(90,200);
        dTextField = new Dimension(150,22);
        setTitle("Controlador de Ponto");
        setSize(dFrame);
        setResizable(false);
        setLocation(200, 200);
        setLayout(null);


        cmdEntrada = new Button("Registro de Entrada");
        cmdEntrada.setSize(dButton);
        cmdEntrada.setLocation(25,150);
        cmdEntrada.addActionListener(this);
        this.add(cmdEntrada);

        cmdSaida = new Button("Registro de Saida");
        cmdSaida.setSize(dButton);
        cmdSaida.setLocation(190,150);
        cmdSaida.addActionListener(this);
        this.add(cmdSaida);

        txtLog = new TextArea(null);
        txtLog.setSize(dTextArea);
        txtLog.setLocation(25,220);
        this.add(txtLog);

        lblCodigo = new Label("Id Funcionario : ");
        lblCodigo.setSize(dLabel);
        lblCodigo.setLocation(25,10);
        this.add(lblCodigo);

        txtCodigo = new TextField(null);
        txtCodigo.setSize(dTextField);
        txtCodigo.setLocation(140,100);
        this.add(txtCodigo);

    }
    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        if(e.getSource()==cmdEntrada){
           int id = Integer.parseInt(txtCodigo.getText());
           if(id == 1){
            r1=  new RegistroPonto(cont+1,funOperador, LocalDate.now(), LocalDateTime.now(),null);
               txtLog.append(r1.apresentarRegistroPonto());
           }else if (id ==2){
             r2 =  new RegistroPonto(cont+1,funGerente, LocalDate.now(), LocalDateTime.now(),null);
               txtLog.append(r2.apresentarRegistroPonto());
           }
           else if (id ==3){
              r3 =  new RegistroPonto(cont+1,funSecretaria, LocalDate.now(), LocalDateTime.now(),null);
               txtLog.append(r3.apresentarRegistroPonto());
           }


        }else if (e.getSource()==cmdSaida){
            int id = Integer.parseInt(txtCodigo.getText());
            try {
                if(id == 1){
                    r1.setHoraSaida(LocalDateTime.now());
                    txtLog.append(r1.apresentarRegistroPonto());
                }else if (id ==2){
                    r2.setHoraSaida(LocalDateTime.now());
                    txtLog.append(r2.apresentarRegistroPonto());
                }
                else if (id ==3){
                    r3.setHoraSaida(LocalDateTime.now());
                    txtLog.append(r3.apresentarRegistroPonto());

                }
            }catch (Exception e1) {

            }


        }
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
