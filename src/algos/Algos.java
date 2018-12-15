package algos;

import generator.ProblemGenerator;
import graph.Link;
import graph.Node;

import java.util.ArrayList;
import java.util.List;

abstract public class Algos {
    protected List<Link> links = new ArrayList<>();
    protected List<List<Node>> Cs = new ArrayList<>();

    public Algos(ProblemGenerator pbg){
        Cs = pbg.getC();
    }

    abstract public void computeSolution();

    public int getNbrLinks(){
        return links.size();
    }
}
