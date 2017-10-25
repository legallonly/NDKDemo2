package com.lonly.example.ndkdemo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // JAVA_packagename_classname_functionname
    // jstring String  jint int
    //1.建立一个调用NDK函数的Java类，并且在Java类中定义与NDK函数名称相同的native方法
    //2. 准备头文件(.h)
    // 使用下面的命令自动生成头文件javah -jni -encoding UTF-8  com.lonly.example.ndkdemo2.MyNDK
    //3.创建jni目录，将头文件移动到这个目录
    //4.在jni目录下创建cpp文件，实现.h文件中的函数
    //5.设置local.properties文件，指定Androidndk的根目录位置 ndk.dir=E\:\\AndroidSDK\\ndk-bundle
    //6. 设置build.gradle文件，编译NDK程序，生成libJniDemo.so文件
    //7.调用NDK函数

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.textview);
        tv.setText(String.valueOf(MyNDK.sequare(21)));
    }
}
