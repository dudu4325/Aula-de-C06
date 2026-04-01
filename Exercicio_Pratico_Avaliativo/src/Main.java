import compra.Cliente;
import compra.ProcessarPedido;
import compra.dispositivo.Computador;
import compra.dispositivo.partes.MemoriaUSB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Cliente vc = new Cliente("Luis", "142.456.789-09");

        int opcao;
        int escolha;
        float total;

        do {
            System.out.println("Escolha a promoção: ");
            System.out.println("[1] - Promoção da Apple");
            System.out.println("[2] - Promoção da Samsung");
            System.out.println("[3] - Promoção da Dell");
            System.out.println("[0] - Finalizar compra");
            System.out.print("Opção: ");
            opcao = scan.nextInt();
            System.out.println();

            switch (opcao){
                case 1:
                    vc.getComputadores()[vc.getQuantidadeComprada()] = new Computador("Apple", 868);
                    vc.setQuantidadeComprada(vc.getQuantidadeComprada() + 1);
                    break;
                case 2:
                    vc.getComputadores()[vc.getQuantidadeComprada()] = new Computador("Samsung",2102);
                    vc.setQuantidadeComprada(vc.getQuantidadeComprada() + 1);
                    break;
                case 3:
                    vc.getComputadores()[vc.getQuantidadeComprada()] = new Computador("Dell",6546);
                    vc.setQuantidadeComprada(vc.getQuantidadeComprada() + 1);
                    break;
                case 0:
                    if (vc.getQuantidadeComprada() >= 2) {
                        System.out.println("Obrigado por fazer compras conosco!");
                    }
                    else {
                        System.out.println("Você deve comprar pelo menos 2 computadores!");
                    }
                    break;
                default:
                    System.out.println("Essa promoção não existe");
            }

            if(opcao == 1 || opcao == 2 || opcao == 3) {
                System.out.println("Você deseja levar a Memoria USB também?");
                System.out.println("[1] - Sim");
                System.out.println("[0] - Não");
                System.out.print("Opção: ");
                escolha = scan.nextInt();
                System.out.println();

                if (escolha == 1) {
                    if (vc.getComputadores()[vc.getQuantidadeComprada() - 1].getMarca().equals("Apple")){
                        MemoriaUSB usb = new MemoriaUSB("Pen-drive",16);
                        vc.getComputadores()[vc.getQuantidadeComprada() - 1].addMemoriaUSB(usb);
                    }
                    else if(vc.getComputadores()[vc.getQuantidadeComprada() - 1].getMarca().equals("Samsung")) {
                        MemoriaUSB usb = new MemoriaUSB("Pen-drive",32);
                        vc.getComputadores()[vc.getQuantidadeComprada() - 1].addMemoriaUSB(usb);
                    }
                    else{
                        MemoriaUSB usb = new MemoriaUSB("HD Externo",1);
                        vc.getComputadores()[vc.getQuantidadeComprada() - 1].addMemoriaUSB(usb);
                    }
                }
            }

        } while (opcao != 0 || vc.getQuantidadeComprada() < 2);

        total = vc.calculaTotalCompra();

        System.out.println();
        System.out.println("O total a ser pago é " + total + " reais.");
        System.out.println();

        ProcessarPedido.helper(vc.getComputadores());
    }
}