import java.util.Scanner;
import java.util.Locale;

    public class Main {
       public static void main(String[] args) {
           Locale.setDefault(Locale.US);
           Scanner sc = new Scanner(System.in);

           String nome, forma_pagamento;
           int idade;
           double valor;

           System.out.println("Digite seu nome: ");

           while (true) {
               nome = sc.nextLine();
               if (nome == null || nome.trim().isEmpty()) {
                   System.out.println("Formato inválido, digite novamente :");
               }else {
                   break;
               }
           }

           System.out.println("Digite sua idade: ");

           while (!sc.hasNextInt()) {
               System.out.println("Formato inválido, tente novamente: ");
               sc.next();
           }

           idade = sc.nextInt();

           while(true) {
               if (idade < 1 || idade > 120) {
                   System.out.println("Formato inválido, tente novamente: ");
               }else {
                   break;
               }
               idade = sc.nextInt();
           }

           System.out.println("Digite o valor do pedido: ");

           while (!sc.hasNextDouble()) {
               System.out.println("Formato invalido, tente novamente: ");
               sc.next();
           }
           valor = sc.nextDouble();

           while (true) {
               if (valor <= 0) {
                   System.out.println("Formato invalido, tente novamente");
               }else {
                   break;
               }
               valor = sc.nextDouble();
           }

           System.out.println("Digite a forma de Pagamento (PIX - DINHEIRO - CARTAO): ");
           sc.nextLine();




           while (true) {
               forma_pagamento = sc.nextLine();
               if (!forma_pagamento.equalsIgnoreCase("pix") && !forma_pagamento.equalsIgnoreCase("dinheiro") && !forma_pagamento.equalsIgnoreCase("cartao")) {
                   System.out.println("Forma de pagamento inválida, tente novamente: ");
               }else {
                   break;
               }
           }

           System.out.println("Pedido realizado com SUCESSO!");
           System.out.println("Nome: " + nome);
           System.out.println("Idade: " + idade);
           System.out.printf("Valor: R$ %.2f%n", valor);
           System.out.println("Pagamento = " + forma_pagamento);




           sc.close();
       }
    }