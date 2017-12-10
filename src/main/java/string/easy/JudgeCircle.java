package string.easy;

//657 Judge Route Circle
public class JudgeCircle {
    public boolean judgeCircle(String moves){
        int[] count = new int[4];
        char[] c = moves.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'U'){
                count[0]++;
            }else if (c[i] == 'D'){
                count[1]++;
            }else if (c[i] == 'R'){
                count[2]++;
            }else {
                count[3]++;
            }

        }

        if (count[0] == count[1] && count[2] == count[3]){
            return true;
        }

        return false;
    }
}
