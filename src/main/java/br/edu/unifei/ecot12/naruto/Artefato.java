package br.edu.unifei.ecot12.naruto;

public class Artefato {
    private String nome;
    private String tipo;
    private int raridade;
    private boolean proibido;
    private String habilidade; 
    private String localizacao;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getRaridade() {
        return raridade;
    }
    public void setRaridade(int raridade) {
        this.raridade = raridade;
    }
    public boolean isProibido() {
        return proibido;
    }
    public void setProibido(boolean proibido) {
        this.proibido = proibido;
    }
    public String getHabilidade() {
        return habilidade;
    }
    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    


}
