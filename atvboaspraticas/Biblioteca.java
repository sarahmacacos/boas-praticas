package atvboaspraticas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Biblioteca {
    private final List<Livro> livros = new ArrayList<>(); // lista de livros da biblioteca

    public Biblioteca() {
        // adicionamos alguns livros iniciais para testes
        this.livros.add(new Livro("it"));
        this.livros.add(new Livro("you"));
        this.livros.add(new Livro("1984"));
    }

    private boolean existe(String titulo) {
        return this.livros.stream().anyMatch(it -> it.getTitulo().equals(titulo));
    }

    public void adicionar(Livro livro) {
        switch (livro) {
            case Livro l when l.getTitulo().isEmpty() || l.getTitulo().isBlank() ->
                    System.out.println("Título de livro inválido!");
            case Livro l when this.existe(l.getTitulo()) -> System.out.println("Esse livro já existe");
            case Livro l when !this.existe(l.getTitulo()) -> {
                this.livros.add(l);
                System.out.println("Livro adicionado");
            }
            default -> throw new IllegalStateException("Unexpected value: " + livro);
        }
    }

    public void emprestar(String titulo) {
        boolean existe = this.existe(titulo);
        if (!existe) {
            System.out.println("livro não encontrado");
            return;
        }

        Optional<Livro> optionalLivro = this.livros.stream().filter(it -> it.getTitulo().equals(titulo) && !it.isEmprestado()).findAny();

        if (optionalLivro.isPresent()) {
            optionalLivro.get().setEmprestado(true);
            System.out.println("livro emprestado");
        } else {
            System.out.println("Livro indisponivel (emprestado)");
        }
    }

    public void listar() {
        if (this.livros.isEmpty()) {
            System.out.println("nenhum livro cadastrado");
            return;
        }

        System.out.println("\nlivros na biblioteca:");
        this.livros.forEach(livro -> System.out.println("-" + livro));
    }
}