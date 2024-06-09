package node_tree.case_;

import java.util.List;
import java.util.Stack;

public class Node {
    //1.java中的Node是一个接口,一般用来被其他数据类实现,也可以自定义node节点让其他类实现以用作复杂的数据处理
    //这里我们以二叉树node遍历为例
    //首先先自定义一个node节点对象
    /**值得注意的是,由于我们的定义,Node数据类型不是单一的一个树或是一串数,而是一个符合我们定义结构的数据
     * 例如:Node{value=1,node=null,left=Node{value=2,node=null,left=null,right=null},right=Node{value=3,node=null,left=null,right=null}}
     * */
    private int value;
    private Node node;
    private Node left;
    private Node right;

    private Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", node=" + node +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    /**
     * 静态创建方法
     */
    public static void create(int[] arrData, List<Node> list) {
        //数组元素取出,变成节点对象
        for (int i = 0; i < arrData.length; i++) {
            Node node = new Node(arrData[i]);
            list.add(node);
        }

        //节点关联成树
        for (int index = 0; index < list.size() / 2 - 1; index++) {
            list.get(index).setLeft(list.get(index * 2 + 1));
            list.get(index).setRight(list.get(index * 2 + 2));
        }
        //可能会剩余一个节点没有只有一个子节点,单独设置
        int index = list.size() / 2 - 1;
        list.get(index).setLeft(list.get(index * 2 + 1));
        //剩余节点的右子节点添加有条件
        if (list.size() % 2 == 1) {
            list.get(index).setRight(list.get(index * 2 + 2));
        }

    }

    /**
     * 递归前序遍历树
     */
    public static void preTraversal(Node node) {
        if (node == null) //很重要，必须加上 当遇到叶子节点用来停止向下遍历
            return;
        System.out.print(node.getValue() + " ");
        preTraversal(node.getLeft());
        preTraversal(node.getRight());
    }

    /**
     * 递归中序遍历树
     */
    public static void midTraversal(Node node) {
        if (node == null) return;
        midTraversal(node.getLeft());
        System.out.print(node.getValue() + " ");//打印本次方法中的节点值
        midTraversal(node.getRight());
    }

    /**
     * 递归后序遍历树
     */
    public static void postTraversal(Node node) {
        if (node == null) return;
        postTraversal(node.getLeft());
        midTraversal(node.getRight());
        System.out.print(node.getValue() + " ");
    }

    /**
     * 非递归前序遍历
     */
    public static void preStackTraversal(Node node) {
        Stack<Node> stack = new Stack<Node>();
        Node p = node;
        while (p != null || !stack.isEmpty()) {
            //将该节点下的所有的左侧元素进栈作为父元素(左右遍历)
            while (p != null) {
                System.out.print(p.getValue() + " ");
                stack.push(p);
                p = p.getLeft();
            }
            //取出左末端元素,并返回一个该末端元素下的右兄弟
            if (!stack.isEmpty()) {
                p = stack.pop();//pop()返回出栈的那个值
                p = p.getRight();
            }
        }
    }
    //非递归前序遍历核心:在元素判断出右兄弟节点后进行"进栈遍历" ==>深度优先的重点

    public static void midStackTraversal(Node node){
        Stack<Node> stack = new Stack<Node>();
        Node p = node;
        while (p != null || !stack.isEmpty()) {//!static.isEmpty()判断顶部元素的返回
            //将该节点下的所有的左侧元素进栈作为父元素(左右遍历)
            while (p!= null) {
                stack.push(p);
                p = p.getLeft();
            }
            if (!stack.isEmpty()) {
                p = stack.pop();//pop()返回出栈的那个值
                System.out.print(p.getValue() + " ");
                p = p.getRight();
            }
        }
    }
    //非递归后续遍历核心:在元素判断右兄弟节点前进行"出栈遍历"  ==>广度优先的重点

    public static void postStackTraversal(Node node){
        Stack<Node> stack=new Stack<Node>();
        Node p=node;//操作节点
        Node prev=node;//这代表着初始节点
        while (p != null || !stack.isEmpty()) {
            //将该节点下的所有的左侧元素进栈作为父元素(左右遍历)
            while (p!= null) {
                stack.push(p);
                p = p.getLeft();
            }
            if (!stack.isEmpty()) {
                Node temp=stack.peek().getRight();
                //单独处理没有右子节点,头节点的情况(这样,树就仅剩下"左枝干结构")
                if(temp==null||temp==prev){
                    p=stack.pop();
                    System.out.print(p.getValue()+" ");
                    prev=p;
                    p=null;
                }else{
                    p=temp;
                }
            }
        }
    }
}
