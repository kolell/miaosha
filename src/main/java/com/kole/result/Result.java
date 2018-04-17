package com.kole.result;

public class Result<T> {
    private int code;
    private String msg;
    private T data;

    public static <T>Result<T> Respose(CodeMsg cm, T data){
        return new Result<T>(cm, data);
    }

    private Result(CodeMsg cm,T data) {
        if(cm == null){
            return;
        }
        this.code = cm.getCode();
        this.msg = cm.getMsg();
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

}
