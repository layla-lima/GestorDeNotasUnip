import java.util.Scanner;

public class GestorDeNotasUnip {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao Gestor de Notas da UNIP!");

        System.out.print("Digite a nota da NP1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a nota da NP2: ");
        double nota2 = sc.nextDouble();

        // Calcula a média
        double notaFinal = (nota1 + nota2) / 2;

        System.out.println("Você tem nota do PIM? (s/n)");

        // Corrigindo a verificação da resposta do usuário
        String resposta1 = sc.next();

        if (resposta1.equalsIgnoreCase("s")) {
            System.out.print("Digite a nota do PIM: ");
            double notaPIM = sc.nextDouble();
            double notaFinalSemestre = (notaFinal + notaPIM) / 2;
            if (notaFinalSemestre <= 6) {
                System.out.println("Nota final:" + notaFinalSemestre);
                System.out.println("Necessidade de Exame: Sim");
            }
            else {
                System.out.println("Nota final:" + notaFinalSemestre);
                System.out.println("Necessidade de Exame: Não");
            }
        } else if (resposta1.equalsIgnoreCase("n")) {
            System.out.println("Média das provas: " + notaFinal);
        }
        sc.close();
    }
}
