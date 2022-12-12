import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=0, val1=0, val2=0;

        System.out.println("1. Area triangulo");
        System.out.println("2. Area círculo.");
        System.out.println("3. Area del cono");
        System.out.println("4. Area del cilindro");
        num=sc.nextInt();

        switch(num) {
            case 1:
                System.out.println("Introduce la base del triangulo:");
                val1=sc.nextInt();
                System.out.println("Introduce la base del triangulo:");
                val2=sc.nextInt();
                System.out.println("El area del triangulo es: "+(val1*val2)/2);
                break;
            case 2:
                System.out.println("Introduce el radio del circulo:");
                val1=sc.nextInt();
                System.out.println("El area del circulo es: "+(val1*val1)*Math.PI);
                break;
            default:
                System.out.println("Introduzca un numero valido");
        }
    }
}