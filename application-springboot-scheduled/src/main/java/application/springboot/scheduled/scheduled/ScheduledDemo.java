package application.springboot.scheduled.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * scheduled定时任务
 */
@Component
public class ScheduledDemo {

    /**
     * 定时任务方法
     * 注解：@Scheduled表示：设置定时任务
     *                      cron表示：定时任务触发时间的字符串表达形式
     */
    @Scheduled(cron = "0/2 * * * * ?")
    public void scheduledMethod(){
        System.out.println("定时器触发时间：" + new Date());
    }
}
