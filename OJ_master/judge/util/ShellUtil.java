package util;

import java.io.InputStream;

public class ShellUtil {
	public static boolean isRunOK(InputStream ins ){
		String msg =IO_Utils.getString(ins);
		if(msg==null||msg.trim().length()<=0){
			return true;
		}
		System.out.println(msg);
		
		return false;
	}
}
