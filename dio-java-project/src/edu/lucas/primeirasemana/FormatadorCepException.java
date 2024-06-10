package edu.lucas.primeirasemana;

public class FormatadorCepException {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("1234567890");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde as regras de negócio");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() !=10) 
            throw new CepInvalidoException();

            return "12.345.678-90";
        
    }
}
