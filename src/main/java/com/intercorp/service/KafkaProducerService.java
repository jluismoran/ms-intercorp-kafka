package com.intercorp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private static final String TOPIC_SAVE = "topic_task_save";
    private static final String TOPIC_UPDATE = "topic_task_update";
    private static final String TOPIC_DELETE = "topic_task_delete";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void saveTaskMessage(String message) {
        kafkaTemplate.send(TOPIC_SAVE, message);
    }

    public void updateTaskMessage(String message) {
        kafkaTemplate.send(TOPIC_SAVE, message);
    }

    public void deleteTaskMessage(String message) {
        kafkaTemplate.send(TOPIC_SAVE, message);
    }
}
