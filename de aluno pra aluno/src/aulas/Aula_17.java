package aulas;

import java.util.*;

public class Aula_17 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        String nome = "Pão com mortadela";
        
        System.out.print("Qual seu primeiro nome?");
        String primeiroNome = input.next();
        
        System.out.print("Qual seu ultimo nome?");
        String ultimoNome = input.next();
        
        System.out.print("Qual sua idade?");
        int idade = input.nextInt();

         System.out.print("Olá" + primeiroNome + "" + ultimoNome + "de" + idade + "anos");

    }
    
}
        