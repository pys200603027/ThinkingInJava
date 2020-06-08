package sample;

import com.sample.android.tree.Node;
import com.sample.android.tree.Tree;

import org.junit.Test;

public class TreeTest {

    @Test
    public void test1() {

        Node a = new Node("1");
        Node b = new Node("2");
        Node c = new Node("3");
        Node d = new Node("4");

        //自己连成树的形式
        a.setLeft(b).setRight(c);
        b.setLeft(d);

        Tree tree = new Tree(a);
        tree.preOrder(a);

        System.out.println();

        tree.inOrder(a);
        System.out.println();

        tree.postOrder(a);
        System.out.println();
    }

    @Test
    public void test2() {
        Node a = new Node("1");

        Tree tree = new Tree(a);

        tree.add(a, new Node("2"));
        tree.add(a, new Node("3"));
        tree.add(a, new Node("4"));
        tree.add(a, new Node("5"));
        tree.add(a, new Node("6"));


        tree.preOrder(a);
    }

}
