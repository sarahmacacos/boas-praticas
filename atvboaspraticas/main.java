package atvboaspraticas;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        biblioteca bib = new biblioteca(); // criamos um objeto biblioteca para organizar as regras
        int op;
        String titulo;
        do {
            System.out.println("\nMENU");
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Emprestar livro");
            System.out.println("3 - Listar livros");
            System.out.println("4 - SAIR");
            System.out.print("escolha: ");
            System.out.println();
            op = sc.nextInt();
            sc.nextLine();

            switch(op) {
                case 1:
                    System.out.print("Titulo do livro: ");
                    titulo = sc.nextLine().toLowerCase().trim(); // padroniza o texto para evitar erro de comparação
                    bib.adicionar(new livro(titulo)); // adicionar foi movida para a classe biblioteca
                    break;
                case 2:
                    System.out.print("Qual livro você quer emprestar? ");
                    titulo = sc.nextLine().toLowerCase().trim();
                    bib.emprestar(titulo); // a lógica de empréstimo também fica na biblioteca
                    break;
                case 3:
                    bib.listar(); // lista os livros disponíveis
                    break;
                case 4:
                    System.out.println("ENCERRANDO...");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }
        while(op != 4);
        sc.close();
    }
}