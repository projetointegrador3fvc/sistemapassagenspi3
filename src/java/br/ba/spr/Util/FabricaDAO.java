/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.spr.Util;
import br.ba.spr.DAO.CidadeDAO;
import br.ba.spr.DAO.CidadeListenerDAO;
import br.ba.spr.DAO.PassagemDAO;
import br.ba.spr.DAO.PassagemListenerDAO;
import br.ba.spr.DAO.UsuarioDAO;
import br.ba.spr.DAO.UsuarioListenerDAO;
import br.ba.spr.DAO.VeiculoDAO;
import br.ba.spr.DAO.VeiculoListenerDAO;

public class FabricaDAO {
      public static CidadeListenerDAO criarCidadeDAO(){
        CidadeDAO cidadeDAO = new CidadeDAO();
        cidadeDAO.setSessao(HibernateUtil.getSessionFactory().getCurrentSession());
        return cidadeDAO;
    }
      public static PassagemListenerDAO criarPassagemDAO(){
        PassagemDAO passagemDAO = new PassagemDAO();
        passagemDAO.setSessao(HibernateUtil.getSessionFactory().getCurrentSession());
        return passagemDAO;
    }
      public static UsuarioListenerDAO criarUsuarioDAO(){
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.setSessao(HibernateUtil.getSessionFactory().getCurrentSession());
        return usuarioDAO;
    }
      public static VeiculoListenerDAO VeiculoAlunoDAO(){
        VeiculoDAO veiculoDAO = new VeiculoDAO();
        veiculoDAO.setSessao(HibernateUtil.getSessionFactory().getCurrentSession());
        return veiculoDAO;
    }
}
