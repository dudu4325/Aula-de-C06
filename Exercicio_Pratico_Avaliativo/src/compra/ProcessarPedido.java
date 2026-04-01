package compra;

import compra.dispositivo.Computador;

public class ProcessarPedido {

    public static void helper(Computador [] computadores){
        for (Computador computador : computadores) {
            if (computador != null) {
                computador.mostraPCConfigs();
            }
            else{
                break;
            }
        }
        System.out.println("Pedido enviado...");
    }
}