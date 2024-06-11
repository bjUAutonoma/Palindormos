package palindromo;
import java.util.Scanner;

public class Palindromo_2 extends Enter{
    
    public static void main(String[] args) {
        Palindromo_2 enter = new Palindromo_2();
        enter.menu();
    }
    public void menu(){
        int option = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Que desea hacer:"
                + "\n(1) Que es un palindromo?"
                + "\n(2) Verificar palindromo");
        try{
            option = input.nextInt();
        }
        catch(Exception e){
            System.out.println("OPCION INVALIDA");
            menu();
        }
        switch (option){
            case 1:
                System.out.println("\nEs una palabra identica al derecho y reves\n");
                menu();
                break;
            case 2:
                isPal();
                break;
            default:
                System.out.println("\n*explota*");
                System.out.println(0/0);
                break;
        }
    }
    public void isPal(){
        System.out.println("\nIngrese la palabra a evaluar:");
        Scanner input = new Scanner(System.in);
        StringBuilder temp = new StringBuilder(input.nextLine());
        String palindromo = temp.toString().toUpperCase();
        String valid = temp.reverse().toString().toUpperCase();
        if (palindromo.equals(valid)){
            System.out.println("\n'"+palindromo+"' es palindromo\n");
        }
        else{
            System.out.println("\n'"+palindromo+"' no es palindromo\n");
        }
        Palindromo_2 obj = new Palindromo_2();
        obj.enter();
    }
}