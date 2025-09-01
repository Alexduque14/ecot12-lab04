package br.edu.unifei.ecot12.naruto;

public class KekkeiGenkai {
    private String nome;
    private String descricao;
    private String caracteristicas;
    private boolean ativado;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getCaracteristicas() {
        return caracteristicas;
    }
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    public boolean isAtivado() {
        return ativado;
    }
    public void setAtivado(boolean ativado) {
        this.ativado = ativado;
    }

}
