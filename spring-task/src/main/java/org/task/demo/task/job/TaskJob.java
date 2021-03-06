package org.task.demo.task.job;

import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.thymeleaf.util.DateUtils;

import java.util.Date;

/**
 * @author mingzhihong
 * @date 2019/11/29 17:02
 */
@Component
@EnableAsync
@Slf4j
public class TaskJob {
    @Async
    @Scheduled(cron = "0 0/1 * * * ?")
    public void taskjob(){
        log.info("【job】开始执行：{}",  DateUtils.createNow());
    }

    @Async
    @Scheduled(fixedRate = 2000)
   public void taskjob2(){
       log.info("【job2】开始执行：{}",  DateUtils.createNow());
   }
}
