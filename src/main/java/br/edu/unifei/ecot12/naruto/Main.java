package br.edu.unifei.ecot12.naruto;

public class Main {
    public static void main(String[] args) {
        KekkeiGenkai r = new KekkeiGenkai();
        r.setNome("Rinnegan");

        Shinobi n = new Shinobi();
        n.setNome("Nagato");
        n.setApelido("Pain");
        n.setRenegado(true);
        n.getKekkeiGenkais().add(r);

    }
}