package node_tree.case_;

import java.util.List;
import java.util.Stack;

public class Node {
    //1.java�е�Node��һ���ӿ�,һ������������������ʵ��,Ҳ�����Զ���node�ڵ���������ʵ�����������ӵ����ݴ���
    //���������Զ�����node����Ϊ��
    //�������Զ���һ��node�ڵ����
    /**ֵ��ע�����,�������ǵĶ���,Node�������Ͳ��ǵ�һ��һ��������һ����,����һ���������Ƕ���ṹ������
     * ����:Node{value=1,node=null,left=Node{value=2,node=null,left=null,right=null},right=Node{value=3,node=null,left=null,right=null}}
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
     * ��̬��������
     */
    public static void create(int[] arrData, List<Node> list) {
        //����Ԫ��ȡ��,��ɽڵ����
        for (int i = 0; i < arrData.length; i++) {
            Node node = new Node(arrData[i]);
            list.add(node);
        }

        //�ڵ��������
        for (int index = 0; index < list.size() / 2 - 1; index++) {
            list.get(index).setLeft(list.get(index * 2 + 1));
            list.get(index).setRight(list.get(index * 2 + 2));
        }
        //���ܻ�ʣ��һ���ڵ�û��ֻ��һ���ӽڵ�,��������
        int index = list.size() / 2 - 1;
        list.get(index).setLeft(list.get(index * 2 + 1));
        //ʣ��ڵ�����ӽڵ����������
        if (list.size() % 2 == 1) {
            list.get(index).setRight(list.get(index * 2 + 2));
        }

    }

    /**
     * �ݹ�ǰ�������
     */
    public static void preTraversal(Node node) {
        if (node == null) //����Ҫ��������� ������Ҷ�ӽڵ�����ֹͣ���±���
            return;
        System.out.print(node.getValue() + " ");
        preTraversal(node.getLeft());
        preTraversal(node.getRight());
    }

    /**
     * �ݹ����������
     */
    public static void midTraversal(Node node) {
        if (node == null) return;
        midTraversal(node.getLeft());
        System.out.print(node.getValue() + " ");//��ӡ���η����еĽڵ�ֵ
        midTraversal(node.getRight());
    }

    /**
     * �ݹ���������
     */
    public static void postTraversal(Node node) {
        if (node == null) return;
        postTraversal(node.getLeft());
        midTraversal(node.getRight());
        System.out.print(node.getValue() + " ");
    }

    /**
     * �ǵݹ�ǰ�����
     */
    public static void preStackTraversal(Node node) {
        Stack<Node> stack = new Stack<Node>();
        Node p = node;
        while (p != null || !stack.isEmpty()) {
            //���ýڵ��µ����е����Ԫ�ؽ�ջ��Ϊ��Ԫ��(���ұ���)
            while (p != null) {
                System.out.print(p.getValue() + " ");
                stack.push(p);
                p = p.getLeft();
            }
            //ȡ����ĩ��Ԫ��,������һ����ĩ��Ԫ���µ����ֵ�
            if (!stack.isEmpty()) {
                p = stack.pop();//pop()���س�ջ���Ǹ�ֵ
                p = p.getRight();
            }
        }
    }
    //�ǵݹ�ǰ���������:��Ԫ���жϳ����ֵܽڵ�����"��ջ����" ==>������ȵ��ص�

    public static void midStackTraversal(Node node){
        Stack<Node> stack = new Stack<Node>();
        Node p = node;
        while (p != null || !stack.isEmpty()) {//!static.isEmpty()�ж϶���Ԫ�صķ���
            //���ýڵ��µ����е����Ԫ�ؽ�ջ��Ϊ��Ԫ��(���ұ���)
            while (p!= null) {
                stack.push(p);
                p = p.getLeft();
            }
            if (!stack.isEmpty()) {
                p = stack.pop();//pop()���س�ջ���Ǹ�ֵ
                System.out.print(p.getValue() + " ");
                p = p.getRight();
            }
        }
    }
    //�ǵݹ������������:��Ԫ���ж����ֵܽڵ�ǰ����"��ջ����"  ==>������ȵ��ص�

    public static void postStackTraversal(Node node){
        Stack<Node> stack=new Stack<Node>();
        Node p=node;//�����ڵ�
        Node prev=node;//������ų�ʼ�ڵ�
        while (p != null || !stack.isEmpty()) {
            //���ýڵ��µ����е����Ԫ�ؽ�ջ��Ϊ��Ԫ��(���ұ���)
            while (p!= null) {
                stack.push(p);
                p = p.getLeft();
            }
            if (!stack.isEmpty()) {
                Node temp=stack.peek().getRight();
                //��������û�����ӽڵ�,ͷ�ڵ�����(����,���ͽ�ʣ��"��֦�ɽṹ")
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
