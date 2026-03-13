package atvboaspraticas;
import java.util.ArrayList;
import java.util.List;

public class biblioteca {
    List<livro> livros = new ArrayList<>(); // lista de livros da biblioteca

    public biblioteca() {
        // adicionamos alguns livros iniciais para testes
        livros.add(new livro("it"));
        livros.add(new livro("you"));
        livros.add(new livro("1984"));
    }
    private boolean existe(String titulo) {
        for(livro l : livros) {
            if(l.gettitulo().equals(titulo)) { // comparação já em minúsculo
                return true;
            }
        }
        return false;
    }
    public void adicionar(livro livro) {
        if(!existe(livro.gettitulo())) {
            livros.add(livro);
            System.out.println("Livro adicionado");
        } else {
            System.out.println("Esse livro já existe");
        }
    }
    public void emprestar(String titulo) {
        for(livro l : livros) {
            if(l.gettitulo().equals(titulo)) {
                if(!l.isemprestado()) {
                    l.setemprestado(true); // marca o livro como emprestado
                    System.out.println("livro emprestado");
                } else {
                    System.out.println("Livro indisponivel (emprestado)");
                }
                return;
            }
        }
        System.out.println("livro não encontrado");
    }
    public void listar() {
        if(livros.isEmpty()) {
            System.out.println("nenhum livro cadastrado");
            return;
        }
        System.out.println("\nlivros na biblioteca:");

        for(livro l : livros) {
            System.out.println("- " + l);
        }
    }
}