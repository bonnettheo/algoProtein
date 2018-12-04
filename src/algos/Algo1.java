package algos;

import generator.ProblemGenerator;
import graph.Link;
import graph.Node;

public class Algo1 extends Algos{
    public Algo1(ProblemGenerator pbg){
        super(pbg);
    }

    @Override
    public void computeSolution() {
        Link link= new Link(this.C.get(0).get(0),this.C.get(0).get(1));
        this.links.add(link);
        // todo
    }
}
