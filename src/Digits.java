import java.util.ArrayList;

public class Digits {

    private ArrayList<Integer> digitList;

    public Digits(int num){
        digitList = new ArrayList<Integer>();
        String temp = num + "";
        if(temp.length() > 1){
        for (int i = 0; i <= temp.length() -1; i ++) {
            digitList.add(Integer.parseInt(temp.substring(i, i + 1)));
        }
        } else if (temp.length() == 1) {
            digitList.add(num);
        }
    }
    public boolean isStrictlyIncreasing(){
        boolean increase = true;
        if(digitList.size() > 1) {
            for (int i = 0; i <= digitList.size() - 2; i++) {
                if (digitList.get(i + 1) <= digitList.get(i)) {
                    increase = false;
                }
            }
        } else if (digitList.size() == 1) {
            return true;
        }
        return increase;
    }
}
