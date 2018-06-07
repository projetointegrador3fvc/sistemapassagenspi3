/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.spr.Bean;

import java.util.Calendar;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "passagemBean")
@SessionScoped
public class Passagem {
   private int idPassagem;
    //String veiculo;
   private String percurso;
   private int poltrona;
   private Date dtsai = new Date();
   private Date dtvolta = new Date();
   private String dataSaida;
   private String dataVolta;
   private String cidadeOrigem; 
   private String cidadeDestino;
   private float valorPassagem;  


    public String getDataVolta() {
        return dataVolta;
    }

    public void setDataVolta(String dataVolta) {
        this.dataVolta = dataVolta;
    }

    public Date getDtvolta() {
        return dtvolta;
    }

    public void setDtvolta(Date dtvolta) {
        this.dtvolta = dtvolta;
    }

    public String getPercurso() {
        return percurso;
    }

    public void setPercurso(String percurso) {
        this.percurso = percurso;
    }

    
    public int getIdPassagem() {
        return idPassagem;
    }

    public void setIdPassagem(int idPassagem) {
        this.idPassagem = idPassagem;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    public Date getDtsai() {
        return dtsai;
    }

    public void setDtsai(Date dtsai) {
        this.dtsai = dtsai;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public float getValorPassagem() {
        return valorPassagem;
    }

    public void setValorPassagem(float valorPassagem) {
        this.valorPassagem = valorPassagem;
    }
    
}
