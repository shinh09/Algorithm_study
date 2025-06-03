package week2.Btree;

public class Itm {
    public void insert(BTree tree, int key) {
        // TODO: B-Tree 삽입 구현
    }

    public boolean search(BTree tree, int key){
        BTreeNode current = tree.root;
        return search(current,key);
    }

    public boolean search(BTreeNode current, int key) {
        // TODO: B-Tree 탐색 구현
        int i = 0;

        // 현재 노드에서 key 탐색 --> key 보다 작으면 계속 i++
        while(i< current.n &&  key > current.keys[i]) {
            i++;
        }

        //현재 노드에 key 존재
        if(i < current.n && key == current.keys[i]){
            return true;
        }

        //리프 노드면 더 이상 못 내려가니까 false
        if(current.leaf){
            return false;
        }

        //자식 노드로 내려가기
        return search(current.children[i],key);
    }
}