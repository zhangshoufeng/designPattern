package com.pattern.Handler;

/**
 * Created by Administrator on 2017/5/19.
 */
public class Hander3 extends Handler {
    @Override
    String  handlerRequest(int num) {
        if(num<20){
            return "manager3处理的request:"+num;
        }else {
            return handler.handlerRequest(num);
        }
    }
}
