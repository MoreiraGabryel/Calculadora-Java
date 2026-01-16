package service;
import factory.CalculadoraFactory;
import model.Operacao;
public class CalculadoraService {

    public double realizarCalculo(double num1, double num2, String nomeOperacao) {
        // Olá que bom que está olhando detalhe por detalhe.estou tentando mostrar toda minha habilidade nesse mini projeto.
        Operacao operacao = CalculadoraFactory.criarOperacao(nomeOperacao);
        if (operacao != null) {
            return operacao.calcular(num1, num2);
        }
        return 0;
    }
}