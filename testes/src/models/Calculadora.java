package models;

public class Calculadora{

    public int somar(int a, int b){
        return a+b;
    }

    public int multiplicar (int a, int b){
        return a*b;
    }

    public int subtrair(int a, int b){
        return a -b;
    }

    public int dividir(int a, int b){
        if(a == 0 || b == 0){
            throw new IllegalArgumentException("Um dos números não pode dar zero");
        }
        return a/b;
    }
}