#include "com_lonly_example_ndkdemo2_MyNDK.h"
//计算一个整数的平方
JNIEXPORT jint JNICALL Java_com_lonly_example_ndkdemo2_MyNDK_sequare
  (JNIEnv *env, jclass clz, jint num){
        return num * num;
  }