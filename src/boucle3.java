 import java.util.Scanner;

public class boucle3 {
    public static void main(String [] args ){
      Scanner sca =new Scanner(System.in);
      System.out.println("enter la valeur n ");
      int n = sca.nextInt();
      int f=1;
      for(int i=2;i<=n;i++){
          f = f*i;
    }
      System.out.println("le factoriel est ="+f);
}}
