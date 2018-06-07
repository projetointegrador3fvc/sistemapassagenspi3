/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ba.spr.RN;

import br.ba.spr.DAO.PassagemListenerDAO;
import br.ba.spr.Mapeamento.Passagem;
import br.ba.spr.Util.FabricaDAO;
import java.util.List;

/**
 *
 * @author Ramon
 */
public class PassagemRN {
    private PassagemListenerDAO passagemDao;
      public PassagemRN() {
        this.passagemDao = FabricaDAO.criarPassagemDAO();
    }
    public void alterar(Passagem pas){
        this.passagemDao.alterar(pas);
    }

    public Passagem consultarId(int idPassagem){
        return this.passagemDao.consultarId(idPassagem);
    }
    public Passagem consultarPoltrona(int poltrona){
        return this.passagemDao.consultarId(poltrona);
    }
    public void excluir(Passagem pas){
        this.passagemDao.excluir(pas);
    }
}
