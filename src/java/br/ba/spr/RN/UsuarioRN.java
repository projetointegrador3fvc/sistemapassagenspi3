/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.spr.RN;

import br.ba.spr.DAO.UsuarioListenerDAO;
import br.ba.spr.Mapeamento.Usuario;
import br.ba.spr.Util.FabricaDAO;

/**
 *
 * @author Ramon
 */
public class UsuarioRN {
        private UsuarioListenerDAO usuarioDao;
    public UsuarioRN() {
        this.usuarioDao = FabricaDAO.criarUsuarioDAO();
    }
    public void alterar(Usuario usu){
        this.usuarioDao.alterar(usu);
    }

    public Usuario consultar(String idCidade){
        return this.usuarioDao.consultar(idCidade);
    }
    public void excluir(Usuario usu){
        this.usuarioDao.excluir(usu);
    }

    public void salvar(Usuario usu){
        this.usuarioDao.salvar(usu);
    }

}

