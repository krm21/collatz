import java.util.ArrayList;
import java.util.List;

public class Collatz {

    public List<Integer> getSequence(int n){
        List<Integer> rv = new ArrayList<>();
        
        rv.add(n);
        while(n!=1){
            if(n%2==0){
                n = n/2;
            } else {
                n = 3*n + 1;
            }
            rv.add(n);
        }
        
        return rv;
    }

    public int getSequenceLength(int n){
        return getSequence(n).size();
    }
}
