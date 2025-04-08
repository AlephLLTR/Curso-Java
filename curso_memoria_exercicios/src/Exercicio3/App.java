package Exercicio3;
import java.util.Scanner;
import java.util.Locale;


public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double altura, avg;
        avg = 0;
        int count_abaixo_16 = 0;
        int idade;


        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        Pessoa[] vetor = new Pessoa[n];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = new Pessoa(null, 0, 0);
            System.out.printf("Dados da %da pessoa:%n", i+1);
            System.out.print("Nome: ");            
            sc.nextLine();
            vetor[i].setNome(sc.nextLine());
            System.out.print("Idade: ");  
            idade = sc.nextInt();          
            vetor[i].setIdade(idade);

            if (idade < 16) {
                count_abaixo_16++;
            }

            System.out.print("Altura: ");     
            altura = sc.nextDouble();  
            avg += altura;     
            vetor[i].setAltura(altura);
        }
        avg /= n;

        System.out.printf("%nAltura média: %.2f%n", avg);
        double porcent = (count_abaixo_16*100)/n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcent);
        
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getIdade() < 16) {
                System.out.println(vetor[i].getNome());
            }
            
        }
        
        sc.close();
    }
}
