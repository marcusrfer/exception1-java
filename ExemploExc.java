package excecoes;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploExc {
    public static void main(String[] args) {
        method1();
        System.out.println("fim do programa!");
    }

    public static void method1(){
        System.out.println("Inicio do metodo 1");
        method2();
        System.out.println("Fim do metodo 1");
    }
    public static  void method2(){
        System.out.println("Inicio do metodo 2");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Nomes: ");
            String[] vect = sc.nextLine().split(" ");
            System.out.print("Posição: ");
            int pos = sc.nextInt();
            System.out.println(vect[pos]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Posição solicitada não existe no vetor!");
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e){
            System.out.println("Informe apenas números! ");
        }
        System.out.println("Fim do metodo 2");

        sc.close();
    }
}
