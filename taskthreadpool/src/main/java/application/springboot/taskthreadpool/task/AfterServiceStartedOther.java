package application.springboot.taskthreadpool.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AfterServiceStartedOther implements CommandLineRunner {

    @Autowired
    private AsyncTask asyncTask;

    /**
     * 会在服务启动完成后立即执行
     */
    @Override
    public void run(String... args) throws Exception {

        System.out.println("容器启动后执行");
        for (int i = 0; i < 100; i++) {
            asyncTask.doTask1(i);
        }
        System.out.println("over");
    }
}