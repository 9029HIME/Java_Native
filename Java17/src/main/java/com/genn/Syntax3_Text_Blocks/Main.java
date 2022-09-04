package com.genn.Syntax3_Text_Blocks;

/**
 * 通过6个"确定一个文本快，文本快里的内容不需要转义
 * 值得注意的是，文本快必须有回车
 */
public class Main {
    public static void main(String[] args) {
        var nonTextBlocks = "{\"a\":\"1\",\"b\":\"2\"}";
        var textBlocks = """
                {"a":"1","b":"2"}
                """;
        System.out.println(nonTextBlocks);
        System.out.println(textBlocks);
    }
}
