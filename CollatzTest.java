import java.util.Scanner;

public class CollatzTest {
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        Collatz ct = new Collatz();
        
        System.out.print("Podaj górny limit... ");
        int limit = k.nextInt();

        int mode;
        do{
            mode = k.nextInt();
        }while(mode!=0 && mode!=1);

        if(mode==0){
            for(int i=1; i<=limit; i++){
                System.out.println(i + " --> " + ct.getSequence(i));
            }
        } else {
            for(int i=1; i<=limit; i++){
                System.out.println(i + " --> " + ct.getSequenceLength(i));
            }
        }
        k.close();
    }
}