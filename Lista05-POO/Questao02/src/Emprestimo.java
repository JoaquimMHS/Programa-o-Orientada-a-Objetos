import java.time.LocalDate;

public class Emprestimo {
    private Pessoa pessoa;
    private Livro livro;
    private LocalDate dataEmprestimo;

    public Emprestimo(Pessoa pessoa, Livro livro, LocalDate dataEmprestimo) {
        this.pessoa = pessoa;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
    }
    public Pessoa getPessoa() {
        return pessoa;
    }
    public Livro getLivro(){
        return livro;
    }
    public LocalDate getDataEmprestimo(){
        return dataEmprestimo;
    }

    public String toString(){
        return String.format("Dados do Emprestimo\nPessoa: %s\nLivro: %s\nData de Emprestimo: %s\n",  pessoa, livro, dataEmprestimo);
    }
}
