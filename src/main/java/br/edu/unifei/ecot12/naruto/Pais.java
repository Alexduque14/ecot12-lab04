package br.edu.unifei.ecot12.naruto;

import java.util.ArrayList;
import java.util.List;

public class Pais extends EntidadePolitica {

    public Pais(Ser lider) {
        super(lider);
    }

    private String localizacao;
    private String estilo;
    private List<Vila> vilas = new ArrayList<Vila>();
    
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public String getEstilo() {
        return estilo;
    }
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
    public List<Vila> getVilas() {
        return vilas;
    }
    public void setVilas(List<Vila> vilas) {
        this.vilas = vilas;
    }



}
