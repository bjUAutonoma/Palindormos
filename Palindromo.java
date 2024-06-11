package palindromo;
import java.util.Scanner;

public class Palindromo extends Enter{

    public static void main(String[] args) {
        Palindromo enter = new Palindromo();
        enter.menu();
    }
    public void menu(){
        int option = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Que desea hacer:"
                + "\n(1) Verificar palindromo");
        try{
            option = input.nextInt();
        }
        catch(Exception e){
            System.out.println("OPCION INVALIDA");
            menu();
        }
        switch (option){
            case 1:
                in();
                break;
            default:
                System.out.println("\n*explota*");
                System.out.println(0/0);
                break;
        }
    }
    public void in(){
        System.out.println("\nIngrese la palabra a evaluar:");
        Scanner input = new Scanner(System.in);
        String palindromo = input.nextLine();
        isPal(palindromo);
    }
    public void isPal(String palindromo){
        String valid = new String();
        for (int i=palindromo.length()-1;i>-1;i--){
            valid = valid+palindromo.substring(i,i+1);
        }
        if (palindromo.equals(valid)){
            System.out.println("\n'"+palindromo+"' es un palindromo\n");
        }
        else{
            System.out.println("\n'"+palindromo+"' no es un palindromo\n");
        }
        enter();
    }
}