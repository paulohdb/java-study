import java.sql.Time;

class Restaurante {
  String nome, endereco;
  Time[] funcionamento;
  String[] pratos;
  int numPratos;
  double[] valorEmCaixa;

  Restaurante(String nome, String endereco, Time[] funcionamento) {
    this.nome = nome;  
    this.endereco = endereco;
    this.funcionamento = funcionamento;
    pratos = new String[1000];
    valorEmCaixa = new double[7]; 
  }
  
  Restaurante(String nome, String endereco, Time[] funcionamento, 
      String []pratos, double[]valorEmCaixa) {
    this.nome = nome;  
    this.endereco = endereco;
    this.funcionamento = funcionamento;
    this.pratos = pratos;
    numPratos = pratos.length;
    this.valorEmCaixa = valorEmCaixa;
  }

  double calculaLucro() {
    double soma = 0;
    for (int i = 0 ; i < valorEmCaixa.length ; i++) {
      soma += valorEmCaixa[i];
    }
    return soma;
  }

  String imprimeHorario() {
    return "Restaurante abre " + funcionamento[0].toString() + 
      "h e fecha " + funcionamento[1].toString() + "h";
  }

}
