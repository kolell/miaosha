package com.kole.result;

public class CodeMsg {
    private int code;
    private String msg;
    
    public static CodeMsg SUCCESS = new CodeMsg(0,"调用成功！");
    public static CodeMsg ERROR = new CodeMsg(-1,"请求错误！");
    public static CodeMsg SER_ERROR = new CodeMsg(500,"服务端访问异常！");

    private CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
