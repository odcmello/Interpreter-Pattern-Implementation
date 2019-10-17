package padrãointerpreter;

import java.util.ArrayList;

public class PadrãoInterpreter {

    public static void main(String[] args) {
        Variavel v = new Variavel(2.12);
        Variavel f = new Variavel(1.50);
        Subtrair t = new Subtrair(v,f);
        Somar s = new Somar(t,f);
        s = new Somar(s,s);
        System.out.println("O resultado é " + s.interpretar()); // Exemplo = (((2,12-1,50)+1,50)+((2,12-1,50)+1,50))
    }

}
