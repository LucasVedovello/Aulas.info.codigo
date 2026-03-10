package main.java.com.sgl.model;

import java.util.Date;

public class Emprestimo {
   
    private Livro livro;
    private Usuario usuario;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public Emprestimo(Livro livro, Usuario usuario, Date dataEmprestimo, Date dataDevolucao){

        this.livro = livro;
        this.usuario = usuario;
        this.date = dataDevolucao;

    }
    public Livro getLivro(){
        return livro;
    }

    public Usuario getUsuario()
{
    return usuario;
}
public Date getDataDevolucao() {
    return dataDevolucao;
}

public Date getDataEmprestimo() {
    return dataEmprestimo;
}







































}
