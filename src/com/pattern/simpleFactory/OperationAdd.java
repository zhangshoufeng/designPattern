package com.pattern.simpleFactory;

/**
 * Created by Administrator on 2017/5/15.
 */
public class OperationAdd extends Operation {
    @Override
    int getResult() {
        return num1+num2;
    }
}
