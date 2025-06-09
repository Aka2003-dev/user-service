//package com.akash.UserService.kafka;
//
//import com.akash.UserService.dtos.ServiceBookingRequest;
//import lombok.RequiredArgsConstructor;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class BookingEventPublisher {
//    private final KafkaTemplate<String, ServiceBookingRequest> kafkaTemplate;
//
//    public void publish(ServiceBookingRequest request) {
//        kafkaTemplate.send("booking", request);
//    }
//
//}
