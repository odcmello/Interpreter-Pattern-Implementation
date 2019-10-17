package padrãointerpreter;

import java.util.ArrayList;

public class PadrãoInterpreter {

    public static void main(String[] args) {
        Variavel v = new Variavel(2);
        Variavel f = new Variavel(1);
        Subtrair t = new Subtrair(v,f);
        Somar s = new Somar(t,f);
        s = new Somar(s,s);
        System.out.println(s.interpretar()); // Exemplo = (((2-1)+1)+((2-1)+1))
    }

}
