import java.util.Scanner;
/* Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. 
 * Receber o tempo de percurso e a velocidade média.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static void main(String[] args) {
    int tempoDoPercurso, velocidadeMedia, tamanhoDoPercursoEmKm; 
    double litrosGastos;
    final int rendimento = 12;
    
    
    System.out.println("Digite o tempo do percurso: ");
    Scanner inTempoDoPercurso = new Scanner(System.in);
    tempoDoPercurso = inTempoDoPercurso.nextInt();
    
    System.out.println("Digite a velocidade média: ");
    Scanner inVelocidadeMedia = new Scanner(System.in);
    velocidadeMedia = inVelocidadeMedia.nextInt();
    
    tamanhoDoPercursoEmKm = velocidadeMedia * tempoDoPercurso;
    litrosGastos = tamanhoDoPercursoEmKm / rendimento;
    
    
    System.out.println("A quantidade de litros gastos no percurso foi: " + litrosGastos);
    
    
  }
}
