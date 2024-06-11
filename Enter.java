package palindromo;
import java.util.Scanner;

public class Enter {
    
    public void enter(){
        System.out.println("Presione ENTER para continuar");
        Scanner wait = new Scanner(System.in);
        wait.nextLine();
        menu();
    }
    public void menu(){
        System.exit(0);
    }
}
