package atvboaspraticas;

public class Livro {

    private final String titulo;
    private boolean emprestado; // estado para saber se o livro está emprestado

    public Livro(String titulo) {
        this.titulo = titulo;
        this.emprestado = false; // todos os livros começam como disponível
    }

    public String getTitulo() {
        return this.titulo;
    }

    public boolean isEmprestado() {
        return this.emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    @Override
    public String toString() {
        return this.titulo + " (" + (this.emprestado ? "EMPRESTADO": "DISPONIVEL") + ")"; // define como o livro aparece na listagem
    }
}