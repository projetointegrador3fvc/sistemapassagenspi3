/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.spr.DAO;

import br.ba.spr.Mapeamento.Usuario;
import org.hibernate.Session;

/**
 *
 * @author Camila
 */
public interface UsuarioListenerDAO {

    void alterar(Usuario usu);

    Usuario consultar(String email);

    void excluir(Usuario usu);

    void salvar(Usuario usu);

    void setSessao(Session sessao);
    
}
