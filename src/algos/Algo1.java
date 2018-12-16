package algos;

import generator.ProblemGenerator;
import graph.Link;
import graph.Node;

import java.util.ArrayList;
import java.util.List;

public class Algo1 extends Algos{
    public Algo1(ProblemGenerator pbg){
        super(pbg);
    }

    @Override
    public void computeSolution() {
        // parcour chaque C et lient les noeuds entre eux dans l'ordre trouvé sauf si le lien existe deja
        for(List<Node> C : Cs){

            for(int i = 0; i < C.size()-1; ++i){
                Link l = new Link(C.get(i),C.get(i+1));
                if(!links.contains(l)){
                    links.add(l);
                }
            }


            /*for(int i = 0; i < C.size()-1; ++i){
                for(int j = i+1; j < C.size(); j++){
                    Link l = new Link(C.get(i),C.get(j));
                    if(links.contains(l)){
                        reusable.add(l);
                    }
                }
            }*/

            /*for (Link l : reusable){
                List<Node> nodes = l.getNodes();
                if(C.contains(nodes.get(0))||C.contains(nodes.get(1))){
                    System.out.println("reuse");
                    links.add(l);
                    C.remove(nodes.get(0));
                    C.remove(nodes.get(1));
                }
            }*/
        }


    }
}
