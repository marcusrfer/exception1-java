package excecoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploFinaly {
    public static void main(String[] args) {
        File file = new File("d:\\sandbox\\in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("Não encontrou o arquivo. "+e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("Bloco finally executado.");
        }
    }
}
