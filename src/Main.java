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
            case 3:
                System.out.println("Introduce el radio del cono:");
                val1=sc.nextInt();
                System.out.println("Introduce la altura de inclinación:");
                val2=sc.nextInt();
                System.out.println("El area del cono es: "+(val1*val2)*Math.PI);
                break;
            case 4:
                System.out.println("Introduce el radio del cilindro:");
                val1=sc.nextInt();
                System.out.println("Introduce la altura del cilindro:");
                val2=sc.nextInt();
                System.out.println("El area del cilindro es: "+2*Math.PI*val1*(val1+val2));
                break;
            case 5:
                System.out.println("Introduce el volumen de la esfera:");
                val1=sc.nextInt();
                System.out.println("El Volumen de la esfera es: "+(4/3)*(Math.PI*Math.pow(val1,3)));
                break;

            default:
                System.out.println("Introduzca un numero valido");
        }
    }
}