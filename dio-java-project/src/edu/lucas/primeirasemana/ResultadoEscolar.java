package edu.lucas.primeirasemana;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 10;
    //  Condição ternária
    //  String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
    //  System.out.println(resultado);
        if (nota >= 7 ) 
            System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7) 
        System.out.println("Prova de Recuperação");
            
        else 
        System.out.println("Reprovado");
        
    }
}
