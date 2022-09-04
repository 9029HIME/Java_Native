package com.genn.Syntax4_Pattern_Matching_Of_Instanceof;

/**
 * instance of的一个优化，不需要强转可以直接使用
 */
public class Main {
    public static void main(String[] args) {
        Object o = new ImplementClass1();
        // 早期写法
        if (o instanceof ImplementClass1){
            ((ImplementClass1) o).invoke();
        }

        // 优化写法
        if (o instanceof ImplementClass1 i){
            i.invoke();
            System.out.println(o == i);
        }
    }

    public static interface InterfaceClass{
        public void invoke();
    }

    public static class ImplementClass1 implements InterfaceClass{
        @Override
        public void invoke() {
            System.out.println("自己实现的Invoke");
        }
    }
}
