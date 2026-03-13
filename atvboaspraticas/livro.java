package atvboaspraticas;

public class livro {
    private String titulo;
    private boolean emprestado; // estado para saber se o livro está emprestado

    public livro(String titulo) {
        this.titulo = titulo;
        this.emprestado = false; // todos os livros começam como disponível
    }
    public String gettitulo() {
        return titulo;
    }
    public boolean isemprestado() {
        return emprestado;
    }
    public void setemprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
    public String toString() {
        String status;
        if(emprestado) {
            status = "EMPRESTADO";
        } else {
            status = "DISPONIVEL";
        }
        return titulo + " (" + status + ")"; // define como o livro aparece na listagem
    }
}