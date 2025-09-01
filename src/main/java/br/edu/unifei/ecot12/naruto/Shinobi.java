package br.edu.unifei.ecot12.naruto;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Shinobi extends Ser {
    private String sexo;
    private Date nascimento;
    private boolean renegado;
    private Bijuu bijuu;
    private String categoria;
    private List<KekkeiGenkai> kekkeiGenkais = new ArrayList<KekkeiGenkai>();
    private Time time;
    
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public Date getNascimento() {
        return nascimento;
    }
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    public boolean isRenegado() {
        return renegado;
    }
    public void setRenegado(boolean renegado) {
        this.renegado = renegado;
    }
    public Bijuu getBijuu() {
        return bijuu;
    }
    public void setBijuu(Bijuu bijuu) {
        this.bijuu = bijuu;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public List<KekkeiGenkai> getKekkeiGenkais() {
        return kekkeiGenkais;
    }
    public void setKekkeiGenkais(List<KekkeiGenkai> kekkeiGenkais) {
        this.kekkeiGenkais = kekkeiGenkais;
    }
    public Time getTime() {
        return time;
    }
    public void setTime(Time time) {
        this.time = time;
    }

}
