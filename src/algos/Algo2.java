package algos;

import generator.ProblemGenerator;
import graph.Link;
import graph.Node;

import java.util.ArrayList;
import java.util.List;

public class Algo2 extends Algos {

    ArrayList<ChainOfLinks> reusable = new ArrayList<>();
    public Algo2(ProblemGenerator pbg) {
        super(pbg);
    }

    @Override
    public void computeSolution() {

        for(List<Node> C : Cs) {

            do {
                reusable = new ArrayList<>();
                computeReusable(C);
                reusable.sort(ChainOfLinks::compareTo);
                if (reusable.size() > 0) {
                    C.removeAll(reusable.get(0).nodes);
                    C.add(reusable.get(0).extremum[1]);
                }
            }while(reusable.size()>0);
            for(int i = 0; i < C.size()-1; ++i){
                Link l = new Link(C.get(i),C.get(i+1));
                if(!links.contains(l)){
                    links.add(l);
                }
            }
        }


    }

    private void computeReusable(List<Node> C){
            for (int i = 0; i < C.size() - 1; ++i) {
                for (int j = i + 1; j < C.size(); j++) {
                    Link l = new Link(C.get(i), C.get(j));
                    if (links.contains(l)) {
                        reusable.add(new ChainOfLinks(l));
                    }
                }
            }

            for (int i = 0; i < reusable.size() - 1; ++i) {
                for (int j = i + 1; j < reusable.size(); j++) {
                    if (reusable.get(i).addChain(reusable.get(j))) {
                        i = 0;
                        j = 1;
                    }
                }
            }
    }
}
