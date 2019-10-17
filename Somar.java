/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrãointerpreter;

/**
 *
 * @author UFSM
 */
public class Somar implements ExpressaoInterpreter {

    private ExpressaoInterpreter esquerda;
    private ExpressaoInterpreter direita;

    public Somar(ExpressaoInterpreter esq, ExpressaoInterpreter dir) {
        super();
        this.direita = dir;
        this.esquerda = esq;
    }

    @Override
    public int interpretar() {
        return esquerda.interpretar() + direita.interpretar();
    }
}