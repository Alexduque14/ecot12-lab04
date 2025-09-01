package br.edu.unifei.ecot12.naruto;

import java.util.ArrayList;
import java.util.List;

public class Vila extends EntidadePolitica {

    public Vila(Ser lider) {
        super(lider);
        //TODO Auto-generated constructor stub
    }
    private String localizacao;
    private String bandana;
    private List<Cla> clas = new ArrayList<Cla>();
    
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public String getBandana() {
        return bandana;
    }
    public void setBandana(String bandana) {
        this.bandana = bandana;
    }
    public List<Cla> getClas() {
        return clas;
    }
    public void setClas(List<Cla> clas) {
        this.clas = clas;
    }
    


}
