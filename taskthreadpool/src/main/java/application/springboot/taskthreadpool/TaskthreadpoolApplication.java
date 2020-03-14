package application.springboot.taskthreadpool;

import application.springboot.taskthreadpool.config.TaskThreadPoolConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@EnableConfigurationProperties({TaskThreadPoolConfig.class} ) // 开启配置属性支持
@SpringBootApplication
public class TaskthreadpoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskthreadpoolApplication.class, args);
    }

}
