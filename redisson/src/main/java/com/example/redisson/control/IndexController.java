package com.example.redisson.control;

import com.example.redisson.service.RedissonService;
import org.redisson.api.RLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class IndexController {

    @Autowired
    private RedissonService redissonService;

    @RequestMapping("/")
    public String index(String recordId){

        //redissonService.getRBucket(recordId).set("test");
        RLock lock = redissonService.getRLock(recordId);
        try {
            boolean bs = lock.tryLock(1, 5, TimeUnit.SECONDS);
            if (bs) {
                // 业务代码
                System.out.println("进入业务代码: " + recordId);

                //lock.unlock();
            } else {
                System.out.println("未取得锁");
                Thread.sleep(300);
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            lock.unlock();
        }

        return "ok";
    }
}
