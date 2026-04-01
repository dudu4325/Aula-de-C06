package compra.dispositivo;

import compra.dispositivo.partes.HardWareBasico;
import compra.dispositivo.partes.MemoriaUSB;
import compra.dispositivo.partes.SistemaOperacional;

public class Computador {
    private String marca;
    private float preco;

    private HardWareBasico [] hardWares = new HardWareBasico[3];
    private SistemaOperacional sistema;
    private MemoriaUSB usb;

    public Computador(String marca, float preco) {
        this.marca = marca;
        this.preco = preco;

        switch (marca) {
            case "Apple":
                hardWares[0] = new HardWareBasico("Pentium Core i3", 2200);
                hardWares[1] = new HardWareBasico("Memória RAM", 8);
                hardWares[2] = new HardWareBasico("HD", 500);

                sistema = new SistemaOperacional("macOS Sequoia", 64);

                break;
            case "Samsung":
                hardWares[0] = new HardWareBasico("Pentium Core i5", 3370);
                hardWares[1] = new HardWareBasico("Memória RAM", 16);
                hardWares[2] = new HardWareBasico("HD", 1);

                sistema = new SistemaOperacional("Windows 8", 64);

                break;
            default:
                hardWares[0] = new HardWareBasico("Pentium Core i7", 4500);
                hardWares[1] = new HardWareBasico("Memória RAM", 32);
                hardWares[2] = new HardWareBasico("HD", 2);

                sistema = new SistemaOperacional("Windows 10", 64);
        }
    }

    public void mostraPCConfigs() {
        System.out.println("Computador: " + marca);

        System.out.println("Hardware: " + hardWares[0].getNome() + " de " + hardWares[0].getCapacidade() + " Mhz");
        System.out.println("Hardware: " + hardWares[1].getCapacidade() + " Gb de " + hardWares[1].getNome());
        if (marca.equals("Apple") ) {
            System.out.println("Hardware: " + hardWares[2].getCapacidade() + " Gb de " + hardWares[2].getNome());
        }
        else {
            System.out.println("Hardware: " + hardWares[2].getCapacidade() + " Tb de " + hardWares[2].getNome());
        }

        System.out.println("Sistema operacional: " + sistema.getNome() + " de " + sistema.getTipo()+ " bits");

        if(marca.equals("Dell") && usb != null) {
            System.out.println("Memoria USB: " + usb.getNome() + " de " + usb.getCapacidade() + " Tb");
        }
        else if (usb != null) {
            System.out.println("Memoria USB: " + usb.getNome() + " de " + usb.getCapacidade() + " Gb");
        }

        System.out.println();
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.usb = musb;
    }

    public float getPreco() {
        return preco;
    }

    public String getMarca() {
        return marca;
    }
}