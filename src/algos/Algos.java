package algos;

import generator.ProblemGenerator;
import graph.Link;
import graph.Node;

import java.util.ArrayList;
import java.util.List;

abstract public class Algos {
    protected List<Link> links = new ArrayList<>();
    protected List<List<Node>> C = new ArrayList<>();

    public Algos(ProblemGenerator pbg){
        C = pbg.getC();
    }

    abstract public void computeSolution();

    public int getNbrLinks(){
        return links.size();
    }
}
