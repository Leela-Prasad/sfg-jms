package guru.springframework.sfgjms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
// This will scan for @Async Annotations in the project
// which is used to do asynchronous operations
@EnableAsync
@Configuration
public class TaskConfig {

    @Bean
    public TaskExecutor taskExecutor() {
        return  new SimpleAsyncTaskExecutor();
    }

}
