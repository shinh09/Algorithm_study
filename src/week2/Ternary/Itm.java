package week2.Ternary;

public class Itm {
    public boolean searchTST(TSTree t , String s){
        Node current = t.root;
        int index = 0;

        while( current != null && index < s.length()){
            char c = s.charAt(index);

            if(c< current.data){
                current = current.left;
            }else if (c> current.data){
                current = current.right;
            }else{
                index++;
                if(index == s.length()){
                    return current.isEndOfString;
                }
                current = current.eq;
            }
        }
        return false;
    }
}
