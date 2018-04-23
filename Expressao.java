package mat2;

import java.util.Scanner;

public class Mat2 {

    public static void main(String[] args) {
        Scanner LerS = new Scanner(System.in);
        int declive, ordenada, objeto, expressao;
        System.out.println("Digite O Valor Do Declive:");
        declive = LerS.nextInt();
        System.out.println("Digite O Valor Da Ordenada Na Origem:");
        ordenada = LerS.nextInt();

        imprimeExpressao(declive, ordenada);

        System.out.println("Digite O Objeto:");
        objeto = LerS.nextInt();
        imprimeImagem (objeto,declive,ordenada);
    }

    private static void imprimeExpressao(int m, int b) {
        System.out.println("Expressao Algebrica: f(x)=" + m + "x+" + b);
    }

    private static void imprimeImagem(int a, int b, int c) {
     System.out.println("Imagem :f(" + a + ") =" + (b * a + c ));
    }
}
