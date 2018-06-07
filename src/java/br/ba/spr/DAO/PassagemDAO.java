/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.spr.DAO;

import br.ba.spr.Mapeamento.Passagem;
import org.hibernate.Session;

/**
 *
 * @author Camila
 */
public class PassagemDAO implements PassagemListenerDAO {
    private Session sessao;
    @Override
    public void setSessao(Session sessao) {
        this.sessao = sessao;
    }
    @Override
    public void salvar(Passagem pas) {
    this.sessao.save(pas);
    }
    @Override
    public void alterar(Passagem pas) {
    this.sessao.update(pas);
    }
    @Override
    public void excluir(Passagem pas) {
    this.sessao.delete(pas);
    }
    
    @Override
    public Passagem consultarId(int idpassagem) {
        return (Passagem) this.sessao.get(Passagem.class,idpassagem);
    }
    @Override 
       public Passagem consultarPoltrona(int poltrona) {
    return (Passagem) this.sessao.get(Passagem.class,poltrona);
    }

    
    }

