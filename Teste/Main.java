package Teste;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer input1, input2;
        Elevador elevador = new Elevador();
        Scanner Input = new Scanner(System.in);

        /* iniciando o elevador */
        System.out.println("digite a capacidade do elevador");
        input1 = Input.nextInt();
        System.out.println("digite o número de andares");
        input2 = Input.nextInt();

        elevador.iniciar(input1,input2);

        /* entrando pessoas ao elevador */
        System.out.println("Quantas pessoas devem entrar no elevador");
        input1 = Input.nextInt();

        for (int i = 0; i < input1; i++) {
            elevador.entrar();
        }
        System.out.println("existem "+elevador.getQuantidadePessoas()+" pessoas no elevador");

        /* saindo pessoas ao elevador */
        System.out.println("Quantas pessoas devem sair do elevador");
        input1 = Input.nextInt();

        for (int i = 0; i < input1; i++) {
            elevador.sair();
        }
        System.out.println("existem "+elevador.getQuantidadePessoas()+" pessoas no elevador");

        /* subindo elevador */
        System.out.println("Deseja subir para qual andar");
        input1 = Input.nextInt();

        for (int i = 0; i < input1; i++) {
            elevador.subir();
        }
        System.out.println("voce está no "+elevador.getAndarAtual() +" andarr");

        /* descendo elevador */
        System.out.println("Deseja descer para qual andar");
        input1 = Input.nextInt();

        for (int i = 0; i < input1; i++) {
            elevador.descer();
        }
        System.out.println("voce está no "+elevador.getAndarAtual() +" andarr");
    }
}
