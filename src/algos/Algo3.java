package algos;

import generator.ProblemGenerator;
import graph.Link;
import graph.Node;

import java.util.ArrayList;
import java.util.List;

public class Algo3 extends Algos {


    public Algo3(ProblemGenerator pbg){
        super(pbg);
    }

    @Override
    public void computeSolution() {
        List<Node> seenNodes = new ArrayList<>();
        List<ScoredNode> scoredNodes = new ArrayList<>();
        for(List<Node> C : Cs) {
            for (int i = 0; i < C.size(); ++i) {
                if (!seenNodes.contains(C.get(i))){
                    seenNodes.add(C.get(i));
                    scoredNodes.add(new ScoredNode(C.get(i)));
                    scoredNodes.get(seenNodes.indexOf(C.get(i))).score++;
                }else{
                    scoredNodes.get(seenNodes.indexOf(C.get(i))).score++;
                }
            }
        }
        List<List<ScoredNode>> CsScored = new ArrayList<>();
        for(List<Node> C : Cs) {
            List<ScoredNode> CScored = new ArrayList<>();
            for (int i = 0; i < C.size(); ++i) {CScored.add(scoredNodes.get(seenNodes.indexOf(C.get(i))));}
            CsScored.add(CScored);
        }
        for(List<ScoredNode> C : CsScored) {
            C.sort(ScoredNode::compareTo);
            for (int i = 0; i < C.size()-1; ++i){
                Link l = new Link(C.get(i).n,C.get(i+1).n);
                if(!links.contains(l)){
                    links.add(l);
                }
            }
        }
    }
}
