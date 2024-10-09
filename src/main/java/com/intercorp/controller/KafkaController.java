package com.intercorp.controller;

import com.intercorp.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @GetMapping("/save-task")
    public String saveTaskMessage(@RequestParam("message") String message) {
        kafkaProducerService.saveTaskMessage(message);
        return "Kafka ha recibido el topic de tarea guardada.";
    }

    @GetMapping("/update-task")
    public String updateTaskMessage(@RequestParam("message") String message) {
        kafkaProducerService.updateTaskMessage(message);
        return "Kafka ha recibido el topic de tarea actualizada.";
    }

    @GetMapping("/delete-task")
    public String deleteTaskMessage(@RequestParam("message") String message) {
        kafkaProducerService.deleteTaskMessage(message);
        return "Kafka ha recibido el topic de tarea eliminada.";
    }
}