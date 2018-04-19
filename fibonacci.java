package Fibonacci;
import java.util.Scanner;
public class Fibonacci {
		public static void main(String[] args) {
		    Scanner LerS = new Scanner(System.in);
		    System.out.println("Digite a quantidade de termos");
		    int QT = LerS.nextInt();
		    int a = 1;
		    int b = 1;
		    System.out.print("1 ");
		    System.out.print("1 ");
		    QT = QT - 2;
		    while (QT > 0) {
		        System.out.print((a+b) + " ");
		        int c = a+b;
		        a = b;
		        b = c;
		        QT--;
		    }
		    }
		    }
