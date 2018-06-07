/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.spr.Bean;

import java.util.Calendar;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "veiculoBean")
@SessionScoped
public class Veiculo {
    String numero;
    String placa;
    String motorista;
    String modelo;
    Calendar dtcom = Calendar.getInstance();
    int qtdPoltronas;
    

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Calendar getDtcom() {
        return dtcom;
    }

    public void setDtcom(Calendar dtcom) {
        this.dtcom = dtcom;
    }

    public int getQtdPoltronas() {
        return qtdPoltronas;
    }

    public void setQtdPoltronas(int qtdPoltronas) {
        this.qtdPoltronas = qtdPoltronas;
    }
    
}
