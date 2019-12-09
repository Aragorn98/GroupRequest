package kz.iitu.jd3.bookrequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    private static final String TOPIC = "group_requests";

    @Autowired
    private KafkaTemplate<String, GroupRequest> kafkaTemplate;

    public String groupRequestNotify(GroupRequest groupRequest) {
        System.out.println(String.format("#### -> Producing book request to notification service -> %s", groupRequest));
        this.kafkaTemplate.send(TOPIC, groupRequest);
        return "Successfully";
    }
}