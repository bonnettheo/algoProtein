import graph.Node;

import javax.activation.UnsupportedDataTypeException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProblemGenerator {
    List<Node> nodes = new ArrayList<>();
    List<List<Node>> C = new ArrayList<>();

    /**
     *
     * @param n nbr of nodes
     * @param p nbr of nodes per C
     * @param t nbr of C
     */
    public ProblemGenerator(int n, int p, int t){
        if(n<1){
            throw new UnsupportedOperationException();
        }
        if(p>n || p < 1){
            throw new UnsupportedOperationException();
        }
        // create n nodes
        for(int i =0; i<n; i++){
            nodes.add(new Node());
        }
        // create t C
        for(int i = 0; i < t; i++){
            C.add(new ArrayList<>());
            // add p nodes in C
            for(int j = 0; j < p; j++){
                Random random = new Random();
                int rdm = random.nextInt(n);
                C.get(i).add(nodes.get(rdm));
            }
        }

    }
}
