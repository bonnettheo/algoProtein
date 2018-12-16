package algos;

import graph.Link;
import graph.Node;

import java.util.ArrayList;
import java.util.List;

public class chainOfLinks implements Comparable{
    List<Node> nodes = new ArrayList<>();
    Node extremum[] = new Node[2];

    chainOfLinks(Link l){
        List<Node> n = l.getNodes();
        extremum[0] = n.get(0);
        extremum[1] = n.get(1);
        nodes.addAll(n);
    }

    void addNode(Node n){
        extremum[1] = n;
        nodes.add(n);
    }

    boolean addChain(chainOfLinks l){
        Node[] n = l.getExtremum();
        if (n[0].equals(extremum[1]) && n[1].equals(extremum[0])){
            return false;
        }
        if (n[0].equals(extremum[1])){
            nodes.remove(extremum[1]);
            extremum[1] = n[1];
            nodes.addAll(l.getNodes());
            return true;
        }
        if (n[1].equals(extremum[0])){
            nodes.remove(extremum[0]);
            extremum[0] = n[0];
            nodes.addAll(l.getNodes());
            return true;
        }

        return false;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public Node[] getExtremum() {
        return extremum;
    }

    @Override
    public int compareTo(Object o) {
        if(!(o instanceof chainOfLinks))throw new UnsupportedOperationException();

        if(this.nodes.size()<((chainOfLinks) o).nodes.size())return -1;
        else if (this.nodes.size()<((chainOfLinks) o).nodes.size())return 1;
        else return 0;
    }
}
