package LerDados;

import java.util.Scanner;

public class LerDados {
    public static void main(String[] args) {
        Scanner LerDados = new Scanner(System.in);
        //Crinaido o objeto Scanner - que tem acesso aos metadados de leitura.
        System.out.println("Entre com o seu nome:");
        //Criando a variavel que vai receber o nome
        String name;
        name = LerDados.nextLine();
        //metodo nextline para leitura dos caracteres em uma linha.
        System.out.println("Bem vindo: "+name);//Saudação ao usuário com o nome informado.
        System.out.println("");
        System.out.println("Agora preciso que informe alguns dados");
        System.out.println("");
        //Vamos agora solicitar que o usuário informe alguns dados para depois imprimir esses dados na tela.
        System.out.println("Informe sua idade:");
        int idade;
        idade = LerDados.nextInt();
        System.out.println("Informe sua altura:");//deve ser usado a virgula ao inves do ponto se necessário.
        double altura;
        altura = LerDados.nextDouble();
        LerDados.next();//Usado para permitir a captura da cidade uma vez que estavamos usando um int.
        System.out.println("Informe sua cidade:");
        String cidade;
        cidade = LerDados.nextLine();
        //Agora vamos imprimir as informações digitadas.
        System.out.println("");
        System.out.println("");
        System.out.println("Senhor " +name+ "segue os dados informados:");
        System.out.println("");
        System.out.println("Idade: "+idade);
        System.out.println("Altura: "+altura);
        System.out.println("Cidade: "+cidade);
        System.out.println("");
        System.out.println("Obrigado!");


    }



}
