package com.genn.Syntax2_Switch_Expressions;

/**
 * 简洁的switch使用,并且可以指定返回值(yield)。
 */
public class Main {
    public static void main(String[] args) {
        var i = 999;
        var j = switch (i) {
            case 1 -> {
                System.out.println("输入1");
                yield i;
            }
            case 2 -> {
                System.out.println("输入2");
                yield i;
            }
            case 3 -> {
                System.out.println("输入3" );
                yield i;
            }
            default -> {
                System.out.println("输入了"+i);
                yield -1;
            }
        };

        System.out.println(String.format("j=%s",j));
    }
}
