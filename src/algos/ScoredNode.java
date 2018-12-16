package algos;

import graph.Node;

public class ScoredNode implements Comparable{
    public int score;
    public Node n;

    ScoredNode(Node n){
        this.n = n;
        score = 0;
    }


    @Override
    public int compareTo(Object o) {
        if (!(o instanceof ScoredNode))throw new UnsupportedOperationException();

        if (this.score < ((ScoredNode) o).score)return -1;
        else if (this.score > ((ScoredNode) o).score)return 1;
        else return 0;
    }
}
