public class Cantina {
    String nome;
    Salgado salgados[] = new Salgado[3];
    int qsalgados = 0;

    public void mostrarInfo() {
        for(Salgado s: salgados){
            if(s != null){
                System.out.println(s.nome);
            }
        }
    }

    public void addSalgado(Salgado novoSalgado) {
        salgados[qsalgados] = novoSalgado;
        qsalgados++;
    }
}
