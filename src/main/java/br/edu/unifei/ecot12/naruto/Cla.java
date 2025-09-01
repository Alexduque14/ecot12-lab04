package br.edu.unifei.ecot12.naruto;

import java.util.ArrayList;
import java.util.List;

public class Cla extends EntidadePolitica {

    public Cla(Ser lider) {
        super(lider);
        //TODO Auto-generated constructor stub
    }

    private String simbolo;
    private List<Shinobi> shinobis = new ArrayList<Shinobi>();
    private List<KekkeiGenkai> kekkeiGenkais = new ArrayList<KekkeiGenkai>();
    public String getSimbolo() {
        return simbolo;
    }
    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
    public List<Shinobi> getShinobis() {
        return shinobis;
    }
    public void setShinobis(List<Shinobi> shinobis) {
        this.shinobis = shinobis;
    }
    public List<KekkeiGenkai> getKekkeiGenkais() {
        return kekkeiGenkais;
    }
    public void setKekkeiGenkais(List<KekkeiGenkai> kekkeiGenkais) {
        this.kekkeiGenkais = kekkeiGenkais;
    }
    

}
