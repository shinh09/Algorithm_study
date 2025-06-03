package week2.Btree;

public class MainBTree {
    public static void main(String[] args) {
        BTree tree = new BTree(3); // 차수 3인 B-Tree 생성
        Itm itm = new Itm();

        int[] keys = {10, 20, 5, 6, 12, 30, 7, 17};
        for (int key : keys) {
            itm.insert(tree, key);
        }

        System.out.println("=== B-Tree 탐색 결과 ===");
        System.out.println("찾음 (6): " + (itm.search(tree, 6) ? "Found" : "Not Found"));
        System.out.println("찾음 (15): " + (itm.search(tree, 15) ? "Found" : "Not Found"));
        System.out.println("찾음 (17): " + (itm.search(tree, 17) ? "Found" : "Not Found"));
    }
}
