/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.spr.DAO;

import br.ba.spr.Mapeamento.Veiculo;
import org.hibernate.Session;

/**
 *
 * @author Camila
 */
public interface VeiculoListenerDAO {

    void alterar(Veiculo vei);

    Veiculo consultarVei(String placa);

    void excluir(Veiculo vei);

    void salvar(Veiculo vei);

    void setSessao(Session sessao);
    
}
