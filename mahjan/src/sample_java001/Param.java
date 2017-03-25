package sample_java001;

import java.util.Arrays;

public class Param {
	public static String[] param = new String[100];

	public void setParam(String[] P1){
		param = P1;
	}

	public String[] getParam(){
		return param;
	}

	public void DelParam(){
		Arrays.fill(param, "");
	}
}
