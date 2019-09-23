package guru.springframework.sfgjms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

@Configuration
public class JmsConfig {

    public static final String MY_QUEUE = "my-hello-world";

    @Bean
    public MessageConverter messageConverter() {
        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        // Converts objects to JMS Text Message
        converter.setTargetType(MessageType.TEXT);
        // This property will carry the Type id.
        converter.setTypeIdPropertyName("_type");
        return converter;
    }
}
