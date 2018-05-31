package Tool;

import java.util.Date;
import java.text.SimpleDateFormat;

public class NowString {
	public static String GetTime() { 
	SimpleDateFormat df = new SimpleDateFormat();//设置日期格式
	return df.format(new Date());// new Date()为获取当前系统时间
	}
}