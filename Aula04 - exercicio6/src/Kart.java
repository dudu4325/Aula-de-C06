public class Kart {
    String nome;
    Motor m;
    Piloto piloto;

    public void pular(){
        System.out.println(piloto.nome + " pulou.");
    }

    public void soltarTurbo(){
        System.out.println(piloto.nome + " soltou turbo.");
    }

    public void fazerDrift(){
        System.out.println(piloto.nome + " fez drift.");
    }

    public Kart(){
        m = new Motor();
    }
}
