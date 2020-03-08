package application.springboot.quartz.config;

import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.scheduling.quartz.AdaptableJobFactory;
import org.springframework.stereotype.Component;

@Component("myAdaptableJobFactory")
public class MyAdaptableJobFactory extends AdaptableJobFactory {

    // AutowireCapableBeanFactory可以将对象加入springboot 的IOC容器中，并且完成该对象的属性注入
    @Autowired
    private AutowireCapableBeanFactory autowireCapableBeanFactory;

    /**
     * 该方法需要将实例化任务对象手动的添加到springboot容器中才能完成注入对象
     * @param bundle
     * @return
     * @throws Exception
     */
    @Override
    protected Object createJobInstance(TriggerFiredBundle bundle) throws Exception {
        Object jobInstance = super.createJobInstance(bundle);
        // 将jobInstance对象添加到springboot容器中，并完成注入
        this.autowireCapableBeanFactory.autowireBean(jobInstance);
        return jobInstance;
    }

}

