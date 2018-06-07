/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.spr.Bean;


import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


@ManagedBean(name ="usuarioBean")
@SessionScoped

public class Usuario {
   private String nome; 
   private String cargo;
   private String login;
   private String senha;
   private String email;

    public void Autenticar(){
        if(login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("1234")){
            FacesContext.getCurrentInstance().addMessage("", new FacesMessage("Logado com Sucesso!", "Logado com Sucesso!"));
        }else{
            FacesContext.getCurrentInstance().addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR,"Login ou Senha Errada!", "Login ou Senha Errada!"));
            
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
