package main.java.com.sgl.model;

public class Livro {
    
    private String titulo;
    private String autor;
    private int anoPublicacao;

    //construtor
    public Livro(String titulo, String autor, int anoPublicado){
       this.titulo = titulo; 
       this.autor = autor;
       this.anoPublicacao = anoPublicacao;
    }
    
    //getter

    public String getTitulo(){
        return titulo;}
    
    public String getAutor(){
        return autor;}
    
    public Int getAnoPublicacao(){
        return anoPublicacao;}
    
    //setter
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setAnoPublicacao(String anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }








}
