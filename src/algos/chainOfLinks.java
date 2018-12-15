package algos;

import graph.Link;
import graph.Node;

import java.util.List;

public class chainOfLinks {
    List<Node> nodes;
    Node extremum[] = new Node[2];

    chainOfLinks(Link l){
        List<Node> n = l.getNodes();
        extremum[1] = n.get(0);
        extremum[2] = n.get(1);
        nodes.addAll(n);
    }

    void addNode(Node n){
        extremum[2] = n;
        nodes.add(n);
    }

    boolean addLink(Link l){
        List<Node> n = l.getNodes();
        if (n.get(0).equals(extremum[1])){
            extremum[1] = n.get(1);
            nodes.add(n.get(1));
            return true;
        }
        if (n.get(1).equals(extremum[0])){
            extremum[0] = n.get(0);
            nodes.add(n.get(0));
            return true;
        }

        return false;
    }

    public Node[] getExtremum() {
        return extremum;
    }
}
