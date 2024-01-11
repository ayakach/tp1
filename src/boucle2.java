import java.util.Scanner;

public class boucle2 {
    public static void main(String [] args ){
        Scanner sca =new Scanner(System.in);
        System.out.println("enter la valeur n ");
        int n = sca.nextInt();
        int s=0;
        for(int i=0;i<=n;i++){
            if(i%2!=0)
                s=s+i;
        }
        System.out.println("le factoriel est ="+s);
    }}