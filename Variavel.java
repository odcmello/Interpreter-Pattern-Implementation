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
public class Variavel implements ExpressaoInterpreter {

    private int variavel;
    
    public Variavel(int v){
        super();
        this.variavel = v;
    }
    
    @Override
    public int interpretar() {
        return variavel;
    }

}
