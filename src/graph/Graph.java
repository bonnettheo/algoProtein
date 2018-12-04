package graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    List<Node> nodes = new ArrayList<>();
    List<Link> links = new ArrayList<>();
    public Graph(){ }

    public boolean addNode(Node n){
        if(!nodes.contains(n)) {
            nodes.add(n);
            return true;
        }else{
            return false;
        }
    }

    public boolean addLink(Link l){
        if(!nodes.containsAll(l.getNodes()) && !links.contains(l)){
            links.add(l);
            return true;
        }else{
            return false;
        }
    }
}
