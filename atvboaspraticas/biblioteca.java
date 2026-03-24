package atvboaspraticas;
import java.util.ArrayList;
import java.util.List;

public class biblioteca {
    List<Livro> livros = new ArrayList<>(); // lista de livros da biblioteca

    public biblioteca() {
        // adicionamos alguns livros iniciais para testes
        livros.add(new Livro("it"));
        livros.add(new Livro("you"));
        livros.add(new Livro("1984"));
    }
    private boolean existe(String titulo) {
        for(Livro l : livros) {
            if(l.getTitulo().equals(titulo)) { // comparação já em minúsculo
                return true;
            }
        }
        return false;
    }
    public void adicionar(Livro livro) {
        if(!existe(livro.getTitulo())) {
            livros.add(livro);
            System.out.println("Livro adicionado");
        } else {
            System.out.println("Esse livro já existe");
        }
    }
    public void emprestar(String titulo) {
        for(Livro l : livros) {
            if(l.getTitulo().equals(titulo)) {
                if(!l.isEmprestado()) {
                    l.setEmprestado(true); // marca o livro como emprestado
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

        for(Livro l : livros) {
            System.out.println("- " + l);
        }
    }
}