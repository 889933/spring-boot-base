package application.springboot.quartz.config;

import application.springboot.quartz.quartz.QuartzDemo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;

import java.beans.SimpleBeanInfo;

/**
 * quartz配置类
 */
@Configuration
public class QuartzConfig {
    /**
     * 1 创建job对象
     */
    @Bean
    public JobDetailFactoryBean jobDetailFactoryBean(){
        JobDetailFactoryBean factory = new JobDetailFactoryBean();
        // 关联我们自己的类
        factory.setJobClass(QuartzDemo.class);
        return factory;
    }



    /**
     * 2 创建简单的trigger对象
     */
/*    @Bean
    public SimpleTriggerFactoryBean simpleTriggerFactoryBean(JobDetailFactoryBean jobDetailFactoryBean){
        SimpleTriggerFactoryBean factory = new SimpleTriggerFactoryBean();
        // 关联jobDetail对象
        factory.setJobDetail(jobDetailFactoryBean.getObject());
        factory.setRepeatInterval(2000); // 2000代表毫秒数
        factory.setRepeatCount(5); // 设置重复次数
        return factory;
    }*/
    /**
     * 3 创建scheduler对象
     */
/*    @Bean
    public SchedulerFactoryBean schedulerFactoryBean(SimpleTriggerFactoryBean simpleTriggerFactoryBean){
        SchedulerFactoryBean factory = new SchedulerFactoryBean();

        // 关联trigger
        factory.setTriggers(simpleTriggerFactoryBean.getObject());
        return factory;
    }*/

    /**
     * 2 创建cron的trigger对象
     */
    @Bean
    public CronTriggerFactoryBean cronTriggerFactoryBean(JobDetailFactoryBean jobDetailFactoryBean){
        CronTriggerFactoryBean factory = new CronTriggerFactoryBean();
        factory.setJobDetail(jobDetailFactoryBean.getObject());
        // 设置触发时间
        factory.setCronExpression("0/2 * * * * ?");
        return factory;
    }

    /**
     * 3 创建scheduler对象
     */
    @Bean
    public SchedulerFactoryBean schedulerFactoryBean(CronTriggerFactoryBean cronTriggerFactoryBean, MyAdaptableJobFactory myAdaptableJobFactory){
        SchedulerFactoryBean factory = new SchedulerFactoryBean();

        // 关联trigger
        factory.setTriggers(cronTriggerFactoryBean.getObject());
        // 调用MyAdaptableJobFactory类
        factory.setJobFactory(myAdaptableJobFactory);
        return factory;
    }
}
