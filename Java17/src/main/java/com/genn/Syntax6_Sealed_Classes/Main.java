package com.genn.Syntax6_Sealed_Classes;

/**
 * 密封类，只允许部分类继承/实现它，其他类不允许。
 * 假设类A只允许类B、类C继承它，那么必须指定类A为密封类，并且permits B,C。同时类B和类C必须符合以下特性：
 *
 * 在编译期必须能够被密封类A访问
 * 必须直接继承封闭类A
 * 必须有如下修饰符中的一个进行修饰：final，sealed，non-sealed
 * 必须和类A在同一个java模块中
 */
public class Main {

    public static sealed class A permits B,C{

    }

    public static non-sealed class B extends A implements D{

    }

    public static final class C extends A{

    }

    // 接口也是可以实现密封效果的
    public static sealed interface D permits B{

    }
}
