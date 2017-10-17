package com.hman.water.util;

public class TextUtils {

	public static boolean isEmpty(String str) {
		if (str == null || str == "" || ("").equals(str)) {
			return true;
		}
		return false;
	}
	
}
