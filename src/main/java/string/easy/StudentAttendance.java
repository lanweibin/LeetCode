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

    public static void main(String[] args) {
        String s = "AA";
        boolean b = checkRecord(s);

        System.out.println(b);
    }
}
