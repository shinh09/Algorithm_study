package week3.huffman;

public class Itm {
    public String decoder(HuffmanCodeTree ht, String s){
        HNode current = ht.root;
        int index =0;
        String result = "";
        while(index < s.length()) {
            char c = s.charAt(index);
            if (c == '0') {
                current = current.left;
            } else if (c == '1'){
                current = current.right;
            }else{
                return "invaild";    //잘못된 문자
            }
            if(current ==null){
                return "invaild";   //잘못된 경로
            }
            if(current.left ==null && current.right==null){
                result += current.character;
                current = ht.root;
            }
            index ++;
        }
        return result;
    }
}
