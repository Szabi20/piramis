import java.util.Scanner;
public class piramis {
    public static void main(String[] args){


        Scanner szam = new Scanner(System.in);
        System.out.println("Kérek egy számot:");
        int piramis2 = szam.nextInt();

        for(int i=1;i<=piramis2;i++){
            for(int j=0 ; j<piramis2-i;j++)
                System.out.print(" ");
            for(int j=0 ; j<2*i-1;j++)
                System.out.print("*");
            System.out.println();
        }
        



    }}
