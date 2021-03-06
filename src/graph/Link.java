package graph;

import java.util.ArrayList;
import java.util.List;

public class Link {
    Node n1;
    Node n2;
    public Link(Node node1, Node node2){
        if(node1==null || node2==null){
            throw new NullPointerException();
        }
        if (node1.equals(node2)){
            throw new UnsupportedOperationException();
        }
        n1 = node1;
        n2 = node2;
    }

    public List<Node> getNodes() {
        List<Node> toReturn = new ArrayList<>();
        toReturn.add(n1);
        toReturn.add(n2);
        return toReturn;
    }

    @Override
    public boolean equals(Object obj) {
        if(n1 == null || n2 == null)return false;
        try {
             Link l = (Link) obj;
             if((l.n1.equals(n1) || l.n1.equals(n2))
                 && (l.n2.equals(n1) || l.n2.equals(n2))){
                 return true;
             }
             return false;
        }catch (Exception e){
            return false;
        }
    }
}
