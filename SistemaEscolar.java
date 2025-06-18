import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] notas = new double[8];
        double[]bimestres = new double[4];
        double[] semestres = new double[2];

        // Recebe as 8 notas
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = input.nextDouble();
        }

        // Calcula as médias bimestrais
        bimestres[0] = (notas[0] + notas[1]) / 2;
        bimestres[1] = (notas[2] + notas[3]) / 2;
        bimestres[2] = (notas[4] + notas[5]) / 2;
        bimestres[3] = (notas[6] + notas[7]) / 2;

        // Calcula as médias semestrais
        semestres[0] = (bimestres[0] + bimestres[1]) / 2;
        semestres[1] = (bimestres[2] + bimestres[3]) / 2;

        // Calcula média final
        double mediaFinal = (semestres[0] + semestres[1]) / 2;

        // Exibe os resultados
        System.out.printf("\n1º Bimestre: %.1f\n", bimestres[0]);
        System.out.printf("2º Bimestre: %.1f\n", bimestres[1]);
        System.out.printf("1º Semestre: %.1f\n", semestres[0]);
        System.out.println("-----------------------------");
        System.out.printf("3º Bimestre: %.1f\n", bimestres[2]);
        System.out.printf("4º Bimestre: %.1f\n", bimestres[3]);
        System.out.printf("2º Semestre: %.1f\n", semestres[1]);
        System.out.println("-----------------------------");
        System.out.printf("Média Final: %.1f\n", mediaFinal);
    }
}
    
