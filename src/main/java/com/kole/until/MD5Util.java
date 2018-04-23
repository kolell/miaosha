package com.kole.until;

import org.apache.commons.codec.digest.DigestUtils;

public class MD5Util {
    private static final String salt = "4a5300f";

    public static String Md5(String str){
        return DigestUtils.md5Hex(str);
    }

    public static String inputPwd(String pwd){
        String diyPwd = "" + salt.charAt(0) + salt.charAt(1) + pwd +salt.charAt(5) + salt.charAt(4);
        return Md5(diyPwd);
    }

    public static String PwdToDB(String formPwd, String salt){
        String diyPwd = "" + salt.charAt(0) + salt.charAt(1) + formPwd +salt.charAt(5) + salt.charAt(4);
        return Md5(diyPwd);
    }

    public static String inputPwdToDB(String inputPwd, String salt){
        String formPwd = inputPwd(inputPwd);
        return PwdToDB(formPwd, salt);
    }

}
