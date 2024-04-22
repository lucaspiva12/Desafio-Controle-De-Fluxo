package exercicio;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int primeiraParametro = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoParametro = scanner.nextInt();

        try{
            contar(primeiraParametro, segundoParametro);
        }catch (ParametrosIvalidosExeption e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        scanner.close();

    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosIvalidosExeption {
        if (primeiroParametro >= segundoParametro ){
            throw new ParametrosIvalidosExeption("O segundo parametro deve ser maior que o primeiro!");
        }

        int contagem = segundoParametro - primeiroParametro;

        for (int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número: " + i);
        }
    }
}
