package br.edu.unifei.ecot12.naruto;

public abstract class Jutsu {
    private String nome;
    private String efeito;
    private boolean proibido;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEfeito() {
        return efeito;
    }
    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }
    public boolean isProibido() {
        return proibido;
    }
    public void setProibido(boolean proibido) {
        this.proibido = proibido;
    }
    
}
