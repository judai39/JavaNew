package node_tree.case_;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        List<Node> nodeList=new ArrayList();
        Node.create(arr,nodeList);
        Node node0=nodeList.get(0);
//        Node.preTraversal(node0);
//        Node.midTraversal(node0);
//        Node.postTraversal(node0);

//        Node.preStackTraversal(node0);
//        Node.midStackTraversal(node0);
        Node.postStackTraversal(node0);
    }
}
