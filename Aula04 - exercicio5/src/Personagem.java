public class Personagem {
    String nome;
    int pontos;
    Arma arma;


    public void usarArma(){
        arma.resistencia -= 2;

        if(arma.resistencia < 0){
            arma.resistencia = 0;
            System.out.println("A arma já está quebrada, não tem como usar");
        }
        else if(arma.resistencia == 0 ||arma.resistencia == -1){
            arma.resistencia = 0;
            System.out.println("A arma quebrou");
        }

    }

    public void tomarDano(){
        if(pontos > 5){
            pontos -= 5;
        }
        else{
            pontos = 0;
            System.out.println("Você morreu!");
        }
    }
}
