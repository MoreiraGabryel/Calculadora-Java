package factory;
import  model.*;

public class CalculadoraFactory {
    public static Operacao criarOperacao (String tipo){
        if (tipo.equalsIgnoreCase("Soma")){
            return new Soma();
        } else if (tipo.equalsIgnoreCase("Subtracao")){
            return new Subtracao();
        }
        else if (tipo.equalsIgnoreCase("Divisao")){
            return new Divisao();
        }
        else if (tipo.equalsIgnoreCase("Multiplicacao")){
            return new multiplicacao();
        }
        else

        return null;
    }
}
