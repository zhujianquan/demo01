package com;

/**
 * @ClassName MathOperation
 * @Description TODO
 * @Author zhujianquanAdministrator
 * @Date 2019/03/22 16:16
 */
public interface MathOperation {
    default int operation(int a, int b){
        return a-b;
    }

    default int operation1(int a, int b){
        return a+b;
    }

    String intToString(int a, int b);
}
