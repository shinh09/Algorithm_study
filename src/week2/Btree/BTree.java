package week2.Btree;
import java.util.*;

class BTreeNode {
    int[] keys;
    int t;  // 최소 차수
    BTreeNode[] children;
    int n; // 현재 key 수
    boolean leaf;

    public BTreeNode(int t, boolean leaf) {
        this.t = t;
        this.leaf = leaf;
        this.keys = new int[2 * t - 1];
        this.children = new BTreeNode[2 * t];
        this.n = 0;
    }
}

public class BTree {
    BTreeNode root;
    int t;

    public BTree(int t) {
        this.root = new BTreeNode(t, true);
        this.t = t;
    }
}
