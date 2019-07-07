package com.example.duodian.until;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value = "RedisUntil.class")
class RedisUntilTest {
    private ApplicationContext applicationContext = SpringUtil.getApplicationContext();
   @Autowired
    private RedisUntil redisUntil = applicationContext.getBean(RedisUntil.class);
    @Test
    public void expire() {
    }

    public boolean set1() {
        boolean b = redisUntil.set("1","3333");
        return b;
    }
    public static void main (String[] args){
        RedisUntilTest redisUntilTest = new RedisUntilTest();
        boolean b = redisUntilTest.set1();
        System.out.println(b);
    }
}