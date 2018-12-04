package graph;

import java.util.UUID;

public class Node {
    private UUID id;
    public Node(){
        id = UUID.randomUUID();
    }

    @Override
    public boolean equals(Object obj) {
        try{
            Node n = (Node) obj;
            if(n.id.equals(id)){
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            return false;
        }
    }
}
