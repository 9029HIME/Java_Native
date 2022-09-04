package com.genn.Syntax5_Records;

/**
 * 档案类，能做到类似Lombok的效果，但是档案类无法继承，它是final类型的。并且只能使用全属性构造器
 */
public class Main {
    public static void main(String[] args) {
        RecordClass recordClass = new RecordClass("名字","方法");
        System.out.println(recordClass);
    }
    public record RecordClass(String name,String method){
    }
}
