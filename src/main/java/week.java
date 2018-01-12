import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class week {
    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy年的第");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间

        Calendar c=Calendar.getInstance();
        int i = c.get(Calendar.WEEK_OF_YEAR);
        System.out.println(i);
    }
}
