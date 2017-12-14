package string.easy;

//551. Student Attendance Record I
public class StudentAttendance {
    public static boolean checkRecord(String s) {
        char[] c = s.toCharArray();
        int[] count = new int[3];
        boolean b = true ;

        for (int i = c.length-1; i > 0; i--) {
            if (c[i] == 'A'){
                count[0]++;
            }
            if (c[i]== 'L'){
                count[1]++;
                if (c[i-1] == 'L'){
                    count[1]++;
                }
            }
            if (c[i] == 'P'){
                count[2]++;
            }

        }

        for (int i = 0; i < count.length; i++) {
           if (count[0] >=1 || count[1] >3 ) {
               b = false;
           }

        }
        return b;
    }

    public boolean checkRecord2(String s) {
        int countA=0;
        int continuosL = 0;
        int charA = 'A';
        int charL ='L';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == charA){
                countA++;
                continuosL = 0;
            }
            else if(s.charAt(i) == charL){
                continuosL++;
            }
            else{
                continuosL = 0;
            }
            if(countA >1 || continuosL > 2 ){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String s = "AA";
        boolean b = checkRecord(s);

        System.out.println(b);
    }
}
