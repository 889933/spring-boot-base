package application.springboot.taskthreadpool.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class AsyncTask {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostConstruct // 在初始化之前
    public void init() throws InterruptedException {
        System.out.println("容器启动后执行");
        for (int i = 0; i < 100; i++) {
            this.doTask1(i);
        }
        System.out.println("over");
    }

    @Async("myTaskAsyncPool")  //myTaskAsynPool即配置线程池的方法名，此处如果不写自定义线程池的方法名，会使用默认的线程池
    public void doTask1(int i) throws InterruptedException{
        logger.info("Task"+i+" started.");
    }
}
