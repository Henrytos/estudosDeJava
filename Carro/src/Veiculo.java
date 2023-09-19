public class Veiculo {
    //Atributos

    private String tipo;
    private String cor;
    private String placa;
    private int portas;
    private int marcha=0;
    private double velocidade;

    //Metodos

    //Construtor
    public Veiculo(String tipo, String cor, String placa, int portas) {
        this.tipo = tipo;
        this.cor = cor;
        this.placa = placa;
        this.portas = portas;
    }

    public void acelerar() {
        velocidade += marcha * 10;
    }

    public void frear() {
        velocidade = -marcha * 10;
    }

    public void buzinar() {
        Buzina.tocarBuzina();
        // Aguarde um tempo antes de parar a reprodução
        try {
            Thread.sleep(3000); // Espera 3 segundos (você pode ajustar o tempo conforme necessário)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Buzina.pararBuzina();
    }

    public void switchMarcha(int marcha){
        if(marcha<6 && marcha>0){
            this.marcha=marcha;
        }
        else {
            System.out.println("A marcha não condiz ao veiculo");
        }
    }

    public void getCar() {
        System.out.println("Tipo:"+tipo);
        System.out.println("Cor: "+cor);
        System.out.println("Placa: "+placa);
        System.out.println("Portas: "+portas);
        System.out.println("Marcha: "+marcha);
        System.out.println("Velocidade: "+velocidade);

    }

}

