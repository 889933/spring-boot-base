package application.springboot.quartz.quartz;

import application.springboot.quartz.service.UsersService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * job 类
 */
public class QuartzDemo implements Job {

    @Autowired
    private UsersService usersService;

    @Override
    public void execute(JobExecutionContext arg0) throws JobExecutionException {


        System.out.println("触发时间：" + new Date());


        this.usersService.addUsers();
    }
}
