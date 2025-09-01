package br.edu.unifei.ecot12.naruto;

import java.util.Date;

public class Humano extends Ser{
    private String sexo;
    private Date nascimento;
    private String classeSocial;
    
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
    public String getClasseSocial() {
        return classeSocial;
    }
    public void setClasseSocial(String classeSocial) {
        this.classeSocial = classeSocial;
    }
    
}
