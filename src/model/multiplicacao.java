package model;

public class multiplicacao implements Operacao{
    @Override
    public double calcular(double num1, double num2) {
        return num1 * num2;
    }
}
