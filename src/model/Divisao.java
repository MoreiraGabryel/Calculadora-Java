package model;

public class Divisao implements Operacao{
    @Override
    public double calcular(double num1, double num2) {
        if(num2==0){
            return 0;
        }
       else
           return num1 /num2;
    }
    }
