package week10.dnC;
public class Itm {
    public int processDigits(String num) {
        int len = num.length();

        if (len == 1) {
            return Character.getNumericValue(num.charAt(0));
        }
        if (len ==2) {
            int a = Character.getNumericValue(num.charAt(0));
            int b = Character.getNumericValue(num.charAt(1));
            return  a*b;
        }
        if(len%2 ==0){
            int mid = len/2;
            String left = num.substring(0,mid);
            String right = num.substring(mid);
            return processDigits(left) * processDigits(right);
        }
        else{
            int mid = len/2;
            String left = num.substring(0,mid);
            String right = num.substring(mid+1);
            int middle = Character.getNumericValue(num.charAt(mid));
            return processDigits(left) * processDigits(right) + middle;
        }

    }
}
