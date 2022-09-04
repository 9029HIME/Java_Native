package com.genn.Syntax1_Local_Variable_Type_Inference;

/**
 * 类型推断，类似Golang里的x:=1，不需要声明引用的类型，只需执行指向数据的类型即可。
 */
public class Main {
    public static void main(String[] args) {
        var str = "str";
        var i = 1;
        var aCLass =  new AClass();
    }

    public static class AClass{

    }
}
