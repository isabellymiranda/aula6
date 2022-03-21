import java.util.Scanner;
public class Tabuada2{
    public static void main(String[] args) {
        int idades[]=new int[11];
        Scanner sc = new Scanner(System.in);
        System.out.println("O numero da Tabuada é: ");
        int Tabuada2 = sc.nextInt();
        for(int i = 0; i < idades.length; i++){
            idades[i]=i*Tabuada2;
        }
        for(int i:idades){
            System.out.println(i);
        }
        
    }
}