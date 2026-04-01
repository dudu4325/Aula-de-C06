package compra;

import compra.dispositivo.Computador;

public class Cliente {
    private String nome;
    private String cpf;

    private Computador[] computadores = new Computador[100];
    private int QuantidadeComprada = 0;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public float calculaTotalCompra(){
        float soma = 0;
        for (Computador computador : computadores) {
            if(computador != null) {
                soma += computador.getPreco();
            }
            else {
                break;
            }
        }
        return soma;
    }

    public Computador[] getComputadores() {
        return computadores;
    }

    public int getQuantidadeComprada() {
        return QuantidadeComprada;
    }

    public void setQuantidadeComprada(int QuantidadeComprada) {
        this.QuantidadeComprada = QuantidadeComprada;
    }
}