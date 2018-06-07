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
public interface PassagemListenerDAO {

    void alterar(Passagem pas);

    Passagem consultarId(int idpassagem);

    Passagem consultarPoltrona(int poltrona);

    void excluir(Passagem pas);

    void salvar(Passagem pas);

    void setSessao(Session sessao);    
    
}
