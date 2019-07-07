package com.example.duodian;

import com.example.duodian.until.RedisUntil;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class DuodianApplicationTests {
    private RedisUntil redisUntil;
    @Test
    public void contextLoads() {
    }
    @Test
    public void RedisTest() {
        boolean b = redisUntil.set("1","23333");
        System.out.println(b);
    }

}
