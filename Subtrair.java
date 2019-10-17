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
public class Subtrair implements ExpressaoInterpreter{
   
    private ExpressaoInterpreter esquerda;
    private ExpressaoInterpreter direita;

    public Subtrair(ExpressaoInterpreter esq, ExpressaoInterpreter dir) {
        super();
        this.direita = dir;
        this.esquerda = esq;
    }

    @Override
    public double interpretar() {
        return esquerda.interpretar() - direita.interpretar();
    }
    
}
