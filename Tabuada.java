public class Tabuada{
    public static void main(String[] args) {
        int idades[]=new int[11];
        for(int i = 0; i < idades.length; i++){
            idades[i]=i*2;
        }
        for(int i:idades){
            System.out.println(i);
        }
        
    }
}