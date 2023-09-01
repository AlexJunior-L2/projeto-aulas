package aulas;

import java.util.*;

public class Aula_11 {
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        double base, altura, areaRetangulo;
        
        System.out.println("informe o valor da base: ");
        base = input.nextDouble();
        
        System.out.println("informe o valor da altura: ");
        altura = input.nextDouble();
        
        areaRetangulo = base * altura;
        
        System.out.println("A area de retangulo de base = "+ base);
        System.out.println("e altura: "+ altura);
        System.out.println("e " +areaRetangulo);
    }
    
    
}
