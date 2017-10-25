package com.lonly.example.ndkdemo2;

/**
 * Created by lonly on 2017/10/25.
 */

public class MyNDK {

    public static native int sequare(int num);

    static {
        //参数是.so库的名称：libJniDemo.so 的名称为JniDemo
        System.loadLibrary("JniDemo");
    }
}
